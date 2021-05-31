package com.cqut.building.dto;

import java.util.Date;

public class IsAuditedDataDto {
    /**
     * id
     */
    private String id;

    /**
     * 学号工号
     */
    private String snoOrJobNumber;

    /**
     * 名称
     */
    private String name;

    /**
     * 联系方式
     */
    private String contact;

    /**
     * 组织id
     */
    private String organizationId;

    /**
     * 职务id
     */
    private String positionId;


    //分类
    private String classification;


    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSnoOrJobNumber() {
        return snoOrJobNumber;
    }

    public void setSnoOrJobNumber(String snoOrJobNumber) {
        this.snoOrJobNumber = snoOrJobNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }
}
