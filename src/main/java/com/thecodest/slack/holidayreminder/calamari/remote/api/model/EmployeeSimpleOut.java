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
 * EmployeeSimpleOut
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class EmployeeSimpleOut {
	@SerializedName("firstName")
	private String firstName = null;

	@SerializedName("lastName")
	private String lastName = null;

	@SerializedName("email")
	private String email = null;

	@SerializedName("externalId")
	private String externalId = null;

	public EmployeeSimpleOut firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * Employee first name
	 *
	 * @return firstName
	 **/
	@Schema(example = "John", required = true, description = "Employee first name")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public EmployeeSimpleOut lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * Employee last name
	 *
	 * @return lastName
	 **/
	@Schema(example = "Williams", required = true, description = "Employee last name")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public EmployeeSimpleOut email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Employee email
	 *
	 * @return email
	 **/
	@Schema(example = "john.williams@domain.com", required = true, description = "Employee email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EmployeeSimpleOut externalId(String externalId) {
		this.externalId = externalId;
		return this;
	}

	/**
	 * Employee external identifier
	 *
	 * @return externalId
	 **/
	@Schema(example = "A12Y", description = "Employee external identifier")
	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		EmployeeSimpleOut employeeSimpleOut = (EmployeeSimpleOut) o;
		return Objects.equals(this.firstName, employeeSimpleOut.firstName) && Objects.equals(this.lastName, employeeSimpleOut.lastName) && Objects.equals(this.email, employeeSimpleOut.email) && Objects.equals(this.externalId, employeeSimpleOut.externalId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, email, externalId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EmployeeSimpleOut {\n");

		sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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
