package com.thecodest.slack.holidayreminder.slack;

import com.google.inject.AbstractModule;

public class SlackModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(SlackClient.class).to(SimpleSlackClient.class);
	}
}

