package com.thecodest.slack.holidayreminder.calamari;

import java.util.List;

public interface CalamariApi {

	List<Employee> employeesWithToMuchFreeDays(int limit);
}
