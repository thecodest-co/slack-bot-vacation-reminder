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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * BreakDto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class BreakDto {
	@SerializedName("from")
	private OffsetDateTime from = null;

	@SerializedName("to")
	private OffsetDateTime to = null;

	@SerializedName("duration")
	private Long duration = null;

	@SerializedName("breakType")
	private BreakTypeOut breakType = null;

	public BreakDto from(OffsetDateTime from) {
		this.from = from;
		return this;
	}

	/**
	 * Date and time when break was started.
	 *
	 * @return from
	 **/
	@Schema(description = "Date and time when break was started.")
	public OffsetDateTime getFrom() {
		return from;
	}

	public void setFrom(OffsetDateTime from) {
		this.from = from;
	}

	public BreakDto to(OffsetDateTime to) {
		this.to = to;
		return this;
	}

	/**
	 * Date and time when break was finished. Has null value if break was not finished
	 *
	 * @return to
	 **/
	@Schema(description = "Date and time when break was finished. Has null value if break was not finished")
	public OffsetDateTime getTo() {
		return to;
	}

	public void setTo(OffsetDateTime to) {
		this.to = to;
	}

	public BreakDto duration(Long duration) {
		this.duration = duration;
		return this;
	}

	/**
	 * Duration of a break in seconds. Has null value if break was not finished.
	 *
	 * @return duration
	 **/
	@Schema(example = "28800", description = "Duration of a break in seconds. Has null value if break was not finished.")
	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public BreakDto breakType(BreakTypeOut breakType) {
		this.breakType = breakType;
		return this;
	}

	/**
	 * Get breakType
	 *
	 * @return breakType
	 **/
	@Schema(description = "")
	public BreakTypeOut getBreakType() {
		return breakType;
	}

	public void setBreakType(BreakTypeOut breakType) {
		this.breakType = breakType;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		BreakDto breakDto = (BreakDto) o;
		return Objects.equals(this.from, breakDto.from) && Objects.equals(this.to, breakDto.to) && Objects.equals(this.duration, breakDto.duration) && Objects.equals(this.breakType, breakDto.breakType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(from, to, duration, breakType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BreakDto {\n");

		sb.append("    from: ").append(toIndentedString(from)).append("\n");
		sb.append("    to: ").append(toIndentedString(to)).append("\n");
		sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
		sb.append("    breakType: ").append(toIndentedString(breakType)).append("\n");
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
