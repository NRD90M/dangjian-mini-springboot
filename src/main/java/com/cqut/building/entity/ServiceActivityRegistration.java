package com.cqut.building.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ServiceActivityRegistration {
    private String id;

    private String volunteerActivityId;

    private String applicantId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
    private Date registrationTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVolunteerActivityId() {
        return volunteerActivityId;
    }

    public void setVolunteerActivityId(String volunteerActivityId) {
        this.volunteerActivityId = volunteerActivityId == null ? null : volunteerActivityId.trim();
    }

    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId == null ? null : applicantId.trim();
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }
}