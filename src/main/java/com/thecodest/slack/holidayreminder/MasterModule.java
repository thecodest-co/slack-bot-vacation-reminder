package com.thecodest.slack.holidayreminder;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

class MasterModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Integer.class)
				.annotatedWith(Names.named("days-limit"))
				.toInstance(Integer.valueOf(System.getenv("DAYS_LIMIT")));
		bind(RunningCalculator.class).toProvider(RunningCalculatorProvider.class);
		bind(Configuration.class);
	}
}
