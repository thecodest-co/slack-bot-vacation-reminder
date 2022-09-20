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
 * Error response.
 */
@Schema(description = "Error response.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class ErrorResponse {
	@SerializedName("message")
	private String message = null;

	@SerializedName("code")
	private String code = null;

	@SerializedName("field")
	private String field = null;

	public ErrorResponse message(String message) {
		this.message = message;
		return this;
	}

	/**
	 * Human readable error explanation.
	 *
	 * @return message
	 **/
	@Schema(example = "Api error", description = "Human readable error explanation.")
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ErrorResponse code(String code) {
		this.code = code;
		return this;
	}

	/**
	 * Error code.
	 *
	 * @return code
	 **/
	@Schema(example = "INVALID_JSON_PAYLOAD", description = "Error code.")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ErrorResponse field(String field) {
		this.field = field;
		return this;
	}

	/**
	 * Which field of payload object caused error. NULL when error is not related to
	 * particular field
	 *
	 * @return field
	 **/
	@Schema(example = "field", description = "Which field of payload object caused error. NULL when error is not related to particular field")
	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ErrorResponse errorResponse = (ErrorResponse) o;
		return Objects.equals(this.message, errorResponse.message) && Objects.equals(this.code, errorResponse.code)
				&& Objects.equals(this.field, errorResponse.field);
	}

	@Override
	public int hashCode() {
		return Objects.hash(message, code, field);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ErrorResponse {\n");

		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    field: ").append(toIndentedString(field)).append("\n");
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