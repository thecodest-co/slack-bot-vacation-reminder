package com.thecodest.slack.holidayreminder.calamari;

import com.thecodest.slack.holidayreminder.EmailNormalization;
import com.thecodest.slack.holidayreminder.calamari.remote.api.AbsenceTypeApi;
import com.thecodest.slack.holidayreminder.calamari.remote.api.EmployeesApi;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.EmployeesOut;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.GetBalanceOfEmployeeAndAbsenceType;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.PublicEmployeesIn;
import io.vavr.control.Either;
import io.vavr.control.Try;
import lombok.RequiredArgsConstructor;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

@RequiredArgsConstructor(onConstructor_ = {@Inject})
class SimpleCalamariApi implements CalamariApi {

	private final EmployeesApi employeesApi;
	private final AbsenceTypeApi absenceTypeApi;

	@Override
	public List<Employee> employeesWithToMuchFreeDays(int limit) {
		final Predicate<Employee> tooMuchFreedomPredicate = emp -> emp.balanceOut() >= limit;
		return Try.success(new PublicEmployeesIn())
				.mapTry(employeesApi::getEmployees)
				.map(EmployeesOut::getEmployees)
				.getOrElse(Collections::emptyList)
				.stream()
				.map(efo -> new Employee(efo.getFirstName(), efo.getEmail(), 0))
				.map(employee -> {
					GetBalanceOfEmployeeAndAbsenceType employeeAbsence = new GetBalanceOfEmployeeAndAbsenceType();
					employeeAbsence.employee(employee.email());
					employeeAbsence.absenceTypeId("7");
					employeeAbsence.date(LocalDate.now());
					return Try.of(() -> absenceTypeApi.getEntitlementBalance(employeeAbsence))
							.onFailure(Throwable::printStackTrace)
							.mapTry(bo -> new Employee(employee.name(), EmailNormalization.normalize(employee.email()).normalForm(), bo.getAmount()))
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
