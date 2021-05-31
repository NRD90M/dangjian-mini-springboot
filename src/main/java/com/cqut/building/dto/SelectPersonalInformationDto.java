package com.cqut.building.dto;

import java.util.List;

public class SelectPersonalInformationDto {
    private String  partyId;


    /**
     * 书记1、党员0
     */
    private String isSecretary;
    /**
     * 学生0、老师1
     */
    private String type;
    /**
     * 名字
     */
    private String name;
    /**
     * 学号工号
     */
    private String studentJobNumber;

    /**
     * 联系方式
     */
    private String telNumber;

    /**
     * 存职务和对应组织
     */
    private List<OrganizationPositionDto> organizationPosition;

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public List<OrganizationPositionDto> getOrganizationPosition() {
        return organizationPosition;
    }

    public void setOrganizationPosition(List<OrganizationPositionDto> organizationPosition) {
        this.organizationPosition = organizationPosition;
    }

    public String getIsSecretary() {
        return isSecretary;
    }

    public void setIsSecretary(String isSecretary) {
        this.isSecretary = isSecretary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentJobNumber() {
        return studentJobNumber;
    }

    public void setStudentJobNumber(String studentJobNumber) {
        this.studentJobNumber = studentJobNumber;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
}
