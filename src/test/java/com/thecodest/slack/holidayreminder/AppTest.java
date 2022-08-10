package com.thecodest.slack.holidayreminder;

import org.junit.jupiter.api.Test;
import uk.org.webcompere.systemstubs.environment.EnvironmentVariables;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AppTest {

	@Test
	public void shouldAnswerWithTrue() {

		var props = Map.of(
				"SLACK_TOKEN", "SLACK-TOKEN",
				"CALAMARI_USERNAME", "CALAMARI-USERNAME",
				"CALAMARI_PASSWORD", "CALAMARI-PASSWORD",
				"DAYS_LIMIT", "5"
		);

		EnvironmentVariables env = new EnvironmentVariables(props);
		assertDoesNotThrow(() ->
				env.execute(() -> App.main(new String[]{}))
		);
	}
}
