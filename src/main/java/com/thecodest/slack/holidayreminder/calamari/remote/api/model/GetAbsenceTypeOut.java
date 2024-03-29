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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Objects;

/**
 * GetAbsenceTypeOut
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class GetAbsenceTypeOut {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("name")
	private String name = null;
	@SerializedName("durationUnit")
	private DurationUnitEnum durationUnit = null;
	@SerializedName("externalId")
	private String externalId = null;

	public GetAbsenceTypeOut id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Absence type ID
	 *
	 * @return id
	 **/
	@Schema(required = true, description = "Absence type ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GetAbsenceTypeOut name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Absence type name
	 *
	 * @return name
	 **/
	@Schema(example = "Annual Leave", required = true, description = "Absence type name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetAbsenceTypeOut durationUnit(DurationUnitEnum durationUnit) {
		this.durationUnit = durationUnit;
		return this;
	}

	/**
	 * Entitlement amount unit
	 *
	 * @return durationUnit
	 **/
	@Schema(required = true, description = "Entitlement amount unit ")
	public DurationUnitEnum getDurationUnit() {
		return durationUnit;
	}

	public void setDurationUnit(DurationUnitEnum durationUnit) {
		this.durationUnit = durationUnit;
	}

	public GetAbsenceTypeOut externalId(String externalId) {
		this.externalId = externalId;
		return this;
	}

	/**
	 * Absence type external ID
	 *
	 * @return externalId
	 **/
	@Schema(example = "P001", description = "Absence type external ID")
	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		GetAbsenceTypeOut getAbsenceTypeOut = (GetAbsenceTypeOut) o;
		return Objects.equals(this.id, getAbsenceTypeOut.id) && Objects.equals(this.name, getAbsenceTypeOut.name)
				&& Objects.equals(this.durationUnit, getAbsenceTypeOut.durationUnit)
				&& Objects.equals(this.externalId, getAbsenceTypeOut.externalId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, durationUnit, externalId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GetAbsenceTypeOut {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    durationUnit: ").append(toIndentedString(durationUnit)).append("\n");
		sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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

	/**
	 * Entitlement amount unit
	 */
	@JsonAdapter(DurationUnitEnum.Adapter.class)
	public enum DurationUnitEnum {
		DAYS("DAYS"), HOURS("HOURS");

		private String value;

		DurationUnitEnum(String value) {
			this.value = value;
		}

		public static DurationUnitEnum fromValue(String input) {
			for (DurationUnitEnum b : DurationUnitEnum.values()) {
				if (b.value.equals(input)) {
					return b;
				}
			}
			return null;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static class Adapter extends TypeAdapter<DurationUnitEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final DurationUnitEnum enumeration) throws IOException {
				jsonWriter.value(String.valueOf(enumeration.getValue()));
			}

			@Override
			public DurationUnitEnum read(final JsonReader jsonReader) throws IOException {
				Object value = jsonReader.nextString();
				return DurationUnitEnum.fromValue((String) (value));
			}
		}
	}

}
