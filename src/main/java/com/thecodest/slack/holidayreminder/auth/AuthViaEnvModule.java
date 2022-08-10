package com.thecodest.slack.holidayreminder.auth;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class AuthViaEnvModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(String.class)
				.annotatedWith(Names.named("slack-token"))
				.toInstance(System.getenv("SLACK_TOKEN"));
		bind(String.class)
				.annotatedWith(Names.named("calamari-username"))
				.toInstance(System.getenv("CALAMARI_USERNAME"));
		bind(String.class)
				.annotatedWith(Names.named("calamari-password"))
				.toInstance(System.getenv("CALAMARI_PASSWORD"));
	}
}
