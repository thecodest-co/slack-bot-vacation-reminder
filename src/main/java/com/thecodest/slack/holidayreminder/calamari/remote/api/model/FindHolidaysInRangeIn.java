/*
 * Calamari API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1
 * Contact: developers@calamari.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.thecodest.slack.holidayreminder.calamari.remote.api.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Searching public holidays for employee filter.
 */
@Schema(description = "Searching public holidays for employee filter.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class FindHolidaysInRangeIn {
	@SerializedName("employee")
	private String employee = null;

	@SerializedName("from")
	private LocalDate from = null;

	@SerializedName("to")
	private LocalDate to = null;

	public FindHolidaysInRangeIn employee(String employee) {
		this.employee = employee;
		return this;
	}

	/**
	 * Employee e-mail or login
	 *
	 * @return employee
	 **/
	@Schema(example = "john.white@mycompany.com", required = true, description = "Employee e-mail or login")
	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public FindHolidaysInRangeIn from(LocalDate from) {
		this.from = from;
		return this;
	}

	/**
	 * Start date of dates range to search in ISO format
	 *
	 * @return from
	 **/
	@Schema(example = "Tue Jan 10 01:00:00 CET 2017", required = true, description = "Start date of dates range to search in ISO format")
	public LocalDate getFrom() {
		return from;
	}

	public void setFrom(LocalDate from) {
		this.from = from;
	}

	public FindHolidaysInRangeIn to(LocalDate to) {
		this.to = to;
		return this;
	}

	/**
	 * End date of dates range to search in ISO format
	 *
	 * @return to
	 **/
	@Schema(example = "Sun Jan 15 01:00:00 CET 2017", required = true, description = "End date of dates range to search in ISO format")
	public LocalDate getTo() {
		return to;
	}

	public void setTo(LocalDate to) {
		this.to = to;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FindHolidaysInRangeIn findHolidaysInRangeIn = (FindHolidaysInRangeIn) o;
		return Objects.equals(this.employee, findHolidaysInRangeIn.employee)
				&& Objects.equals(this.from, findHolidaysInRangeIn.from)
				&& Objects.equals(this.to, findHolidaysInRangeIn.to);
	}

	@Override
	public int hashCode() {
		return Objects.hash(employee, from, to);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FindHolidaysInRangeIn {\n");

		sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
		sb.append("    from: ").append(toIndentedString(from)).append("\n");
		sb.append("    to: ").append(toIndentedString(to)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}