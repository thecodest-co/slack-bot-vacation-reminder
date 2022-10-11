package com.thecodest.slack.holidayreminder.slack;

import com.slack.api.Slack;
import com.slack.api.methods.MethodsClient;
import com.slack.api.methods.request.users.UsersListRequest;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;
import com.slack.api.methods.response.users.UsersListResponse;
import io.vavr.control.Try;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.extern.java.Log;

@Log
class SimpleSlackClient implements SlackClient {

	private final MethodsClient methods;

	@Inject
	SimpleSlackClient(@Named("slack-token") String token) {
		System.out.println(token);
		this.methods = Slack.getInstance().methods(token);
	}

	@Override
	public ChatPostMessageResponse sendMessageToUser(SlackUser slackUser, String message) {
		log.info("Send message to " + slackUser.normalizedEmail());
		return Try.of(() -> methods.chatPostMessage(req -> req.channel(slackUser.slackId()).text(message)))
				.onFailure(Throwable::printStackTrace)
				.get();
	}

	@Override
	public List<SlackUser> getUsersByEmails(List<String> emails) {
		log.info("Get users from slack");
		log.info(emails.toString());
		return Try.of(() -> methods
				.usersList(UsersListRequest.builder().build()))
				.onFailure(Throwable::printStackTrace)
				.map(UsersListResponse::getMembers)
				.getOrElse(Collections.emptyList())
				.stream()
				.filter(u -> u.getProfile().getEmail() != null)
				.peek(System.out::println)
				.map(u -> new SlackUser(u.getId(), u.getName(), u.getProfile().getEmail()))
				.filter(su -> emails.contains(su.normalizedEmail()))
				.toList();
	}
}
