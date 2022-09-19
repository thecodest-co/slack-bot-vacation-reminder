package com.thecodest.slack.holidayreminder;

import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.MONDAY;
import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;
import static java.time.DayOfWeek.THURSDAY;
import static java.time.DayOfWeek.TUESDAY;
import static java.time.DayOfWeek.WEDNESDAY;
import static java.time.Month.APRIL;
import static java.time.Month.AUGUST;
import static java.time.Month.DECEMBER;
import static java.time.Month.FEBRUARY;
import static java.time.Month.JANUARY;
import static java.time.Month.JULY;
import static java.time.Month.JUNE;
import static java.time.Month.MARCH;
import static java.time.Month.MAY;
import static java.time.Month.NOVEMBER;
import static java.time.Month.OCTOBER;
import static java.time.Month.SEPTEMBER;
import static java.util.stream.Stream.concat;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LocalRunningCalculatorTest {

	private final LocalRunningCalculator sut = new LocalRunningCalculator();

	static Stream<Arguments> validDates() {
		return Stream.of(
				Arguments.of(JANUARY, 2, TUESDAY),
				Arguments.of(APRIL, 2, WEDNESDAY),
				Arguments.of(JANUARY, 2, THURSDAY),
				Arguments.of(APRIL, 2, FRIDAY),
				Arguments.of(APRIL, 3, TUESDAY),
				Arguments.of(OCTOBER, 4, MONDAY),
				Arguments.of(JULY, 4, TUESDAY));
	}

	static Stream<Arguments> invalidDates() {
		var badMonths = Stream.of(
				Arguments.of(FEBRUARY, 2, TUESDAY),
				Arguments.of(MARCH, 2, WEDNESDAY),
				Arguments.of(MAY, 2, THURSDAY),
				Arguments.of(JUNE, 2, FRIDAY),
				Arguments.of(AUGUST, 3, TUESDAY),
				Arguments.of(SEPTEMBER, 4, MONDAY),
				Arguments.of(NOVEMBER, 4, TUESDAY),
				Arguments.of(DECEMBER, 4, TUESDAY));

		var badDayOfWeek = Stream.of(
				Arguments.of(JANUARY, 2, MONDAY),
				Arguments.of(APRIL, 3, MONDAY),
				Arguments.of(APRIL, 3, WEDNESDAY),
				Arguments.of(JANUARY, 3, THURSDAY),
				Arguments.of(APRIL, 3, FRIDAY),
				Arguments.of(OCTOBER, 4, WEDNESDAY),
				Arguments.of(OCTOBER, 4, THURSDAY),
				Arguments.of(JULY, 4, FRIDAY),
				Arguments.of(OCTOBER, 4, SATURDAY),
				Arguments.of(JULY, 4, SUNDAY));

		var badDayOfMonth = Stream.of(
				Arguments.of(JANUARY, 5, TUESDAY),
				Arguments.of(JANUARY, 6, WEDNESDAY),
				Arguments.of(JANUARY, 7, THURSDAY),
				Arguments.of(JANUARY, 8, FRIDAY),
				Arguments.of(JANUARY, 9, TUESDAY),
				Arguments.of(JANUARY, 10, MONDAY),
				Arguments.of(JANUARY, 11, TUESDAY),
				Arguments.of(JANUARY, 12, TUESDAY),
				Arguments.of(JANUARY, 13, WEDNESDAY),
				Arguments.of(JANUARY, 14, THURSDAY),
				Arguments.of(JANUARY, 15, FRIDAY),
				Arguments.of(JANUARY, 16, TUESDAY),
				Arguments.of(JANUARY, 17, MONDAY),
				Arguments.of(JANUARY, 18, TUESDAY),
				Arguments.of(JANUARY, 19, MONDAY),
				Arguments.of(JANUARY, 20, TUESDAY),
				Arguments.of(JANUARY, 21, TUESDAY),
				Arguments.of(JANUARY, 22, TUESDAY),
				Arguments.of(JANUARY, 23, WEDNESDAY),
				Arguments.of(JANUARY, 24, THURSDAY),
				Arguments.of(JANUARY, 25, FRIDAY),
				Arguments.of(JANUARY, 26, TUESDAY),
				Arguments.of(JANUARY, 27, MONDAY),
				Arguments.of(JANUARY, 28, TUESDAY),
				Arguments.of(JANUARY, 29, TUESDAY),
				Arguments.of(JANUARY, 30, TUESDAY),
				Arguments.of(JANUARY, 31, TUESDAY));

		return concat(
				concat(badMonths, badDayOfWeek), badDayOfMonth);
	}

	@ParameterizedTest()
	@MethodSource("validDates")
	void shouldReturnTrueForValidDays(Month month, int day, DayOfWeek dayOfWeek) {
		assertThat(sut.shouldItRun(month, day, dayOfWeek)).isTrue();
	}

	@ParameterizedTest()
	@MethodSource("invalidDates")
	void shouldReturnTrueForInvalidDays(Month month, int day, DayOfWeek dayOfWeek) {
		assertThat(sut.shouldItRun(month, day, dayOfWeek)).isFalse();
	}
}