package com.thecodest.slack.holidayreminder.calamari;

import java.util.List;

/**
 * Simplified Calamari interface. If you want to use some additional APIs then you need to add that method here.
 * Idea was that to have a simple „only things that we need” interface.
 */
public interface CalamariApi {

	/**
	 * Get list of employees that have more than #limit days of vacation.
	 *
	 * @param limit bottom limit of vacation days
	 * @return list of @{@link CalamariEmployee} that match limit.
	 */
	List<CalamariEmployee> employeesWithToMuchFreeDays(int limit);
}
