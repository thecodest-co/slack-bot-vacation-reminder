package com.thecodest.slack.holidayreminder.slack;

import com.slack.api.Slack;
import com.slack.api.methods.MethodsClient;
import com.slack.api.methods.request.users.UsersListRequest;
import com.slack.api.methods.response.chat.ChatPostMessageResponse;
import com.slack.api.methods.response.users.UsersListResponse;
import io.vavr.control.Try;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Collections;
import java.util.List;

class SimpleSlackClient implements SlackClient {

	private final MethodsClient methods;

	@Inject
	SimpleSlackClient(@Named("slack-token")  String token) {
		this.methods = Slack.getInstance().methods(token);
	}

	@Override
	public ChatPostMessageResponse sendMessageToUser(SlackUser slackUser, String message) {
		return Try.of(() -> methods.chatPostMessage(req -> req.channel(slackUser.slackId()).text(message)))
				.onFailure(Throwable::printStackTrace)
				.get();
	}

	@Override
	public List<SlackUser> getUsersByEmails(List<String> emails) {
		return Try.of(() ->
						methods
								.usersList(UsersListRequest.builder().build())
				)
				.onFailure(Throwable::printStackTrace)
				.map(UsersListResponse::getMembers)
				.getOrElse(Collections.emptyList())
				.stream()
				.filter(u -> u.getProfile().getEmail() != null)
				.map(u ->
						new SlackUser(u.getId(), u.getName(), u.getProfile().getEmail())
				)
				.filter(su -> emails.contains(su.normalizedEmail()))
				.toList();
	}
}
