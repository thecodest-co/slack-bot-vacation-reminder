package com.thecodest.slack.holidayreminder;

import com.google.common.annotations.VisibleForTesting;
import com.thecodest.slack.holidayreminder.calamari.CalamariApi;
import com.thecodest.slack.holidayreminder.calamari.Employee;
import com.thecodest.slack.holidayreminder.slack.SlackClient;
import com.thecodest.slack.holidayreminder.slack.SlackUser;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

import javax.inject.Inject;

import static io.github.pellse.assembler.AssemblerBuilder.assemblerOf;
import static io.github.pellse.assembler.stream.StreamAdapter.streamAdapter;
import static io.github.pellse.util.query.MapperUtils.oneToOne;


@Log
@RequiredArgsConstructor(onConstructor_ = {@Inject})
class VacationReminder implements Runnable {

	private final Message message;
	private final SlackClient slackClient;
	private final CalamariApi calamariApi;
	private final RunningCalculator runningCalculator;

	@Override
	public void run() {
//		if(!runningCalculator.shouldItRun()) {
//			log.info("Not today");
//			return;
//		}
		sendMessage();
	}

	@VisibleForTesting
	void sendMessage() {
		assemblerOf(Coder.class)
				.withIdExtractor(Employee::email)
				.withAssemblerRules(
						oneToOne(slackClient::getUsersByEmails, SlackUser::email),
						Coder::new
				)
				.using(streamAdapter())
				.assemble(calamariApi.employeesWithToMuchFreeDays(5))
				.filter(coder -> coder.slackUser() != null)
				.toList()
				.stream()
				.map(coder ->
						slackClient.sendMessageToUser(coder.slackUser(), message.getMessage(coder.employee()))
				)
				.forEach(c -> log.info(String.valueOf(c)));
	}
}
