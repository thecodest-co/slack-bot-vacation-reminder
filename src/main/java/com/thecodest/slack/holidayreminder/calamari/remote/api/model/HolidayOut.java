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
import java.time.LocalDate;
import java.util.Objects;

/**
 * HolidayOut
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class HolidayOut {
	@SerializedName("name")
	private String name = null;

	@SerializedName("start")
	private LocalDate start = null;

	@SerializedName("end")
	private LocalDate end = null;

	@SerializedName("halfDay")
	private Boolean halfDay = null;
	@SerializedName("halfdayPeriod")
	private HalfdayPeriodEnum halfdayPeriod = HalfdayPeriodEnum.NULL;

	public HolidayOut name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Public holiday name
	 *
	 * @return name
	 **/
	@Schema(example = "Holiday name", required = true, description = "Public holiday name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HolidayOut start(LocalDate start) {
		this.start = start;
		return this;
	}

	/**
	 * First day of the holiday
	 *
	 * @return start
	 **/
	@Schema(example = "Mon Feb 20 01:00:00 CET 2017", required = true, description = "First day of the holiday")
	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public HolidayOut end(LocalDate end) {
		this.end = end;
		return this;
	}

	/**
	 * Last day of the holiday
	 *
	 * @return end
	 **/
	@Schema(example = "Mon Feb 20 01:00:00 CET 2017", required = true, description = "Last day of the holiday")
	public LocalDate getEnd() {
		return end;
	}

	public void setEnd(LocalDate end) {
		this.end = end;
	}

	public HolidayOut halfDay(Boolean halfDay) {
		this.halfDay = halfDay;
		return this;
	}

	/**
	 * Half day holiday
	 *
	 * @return halfDay
	 **/
	@Schema(required = true, description = "Half day holiday")
	public Boolean isHalfDay() {
		return halfDay;
	}

	public void setHalfDay(Boolean halfDay) {
		this.halfDay = halfDay;
	}

	public HolidayOut halfdayPeriod(HalfdayPeriodEnum halfdayPeriod) {
		this.halfdayPeriod = halfdayPeriod;
		return this;
	}

	/**
	 * If halfDay is true halfdayPeriod tells which part of day is non-working
	 *
	 * @return halfdayPeriod
	 **/
	@Schema(required = true, description = "If halfDay is true halfdayPeriod tells which part of day is non-working")
	public HalfdayPeriodEnum getHalfdayPeriod() {
		return halfdayPeriod;
	}

	public void setHalfdayPeriod(HalfdayPeriodEnum halfdayPeriod) {
		this.halfdayPeriod = halfdayPeriod;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HolidayOut holidayOut = (HolidayOut) o;
		return Objects.equals(this.name, holidayOut.name) && Objects.equals(this.start, holidayOut.start)
				&& Objects.equals(this.end, holidayOut.end) && Objects.equals(this.halfDay, holidayOut.halfDay)
				&& Objects.equals(this.halfdayPeriod, holidayOut.halfdayPeriod);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, start, end, halfDay, halfdayPeriod);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HolidayOut {\n");

		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    start: ").append(toIndentedString(start)).append("\n");
		sb.append("    end: ").append(toIndentedString(end)).append("\n");
		sb.append("    halfDay: ").append(toIndentedString(halfDay)).append("\n");
		sb.append("    halfdayPeriod: ").append(toIndentedString(halfdayPeriod)).append("\n");
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
	 * If halfDay is true halfdayPeriod tells which part of day is non-working
	 */
	@JsonAdapter(HalfdayPeriodEnum.Adapter.class)
	public enum HalfdayPeriodEnum {
		AM("AM"), PM("PM"), NULL("null");

		private String value;

		HalfdayPeriodEnum(String value) {
			this.value = value;
		}

		public static HalfdayPeriodEnum fromValue(String input) {
			for (HalfdayPeriodEnum b : HalfdayPeriodEnum.values()) {
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

		public static class Adapter extends TypeAdapter<HalfdayPeriodEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final HalfdayPeriodEnum enumeration) throws IOException {
				jsonWriter.value(String.valueOf(enumeration.getValue()));
			}

			@Override
			public HalfdayPeriodEnum read(final JsonReader jsonReader) throws IOException {
				Object value = jsonReader.nextString();
				return HalfdayPeriodEnum.fromValue((String) (value));
			}
		}
	}

}
