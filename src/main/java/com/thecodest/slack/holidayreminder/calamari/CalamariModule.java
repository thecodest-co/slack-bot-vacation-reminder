package com.thecodest.slack.holidayreminder.calamari;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.thecodest.slack.holidayreminder.calamari.remote.ApiClient;
import com.thecodest.slack.holidayreminder.calamari.remote.api.AbsenceTypeApi;
import com.thecodest.slack.holidayreminder.calamari.remote.api.EmployeesApi;

import javax.inject.Named;
import javax.inject.Singleton;

public class CalamariModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(CalamariApi.class).to(SimpleCalamariApi.class);
	}

	@Provides
	@Singleton
	public ApiClient apiClient(@Named("calamari-username") String username,
	                           @Named("calamari-password") String password) {
		var apiClient = new ApiClient();
		apiClient.setUsername(username);
		apiClient.setPassword(password);
		return apiClient;
	}

	@Provides
	@Singleton
	public EmployeesApi employeesApi(ApiClient apiClient) {
		return new EmployeesApi(apiClient);
	}

	@Provides
	@Singleton
	public AbsenceTypeApi absenceTypeApi(ApiClient apiClient) {
		return new AbsenceTypeApi(apiClient);
	}

}
