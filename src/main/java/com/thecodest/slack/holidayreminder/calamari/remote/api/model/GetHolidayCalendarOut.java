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
 * GetHolidayCalendarOut
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class GetHolidayCalendarOut {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("name")
	private String name = null;

	public GetHolidayCalendarOut id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Holiday calendar id
	 *
	 * @return id
	 **/
	@Schema(required = true, description = "Holiday calendar id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GetHolidayCalendarOut name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Holiday calendar name
	 *
	 * @return name
	 **/
	@Schema(example = "Primary calendar", required = true, description = "Holiday calendar name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		GetHolidayCalendarOut getHolidayCalendarOut = (GetHolidayCalendarOut) o;
		return Objects.equals(this.id, getHolidayCalendarOut.id) && Objects.equals(this.name, getHolidayCalendarOut.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetHolidayCalendarOut {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
