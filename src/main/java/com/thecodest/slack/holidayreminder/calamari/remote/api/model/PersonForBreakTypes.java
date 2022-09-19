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
 * PersonForBreakTypes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class PersonForBreakTypes {
	@SerializedName("person")
	private String person = null;

	public PersonForBreakTypes person(String person) {
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonForBreakTypes personForBreakTypes = (PersonForBreakTypes) o;
		return Objects.equals(this.person, personForBreakTypes.person);
	}

	@Override
	public int hashCode() {
		return Objects.hash(person);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonForBreakTypes {\n");

		sb.append("    person: ").append(toIndentedString(person)).append("\n");
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