package com.thecodest.slack.holidayreminder.calamari;

import com.google.inject.AbstractModule;

public class CalamariModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(CalamariApi.class).to(SimpleCalamariApi.class);
	}
}
