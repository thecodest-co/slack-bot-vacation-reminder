package com.thecodest.slack.holidayreminder.calamari;

import static com.thecodest.slack.holidayreminder.EmailNormalization.normalize;

import com.thecodest.slack.holidayreminder.calamari.remote.api.AbsenceTypeApi;
import com.thecodest.slack.holidayreminder.calamari.remote.api.EmployeesApi;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.EmployeesOut;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.GetBalanceOfEmployeeAndAbsenceType;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.PublicEmployeesIn;
import io.vavr.control.Either;
import io.vavr.control.Try;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import javax.inject.Inject;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@Log
@RequiredArgsConstructor(onConstructor_ = {@Inject})
class SimpleCalamariApi implements CalamariApi {

	private final EmployeesApi employeesApi;
	private final AbsenceTypeApi absenceTypeApi;

	@Override
	public List<CalamariEmployee> employeesWithToMuchFreeDays(int limit) {
		log.info("Get employees with vacation over limit " + limit);
		final Predicate<CalamariEmployee> tooMuchFreedomPredicate = emp -> emp.balanceOut() >= limit;
		return Try.success(new PublicEmployeesIn())
				.mapTry(employeesApi::getEmployees)
				.map(EmployeesOut::getEmployees)
				.getOrElse(Collections::emptyList)
				.stream()
				.map(efo -> {
					var employeeAbsence = new GetBalanceOfEmployeeAndAbsenceType();
					employeeAbsence.employee(efo.getEmail());
					employeeAbsence.absenceTypeId("7");
					employeeAbsence.date(LocalDate.now());
					return Try.of(() -> absenceTypeApi.getEntitlementBalance(employeeAbsence))
							.onFailure(t -> {
								log.warning(t.getMessage());
								t.printStackTrace();
							})
							.mapTry(bo -> new CalamariEmployee(efo.getFirstName(),
									normalize(efo.getEmail()).normalForm(),
									bo.getAmount()))
							.toEither();
				})
				.filter(Either::isRight)
				.map(Either::get)
				.toList()
				.stream()
				.filter(tooMuchFreedomPredicate)
				.toList();
	}
}
