package com.thecodest.slack.holidayreminder.slack;

import com.slack.api.methods.response.chat.ChatPostMessageResponse;
import java.util.List;

/**
 * Simplified Slack interface. If you want to use some additional APIs then you need to add that method here.
 * Idea was that to have a simple „only things that we need” interface.
 */
public interface SlackClient {


	/**
	 * Send message to user. Message text is send as it is. If you need format your message you need to send proper
	 * formatting tags here.
	 *
	 * @param slackUser target user.
	 * @param message   message as text.
	 * @return server response.
	 */
	ChatPostMessageResponse sendMessageToUser(SlackUser slackUser, String message);

	/**
	 * Find all users that emails match to given list.
	 *
	 * @param emails list of user emails that se looking for.
	 * @return List of @{@link SlackUser}s that we found.
	 */
	List<SlackUser> getUsersByEmails(List<String> emails);
}
