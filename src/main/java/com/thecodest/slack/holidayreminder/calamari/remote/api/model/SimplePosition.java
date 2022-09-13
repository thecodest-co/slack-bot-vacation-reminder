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
 * SimplePosition
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class SimplePosition {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("name")
	private String name = null;

	public SimplePosition id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Position id
	 *
	 * @return id
	 **/
	@Schema(required = true, description = "Position id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SimplePosition name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Position name
	 *
	 * @return name
	 **/
	@Schema(example = "Developer", required = true, description = "Position name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		SimplePosition simplePosition = (SimplePosition) o;
		return Objects.equals(this.id, simplePosition.id) && Objects.equals(this.name, simplePosition.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SimplePosition {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
