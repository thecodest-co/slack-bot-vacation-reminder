package com.thecodest.slack.holidayreminder;

import com.thecodest.slack.holidayreminder.calamari.CalamariEmployee;
import com.thecodest.slack.holidayreminder.slack.SlackUser;

/**
 * This is an representation of The Codest employee. Each employee has Slack anc
 * Calamari account.
 *
 * @param calamariEmployee
 *            Calamari account
 * @param slackUser
 *            Slack account
 */
public record Coder(CalamariEmployee calamariEmployee, SlackUser slackUser) {
}
