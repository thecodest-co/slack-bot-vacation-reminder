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
 * Punch clock in method payload.
 */
@Schema(description = "Punch clock in method payload.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class PunchClockIn {
	@SerializedName("person")
	private String person = null;

	@SerializedName("time")
	private LocalDateTime time = null;

	@SerializedName("projectId")
	private Long projectId = null;

	public PunchClockIn person(String person) {
		this.person = person;
		return this;
	}

	/**
	 * Employee identifier. You can use e-mail or external identifier in format
	 * (externalNumber:ABC123)
	 *
	 * @return person
	 **/
	@Schema(example = "john.white@mycompany.com", required = true, description = "Employee identifier. You can use e-mail or external identifier in format (externalNumber:ABC123)")
	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public PunchClockIn time(LocalDateTime time) {
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

	public PunchClockIn projectId(Long projectId) {
		this.projectId = projectId;
		return this;
	}

	/**
	 * Project id.
	 *
	 * @return projectId
	 **/
	@Schema(example = "1", description = "Project id.")
	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PunchClockIn punchClockIn = (PunchClockIn) o;
		return Objects.equals(this.person, punchClockIn.person) && Objects.equals(this.time, punchClockIn.time)
				&& Objects.equals(this.projectId, punchClockIn.projectId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(person, time, projectId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PunchClockIn {\n");

		sb.append("    person: ").append(toIndentedString(person)).append("\n");
		sb.append("    time: ").append(toIndentedString(time)).append("\n");
		sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
