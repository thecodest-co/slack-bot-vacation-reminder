package com.thecodest.slack.holidayreminder;

import com.google.inject.Guice;
import com.thecodest.slack.holidayreminder.auth.AuthViaEnvModule;
import com.thecodest.slack.holidayreminder.calamari.CalamariModule;
import com.thecodest.slack.holidayreminder.slack.SlackModule;

/**
 * Bootstrap class. Load and configure Guice Modules.
 */
public class App {

	/**
	 * No params.
	 *
	 * @param args
	 *            empty array
	 */
	public static void main(String[] args) {
		var injector = Guice.createInjector(
				new MasterModule(), new AuthViaEnvModule(),
				new SlackModule(), new CalamariModule());
		var app = injector.getInstance(VacationReminder.class);
		app.run();
	}

}
