package com.thecodest.slack.holidayreminder;

import static java.time.DayOfWeek.MONDAY;
import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;
import static java.time.DayOfWeek.TUESDAY;
import static java.time.Month.APRIL;
import static java.time.Month.JANUARY;
import static java.time.Month.JULY;
import static java.time.Month.OCTOBER;

import com.google.common.annotations.VisibleForTesting;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 * For requirement, run on second working day of first month of each quarter.
 *
 * <p>This is very tricky and impossible to implement without complex calendar
 * support. So, let's make some assumptions.
 *
 * <ul>
 * <li>We omit all midweek holidays » to implement that feature we need to know
 * holiday calendar
 * for every single country, region and ethnic group.</li>
 * <li>We use Gregorian Calendar with saturday and sunday as days off » other
 * week model need to implement
 * different calendar support.</li>
 * </ul>
 *
 * <p>Based on that we can define some rules.
 *
 * <ul>
 * <li>Only valid „run months” are January, April, July and October.</li>
 * <li>Only valid „run days” are between 2nd and 4th and are not Saturday or
 * Sunday.</li>
 * <li>2nd is valid only if it is between Tuesday and Friday » 1st is Monday to
 * Thursday</li>
 * <li>3rd is valid only if it is Tuesday » 2st is Monday</li>
 * <li>4th is valid only if it is Monday or Tuesday</li>
 * <li>All other days are „invalid”.</li>
 * </ul>
 *
 * <p>Example dates that match cases above:
 *
 * <ul>
 * <li>January 2019 – 2nd is Wednesday</li>
 * <li>April 2019 – 2nd is Tuesday</li>
 * <li>January 2020 – 2nd is Thursday</li>
 * <li>April 2021 – 2nd is Friday</li>
 * <li>April 2018 – 3rd is Tuesday</li>
 * <li>October 2022 – 4th is Tuesday</li>
 * <li>July 2022 – 4th is Monday</li>
 * </ul>
 */
class RunningCalculator {

	/**
	 * Check if current local date is valid.
	 *
	 * @return true if date match to the rules. Otherwise, return false.
	 */
	public boolean shouldItRun() {
		LocalDate date = LocalDate.now();
		var month = date.getMonth();
		var day = date.getDayOfMonth();
		var dayOfWeek = date.getDayOfWeek();
		return shouldItRun(month, day, dayOfWeek);
	}

	@VisibleForTesting
	boolean shouldItRun(Month month, int day, DayOfWeek dayOfWeek) {
		return isFirstMonthOfQuarter(month)
				&& isBetween2ndAnd4th(day)
				&& isNotWeekend(dayOfWeek)
				&& matchDayRules(day, dayOfWeek);
	}

	private boolean matchDayRules(int day, DayOfWeek dayOfWeek) {
		return ruleFor2nd(day, dayOfWeek)
				|| ruleFor3rd(day, dayOfWeek)
				|| ruleFor4th(day, dayOfWeek);
	}

	private boolean isFirstMonthOfQuarter(Month month) {
		return month == JANUARY || month == APRIL || month == JULY || month == OCTOBER;
	}

	private boolean isBetween2ndAnd4th(int day) {
		return day > 1 && day <= 4;
	}

	private boolean isNotWeekend(DayOfWeek dayOfWeek) {
		return dayOfWeek != SATURDAY && dayOfWeek != SUNDAY;
	}

	private boolean ruleFor2nd(int day, DayOfWeek dayOfWeek) {
		return day == 2 && dayOfWeek != MONDAY;
	}

	private boolean ruleFor3rd(int day, DayOfWeek dayOfWeek) {
		return day == 3 && dayOfWeek == TUESDAY;
	}

	private boolean ruleFor4th(int day, DayOfWeek dayOfWeek) {
		return day == 4 && (dayOfWeek == MONDAY || dayOfWeek == TUESDAY);
	}
}
