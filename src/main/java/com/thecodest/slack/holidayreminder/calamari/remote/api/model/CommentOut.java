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
 * CommentOut
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class CommentOut {
	@SerializedName("commentator")
	private EmployeeSimpleOut commentator = null;

	@SerializedName("content")
	private String content = null;

	@SerializedName("absenceRequestId")
	private Long absenceRequestId = null;

	public CommentOut commentator(EmployeeSimpleOut commentator) {
		this.commentator = commentator;
		return this;
	}

	/**
	 * Get commentator
	 *
	 * @return commentator
	 **/
	@Schema(required = true, description = "")
	public EmployeeSimpleOut getCommentator() {
		return commentator;
	}

	public void setCommentator(EmployeeSimpleOut commentator) {
		this.commentator = commentator;
	}

	public CommentOut content(String content) {
		this.content = content;
		return this;
	}

	/**
	 * Comment content
	 *
	 * @return content
	 **/
	@Schema(required = true, description = "Comment content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public CommentOut absenceRequestId(Long absenceRequestId) {
		this.absenceRequestId = absenceRequestId;
		return this;
	}

	/**
	 * Absence request ID
	 *
	 * @return absenceRequestId
	 **/
	@Schema(required = true, description = "Absence request ID")
	public Long getAbsenceRequestId() {
		return absenceRequestId;
	}

	public void setAbsenceRequestId(Long absenceRequestId) {
		this.absenceRequestId = absenceRequestId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CommentOut commentOut = (CommentOut) o;
		return Objects.equals(this.commentator, commentOut.commentator)
				&& Objects.equals(this.content, commentOut.content)
				&& Objects.equals(this.absenceRequestId, commentOut.absenceRequestId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(commentator, content, absenceRequestId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CommentOut {\n");

		sb.append("    commentator: ").append(toIndentedString(commentator)).append("\n");
		sb.append("    content: ").append(toIndentedString(content)).append("\n");
		sb.append("    absenceRequestId: ").append(toIndentedString(absenceRequestId)).append("\n");
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
