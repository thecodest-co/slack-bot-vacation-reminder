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
 * DateTimeField
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class DateTimeField {
	@SerializedName("name")
	private String name = null;

	@SerializedName("type")
	private DateTimeFieldType type = null;

	@SerializedName("supported")
	private Boolean supported = null;

	@SerializedName("lenient")
	private Boolean lenient = null;

	@SerializedName("minimumValue")
	private Integer minimumValue = null;

	@SerializedName("maximumValue")
	private Integer maximumValue = null;

	@SerializedName("durationField")
	private DurationField durationField = null;

	@SerializedName("rangeDurationField")
	private DurationField rangeDurationField = null;

	@SerializedName("leapDurationField")
	private DurationField leapDurationField = null;

	public DateTimeField name(String name) {
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

	public DateTimeField type(DateTimeFieldType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 *
	 * @return type
	 **/
	@Schema(description = "")
	public DateTimeFieldType getType() {
		return type;
	}

	public void setType(DateTimeFieldType type) {
		this.type = type;
	}

	public DateTimeField supported(Boolean supported) {
		this.supported = supported;
		return this;
	}

	/**
	 * Get supported
	 *
	 * @return supported
	 **/
	@Schema(description = "")
	public Boolean isSupported() {
		return supported;
	}

	public void setSupported(Boolean supported) {
		this.supported = supported;
	}

	public DateTimeField lenient(Boolean lenient) {
		this.lenient = lenient;
		return this;
	}

	/**
	 * Get lenient
	 *
	 * @return lenient
	 **/
	@Schema(description = "")
	public Boolean isLenient() {
		return lenient;
	}

	public void setLenient(Boolean lenient) {
		this.lenient = lenient;
	}

	public DateTimeField minimumValue(Integer minimumValue) {
		this.minimumValue = minimumValue;
		return this;
	}

	/**
	 * Get minimumValue
	 *
	 * @return minimumValue
	 **/
	@Schema(description = "")
	public Integer getMinimumValue() {
		return minimumValue;
	}

	public void setMinimumValue(Integer minimumValue) {
		this.minimumValue = minimumValue;
	}

	public DateTimeField maximumValue(Integer maximumValue) {
		this.maximumValue = maximumValue;
		return this;
	}

	/**
	 * Get maximumValue
	 *
	 * @return maximumValue
	 **/
	@Schema(description = "")
	public Integer getMaximumValue() {
		return maximumValue;
	}

	public void setMaximumValue(Integer maximumValue) {
		this.maximumValue = maximumValue;
	}

	public DateTimeField durationField(DurationField durationField) {
		this.durationField = durationField;
		return this;
	}

	/**
	 * Get durationField
	 *
	 * @return durationField
	 **/
	@Schema(description = "")
	public DurationField getDurationField() {
		return durationField;
	}

	public void setDurationField(DurationField durationField) {
		this.durationField = durationField;
	}

	public DateTimeField rangeDurationField(DurationField rangeDurationField) {
		this.rangeDurationField = rangeDurationField;
		return this;
	}

	/**
	 * Get rangeDurationField
	 *
	 * @return rangeDurationField
	 **/
	@Schema(description = "")
	public DurationField getRangeDurationField() {
		return rangeDurationField;
	}

	public void setRangeDurationField(DurationField rangeDurationField) {
		this.rangeDurationField = rangeDurationField;
	}

	public DateTimeField leapDurationField(DurationField leapDurationField) {
		this.leapDurationField = leapDurationField;
		return this;
	}

	/**
	 * Get leapDurationField
	 *
	 * @return leapDurationField
	 **/
	@Schema(description = "")
	public DurationField getLeapDurationField() {
		return leapDurationField;
	}

	public void setLeapDurationField(DurationField leapDurationField) {
		this.leapDurationField = leapDurationField;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DateTimeField dateTimeField = (DateTimeField) o;
		return Objects.equals(this.name, dateTimeField.name) && Objects.equals(this.type, dateTimeField.type)
				&& Objects.equals(this.supported, dateTimeField.supported)
				&& Objects.equals(this.lenient, dateTimeField.lenient)
				&& Objects.equals(this.minimumValue, dateTimeField.minimumValue)
				&& Objects.equals(this.maximumValue, dateTimeField.maximumValue)
				&& Objects.equals(this.durationField, dateTimeField.durationField)
				&& Objects.equals(this.rangeDurationField, dateTimeField.rangeDurationField)
				&& Objects.equals(this.leapDurationField, dateTimeField.leapDurationField);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, type, supported, lenient, minimumValue, maximumValue, durationField,
				rangeDurationField, leapDurationField);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DateTimeField {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
		sb.append("    lenient: ").append(toIndentedString(lenient)).append("\n");
		sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
		sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
		sb.append("    durationField: ").append(toIndentedString(durationField)).append("\n");
		sb.append("    rangeDurationField: ").append(toIndentedString(rangeDurationField)).append("\n");
		sb.append("    leapDurationField: ").append(toIndentedString(leapDurationField)).append("\n");
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
