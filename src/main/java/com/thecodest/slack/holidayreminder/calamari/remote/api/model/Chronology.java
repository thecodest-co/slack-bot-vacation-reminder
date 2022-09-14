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
 * Chronology
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class Chronology {
	@SerializedName("zone")
	private DateTimeZone zone = null;

	public Chronology zone(DateTimeZone zone) {
		this.zone = zone;
		return this;
	}

	/**
	 * Get zone
	 *
	 * @return zone
	 **/
	@Schema(description = "")
	public DateTimeZone getZone() {
		return zone;
	}

	public void setZone(DateTimeZone zone) {
		this.zone = zone;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Chronology chronology = (Chronology) o;
		return Objects.equals(this.zone, chronology.zone);
	}

	@Override
	public int hashCode() {
		return Objects.hash(zone);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Chronology {\n");

		sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
