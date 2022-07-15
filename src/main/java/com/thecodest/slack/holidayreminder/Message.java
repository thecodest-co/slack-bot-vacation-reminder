package com.thecodest.slack.holidayreminder;

import com.thecodest.slack.holidayreminder.calamari.Employee;

/**
 * Message send to user.
 * <p>
 * TODO: extract string template to more configurable form.
 */
class Message {

	private final String message;

	Message() {
		this.message = """
				Hi %s,
				Famous American scientists have proven that work-life balance is damn necessary to keep you job satisfaction high. Just to name a few advantages from taking a break:
				You have more time to fight with your family and friends :family:
				You can waste entire days on useless activities, not only afternoons and evenings :hourglass:
				You could spend more time on your side project that is going to trash anyway :put_litter_in_its_place:
				Life and reality are more tolerable when you are well rested :zzz:
				You could also travel a world and see something cool or smth :globe_with_meridians:
				I have spied in Calamari that you've got plenty of days off to take, do you need any more arguments to enjoy your holiday?
				You deserve it! <https://www.youtube.com/watch?v=bVRnMrl2oj8|Chill out like a BOSS> :cool-doge:
				Peace :peace-out:
				Cody
				""";
	}

	public String getMessage(Employee employee) {
		return String.format(message, employee.name(), employee.balanceOut());
	}
}
