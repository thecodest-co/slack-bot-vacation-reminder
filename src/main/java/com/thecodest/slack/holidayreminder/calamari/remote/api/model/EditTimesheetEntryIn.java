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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Updating historical shift
 */
@Schema(description = "Updating historical shift")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class EditTimesheetEntryIn {
	@SerializedName("person")
	private String person = null;

	@SerializedName("shiftStart")
	private LocalDateTime shiftStart = null;

	@SerializedName("shiftEnd")
	private LocalDateTime shiftEnd = null;

	@SerializedName("breaks")
	private List<BreakDtoIn> breaks = null;

	@SerializedName("projects")
	private List<ProjectDtoIn> projects = null;

	@SerializedName("id")
	private Long id = null;

	public EditTimesheetEntryIn person(String person) {
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

	public EditTimesheetEntryIn shiftStart(LocalDateTime shiftStart) {
		this.shiftStart = shiftStart;
		return this;
	}

	/**
	 * Get shiftStart
	 *
	 * @return shiftStart
	 **/
	@Schema(required = true, description = "")
	public LocalDateTime getShiftStart() {
		return shiftStart;
	}

	public void setShiftStart(LocalDateTime shiftStart) {
		this.shiftStart = shiftStart;
	}

	public EditTimesheetEntryIn shiftEnd(LocalDateTime shiftEnd) {
		this.shiftEnd = shiftEnd;
		return this;
	}

	/**
	 * Get shiftEnd
	 *
	 * @return shiftEnd
	 **/
	@Schema(required = true, description = "")
	public LocalDateTime getShiftEnd() {
		return shiftEnd;
	}

	public void setShiftEnd(LocalDateTime shiftEnd) {
		this.shiftEnd = shiftEnd;
	}

	public EditTimesheetEntryIn breaks(List<BreakDtoIn> breaks) {
		this.breaks = breaks;
		return this;
	}

	public EditTimesheetEntryIn addBreaksItem(BreakDtoIn breaksItem) {
		if (this.breaks == null) {
			this.breaks = new ArrayList<>();
		}
		this.breaks.add(breaksItem);
		return this;
	}

	/**
	 * List of breaks.
	 *
	 * @return breaks
	 **/
	@Schema(description = "List of breaks.")
	public List<BreakDtoIn> getBreaks() {
		return breaks;
	}

	public void setBreaks(List<BreakDtoIn> breaks) {
		this.breaks = breaks;
	}

	public EditTimesheetEntryIn projects(List<ProjectDtoIn> projects) {
		this.projects = projects;
		return this;
	}

	public EditTimesheetEntryIn addProjectsItem(ProjectDtoIn projectsItem) {
		if (this.projects == null) {
			this.projects = new ArrayList<>();
		}
		this.projects.add(projectsItem);
		return this;
	}

	/**
	 * List of projects.
	 *
	 * @return projects
	 **/
	@Schema(description = "List of projects.")
	public List<ProjectDtoIn> getProjects() {
		return projects;
	}

	public void setProjects(List<ProjectDtoIn> projects) {
		this.projects = projects;
	}

	public EditTimesheetEntryIn id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 *
	 * @return id
	 **/
	@Schema(required = true, description = "")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EditTimesheetEntryIn editTimesheetEntryIn = (EditTimesheetEntryIn) o;
		return Objects.equals(this.person, editTimesheetEntryIn.person)
				&& Objects.equals(this.shiftStart, editTimesheetEntryIn.shiftStart)
				&& Objects.equals(this.shiftEnd, editTimesheetEntryIn.shiftEnd)
				&& Objects.equals(this.breaks, editTimesheetEntryIn.breaks)
				&& Objects.equals(this.projects, editTimesheetEntryIn.projects)
				&& Objects.equals(this.id, editTimesheetEntryIn.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(person, shiftStart, shiftEnd, breaks, projects, id);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EditTimesheetEntryIn {\n");

		sb.append("    person: ").append(toIndentedString(person)).append("\n");
		sb.append("    shiftStart: ").append(toIndentedString(shiftStart)).append("\n");
		sb.append("    shiftEnd: ").append(toIndentedString(shiftEnd)).append("\n");
		sb.append("    breaks: ").append(toIndentedString(breaks)).append("\n");
		sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
