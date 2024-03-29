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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ProjectDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class ProjectDto {
	@SerializedName("from")
	private OffsetDateTime from = null;

	@SerializedName("to")
	private OffsetDateTime to = null;

	@SerializedName("duration")
	private Long duration = null;

	@SerializedName("project")
	private ProjectOut project = null;

	public ProjectDto from(OffsetDateTime from) {
		this.from = from;
		return this;
	}

	/**
	 * Date and time when employee started working on project
	 *
	 * @return from
	 **/
	@Schema(description = "Date and time when employee started working on project")
	public OffsetDateTime getFrom() {
		return from;
	}

	public void setFrom(OffsetDateTime from) {
		this.from = from;
	}

	public ProjectDto to(OffsetDateTime to) {
		this.to = to;
		return this;
	}

	/**
	 * Date and time when employee finished working on project. Has null value if
	 * work on project was not finished
	 *
	 * @return to
	 **/
	@Schema(description = "Date and time when employee finished working on project. Has null value if work on project was not finished")
	public OffsetDateTime getTo() {
		return to;
	}

	public void setTo(OffsetDateTime to) {
		this.to = to;
	}

	public ProjectDto duration(Long duration) {
		this.duration = duration;
		return this;
	}

	/**
	 * Duration of time spent on a project in seconds. Has null value if work on
	 * project was not finished
	 *
	 * @return duration
	 **/
	@Schema(example = "28800", description = "Duration of time spent on a project in seconds. Has null value if work on project was not finished")
	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public ProjectDto project(ProjectOut project) {
		this.project = project;
		return this;
	}

	/**
	 * Get project
	 *
	 * @return project
	 **/
	@Schema(description = "")
	public ProjectOut getProject() {
		return project;
	}

	public void setProject(ProjectOut project) {
		this.project = project;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProjectDto projectDto = (ProjectDto) o;
		return Objects.equals(this.from, projectDto.from) && Objects.equals(this.to, projectDto.to)
				&& Objects.equals(this.duration, projectDto.duration)
				&& Objects.equals(this.project, projectDto.project);
	}

	@Override
	public int hashCode() {
		return Objects.hash(from, to, duration, project);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProjectDto {\n");

		sb.append("    from: ").append(toIndentedString(from)).append("\n");
		sb.append("    to: ").append(toIndentedString(to)).append("\n");
		sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
		sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
