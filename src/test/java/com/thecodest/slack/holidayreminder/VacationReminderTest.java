package com.thecodest.slack.holidayreminder;

import static java.util.List.of;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.thecodest.slack.holidayreminder.calamari.CalamariApi;
import com.thecodest.slack.holidayreminder.calamari.CalamariEmployee;
import com.thecodest.slack.holidayreminder.slack.SlackClient;
import com.thecodest.slack.holidayreminder.slack.SlackUser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class VacationReminderTest {

	@Spy
	private Message message;
	@Spy
	private RunningCalculator runningCalculator;

	@Mock
	private SlackClient slackClient;
	@Mock
	private CalamariApi calamariApi;

	@Mock
	private Configuration configuration;

	@InjectMocks
	private VacationReminder vacationReminder;

	@Test
	void shouldSendMessageOnlyToPeopleWithMoreThan5Days() {
		var e1 = new CalamariEmployee("E1", "e1@codest.com", 10);
		var e2 = new CalamariEmployee("E2", "e2@notcodest.com", 5);
		var e3 = new CalamariEmployee("E3", "e3@codest.com", 7);
		var s1 = new SlackUser("E1", "E1", "e1@codest.com");
		var s3 = new SlackUser("E3", "E3", "e3@codest.com");

		when(calamariApi.employeesWithToMuchFreeDays(5)).thenReturn(of(e1, e2, e3));
		when(slackClient.getUsersByEmails(of(e1.email(), e2.email(), e3.email()))).thenReturn(of(s1, s3));
		when(configuration.daysLimit()).thenReturn(5);

		vacationReminder.sendMessage();

		verify(message).getMessage(e1);
		verify(message).getMessage(e3);

		verify(slackClient).sendMessageToUser(s1, message.getMessage(e1));
		verify(slackClient).sendMessageToUser(s3, message.getMessage(e3));
	}
}