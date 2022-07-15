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
 * BalanceOut
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class BalanceOut {
	@SerializedName("unit")
	private UnitEnum unit = null;
	@SerializedName("unlimited")
	private Boolean unlimited = null;
	@SerializedName("amount")
	private Integer amount = null;

	public BalanceOut unit(UnitEnum unit) {
		this.unit = unit;
		return this;
	}

	/**
	 * Duration unit
	 *
	 * @return unit
	 **/
	@Schema(required = true, description = "Duration unit")
	public UnitEnum getUnit() {
		return unit;
	}

	public void setUnit(UnitEnum unit) {
		this.unit = unit;
	}

	public BalanceOut unlimited(Boolean unlimited) {
		this.unlimited = unlimited;
		return this;
	}

	/**
	 * Is entitlement balance unlimited?
	 *
	 * @return unlimited
	 **/
	@Schema(required = true, description = "Is entitlement balance unlimited?")
	public Boolean isUnlimited() {
		return unlimited;
	}

	public void setUnlimited(Boolean unlimited) {
		this.unlimited = unlimited;
	}

	public BalanceOut amount(Integer amount) {
		this.amount = amount;
		return this;
	}

	/**
	 * Entitlement balance amount
	 *
	 * @return amount
	 **/
	@Schema(required = true, description = "Entitlement balance amount")
	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		BalanceOut balanceOut = (BalanceOut) o;
		return Objects.equals(this.unit, balanceOut.unit) && Objects.equals(this.unlimited, balanceOut.unlimited) && Objects.equals(this.amount, balanceOut.amount);
	}

	@Override
	public int hashCode() {
		return Objects.hash(unit, unlimited, amount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BalanceOut {\n");

		sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
		sb.append("    unlimited: ").append(toIndentedString(unlimited)).append("\n");
		sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
	 * Duration unit
	 */
	@JsonAdapter(UnitEnum.Adapter.class)
	public enum UnitEnum {
		_HOURS("[HOURS"), DAYS_("DAYS]");

		private String value;

		UnitEnum(String value) {
			this.value = value;
		}

		public static UnitEnum fromValue(String input) {
			for(UnitEnum b : UnitEnum.values()) {
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

		public static class Adapter extends TypeAdapter<UnitEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
				jsonWriter.value(String.valueOf(enumeration.getValue()));
			}

			@Override
			public UnitEnum read(final JsonReader jsonReader) throws IOException {
				Object value = jsonReader.nextString();
				return UnitEnum.fromValue((String) (value));
			}
		}
	}

}
