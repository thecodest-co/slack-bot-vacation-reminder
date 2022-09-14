package com.thecodest.slack.holidayreminder.auth;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Module configure authentication for Slack and Calamari.
 *
 * <p>Looking for:
 * <ul>
 * <li>SLACK_TOKEN</li>
 * <li>CALAMARI_USERNAME</li>
 * <li>CALAMARI_PASSWORD</li>
 * </ul>>
 * Environment variables.
 */
public class AuthViaEnvModule extends AbstractModule {

	/**
	 * Read environment variables and set them into named Strings.
	 * <ul>
	 * <li>SLACK_TOKEN » slack-token</li>
	 * <li>CALAMARI_USERNAME » calamari-username</li>
	 * <li>CALAMARI_PASSWORD » calamari-password</li>
	 * </ul>>
	 */
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
