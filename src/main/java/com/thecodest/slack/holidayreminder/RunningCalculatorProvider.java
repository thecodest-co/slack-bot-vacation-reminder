package com.thecodest.slack.holidayreminder;

import java.util.Optional;
import javax.inject.Provider;
import lombok.extern.java.Log;

@Log
class RunningCalculatorProvider implements Provider<RunningCalculator> {
	@Override
	public RunningCalculator get() {
		return Optional.ofNullable(Boolean.valueOf(System.getenv("TEST_RUN")))
				.or(() -> Optional.of(Boolean.FALSE))
				.stream()
				.peek(b -> log.warning("TEST_RUN is set to " + b))
				.map(b -> b ? new FakeRunningCalculator() : new LocalRunningCalculator())
				.get();
	}
}
