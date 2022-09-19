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
 * DailyPresenceReport
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class DailyPresenceReport {
	@SerializedName("date")
	private String date = null;

	@SerializedName("dailyPresenceReport")
	private List<EmployeePresenceStatus> dailyPresenceReport = new ArrayList<>();

	public DailyPresenceReport date(String date) {
		this.date = date;
		return this;
	}

	/**
	 * Date of the daily report
	 *
	 * @return date
	 **/
	@Schema(example = "2021-01-01", required = true, description = "Date of the daily report")
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public DailyPresenceReport dailyPresenceReport(List<EmployeePresenceStatus> dailyPresenceReport) {
		this.dailyPresenceReport = dailyPresenceReport;
		return this;
	}

	public DailyPresenceReport addDailyPresenceReportItem(EmployeePresenceStatus dailyPresenceReportItem) {
		this.dailyPresenceReport.add(dailyPresenceReportItem);
		return this;
	}

	/**
	 * Daily employees presence reports
	 *
	 * @return dailyPresenceReport
	 **/
	@Schema(required = true, description = "Daily employees presence reports")
	public List<EmployeePresenceStatus> getDailyPresenceReport() {
		return dailyPresenceReport;
	}

	public void setDailyPresenceReport(List<EmployeePresenceStatus> dailyPresenceReport) {
		this.dailyPresenceReport = dailyPresenceReport;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DailyPresenceReport dailyPresenceReport = (DailyPresenceReport) o;
		return Objects.equals(this.date, dailyPresenceReport.date)
				&& Objects.equals(this.dailyPresenceReport, dailyPresenceReport.dailyPresenceReport);
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, dailyPresenceReport);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DailyPresenceReport {\n");

		sb.append("    date: ").append(toIndentedString(date)).append("\n");
		sb.append("    dailyPresenceReport: ").append(toIndentedString(dailyPresenceReport)).append("\n");
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