package com.cqut.building.dto;

public class GetServiceThemeDayAllDto {
    /**
     * organizationId:组织id
     */
    private String organizationId;

    /**
     * higherOrganizationId:上级id
     */
    private String higherOrganizationId;

    /**
     * firstLevelOrganizationId:一级组织id
     */
    private String firstLevelOrganizationId;

    /**
     * rank:级别
     */
    private Integer rank;

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getHigherOrganizationId() {
        return higherOrganizationId;
    }

    public void setHigherOrganizationId(String higherOrganizationId) {
        this.higherOrganizationId = higherOrganizationId;
    }

    public String getFirstLevelOrganizationId() {
        return firstLevelOrganizationId;
    }

    public void setFirstLevelOrganizationId(String firstLevelOrganizationId) {
        this.firstLevelOrganizationId = firstLevelOrganizationId;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}
