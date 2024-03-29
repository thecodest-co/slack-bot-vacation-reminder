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
 * DateTimeZone
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class DateTimeZone {
	@SerializedName("id")
	private String id = null;

	@SerializedName("fixed")
	private Boolean fixed = null;

	public DateTimeZone id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 *
	 * @return id
	 **/
	@Schema(description = "")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DateTimeZone fixed(Boolean fixed) {
		this.fixed = fixed;
		return this;
	}

	/**
	 * Get fixed
	 *
	 * @return fixed
	 **/
	@Schema(description = "")
	public Boolean isFixed() {
		return fixed;
	}

	public void setFixed(Boolean fixed) {
		this.fixed = fixed;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DateTimeZone dateTimeZone = (DateTimeZone) o;
		return Objects.equals(this.id, dateTimeZone.id) && Objects.equals(this.fixed, dateTimeZone.fixed);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, fixed);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DateTimeZone {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    fixed: ").append(toIndentedString(fixed)).append("\n");
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
