package com.thecodest.slack.holidayreminder;

import javax.inject.Inject;
import javax.inject.Named;

record Configuration(
		@Named("days-limit") Integer daysLimit) {

	@Inject
	Configuration(@Named("days-limit") Integer daysLimit) {
		this.daysLimit = daysLimit;
	}
}
