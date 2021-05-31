package com.cqut.building.dto;
/**
 * 小程序>>>>首页>>>基层风采，党员先锋
 * 小程序>>>>应用>>>发布文章
 * 对应表：dynamic_article_management
 */
public class GetArticleBySourceDto {
    /**
     * source:类型
     **/
    private int source;

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

    public String getHigherOrganizationId() {
        return higherOrganizationId;
    }

    public void setHigherOrganizationId(String higherOrganizationId) {
        this.higherOrganizationId = higherOrganizationId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }
}

