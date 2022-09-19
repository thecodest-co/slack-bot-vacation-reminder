package com.thecodest.slack.holidayreminder;

import java.util.Optional;
import javax.inject.Provider;

class RunningCalculatorProvider implements Provider<RunningCalculator> {
	@Override
	public RunningCalculator get() {
		return Optional.ofNullable(Boolean.valueOf(System.getenv("TEST_RUN")))
				.or(() -> Optional.of(Boolean.FALSE))
				.map(b -> b ? new FakeRunningCalculator() : new LocalRunningCalculator())
				.get();
	}
}
