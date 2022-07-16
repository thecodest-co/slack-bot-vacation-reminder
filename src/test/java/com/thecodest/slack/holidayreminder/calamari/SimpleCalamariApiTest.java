package com.thecodest.slack.holidayreminder.calamari;

import com.thecodest.slack.holidayreminder.calamari.remote.ApiException;
import com.thecodest.slack.holidayreminder.calamari.remote.api.AbsenceTypeApi;
import com.thecodest.slack.holidayreminder.calamari.remote.api.EmployeesApi;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.BalanceOut;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.EmployeeFullOut;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.EmployeesOut;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.GetBalanceOfEmployeeAndAbsenceType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static java.util.List.of;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SimpleCalamariApiTest {

	@Mock
	private EmployeesApi employeesApi;
	@Mock
	private AbsenceTypeApi absenceTypeApi;

	@InjectMocks
	private SimpleCalamariApi simpleCalamariApi;

	@Test
	void shouldReturnOnlyEmployeesThatHave5OrMoreVacationDaysLeft() throws ApiException {
		var employeesApiResponse = new EmployeesOut();
		employeesApiResponse.employees(of(
				buildEFO("e1"),
				buildEFO("e2"),
				buildEFO("e3")
		));
		when(employeesApi.getEmployees(any())).thenReturn(employeesApiResponse);
		when(absenceTypeApi.getEntitlementBalance(any())).thenAnswer(
				invocationOnMock -> {
					var arg = (GetBalanceOfEmployeeAndAbsenceType) (invocationOnMock.getArguments()[0]);
					var employee = arg.getEmployee();
					if(employee.equals("e2@codest.com")) {
						var balance = new BalanceOut();
						balance.setAmount(4);
						return balance;
					}
					var balance = new BalanceOut();
					balance.setAmount(6);
					return balance;
				}
		);

		var employees = simpleCalamariApi.employeesWithToMuchFreeDays(5);
		assertThat(employees).hasSize(2)
				.contains(
						new Employee("e1", "e1@codest.com", 6),
						new Employee("e3", "e3@codest.com", 6)
						);

	}

	private EmployeeFullOut buildEFO(String id) {
		EmployeeFullOut employeeFullOut = new EmployeeFullOut();
		employeeFullOut.setFirstName(id);
		employeeFullOut.setEmail(id + "@codest.com");
		return employeeFullOut;
	}
}