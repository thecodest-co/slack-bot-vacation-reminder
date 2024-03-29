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

import com.thecodest.slack.holidayreminder.calamari.remote.api.model.BalanceOut;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.CreateBalanceIn;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.EmployeeBalanceOut;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.GetAbsenceTypeOut;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.GetBalanceOfEmployeeAndAbsenceType;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.GetEmployeesBalancesIn;
import com.thecodest.slack.holidayreminder.calamari.remote.api.model.ModifyBalanceOut;
import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * API tests for AbsenceTypeApi
 */
@Disabled
class AbsenceTypeApiTest {

	private final AbsenceTypeApi api = new AbsenceTypeApi();

	/**
	 * Get absence types with duration units.
	 * <p>
	 * Get absence types with duration units. &lt;br/&gt;&lt;br/&gt;
	 *
	 * @throws Exception
	 *             if the Api call fails
	 */
	@Test
	void getAbsenceTypesTest() throws Exception {
		List<GetAbsenceTypeOut> response = api.getAbsenceTypes();

		// TODO: test validations
	}

	/**
	 * Get entitlement balance.
	 * <p>
	 * Get entitlement balance.&lt;br/&gt;&lt;br/&gt;The method allows you to get
	 * the entitlement balance for selected employee and absence type on a selected
	 * day.&lt;br &gt;&lt;br /&gt;Expect error
	 * codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; -
	 * when invalid absence type
	 * provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; -
	 * when invalid balance owner
	 * provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE&lt;/strong&gt; - when
	 * invalid date provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @throws Exception
	 *             if the Api call fails
	 */
	@Test
	void getEntitlementBalanceTest() throws Exception {
		GetBalanceOfEmployeeAndAbsenceType body = null;
		BalanceOut response = api.getEntitlementBalance(body);

		// TODO: test validations
	}

	/**
	 * Get entitlement balance with advanced filtering by several parameters.
	 * <p>
	 * Get entitlement balance.&lt;br/&gt;&lt;br/&gt;The method allows you to get
	 * the entitlement balance for selected employees and absence types on a
	 * selected day.&lt;br &gt;&lt;br /&gt;Expect error
	 * codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt; -
	 * when invalid absence type
	 * provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; -
	 * when invalid balance owner
	 * provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_TEAM&lt;/strong&gt; - when
	 * invalid team
	 * provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_DATE&lt;/strong&gt; - when
	 * invalid date provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @throws Exception
	 *             if the Api call fails
	 */
	@Test
	void getEntitlementBalancesTest() throws Exception {
		GetEmployeesBalancesIn body = null;
		List<EmployeeBalanceOut> response = api.getEntitlementBalances(body);

		// TODO: test validations
	}

	/**
	 * Create entitlement balance.
	 * <p>
	 * Create entitlement balance.&lt;br/&gt;&lt;br/&gt;The method allows you to add
	 * the entitlement balance of a selected absence type on a selected day.&lt;br
	 * &gt;&lt;br /&gt;Expect error
	 * codes:&lt;ol&gt;&lt;li&gt;&lt;strong&gt;INVALID_AMOUNT&lt;/strong&gt; - when
	 * invalid amount
	 * provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_AS_OF_DATE&lt;/strong&gt;
	 * - when invalid date
	 * provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_ABSENCE_TYPE&lt;/strong&gt;
	 * - when invalid absence type
	 * provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_EMPLOYEE&lt;/strong&gt; -
	 * when invalid balance owner
	 * provided&lt;/li&gt;&lt;li&gt;&lt;strong&gt;INVALID_COMMENT&lt;/strong&gt; -
	 * when invalid comment provided&lt;/li&gt;&lt;/ol&gt;
	 *
	 * @throws Exception
	 *             if the Api call fails
	 */
	@Test
	void manualCreateEntitlementBalanceTest() throws Exception {
		CreateBalanceIn body = null;
		ModifyBalanceOut response = api.manualCreateEntitlementBalance(body);

		// TODO: test validations
	}
}
