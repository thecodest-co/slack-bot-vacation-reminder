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

import com.thecodest.slack.holidayreminder.calamari.remote.api.model.CreateTeamIn;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.CreateTeamOut;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.TeamOut;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * API tests for TeamsApi
 */
@Disabled
class TeamsApiTest {

	private final TeamsApi api = new TeamsApi();

	/**
	 * Create a team.
	 * <p>
	 * Create a team.
	 *
	 * @throws Exception
	 *             if the Api call fails
	 */
	@Test
	void createTeamTest() throws Exception {
		CreateTeamIn body = null;
		CreateTeamOut response = api.createTeam(body);

		// TODO: test validations
	}

	/**
	 * Get all teams.
	 * <p>
	 * Get all teams.
	 *
	 * @throws Exception
	 *             if the Api call fails
	 */
	@Test
	void getTeamsTest() throws Exception {
		List<TeamOut> response = api.getTeams();

		// TODO: test validations
	}
}