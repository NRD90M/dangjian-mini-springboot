package com.cqut.building.entity;

import java.util.Date;

public class serviceChangeOrganization {


	private String id;

	private String userNumber;

	private String userName;

	private String userSex;

	private String orginOrganizationId;

	private String targetOrganizationId;

	private String userNation;

	private String changeReason;

	private Boolean state;

	private Boolean progress;

	private Date applicationDate;

	private Date birthday;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getOrginOrganizationId() {
		return orginOrganizationId;
	}

	public void setOrginOrganizationId(String orginOrganizationId) {
		this.orginOrganizationId = orginOrganizationId;
	}

	public String getTargetOrganizationId() {
		return targetOrganizationId;
	}

	public void setTargetOrganizationId(String targetOrganizationId) {
		this.targetOrganizationId = targetOrganizationId;
	}

	public String getUserNation() {
		return userNation;
	}

	public void setUserNation(String userNation) {
		this.userNation = userNation;
	}

	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public Boolean getProgress() {
		return progress;
	}

	public void setProgress(Boolean progress) {
		this.progress = progress;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}