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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Searching working time balances advanced filter.
 */
@Schema(description = "Searching working time balances advanced filter.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class FilterBalanceEntriesIn {
	@SerializedName("from")
	private LocalDate from = null;

	@SerializedName("to")
	private LocalDate to = null;

	@SerializedName("teams")
	private List<String> teams = null;

	@SerializedName("positions")
	private List<String> positions = null;

	@SerializedName("contractTypes")
	private List<String> contractTypes = null;

	@SerializedName("employees")
	private List<String> employees = null;

	public FilterBalanceEntriesIn from(LocalDate from) {
		this.from = from;
		return this;
	}

	/**
	 * Start date of dates range to search request in ISO format
	 *
	 * @return from
	 **/
	@Schema(example = "Fri Jan 10 01:00:00 CET 2020", required = true, description = "Start date of dates range to search request in ISO format")
	public LocalDate getFrom() {
		return from;
	}

	public void setFrom(LocalDate from) {
		this.from = from;
	}

	public FilterBalanceEntriesIn to(LocalDate to) {
		this.to = to;
		return this;
	}

	/**
	 * End date of dates range to search request in ISO format
	 *
	 * @return to
	 **/
	@Schema(example = "Wed Jan 15 01:00:00 CET 2020", required = true, description = "End date of dates range to search request in ISO format")
	public LocalDate getTo() {
		return to;
	}

	public void setTo(LocalDate to) {
		this.to = to;
	}

	public FilterBalanceEntriesIn teams(List<String> teams) {
		this.teams = teams;
		return this;
	}

	public FilterBalanceEntriesIn addTeamsItem(String teamsItem) {
		if (this.teams == null) {
			this.teams = new ArrayList<>();
		}
		this.teams.add(teamsItem);
		return this;
	}

	/**
	 * List of teams names or identifiers to search. As a result there will be
	 * absence requests of employees who are members of at least one of provided
	 * teams. Example: [\&quot;First Team\&quot;, \&quot;Second Team\&quot;,
	 * \&quot;Third Team\&quot;]
	 *
	 * @return teams
	 **/
	@Schema(description = "List of teams names or identifiers to search. As a result there will be absence requests of employees who are members of at least one of provided teams. Example: [\"First Team\", \"Second Team\", \"Third Team\"]")
	public List<String> getTeams() {
		return teams;
	}

	public void setTeams(List<String> teams) {
		this.teams = teams;
	}

	public FilterBalanceEntriesIn positions(List<String> positions) {
		this.positions = positions;
		return this;
	}

	public FilterBalanceEntriesIn addPositionsItem(String positionsItem) {
		if (this.positions == null) {
			this.positions = new ArrayList<>();
		}
		this.positions.add(positionsItem);
		return this;
	}

	/**
	 * List of positions names or identifiers to search. As a result there will be
	 * absence requests of employees who have one of provided positions. Example:
	 * [\&quot;Developer\&quot;, \&quot;Support\&quot;, \&quot;Architect\&quot;]
	 *
	 * @return positions
	 **/
	@Schema(description = "List of positions names or identifiers to search. As a result there will be absence requests of employees who have one of provided positions. Example: [\"Developer\", \"Support\", \"Architect\"]")
	public List<String> getPositions() {
		return positions;
	}

	public void setPositions(List<String> positions) {
		this.positions = positions;
	}

	public FilterBalanceEntriesIn contractTypes(List<String> contractTypes) {
		this.contractTypes = contractTypes;
		return this;
	}

	public FilterBalanceEntriesIn addContractTypesItem(String contractTypesItem) {
		if (this.contractTypes == null) {
			this.contractTypes = new ArrayList<>();
		}
		this.contractTypes.add(contractTypesItem);
		return this;
	}

	/**
	 * List of contract types names or identifiers to search. As a result there will
	 * be absence requests of employees who have one of contract type. Example:
	 * [\&quot;firstContract\&quot;, \&quot;secondContract\&quot;]
	 *
	 * @return contractTypes
	 **/
	@Schema(description = "List of contract types names or identifiers to search. As a result there will be absence requests of employees who have one of contract type. Example: [\"firstContract\", \"secondContract\"]")
	public List<String> getContractTypes() {
		return contractTypes;
	}

	public void setContractTypes(List<String> contractTypes) {
		this.contractTypes = contractTypes;
	}

	public FilterBalanceEntriesIn employees(List<String> employees) {
		this.employees = employees;
		return this;
	}

	public FilterBalanceEntriesIn addEmployeesItem(String employeesItem) {
		if (this.employees == null) {
			this.employees = new ArrayList<>();
		}
		this.employees.add(employeesItem);
		return this;
	}

	/**
	 * List of employees e-mails or logins. Example:
	 * [\&quot;john.smith@domain.com\&quot;, \&quot;mark.small@domain.com\&quot;]
	 *
	 * @return employees
	 **/
	@Schema(description = "List of employees e-mails or logins. Example: [\"john.smith@domain.com\", \"mark.small@domain.com\"]")
	public List<String> getEmployees() {
		return employees;
	}

	public void setEmployees(List<String> employees) {
		this.employees = employees;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FilterBalanceEntriesIn filterBalanceEntriesIn = (FilterBalanceEntriesIn) o;
		return Objects.equals(this.from, filterBalanceEntriesIn.from)
				&& Objects.equals(this.to, filterBalanceEntriesIn.to)
				&& Objects.equals(this.teams, filterBalanceEntriesIn.teams)
				&& Objects.equals(this.positions, filterBalanceEntriesIn.positions)
				&& Objects.equals(this.contractTypes, filterBalanceEntriesIn.contractTypes)
				&& Objects.equals(this.employees, filterBalanceEntriesIn.employees);
	}

	@Override
	public int hashCode() {
		return Objects.hash(from, to, teams, positions, contractTypes, employees);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FilterBalanceEntriesIn {\n");

		sb.append("    from: ").append(toIndentedString(from)).append("\n");
		sb.append("    to: ").append(toIndentedString(to)).append("\n");
		sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
		sb.append("    positions: ").append(toIndentedString(positions)).append("\n");
		sb.append("    contractTypes: ").append(toIndentedString(contractTypes)).append("\n");
		sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
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