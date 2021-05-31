package com.cqut.building.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
/**
 * 小程序>>>>首页>>>基层风采，党员先锋
 * 小程序>>>>应用>>>发布文章
 * 对应表：dynamic_article_management
 */
public class GetArticleDto {

    /**
     * id：文章/稿件id
     */
    private String id;

    /**
     * title:文章/稿件标题
     */
    private String title;

    /**
     * organizationId:组织id
     */
    private String organizationId;

    /**
     *collegeName:组织名称
     */
    private String organizationName;

    /**
     *source:来源(来源于小程序的发布文章的党员先锋1,基层风采2,党主题日是3)，也称类别
     */
    private Integer source;

    /**
     *contributorId:投稿人id
     */
    private String contributorId;

    /**
     *contributorName:投稿人名称
     */
    private String contributorName;

    /**
     *contributeTime:投稿时间
     */
    private String contributeTime;

    /**
     *checkStatus:审核状态(1:已通过0:未审核-1:未通过)
     */
    private Integer checkStatus;

    /**
     *reviewerId:审核人id(根据id查姓名)
     */
    private String reviewerId;

    /**
     *reviewerName:审核人名称
     */
    private String reviewerName;

    /**
     *checkTime:审核时间
     */
    private String checkTime;

    /**
     *checkDiscription:审核说明
     */
    private String checkDiscription;

    /**
     *praiseAmount:点赞数
     */
    private Integer praiseAmount;

    /**
     *praiseAmount:浏览量
     */
    private String browsingAmount;

    /**
     *praiseAmount:图片路径
     */
    private String picUrl;

    /**
     *pluginUrl:附件路径
     */
    private String pluginUrl;

    /**
     *content:内容
     */
    private String content;

    /**
     *topSort:用于置顶功能（置顶为0，未置顶为1）
     */
    private Integer topSort;


    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getContributorId() {
        return contributorId;
    }

    public void setContributorId(String contributorId) {
        this.contributorId = contributorId;
    }

    public String getContributorName() {
        return contributorName;
    }

    public void setContributorName(String contributorName) {
        this.contributorName = contributorName;
    }

    public String getContributeTime() {
        return contributeTime;
    }

    public void setContributeTime(String contributeTime) {
        this.contributeTime = contributeTime;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckDiscription() {
        return checkDiscription;
    }

    public void setCheckDiscription(String checkDiscription) {
        this.checkDiscription = checkDiscription;
    }

    public Integer getPraiseAmount() {
        return praiseAmount;
    }

    public void setPraiseAmount(Integer praiseAmount) {
        this.praiseAmount = praiseAmount;
    }

    public String getBrowsingAmount() {
        return browsingAmount;
    }

    public void setBrowsingAmount(String browsingAmount) {
        this.browsingAmount = browsingAmount;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPluginUrl() {
        return pluginUrl;
    }

    public void setPluginUrl(String pluginUrl) {
        this.pluginUrl = pluginUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getTopSort() {
        return topSort;
    }

    public void setTopSort(Integer topSort) {
        this.topSort = topSort;
    }
}
