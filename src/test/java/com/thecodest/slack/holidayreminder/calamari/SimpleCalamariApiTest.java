package com.thecodest.slack.holidayreminder.calamari;

import static java.util.List.of;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import com.thecodest.slack.holidayreminder.calamari.remote.ApiException;
import com.thecodest.slack.holidayreminder.calamari.remote.api.AbsenceTypeApi;
import com.thecodest.slack.holidayreminder.calamari.remote.api.EmployeesApi;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.BalanceOut;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.EmployeeFullOut;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.EmployeesOut;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.GetBalanceOfEmployeeAndAbsenceType;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

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
				buildEmployeeFullOut("e1"),
				buildEmployeeFullOut("e2"),
				buildEmployeeFullOut("e3")));
		when(employeesApi.getEmployees(any())).thenReturn(employeesApiResponse);
		when(absenceTypeApi.getEntitlementBalance(any())).thenAnswer(prepareBalanceAnswer());

		var employees = simpleCalamariApi.employeesWithToMuchFreeDays(5);
		assertThat(employees).hasSize(2)
				.contains(
						new CalamariEmployee("e1", "e1@codest.com", 6),
						new CalamariEmployee("e3", "e3@codest.com", 6));

	}

	@NotNull
	private Answer<Object> prepareBalanceAnswer() {
		return invocationOnMock -> {
			var arg = (GetBalanceOfEmployeeAndAbsenceType) (invocationOnMock.getArguments()[0]);
			if (arg.getEmployee().equals("e2@codest.com")) {
				return buildBalanceOut(4);
			}
			return buildBalanceOut(6);
		};
	}

	@NotNull
	private Object buildBalanceOut(int amount) {
		var balance = new BalanceOut();
		balance.setAmount(amount);
		return balance;
	}

	private EmployeeFullOut buildEmployeeFullOut(String id) {
		EmployeeFullOut employeeFullOut = new EmployeeFullOut();
		employeeFullOut.setFirstName(id);
		employeeFullOut.setEmail(id + "@codest.com");
		return employeeFullOut;
	}
}