package com.cqut.building.dto;

import java.util.List;

public class OrganizationStructureDto {
    String organizationId;
    String rank;
    String organizationName;
    List<OrganizationMember> organizationMemberList;

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public List<OrganizationMember> getOrganizationMemberList() {
        return organizationMemberList;
    }

    public void setOrganizationMemberList(List<OrganizationMember> organizationMemberList) {
        this.organizationMemberList = organizationMemberList;
    }
}
