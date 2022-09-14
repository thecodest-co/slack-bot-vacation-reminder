package com.thecodest.slack.holidayreminder;

import static io.github.pellse.assembler.AssemblerBuilder.assemblerOf;
import static io.github.pellse.assembler.stream.StreamAdapter.streamAdapter;
import static io.github.pellse.util.query.MapperUtils.oneToOne;

import com.google.common.annotations.VisibleForTesting;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;
import com.thecodest.slack.holidayreminder.calamari.CalamariApi;
import com.thecodest.slack.holidayreminder.calamari.CalamariEmployee;
import com.thecodest.slack.holidayreminder.slack.SlackClient;
import com.thecodest.slack.holidayreminder.slack.SlackUser;
import javax.inject.Inject;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@Log
@RequiredArgsConstructor(onConstructor_ = {@Inject})
class VacationReminder implements Runnable {

	private final Message message;
	private final SlackClient slackClient;
	private final CalamariApi calamariApi;
	private final RunningCalculator runningCalculator;
	private final Configuration configuration;

	@Override
	public void run() {
		if (!runningCalculator.shouldItRun()) {
			log.info("Not today");
			return;
		}
		sendMessage();
	}

	@VisibleForTesting
	void sendMessage() {
		assemblerOf(Coder.class)
				.withIdExtractor(CalamariEmployee::email)
				.withAssemblerRules(
						oneToOne(slackClient::getUsersByEmails, SlackUser::normalizedEmail),
						Coder::new)
				.using(streamAdapter())
				.assemble(calamariApi.employeesWithToMuchFreeDays(configuration.daysLimit()))
				.filter(coder -> coder.slackUser() != null)
				.toList()
				.stream()
				.map(this::sendMessage)
				.forEach(c -> log.info(String.valueOf(c)));
	}

	private ChatPostMessageResponse sendMessage(Coder coder) {
		return slackClient.sendMessageToUser(coder.slackUser(), message.getMessage(coder.calamariEmployee()));
	}
}
