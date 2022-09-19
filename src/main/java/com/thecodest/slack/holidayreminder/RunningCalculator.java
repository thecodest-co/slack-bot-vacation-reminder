package com.thecodest.slack.holidayreminder;

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
public interface RunningCalculator {
	/**
	 * Check if current local date is valid.
	 *
	 * @return true if date match to the rules. Otherwise, return false.
	 */
	boolean shouldItRun();
}
