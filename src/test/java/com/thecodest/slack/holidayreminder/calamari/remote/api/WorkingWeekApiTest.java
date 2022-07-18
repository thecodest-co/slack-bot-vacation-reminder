/*
 * Calamari API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1
 * Contact: developers@calamari.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.thecodest.slack.holidayreminder.calamari.remote.api;

import com.thecodest.slack.holidayreminder.calamari.remote.api.model.WorkingWeekOut;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;


/**
 * API tests for WorkingWeekApi
 */
@Disabled
class WorkingWeekApiTest {

	private final WorkingWeekApi api = new WorkingWeekApi();

	/**
	 * Get all working weeks.
	 * <p>
	 * Get all working weeks.
	 *
	 * @throws Exception if the Api call fails
	 */
	@Test
	void getWorkingWeeksTest() throws Exception {
		List<WorkingWeekOut> response = api.getWorkingWeeks();

		// TODO: test validations
	}
}
