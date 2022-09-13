package com.thecodest.slack.holidayreminder.calamari;

/**
 * This record represents The Codest employee in Calamari system.
 *
 * @param name       employee name as it is in Calamari system.
 * @param email      employee email as it is in Calamari system.
 * @param balanceOut number of days of vacation that employee can take.
 */
public record CalamariEmployee(String name, String email, int balanceOut) {
}
