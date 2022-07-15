package com.thecodest.slack.holidayreminder;

import com.thecodest.slack.holidayreminder.calamari.Employee;
import com.thecodest.slack.holidayreminder.slack.SlackUser;

public record Coder(Employee employee, SlackUser slackUser) {
}
