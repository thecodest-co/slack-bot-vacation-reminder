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
 * LocalDateTime
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class LocalDateTime {
	@SerializedName("year")
	private Integer year = null;

	@SerializedName("dayOfMonth")
	private Integer dayOfMonth = null;

	@SerializedName("chronology")
	private Chronology chronology = null;

	@SerializedName("dayOfWeek")
	private Integer dayOfWeek = null;

	@SerializedName("dayOfYear")
	private Integer dayOfYear = null;

	@SerializedName("era")
	private Integer era = null;

	@SerializedName("millisOfDay")
	private Integer millisOfDay = null;

	@SerializedName("centuryOfEra")
	private Integer centuryOfEra = null;

	@SerializedName("yearOfEra")
	private Integer yearOfEra = null;

	@SerializedName("yearOfCentury")
	private Integer yearOfCentury = null;

	@SerializedName("weekyear")
	private Integer weekyear = null;

	@SerializedName("monthOfYear")
	private Integer monthOfYear = null;

	@SerializedName("weekOfWeekyear")
	private Integer weekOfWeekyear = null;

	@SerializedName("hourOfDay")
	private Integer hourOfDay = null;

	@SerializedName("minuteOfHour")
	private Integer minuteOfHour = null;

	@SerializedName("secondOfMinute")
	private Integer secondOfMinute = null;

	@SerializedName("millisOfSecond")
	private Integer millisOfSecond = null;

	@SerializedName("fields")
	private List<DateTimeField> fields = null;

	@SerializedName("values")
	private List<Integer> values = null;

	@SerializedName("fieldTypes")
	private List<DateTimeFieldType> fieldTypes = null;

	public LocalDateTime year(Integer year) {
		this.year = year;
		return this;
	}

	/**
	 * Get year
	 *
	 * @return year
	 **/
	@Schema(description = "")
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public LocalDateTime dayOfMonth(Integer dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
		return this;
	}

	/**
	 * Get dayOfMonth
	 *
	 * @return dayOfMonth
	 **/
	@Schema(description = "")
	public Integer getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(Integer dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public LocalDateTime chronology(Chronology chronology) {
		this.chronology = chronology;
		return this;
	}

	/**
	 * Get chronology
	 *
	 * @return chronology
	 **/
	@Schema(description = "")
	public Chronology getChronology() {
		return chronology;
	}

	public void setChronology(Chronology chronology) {
		this.chronology = chronology;
	}

	public LocalDateTime dayOfWeek(Integer dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
		return this;
	}

	/**
	 * Get dayOfWeek
	 *
	 * @return dayOfWeek
	 **/
	@Schema(description = "")
	public Integer getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(Integer dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public LocalDateTime dayOfYear(Integer dayOfYear) {
		this.dayOfYear = dayOfYear;
		return this;
	}

	/**
	 * Get dayOfYear
	 *
	 * @return dayOfYear
	 **/
	@Schema(description = "")
	public Integer getDayOfYear() {
		return dayOfYear;
	}

	public void setDayOfYear(Integer dayOfYear) {
		this.dayOfYear = dayOfYear;
	}

	public LocalDateTime era(Integer era) {
		this.era = era;
		return this;
	}

	/**
	 * Get era
	 *
	 * @return era
	 **/
	@Schema(description = "")
	public Integer getEra() {
		return era;
	}

	public void setEra(Integer era) {
		this.era = era;
	}

	public LocalDateTime millisOfDay(Integer millisOfDay) {
		this.millisOfDay = millisOfDay;
		return this;
	}

	/**
	 * Get millisOfDay
	 *
	 * @return millisOfDay
	 **/
	@Schema(description = "")
	public Integer getMillisOfDay() {
		return millisOfDay;
	}

	public void setMillisOfDay(Integer millisOfDay) {
		this.millisOfDay = millisOfDay;
	}

	public LocalDateTime centuryOfEra(Integer centuryOfEra) {
		this.centuryOfEra = centuryOfEra;
		return this;
	}

	/**
	 * Get centuryOfEra
	 *
	 * @return centuryOfEra
	 **/
	@Schema(description = "")
	public Integer getCenturyOfEra() {
		return centuryOfEra;
	}

	public void setCenturyOfEra(Integer centuryOfEra) {
		this.centuryOfEra = centuryOfEra;
	}

	public LocalDateTime yearOfEra(Integer yearOfEra) {
		this.yearOfEra = yearOfEra;
		return this;
	}

	/**
	 * Get yearOfEra
	 *
	 * @return yearOfEra
	 **/
	@Schema(description = "")
	public Integer getYearOfEra() {
		return yearOfEra;
	}

	public void setYearOfEra(Integer yearOfEra) {
		this.yearOfEra = yearOfEra;
	}

	public LocalDateTime yearOfCentury(Integer yearOfCentury) {
		this.yearOfCentury = yearOfCentury;
		return this;
	}

	/**
	 * Get yearOfCentury
	 *
	 * @return yearOfCentury
	 **/
	@Schema(description = "")
	public Integer getYearOfCentury() {
		return yearOfCentury;
	}

	public void setYearOfCentury(Integer yearOfCentury) {
		this.yearOfCentury = yearOfCentury;
	}

	public LocalDateTime weekyear(Integer weekyear) {
		this.weekyear = weekyear;
		return this;
	}

	/**
	 * Get weekyear
	 *
	 * @return weekyear
	 **/
	@Schema(description = "")
	public Integer getWeekyear() {
		return weekyear;
	}

	public void setWeekyear(Integer weekyear) {
		this.weekyear = weekyear;
	}

	public LocalDateTime monthOfYear(Integer monthOfYear) {
		this.monthOfYear = monthOfYear;
		return this;
	}

	/**
	 * Get monthOfYear
	 *
	 * @return monthOfYear
	 **/
	@Schema(description = "")
	public Integer getMonthOfYear() {
		return monthOfYear;
	}

	public void setMonthOfYear(Integer monthOfYear) {
		this.monthOfYear = monthOfYear;
	}

	public LocalDateTime weekOfWeekyear(Integer weekOfWeekyear) {
		this.weekOfWeekyear = weekOfWeekyear;
		return this;
	}

	/**
	 * Get weekOfWeekyear
	 *
	 * @return weekOfWeekyear
	 **/
	@Schema(description = "")
	public Integer getWeekOfWeekyear() {
		return weekOfWeekyear;
	}

	public void setWeekOfWeekyear(Integer weekOfWeekyear) {
		this.weekOfWeekyear = weekOfWeekyear;
	}

	public LocalDateTime hourOfDay(Integer hourOfDay) {
		this.hourOfDay = hourOfDay;
		return this;
	}

	/**
	 * Get hourOfDay
	 *
	 * @return hourOfDay
	 **/
	@Schema(description = "")
	public Integer getHourOfDay() {
		return hourOfDay;
	}

	public void setHourOfDay(Integer hourOfDay) {
		this.hourOfDay = hourOfDay;
	}

	public LocalDateTime minuteOfHour(Integer minuteOfHour) {
		this.minuteOfHour = minuteOfHour;
		return this;
	}

	/**
	 * Get minuteOfHour
	 *
	 * @return minuteOfHour
	 **/
	@Schema(description = "")
	public Integer getMinuteOfHour() {
		return minuteOfHour;
	}

	public void setMinuteOfHour(Integer minuteOfHour) {
		this.minuteOfHour = minuteOfHour;
	}

	public LocalDateTime secondOfMinute(Integer secondOfMinute) {
		this.secondOfMinute = secondOfMinute;
		return this;
	}

	/**
	 * Get secondOfMinute
	 *
	 * @return secondOfMinute
	 **/
	@Schema(description = "")
	public Integer getSecondOfMinute() {
		return secondOfMinute;
	}

	public void setSecondOfMinute(Integer secondOfMinute) {
		this.secondOfMinute = secondOfMinute;
	}

	public LocalDateTime millisOfSecond(Integer millisOfSecond) {
		this.millisOfSecond = millisOfSecond;
		return this;
	}

	/**
	 * Get millisOfSecond
	 *
	 * @return millisOfSecond
	 **/
	@Schema(description = "")
	public Integer getMillisOfSecond() {
		return millisOfSecond;
	}

	public void setMillisOfSecond(Integer millisOfSecond) {
		this.millisOfSecond = millisOfSecond;
	}

	public LocalDateTime fields(List<DateTimeField> fields) {
		this.fields = fields;
		return this;
	}

	public LocalDateTime addFieldsItem(DateTimeField fieldsItem) {
		if (this.fields == null) {
			this.fields = new ArrayList<>();
		}
		this.fields.add(fieldsItem);
		return this;
	}

	/**
	 * Get fields
	 *
	 * @return fields
	 **/
	@Schema(description = "")
	public List<DateTimeField> getFields() {
		return fields;
	}

	public void setFields(List<DateTimeField> fields) {
		this.fields = fields;
	}

	public LocalDateTime values(List<Integer> values) {
		this.values = values;
		return this;
	}

	public LocalDateTime addValuesItem(Integer valuesItem) {
		if (this.values == null) {
			this.values = new ArrayList<>();
		}
		this.values.add(valuesItem);
		return this;
	}

	/**
	 * Get values
	 *
	 * @return values
	 **/
	@Schema(description = "")
	public List<Integer> getValues() {
		return values;
	}

	public void setValues(List<Integer> values) {
		this.values = values;
	}

	public LocalDateTime fieldTypes(List<DateTimeFieldType> fieldTypes) {
		this.fieldTypes = fieldTypes;
		return this;
	}

	public LocalDateTime addFieldTypesItem(DateTimeFieldType fieldTypesItem) {
		if (this.fieldTypes == null) {
			this.fieldTypes = new ArrayList<>();
		}
		this.fieldTypes.add(fieldTypesItem);
		return this;
	}

	/**
	 * Get fieldTypes
	 *
	 * @return fieldTypes
	 **/
	@Schema(description = "")
	public List<DateTimeFieldType> getFieldTypes() {
		return fieldTypes;
	}

	public void setFieldTypes(List<DateTimeFieldType> fieldTypes) {
		this.fieldTypes = fieldTypes;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LocalDateTime localDateTime = (LocalDateTime) o;
		return Objects.equals(this.year, localDateTime.year)
				&& Objects.equals(this.dayOfMonth, localDateTime.dayOfMonth)
				&& Objects.equals(this.chronology, localDateTime.chronology)
				&& Objects.equals(this.dayOfWeek, localDateTime.dayOfWeek)
				&& Objects.equals(this.dayOfYear, localDateTime.dayOfYear)
				&& Objects.equals(this.era, localDateTime.era)
				&& Objects.equals(this.millisOfDay, localDateTime.millisOfDay)
				&& Objects.equals(this.centuryOfEra, localDateTime.centuryOfEra)
				&& Objects.equals(this.yearOfEra, localDateTime.yearOfEra)
				&& Objects.equals(this.yearOfCentury, localDateTime.yearOfCentury)
				&& Objects.equals(this.weekyear, localDateTime.weekyear)
				&& Objects.equals(this.monthOfYear, localDateTime.monthOfYear)
				&& Objects.equals(this.weekOfWeekyear, localDateTime.weekOfWeekyear)
				&& Objects.equals(this.hourOfDay, localDateTime.hourOfDay)
				&& Objects.equals(this.minuteOfHour, localDateTime.minuteOfHour)
				&& Objects.equals(this.secondOfMinute, localDateTime.secondOfMinute)
				&& Objects.equals(this.millisOfSecond, localDateTime.millisOfSecond)
				&& Objects.equals(this.fields, localDateTime.fields)
				&& Objects.equals(this.values, localDateTime.values)
				&& Objects.equals(this.fieldTypes, localDateTime.fieldTypes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(year, dayOfMonth, chronology, dayOfWeek, dayOfYear, era, millisOfDay, centuryOfEra,
				yearOfEra, yearOfCentury, weekyear, monthOfYear, weekOfWeekyear, hourOfDay, minuteOfHour,
				secondOfMinute, millisOfSecond, fields, values, fieldTypes);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LocalDateTime {\n");

		sb.append("    year: ").append(toIndentedString(year)).append("\n");
		sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
		sb.append("    chronology: ").append(toIndentedString(chronology)).append("\n");
		sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
		sb.append("    dayOfYear: ").append(toIndentedString(dayOfYear)).append("\n");
		sb.append("    era: ").append(toIndentedString(era)).append("\n");
		sb.append("    millisOfDay: ").append(toIndentedString(millisOfDay)).append("\n");
		sb.append("    centuryOfEra: ").append(toIndentedString(centuryOfEra)).append("\n");
		sb.append("    yearOfEra: ").append(toIndentedString(yearOfEra)).append("\n");
		sb.append("    yearOfCentury: ").append(toIndentedString(yearOfCentury)).append("\n");
		sb.append("    weekyear: ").append(toIndentedString(weekyear)).append("\n");
		sb.append("    monthOfYear: ").append(toIndentedString(monthOfYear)).append("\n");
		sb.append("    weekOfWeekyear: ").append(toIndentedString(weekOfWeekyear)).append("\n");
		sb.append("    hourOfDay: ").append(toIndentedString(hourOfDay)).append("\n");
		sb.append("    minuteOfHour: ").append(toIndentedString(minuteOfHour)).append("\n");
		sb.append("    secondOfMinute: ").append(toIndentedString(secondOfMinute)).append("\n");
		sb.append("    millisOfSecond: ").append(toIndentedString(millisOfSecond)).append("\n");
		sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
		sb.append("    values: ").append(toIndentedString(values)).append("\n");
		sb.append("    fieldTypes: ").append(toIndentedString(fieldTypes)).append("\n");
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
