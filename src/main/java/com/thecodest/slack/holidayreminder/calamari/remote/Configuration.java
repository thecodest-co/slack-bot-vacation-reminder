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

package com.thecodest.slack.holidayreminder.calamari.remote;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class Configuration {
	private static ApiClient defaultApiClient = new ApiClient();

	/**
	 * Get the default API client, which would be used when creating API
	 * instances without providing an API client.
	 *
	 * @return Default API client
	 */
	public static ApiClient getDefaultApiClient() {
		return defaultApiClient;
	}

	/**
	 * Set the default API client, which would be used when creating API
	 * instances without providing an API client.
	 *
	 * @param apiClient
	 *            API client
	 */
	public static void setDefaultApiClient(ApiClient apiClient) {
		defaultApiClient = apiClient;
	}
}
