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
import java.util.Objects;

/**
 * Break method payload.
 */
@Schema(description = "Break method payload.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class BreakIn {
	@SerializedName("person")
	private String person = null;

	@SerializedName("time")
	private LocalDateTime time = null;

	@SerializedName("breakType")
	private Long breakType = null;

	public BreakIn person(String person) {
		this.person = person;
		return this;
	}

	/**
	 * Employee e-mail or login
	 *
	 * @return person
	 **/
	@Schema(example = "john.white@mycompany.com", required = true, description = "Employee e-mail or login")
	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public BreakIn time(LocalDateTime time) {
		this.time = time;
		return this;
	}

	/**
	 * Get time
	 *
	 * @return time
	 **/
	@Schema(required = true, description = "")
	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public BreakIn breakType(Long breakType) {
		this.breakType = breakType;
		return this;
	}

	/**
	 * ID break type
	 *
	 * @return breakType
	 **/
	@Schema(example = "1", required = true, description = "ID break type")
	public Long getBreakType() {
		return breakType;
	}

	public void setBreakType(Long breakType) {
		this.breakType = breakType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BreakIn breakIn = (BreakIn) o;
		return Objects.equals(this.person, breakIn.person) && Objects.equals(this.time, breakIn.time)
				&& Objects.equals(this.breakType, breakIn.breakType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(person, time, breakType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BreakIn {\n");

		sb.append("    person: ").append(toIndentedString(person)).append("\n");
		sb.append("    time: ").append(toIndentedString(time)).append("\n");
		sb.append("    breakType: ").append(toIndentedString(breakType)).append("\n");
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
