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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CreatePositionIn
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class CreatePositionIn {
	@SerializedName("positionName")
	private String positionName = null;

	@SerializedName("members")
	private List<Long> members = new ArrayList<>();

	public CreatePositionIn positionName(String positionName) {
		this.positionName = positionName;
		return this;
	}

	/**
	 * Position name.
	 *
	 * @return positionName
	 **/
	@Schema(example = "Manager", required = true, description = "Position name.")
	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public CreatePositionIn members(List<Long> members) {
		this.members = members;
		return this;
	}

	public CreatePositionIn addMembersItem(Long membersItem) {
		this.members.add(membersItem);
		return this;
	}

	/**
	 * Ids of employees in the position.
	 *
	 * @return members
	 **/
	@Schema(required = true, description = "Ids of employees in the position.")
	public List<Long> getMembers() {
		return members;
	}

	public void setMembers(List<Long> members) {
		this.members = members;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CreatePositionIn createPositionIn = (CreatePositionIn) o;
		return Objects.equals(this.positionName, createPositionIn.positionName)
				&& Objects.equals(this.members, createPositionIn.members);
	}

	@Override
	public int hashCode() {
		return Objects.hash(positionName, members);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CreatePositionIn {\n");

		sb.append("    positionName: ").append(toIndentedString(positionName)).append("\n");
		sb.append("    members: ").append(toIndentedString(members)).append("\n");
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