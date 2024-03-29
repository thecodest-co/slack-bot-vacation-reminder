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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PublicCreateEmployeeIn
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-07-06T15:14:15.923389380+02:00[Europe/Warsaw]")
public class PublicCreateEmployeeIn {
	@SerializedName("firstName")
	private String firstName = null;

	@SerializedName("lastName")
	private String lastName = null;

	@SerializedName("email")
	private String email = null;

	@SerializedName("workingWeek")
	private String workingWeek = null;

	@SerializedName("approvalFlow")
	private String approvalFlow = null;

	@SerializedName("position")
	private String position = null;

	@SerializedName("teams")
	private List<String> teams = null;

	@SerializedName("holidaysCalendar")
	private String holidaysCalendar = null;
	@SerializedName("sex")
	private SexEnum sex = null;
	@SerializedName("maritalStatus")
	private MaritalStatusEnum maritalStatus = null;
	@SerializedName("admin")
	private Boolean admin = null;
	@SerializedName("contractType")
	private String contractType = null;
	@SerializedName("externalNumber")
	private String externalNumber = null;
	@SerializedName("directManager")
	private String directManager = null;
	@SerializedName("birthDate")
	private LocalDate birthDate = null;
	@SerializedName("hireDate")
	private LocalDate hireDate = null;
	@SerializedName("businessPhone")
	private String businessPhone = null;
	@SerializedName("homePhone")
	private String homePhone = null;
	@SerializedName("personalEmail")
	private String personalEmail = null;
	@SerializedName("addressStreet")
	private String addressStreet = null;
	@SerializedName("addressNumber")
	private String addressNumber = null;
	@SerializedName("addressCity")
	private String addressCity = null;
	@SerializedName("addressPostalCode")
	private String addressPostalCode = null;
	@SerializedName("addressProvinceState")
	private String addressProvinceState = null;
	@SerializedName("addressCountry")
	private String addressCountry = null;
	@SerializedName("emergencyContactName")
	private String emergencyContactName = null;
	@SerializedName("emergencyContactRelationship")
	private String emergencyContactRelationship = null;
	@SerializedName("emergencyContactPhone")
	private String emergencyContactPhone = null;
	@SerializedName("probationEndDate")
	private LocalDate probationEndDate = null;
	@SerializedName("plannedFiring")
	private LocalDate plannedFiring = null;
	@SerializedName("seniorityBeforeHireYears")
	private Integer seniorityBeforeHireYears = null;
	@SerializedName("seniorityBeforeHireMonths")
	private Integer seniorityBeforeHireMonths = null;
	@SerializedName("childrenCount")
	private Integer childrenCount = null;
	@SerializedName("youngestChildBirthDate")
	private LocalDate youngestChildBirthDate = null;
	@SerializedName("customNote")
	private String customNote = null;

	public PublicCreateEmployeeIn firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * Employee first name
	 *
	 * @return firstName
	 **/
	@Schema(example = "John", required = true, description = "Employee first name")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public PublicCreateEmployeeIn lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * Employee last name
	 *
	 * @return lastName
	 **/
	@Schema(example = "Williams", required = true, description = "Employee last name")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public PublicCreateEmployeeIn email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Employee email
	 *
	 * @return email
	 **/
	@Schema(example = "john.white@mycompany.com", required = true, description = "Employee email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PublicCreateEmployeeIn workingWeek(String workingWeek) {
		this.workingWeek = workingWeek;
		return this;
	}

	/**
	 * Working week name or identifier
	 *
	 * @return workingWeek
	 **/
	@Schema(example = "Working week name", required = true, description = "Working week name or identifier")
	public String getWorkingWeek() {
		return workingWeek;
	}

	public void setWorkingWeek(String workingWeek) {
		this.workingWeek = workingWeek;
	}

	public PublicCreateEmployeeIn approvalFlow(String approvalFlow) {
		this.approvalFlow = approvalFlow;
		return this;
	}

	/**
	 * Approval flow name or identifier
	 *
	 * @return approvalFlow
	 **/
	@Schema(example = "Flow name", required = true, description = "Approval flow name or identifier")
	public String getApprovalFlow() {
		return approvalFlow;
	}

	public void setApprovalFlow(String approvalFlow) {
		this.approvalFlow = approvalFlow;
	}

	public PublicCreateEmployeeIn position(String position) {
		this.position = position;
		return this;
	}

	/**
	 * Position name or identifier.
	 *
	 * @return position
	 **/
	@Schema(example = "Developer", description = "Position name or identifier.")
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public PublicCreateEmployeeIn teams(List<String> teams) {
		this.teams = teams;
		return this;
	}

	public PublicCreateEmployeeIn addTeamsItem(String teamsItem) {
		if (this.teams == null) {
			this.teams = new ArrayList<>();
		}
		this.teams.add(teamsItem);
		return this;
	}

	/**
	 * List of teams names or identifiers. Example: [\&quot;Developers Team\&quot;]
	 *
	 * @return teams
	 **/
	@Schema(description = "List of teams names or identifiers. Example: [\"Developers Team\"]")
	public List<String> getTeams() {
		return teams;
	}

	public void setTeams(List<String> teams) {
		this.teams = teams;
	}

	public PublicCreateEmployeeIn holidaysCalendar(String holidaysCalendar) {
		this.holidaysCalendar = holidaysCalendar;
		return this;
	}

	/**
	 * Holidays calendar name or identifier
	 *
	 * @return holidaysCalendar
	 **/
	@Schema(example = "Primary calendar", required = true, description = "Holidays calendar name or identifier")
	public String getHolidaysCalendar() {
		return holidaysCalendar;
	}

	public void setHolidaysCalendar(String holidaysCalendar) {
		this.holidaysCalendar = holidaysCalendar;
	}

	public PublicCreateEmployeeIn sex(SexEnum sex) {
		this.sex = sex;
		return this;
	}

	/**
	 * Sex
	 *
	 * @return sex
	 **/
	@Schema(required = true, description = "Sex")
	public SexEnum getSex() {
		return sex;
	}

	public void setSex(SexEnum sex) {
		this.sex = sex;
	}

	public PublicCreateEmployeeIn maritalStatus(MaritalStatusEnum maritalStatus) {
		this.maritalStatus = maritalStatus;
		return this;
	}

	/**
	 * Martial status
	 *
	 * @return maritalStatus
	 **/
	@Schema(required = true, description = "Martial status")
	public MaritalStatusEnum getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatusEnum maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public PublicCreateEmployeeIn admin(Boolean admin) {
		this.admin = admin;
		return this;
	}

	/**
	 * Is the employee is an admin?
	 *
	 * @return admin
	 **/
	@Schema(required = true, description = "Is the employee is an admin?")
	public Boolean isAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public PublicCreateEmployeeIn contractType(String contractType) {
		this.contractType = contractType;
		return this;
	}

	/**
	 * Contract type name or identifier
	 *
	 * @return contractType
	 **/
	@Schema(example = "Contract type", description = "Contract type name or identifier")
	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public PublicCreateEmployeeIn externalNumber(String externalNumber) {
		this.externalNumber = externalNumber;
		return this;
	}

	/**
	 * External number
	 *
	 * @return externalNumber
	 **/
	@Schema(example = "A12Y", description = "External number")
	public String getExternalNumber() {
		return externalNumber;
	}

	public void setExternalNumber(String externalNumber) {
		this.externalNumber = externalNumber;
	}

	public PublicCreateEmployeeIn directManager(String directManager) {
		this.directManager = directManager;
		return this;
	}

	/**
	 * Direct manager e-mail or login
	 *
	 * @return directManager
	 **/
	@Schema(example = "john.white@mycompany.com", description = "Direct manager e-mail or login")
	public String getDirectManager() {
		return directManager;
	}

	public void setDirectManager(String directManager) {
		this.directManager = directManager;
	}

	public PublicCreateEmployeeIn birthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
		return this;
	}

	/**
	 * Birth date in ISO format
	 *
	 * @return birthDate
	 **/
	@Schema(example = "Mon Feb 20 01:00:00 CET 2017", description = "Birth date in ISO format")
	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public PublicCreateEmployeeIn hireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
		return this;
	}

	/**
	 * Hire date in ISO format
	 *
	 * @return hireDate
	 **/
	@Schema(example = "Mon Feb 20 01:00:00 CET 2017", description = "Hire date in ISO format")
	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public PublicCreateEmployeeIn businessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
		return this;
	}

	/**
	 * Business phone
	 *
	 * @return businessPhone
	 **/
	@Schema(example = "876234928", description = "Business phone")
	public String getBusinessPhone() {
		return businessPhone;
	}

	public void setBusinessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
	}

	public PublicCreateEmployeeIn homePhone(String homePhone) {
		this.homePhone = homePhone;
		return this;
	}

	/**
	 * Home phone
	 *
	 * @return homePhone
	 **/
	@Schema(example = "283018271", description = "Home phone")
	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public PublicCreateEmployeeIn personalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
		return this;
	}

	/**
	 * Personal email
	 *
	 * @return personalEmail
	 **/
	@Schema(example = "john.white@mycompany.com", description = "Personal email")
	public String getPersonalEmail() {
		return personalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}

	public PublicCreateEmployeeIn addressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
		return this;
	}

	/**
	 * Address street
	 *
	 * @return addressStreet
	 **/
	@Schema(example = "Buckfast Street", description = "Address street")
	public String getAddressStreet() {
		return addressStreet;
	}

	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	public PublicCreateEmployeeIn addressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
		return this;
	}

	/**
	 * Address building/flat number
	 *
	 * @return addressNumber
	 **/
	@Schema(example = "2/20", description = "Address building/flat number")
	public String getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}

	public PublicCreateEmployeeIn addressCity(String addressCity) {
		this.addressCity = addressCity;
		return this;
	}

	/**
	 * Address city
	 *
	 * @return addressCity
	 **/
	@Schema(example = "Warsaw", description = "Address city")
	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public PublicCreateEmployeeIn addressPostalCode(String addressPostalCode) {
		this.addressPostalCode = addressPostalCode;
		return this;
	}

	/**
	 * Address postal code
	 *
	 * @return addressPostalCode
	 **/
	@Schema(example = "12-333", description = "Address postal code")
	public String getAddressPostalCode() {
		return addressPostalCode;
	}

	public void setAddressPostalCode(String addressPostalCode) {
		this.addressPostalCode = addressPostalCode;
	}

	public PublicCreateEmployeeIn addressProvinceState(String addressProvinceState) {
		this.addressProvinceState = addressProvinceState;
		return this;
	}

	/**
	 * Address province/state
	 *
	 * @return addressProvinceState
	 **/
	@Schema(example = "Main Province", description = "Address province/state")
	public String getAddressProvinceState() {
		return addressProvinceState;
	}

	public void setAddressProvinceState(String addressProvinceState) {
		this.addressProvinceState = addressProvinceState;
	}

	public PublicCreateEmployeeIn addressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
		return this;
	}

	/**
	 * Address country
	 *
	 * @return addressCountry
	 **/
	@Schema(example = "Poland", description = "Address country")
	public String getAddressCountry() {
		return addressCountry;
	}

	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}

	public PublicCreateEmployeeIn emergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
		return this;
	}

	/**
	 * Emergency contact name
	 *
	 * @return emergencyContactName
	 **/
	@Schema(example = "Contact name", description = "Emergency contact name")
	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public PublicCreateEmployeeIn emergencyContactRelationship(String emergencyContactRelationship) {
		this.emergencyContactRelationship = emergencyContactRelationship;
		return this;
	}

	/**
	 * Emergency contact relationship
	 *
	 * @return emergencyContactRelationship
	 **/
	@Schema(example = "Contact relationship", description = "Emergency contact relationship")
	public String getEmergencyContactRelationship() {
		return emergencyContactRelationship;
	}

	public void setEmergencyContactRelationship(String emergencyContactRelationship) {
		this.emergencyContactRelationship = emergencyContactRelationship;
	}

	public PublicCreateEmployeeIn emergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
		return this;
	}

	/**
	 * Emergency contact phone
	 *
	 * @return emergencyContactPhone
	 **/
	@Schema(example = "198263098", description = "Emergency contact phone")
	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}

	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}

	public PublicCreateEmployeeIn probationEndDate(LocalDate probationEndDate) {
		this.probationEndDate = probationEndDate;
		return this;
	}

	/**
	 * Probation end date in ISO format
	 *
	 * @return probationEndDate
	 **/
	@Schema(example = "Mon Feb 20 01:00:00 CET 2017", description = "Probation end date in ISO format")
	public LocalDate getProbationEndDate() {
		return probationEndDate;
	}

	public void setProbationEndDate(LocalDate probationEndDate) {
		this.probationEndDate = probationEndDate;
	}

	public PublicCreateEmployeeIn plannedFiring(LocalDate plannedFiring) {
		this.plannedFiring = plannedFiring;
		return this;
	}

	/**
	 * Planned firing in ISO format
	 *
	 * @return plannedFiring
	 **/
	@Schema(example = "Mon Feb 20 01:00:00 CET 2017", description = "Planned firing in ISO format")
	public LocalDate getPlannedFiring() {
		return plannedFiring;
	}

	public void setPlannedFiring(LocalDate plannedFiring) {
		this.plannedFiring = plannedFiring;
	}

	public PublicCreateEmployeeIn seniorityBeforeHireYears(Integer seniorityBeforeHireYears) {
		this.seniorityBeforeHireYears = seniorityBeforeHireYears;
		return this;
	}

	/**
	 * Seniority before hire - years
	 *
	 * @return seniorityBeforeHireYears
	 **/
	@Schema(description = "Seniority before hire - years")
	public Integer getSeniorityBeforeHireYears() {
		return seniorityBeforeHireYears;
	}

	public void setSeniorityBeforeHireYears(Integer seniorityBeforeHireYears) {
		this.seniorityBeforeHireYears = seniorityBeforeHireYears;
	}

	public PublicCreateEmployeeIn seniorityBeforeHireMonths(Integer seniorityBeforeHireMonths) {
		this.seniorityBeforeHireMonths = seniorityBeforeHireMonths;
		return this;
	}

	/**
	 * Seniority before hire - months
	 *
	 * @return seniorityBeforeHireMonths
	 **/
	@Schema(description = "Seniority before hire - months")
	public Integer getSeniorityBeforeHireMonths() {
		return seniorityBeforeHireMonths;
	}

	public void setSeniorityBeforeHireMonths(Integer seniorityBeforeHireMonths) {
		this.seniorityBeforeHireMonths = seniorityBeforeHireMonths;
	}

	public PublicCreateEmployeeIn childrenCount(Integer childrenCount) {
		this.childrenCount = childrenCount;
		return this;
	}

	/**
	 * Number of children
	 *
	 * @return childrenCount
	 **/
	@Schema(description = "Number of children")
	public Integer getChildrenCount() {
		return childrenCount;
	}

	public void setChildrenCount(Integer childrenCount) {
		this.childrenCount = childrenCount;
	}

	public PublicCreateEmployeeIn youngestChildBirthDate(LocalDate youngestChildBirthDate) {
		this.youngestChildBirthDate = youngestChildBirthDate;
		return this;
	}

	/**
	 * The youngest child birth date in ISO format
	 *
	 * @return youngestChildBirthDate
	 **/
	@Schema(example = "Mon Feb 20 01:00:00 CET 2017", description = "The youngest child birth date in ISO format")
	public LocalDate getYoungestChildBirthDate() {
		return youngestChildBirthDate;
	}

	public void setYoungestChildBirthDate(LocalDate youngestChildBirthDate) {
		this.youngestChildBirthDate = youngestChildBirthDate;
	}

	public PublicCreateEmployeeIn customNote(String customNote) {
		this.customNote = customNote;
		return this;
	}

	/**
	 * Custom note
	 *
	 * @return customNote
	 **/
	@Schema(example = "Optional custom note about employee", description = "Custom note")
	public String getCustomNote() {
		return customNote;
	}

	public void setCustomNote(String customNote) {
		this.customNote = customNote;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PublicCreateEmployeeIn publicCreateEmployeeIn = (PublicCreateEmployeeIn) o;
		return Objects.equals(this.firstName, publicCreateEmployeeIn.firstName)
				&& Objects.equals(this.lastName, publicCreateEmployeeIn.lastName)
				&& Objects.equals(this.email, publicCreateEmployeeIn.email)
				&& Objects.equals(this.workingWeek, publicCreateEmployeeIn.workingWeek)
				&& Objects.equals(this.approvalFlow, publicCreateEmployeeIn.approvalFlow)
				&& Objects.equals(this.position, publicCreateEmployeeIn.position)
				&& Objects.equals(this.teams, publicCreateEmployeeIn.teams)
				&& Objects.equals(this.holidaysCalendar, publicCreateEmployeeIn.holidaysCalendar)
				&& Objects.equals(this.sex, publicCreateEmployeeIn.sex)
				&& Objects.equals(this.maritalStatus, publicCreateEmployeeIn.maritalStatus)
				&& Objects.equals(this.admin, publicCreateEmployeeIn.admin)
				&& Objects.equals(this.contractType, publicCreateEmployeeIn.contractType)
				&& Objects.equals(this.externalNumber, publicCreateEmployeeIn.externalNumber)
				&& Objects.equals(this.directManager, publicCreateEmployeeIn.directManager)
				&& Objects.equals(this.birthDate, publicCreateEmployeeIn.birthDate)
				&& Objects.equals(this.hireDate, publicCreateEmployeeIn.hireDate)
				&& Objects.equals(this.businessPhone, publicCreateEmployeeIn.businessPhone)
				&& Objects.equals(this.homePhone, publicCreateEmployeeIn.homePhone)
				&& Objects.equals(this.personalEmail, publicCreateEmployeeIn.personalEmail)
				&& Objects.equals(this.addressStreet, publicCreateEmployeeIn.addressStreet)
				&& Objects.equals(this.addressNumber, publicCreateEmployeeIn.addressNumber)
				&& Objects.equals(this.addressCity, publicCreateEmployeeIn.addressCity)
				&& Objects.equals(this.addressPostalCode, publicCreateEmployeeIn.addressPostalCode)
				&& Objects.equals(this.addressProvinceState, publicCreateEmployeeIn.addressProvinceState)
				&& Objects.equals(this.addressCountry, publicCreateEmployeeIn.addressCountry)
				&& Objects.equals(this.emergencyContactName, publicCreateEmployeeIn.emergencyContactName)
				&& Objects.equals(this.emergencyContactRelationship,
						publicCreateEmployeeIn.emergencyContactRelationship)
				&& Objects.equals(this.emergencyContactPhone, publicCreateEmployeeIn.emergencyContactPhone)
				&& Objects.equals(this.probationEndDate, publicCreateEmployeeIn.probationEndDate)
				&& Objects.equals(this.plannedFiring, publicCreateEmployeeIn.plannedFiring)
				&& Objects.equals(this.seniorityBeforeHireYears, publicCreateEmployeeIn.seniorityBeforeHireYears)
				&& Objects.equals(this.seniorityBeforeHireMonths, publicCreateEmployeeIn.seniorityBeforeHireMonths)
				&& Objects.equals(this.childrenCount, publicCreateEmployeeIn.childrenCount)
				&& Objects.equals(this.youngestChildBirthDate, publicCreateEmployeeIn.youngestChildBirthDate)
				&& Objects.equals(this.customNote, publicCreateEmployeeIn.customNote);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, email, workingWeek, approvalFlow, position, teams, holidaysCalendar,
				sex, maritalStatus, admin, contractType, externalNumber, directManager, birthDate, hireDate,
				businessPhone, homePhone, personalEmail, addressStreet, addressNumber, addressCity, addressPostalCode,
				addressProvinceState, addressCountry, emergencyContactName, emergencyContactRelationship,
				emergencyContactPhone, probationEndDate, plannedFiring, seniorityBeforeHireYears,
				seniorityBeforeHireMonths, childrenCount, youngestChildBirthDate, customNote);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PublicCreateEmployeeIn {\n");

		sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    workingWeek: ").append(toIndentedString(workingWeek)).append("\n");
		sb.append("    approvalFlow: ").append(toIndentedString(approvalFlow)).append("\n");
		sb.append("    position: ").append(toIndentedString(position)).append("\n");
		sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
		sb.append("    holidaysCalendar: ").append(toIndentedString(holidaysCalendar)).append("\n");
		sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
		sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
		sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
		sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
		sb.append("    externalNumber: ").append(toIndentedString(externalNumber)).append("\n");
		sb.append("    directManager: ").append(toIndentedString(directManager)).append("\n");
		sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
		sb.append("    hireDate: ").append(toIndentedString(hireDate)).append("\n");
		sb.append("    businessPhone: ").append(toIndentedString(businessPhone)).append("\n");
		sb.append("    homePhone: ").append(toIndentedString(homePhone)).append("\n");
		sb.append("    personalEmail: ").append(toIndentedString(personalEmail)).append("\n");
		sb.append("    addressStreet: ").append(toIndentedString(addressStreet)).append("\n");
		sb.append("    addressNumber: ").append(toIndentedString(addressNumber)).append("\n");
		sb.append("    addressCity: ").append(toIndentedString(addressCity)).append("\n");
		sb.append("    addressPostalCode: ").append(toIndentedString(addressPostalCode)).append("\n");
		sb.append("    addressProvinceState: ").append(toIndentedString(addressProvinceState)).append("\n");
		sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
		sb.append("    emergencyContactName: ").append(toIndentedString(emergencyContactName)).append("\n");
		sb.append("    emergencyContactRelationship: ").append(toIndentedString(emergencyContactRelationship))
				.append("\n");
		sb.append("    emergencyContactPhone: ").append(toIndentedString(emergencyContactPhone)).append("\n");
		sb.append("    probationEndDate: ").append(toIndentedString(probationEndDate)).append("\n");
		sb.append("    plannedFiring: ").append(toIndentedString(plannedFiring)).append("\n");
		sb.append("    seniorityBeforeHireYears: ").append(toIndentedString(seniorityBeforeHireYears)).append("\n");
		sb.append("    seniorityBeforeHireMonths: ").append(toIndentedString(seniorityBeforeHireMonths)).append("\n");
		sb.append("    childrenCount: ").append(toIndentedString(childrenCount)).append("\n");
		sb.append("    youngestChildBirthDate: ").append(toIndentedString(youngestChildBirthDate)).append("\n");
		sb.append("    customNote: ").append(toIndentedString(customNote)).append("\n");
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

	/**
	 * Sex
	 */
	@JsonAdapter(SexEnum.Adapter.class)
	public enum SexEnum {
		MALE("MALE"), FEMALE("FEMALE"), OTHER("OTHER"), NOT_SET("NOT_SET");

		private String value;

		SexEnum(String value) {
			this.value = value;
		}

		public static SexEnum fromValue(String input) {
			for (SexEnum b : SexEnum.values()) {
				if (b.value.equals(input)) {
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

		public static class Adapter extends TypeAdapter<SexEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final SexEnum enumeration) throws IOException {
				jsonWriter.value(String.valueOf(enumeration.getValue()));
			}

			@Override
			public SexEnum read(final JsonReader jsonReader) throws IOException {
				Object value = jsonReader.nextString();
				return SexEnum.fromValue((String) (value));
			}
		}
	}

	/**
	 * Martial status
	 */
	@JsonAdapter(MaritalStatusEnum.Adapter.class)
	public enum MaritalStatusEnum {
		SINGLE("SINGLE"), MARRIED("MARRIED"), WIDOWED("WIDOWED"), SEPARATED("SEPARATED"), DIVORCED("DIVORCED"), NOT_SET(
				"NOT_SET");

		private String value;

		MaritalStatusEnum(String value) {
			this.value = value;
		}

		public static MaritalStatusEnum fromValue(String input) {
			for (MaritalStatusEnum b : MaritalStatusEnum.values()) {
				if (b.value.equals(input)) {
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

		public static class Adapter extends TypeAdapter<MaritalStatusEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final MaritalStatusEnum enumeration) throws IOException {
				jsonWriter.value(String.valueOf(enumeration.getValue()));
			}

			@Override
			public MaritalStatusEnum read(final JsonReader jsonReader) throws IOException {
				Object value = jsonReader.nextString();
				return MaritalStatusEnum.fromValue((String) (value));
			}
		}
	}

}
