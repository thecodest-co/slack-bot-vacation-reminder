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
 * DateTimeFieldType
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class DateTimeFieldType {
	@SerializedName("name")
	private String name = null;

	@SerializedName("durationType")
	private DurationFieldType durationType = null;

	@SerializedName("rangeDurationType")
	private DurationFieldType rangeDurationType = null;

	public DateTimeFieldType name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 *
	 * @return name
	 **/
	@Schema(description = "")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DateTimeFieldType durationType(DurationFieldType durationType) {
		this.durationType = durationType;
		return this;
	}

	/**
	 * Get durationType
	 *
	 * @return durationType
	 **/
	@Schema(description = "")
	public DurationFieldType getDurationType() {
		return durationType;
	}

	public void setDurationType(DurationFieldType durationType) {
		this.durationType = durationType;
	}

	public DateTimeFieldType rangeDurationType(DurationFieldType rangeDurationType) {
		this.rangeDurationType = rangeDurationType;
		return this;
	}

	/**
	 * Get rangeDurationType
	 *
	 * @return rangeDurationType
	 **/
	@Schema(description = "")
	public DurationFieldType getRangeDurationType() {
		return rangeDurationType;
	}

	public void setRangeDurationType(DurationFieldType rangeDurationType) {
		this.rangeDurationType = rangeDurationType;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		DateTimeFieldType dateTimeFieldType = (DateTimeFieldType) o;
		return Objects.equals(this.name, dateTimeFieldType.name) && Objects.equals(this.durationType, dateTimeFieldType.durationType) && Objects.equals(this.rangeDurationType, dateTimeFieldType.rangeDurationType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, durationType, rangeDurationType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DateTimeFieldType {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    durationType: ").append(toIndentedString(durationType)).append("\n");
		sb.append("    rangeDurationType: ").append(toIndentedString(rangeDurationType)).append("\n");
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
