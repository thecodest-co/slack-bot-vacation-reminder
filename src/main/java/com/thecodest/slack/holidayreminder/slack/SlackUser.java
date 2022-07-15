package com.thecodest.slack.holidayreminder.slack;

import com.thecodest.slack.holidayreminder.EmailNormalization;
import io.vavr.control.Try;

public record SlackUser(String slackId, String name, String email) {

	public String normalizedEmail() {
		return Try.success(email())
				.mapTry(EmailNormalization::normalize)
				.map(EmailNormalization.NormalizedEmail::normalForm)
				.getOrElseThrow(t -> new RuntimeException(t));
	}
}
