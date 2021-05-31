package com.cqut.building.entity;

import java.util.Date;

/**
 * 党员信息表
 * 对应表：sys_party_member_information
 */
public class SysPartyMemberInformation {
    private String id;

    private String snoOrJobNumber;

    private String name;


    private Boolean sex;

    private Date partyJoinTime;


    private String contact;

    //分类
    private String classification;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSnoOrJobNumber() {
        return snoOrJobNumber;
    }

    public void setSnoOrJobNumber(String snoOrJobNumber) {
        this.snoOrJobNumber = snoOrJobNumber == null ? null : snoOrJobNumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getPartyJoinTime() {
        return partyJoinTime;
    }

    public void setPartyJoinTime(Date partyJoinTime) {
        this.partyJoinTime = partyJoinTime;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification == null ? null : classification.trim();
    }
}