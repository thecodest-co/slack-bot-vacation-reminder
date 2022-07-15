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
 * ModifyBalanceOut
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class ModifyBalanceOut {
	@SerializedName("result")
	private ResultEnum result = null;

	public ModifyBalanceOut result(ResultEnum result) {
		this.result = result;
		return this;
	}

	/**
	 * Result of modify entitlement
	 *
	 * @return result
	 **/
	@Schema(required = true, description = "Result of modify entitlement")
	public ResultEnum getResult() {
		return result;
	}

	public void setResult(ResultEnum result) {
		this.result = result;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		ModifyBalanceOut modifyBalanceOut = (ModifyBalanceOut) o;
		return Objects.equals(this.result, modifyBalanceOut.result);
	}

	@Override
	public int hashCode() {
		return Objects.hash(result);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ModifyBalanceOut {\n");

		sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
	 * Result of modify entitlement
	 */
	@JsonAdapter(ResultEnum.Adapter.class)
	public enum ResultEnum {
		ENTITLEMENT_MODIFIED("ENTITLEMENT_MODIFIED");

		private String value;

		ResultEnum(String value) {
			this.value = value;
		}

		public static ResultEnum fromValue(String input) {
			for(ResultEnum b : ResultEnum.values()) {
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

		public static class Adapter extends TypeAdapter<ResultEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final ResultEnum enumeration) throws IOException {
				jsonWriter.value(String.valueOf(enumeration.getValue()));
			}

			@Override
			public ResultEnum read(final JsonReader jsonReader) throws IOException {
				Object value = jsonReader.nextString();
				return ResultEnum.fromValue((String) (value));
			}
		}
	}

}
