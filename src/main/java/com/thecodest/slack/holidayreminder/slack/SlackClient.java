package com.thecodest.slack.holidayreminder.slack;

import com.slack.api.methods.response.chat.ChatPostMessageResponse;

import java.util.List;

public interface SlackClient {

	ChatPostMessageResponse sendMessageToUser(SlackUser slackUser, String message);

	List<SlackUser> getUsersByEmails(List<String> emails);
}
