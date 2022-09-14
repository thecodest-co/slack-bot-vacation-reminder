package com.thecodest.slack.holidayreminder.calamari;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.thecodest.slack.holidayreminder.calamari.remote.ApiClient;
import com.thecodest.slack.holidayreminder.calamari.remote.api.AbsenceTypeApi;
import com.thecodest.slack.holidayreminder.calamari.remote.api.EmployeesApi;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Setup of Calamari module. We looking for named Strings
 * <samp>calamari-username</samp>
 * and <samp>calamari-username</samp>.
 */
public class CalamariModule extends AbstractModule {

	/**
	 * Configuration of @{@link CalamariApi} interface.
	 */
	@Override
	protected void configure() {
		bind(CalamariApi.class).to(SimpleCalamariApi.class);
	}

	/**
	 * Main {@link ApiClient} provider.
	 *
	 * @param username
	 *            named String <samp>calamari-username</samp>.
	 * @param password
	 *            named String <samp>calamari-password</samp>.
	 * @return instance that is singleton.
	 */
	@Provides
	@Singleton
	public ApiClient apiClient(@Named("calamari-username") String username,
			@Named("calamari-password") String password) {
		var apiClient = new ApiClient();
		apiClient.setUsername(username);
		apiClient.setPassword(password);
		return apiClient;
	}

	/**
	 * Provides {@link EmployeesApi} client instance.
	 *
	 * @param apiClient
	 *            main calamari client.
	 * @return instance that is singleton.
	 */
	@Provides
	@Singleton
	public EmployeesApi employeesApi(ApiClient apiClient) {
		return new EmployeesApi(apiClient);
	}

	/**
	 * Provides {@link AbsenceTypeApi} client instance.
	 *
	 * @param apiClient
	 *            main calamari client.
	 * @return instance that is singleton.
	 */
	@Provides
	@Singleton
	public AbsenceTypeApi absenceTypeApi(ApiClient apiClient) {
		return new AbsenceTypeApi(apiClient);
	}

}
