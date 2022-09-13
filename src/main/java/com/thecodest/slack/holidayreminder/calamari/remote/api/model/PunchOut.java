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
 * PunchOut
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class PunchOut {
	@SerializedName("person")
	private Person person = null;
	@SerializedName("shiftStatus")
	private ShiftStatusEnum shiftStatus = null;

	public PunchOut person(Person person) {
		this.person = person;
		return this;
	}

	/**
	 * Get person
	 *
	 * @return person
	 **/
	@Schema(required = true, description = "")
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public PunchOut shiftStatus(ShiftStatusEnum shiftStatus) {
		this.shiftStatus = shiftStatus;
		return this;
	}

	/**
	 * Employee shift status after request
	 *
	 * @return shiftStatus
	 **/
	@Schema(required = true, description = "Employee shift status after request")
	public ShiftStatusEnum getShiftStatus() {
		return shiftStatus;
	}

	public void setShiftStatus(ShiftStatusEnum shiftStatus) {
		this.shiftStatus = shiftStatus;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		PunchOut punchOut = (PunchOut) o;
		return Objects.equals(this.person, punchOut.person) && Objects.equals(this.shiftStatus, punchOut.shiftStatus);
	}

	@Override
	public int hashCode() {
		return Objects.hash(person, shiftStatus);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PunchOut {\n");

		sb.append("    person: ").append(toIndentedString(person)).append("\n");
		sb.append("    shiftStatus: ").append(toIndentedString(shiftStatus)).append("\n");
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

	/**
	 * Employee shift status after request
	 */
	@JsonAdapter(ShiftStatusEnum.Adapter.class)
	public enum ShiftStatusEnum {
		STARTED("STARTED"), FINISHED("FINISHED");

		private String value;

		ShiftStatusEnum(String value) {
			this.value = value;
		}

		public static ShiftStatusEnum fromValue(String input) {
			for(ShiftStatusEnum b : ShiftStatusEnum.values()) {
				if(b.value.equals(input)) {
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

		public static class Adapter extends TypeAdapter<ShiftStatusEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final ShiftStatusEnum enumeration) throws IOException {
				jsonWriter.value(String.valueOf(enumeration.getValue()));
			}

			@Override
			public ShiftStatusEnum read(final JsonReader jsonReader) throws IOException {
				Object value = jsonReader.nextString();
				return ShiftStatusEnum.fromValue((String) (value));
			}
		}
	}

}
