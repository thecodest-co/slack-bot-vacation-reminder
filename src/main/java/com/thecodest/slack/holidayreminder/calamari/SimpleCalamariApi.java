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

@RequiredArgsConstructor(onConstructor_ = {@Inject})
class SimpleCalamariApi implements CalamariApi {

	private final EmployeesApi employeesApi;
	private final AbsenceTypeApi absenceTypeApi;

	@Override
	public List<CalamariEmployee> employeesWithToMuchFreeDays(int limit) {
		final Predicate<CalamariEmployee> tooMuchFreedomPredicate = emp -> emp.balanceOut() >= limit;
		return Try.success(new PublicEmployeesIn())
				.mapTry(employeesApi::getEmployees)
				.map(EmployeesOut::getEmployees)
				.getOrElse(Collections::emptyList)
				.stream()
				.map(efo -> new CalamariEmployee(efo.getFirstName(), efo.getEmail(), 0))
				.map(employee -> {
					var employeeAbsence = new GetBalanceOfEmployeeAndAbsenceType();
					employeeAbsence.employee(employee.email());
					employeeAbsence.absenceTypeId("7");
					employeeAbsence.date(LocalDate.now());
					return Try.of(() -> absenceTypeApi.getEntitlementBalance(employeeAbsence))
							.onFailure(Throwable::printStackTrace)
							.mapTry(bo -> new CalamariEmployee(employee.name(),
									normalize(employee.email()).normalForm(),
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