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
 * Breaks
 */
@Schema(description = "Breaks")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class BreakDtoIn {
	@SerializedName("breakType")
	private Long breakType = null;

	@SerializedName("breakStart")
	private LocalDateTime breakStart = null;

	@SerializedName("breakEnd")
	private LocalDateTime breakEnd = null;

	public BreakDtoIn breakType(Long breakType) {
		this.breakType = breakType;
		return this;
	}

	/**
	 * ID break type
	 *
	 * @return breakType
	 **/
	@Schema(example = "1", required = true, description = "ID break type")
	public Long getBreakType() {
		return breakType;
	}

	public void setBreakType(Long breakType) {
		this.breakType = breakType;
	}

	public BreakDtoIn breakStart(LocalDateTime breakStart) {
		this.breakStart = breakStart;
		return this;
	}

	/**
	 * Get breakStart
	 *
	 * @return breakStart
	 **/
	@Schema(required = true, description = "")
	public LocalDateTime getBreakStart() {
		return breakStart;
	}

	public void setBreakStart(LocalDateTime breakStart) {
		this.breakStart = breakStart;
	}

	public BreakDtoIn breakEnd(LocalDateTime breakEnd) {
		this.breakEnd = breakEnd;
		return this;
	}

	/**
	 * Get breakEnd
	 *
	 * @return breakEnd
	 **/
	@Schema(required = true, description = "")
	public LocalDateTime getBreakEnd() {
		return breakEnd;
	}

	public void setBreakEnd(LocalDateTime breakEnd) {
		this.breakEnd = breakEnd;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BreakDtoIn breakDtoIn = (BreakDtoIn) o;
		return Objects.equals(this.breakType, breakDtoIn.breakType)
				&& Objects.equals(this.breakStart, breakDtoIn.breakStart)
				&& Objects.equals(this.breakEnd, breakDtoIn.breakEnd);
	}

	@Override
	public int hashCode() {
		return Objects.hash(breakType, breakStart, breakEnd);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BreakDtoIn {\n");

		sb.append("    breakType: ").append(toIndentedString(breakType)).append("\n");
		sb.append("    breakStart: ").append(toIndentedString(breakStart)).append("\n");
		sb.append("    breakEnd: ").append(toIndentedString(breakEnd)).append("\n");
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
