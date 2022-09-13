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
 * ProjectOutWithAssignedEmployeesTeams
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class ProjectOutWithAssignedEmployeesTeams {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("employees")
	private List<EmployeeSimpleOut> employees = null;

	@SerializedName("teams")
	private List<TeamOut> teams = null;

	public ProjectOutWithAssignedEmployeesTeams id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Project id
	 *
	 * @return id
	 **/
	@Schema(description = "Project id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProjectOutWithAssignedEmployeesTeams name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Project name
	 *
	 * @return name
	 **/
	@Schema(example = "Primary project", description = "Project name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProjectOutWithAssignedEmployeesTeams employees(List<EmployeeSimpleOut> employees) {
		this.employees = employees;
		return this;
	}

	public ProjectOutWithAssignedEmployeesTeams addEmployeesItem(EmployeeSimpleOut employeesItem) {
		if(this.employees == null) {
			this.employees = new ArrayList<>();
		}
		this.employees.add(employeesItem);
		return this;
	}

	/**
	 * Assigned employees
	 *
	 * @return employees
	 **/
	@Schema(description = "Assigned employees")
	public List<EmployeeSimpleOut> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeSimpleOut> employees) {
		this.employees = employees;
	}

	public ProjectOutWithAssignedEmployeesTeams teams(List<TeamOut> teams) {
		this.teams = teams;
		return this;
	}

	public ProjectOutWithAssignedEmployeesTeams addTeamsItem(TeamOut teamsItem) {
		if(this.teams == null) {
			this.teams = new ArrayList<>();
		}
		this.teams.add(teamsItem);
		return this;
	}

	/**
	 * Assigned teams
	 *
	 * @return teams
	 **/
	@Schema(description = "Assigned teams")
	public List<TeamOut> getTeams() {
		return teams;
	}

	public void setTeams(List<TeamOut> teams) {
		this.teams = teams;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		ProjectOutWithAssignedEmployeesTeams projectOutWithAssignedEmployeesTeams = (ProjectOutWithAssignedEmployeesTeams) o;
		return Objects.equals(this.id, projectOutWithAssignedEmployeesTeams.id) && Objects.equals(this.name, projectOutWithAssignedEmployeesTeams.name) && Objects.equals(this.employees, projectOutWithAssignedEmployeesTeams.employees) && Objects.equals(this.teams, projectOutWithAssignedEmployeesTeams.teams);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, employees, teams);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProjectOutWithAssignedEmployeesTeams {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
		sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if(o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
