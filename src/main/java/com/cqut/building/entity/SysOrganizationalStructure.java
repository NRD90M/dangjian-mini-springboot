package com.cqut.building.entity;

public class SysOrganizationalStructure {
    private String organizationId;

    private String higherOrganizationId;

    private String remark;

    private Integer rank;

    private String createMemberId;

    private String organizationName;

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getHigherOrganizationId() {
        return higherOrganizationId;
    }

    public void setHigherOrganizationId(String higherOrganizationId) {
        this.higherOrganizationId = higherOrganizationId == null ? null : higherOrganizationId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getCreateMemberId() {
        return createMemberId;
    }

    public void setCreateMemberId(String createMemberId) {
        this.createMemberId = createMemberId == null ? null : createMemberId.trim();
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }
}