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
 * DurationField
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class DurationField {
	@SerializedName("name")
	private String name = null;

	@SerializedName("type")
	private DurationFieldType type = null;

	@SerializedName("supported")
	private Boolean supported = null;

	@SerializedName("precise")
	private Boolean precise = null;

	@SerializedName("unitMillis")
	private Long unitMillis = null;

	public DurationField name(String name) {
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

	public DurationField type(DurationFieldType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 *
	 * @return type
	 **/
	@Schema(description = "")
	public DurationFieldType getType() {
		return type;
	}

	public void setType(DurationFieldType type) {
		this.type = type;
	}

	public DurationField supported(Boolean supported) {
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

	public DurationField precise(Boolean precise) {
		this.precise = precise;
		return this;
	}

	/**
	 * Get precise
	 *
	 * @return precise
	 **/
	@Schema(description = "")
	public Boolean isPrecise() {
		return precise;
	}

	public void setPrecise(Boolean precise) {
		this.precise = precise;
	}

	public DurationField unitMillis(Long unitMillis) {
		this.unitMillis = unitMillis;
		return this;
	}

	/**
	 * Get unitMillis
	 *
	 * @return unitMillis
	 **/
	@Schema(description = "")
	public Long getUnitMillis() {
		return unitMillis;
	}

	public void setUnitMillis(Long unitMillis) {
		this.unitMillis = unitMillis;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		DurationField durationField = (DurationField) o;
		return Objects.equals(this.name, durationField.name) && Objects.equals(this.type, durationField.type) && Objects.equals(this.supported, durationField.supported) && Objects.equals(this.precise, durationField.precise) && Objects.equals(this.unitMillis, durationField.unitMillis);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, type, supported, precise, unitMillis);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DurationField {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
		sb.append("    precise: ").append(toIndentedString(precise)).append("\n");
		sb.append("    unitMillis: ").append(toIndentedString(unitMillis)).append("\n");
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
