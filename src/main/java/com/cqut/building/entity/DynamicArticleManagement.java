package com.cqut.building.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;


/**
 * 小程序>>>>首页>>>基层风采，党员先锋
 * 小程序>>>>应用>>>发布文章
 * 对应表：dynamic_article_management
 */
public class DynamicArticleManagement {
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
     *source:来源(来源于小程序的发布文章的党员先锋1,基层风采2,党主题日是3)，也称类别
     */
    private Integer source;

    /**
     *contributorId:投稿人id
     */
    private String contributorId;

    /**
     *contributeTime:投稿时间
     */
    private Date contributeTime;

    /**
     *checkStatus:审核状态(1:已通过0:未审核-1:未通过)
     */
    private Integer checkStatus;

    /**
     *reviewerId:审核人id(根据id查姓名)
     */
    private String reviewerId;

    /**
     *checkTime:审核时间
     */
    private Date checkTime;

    /**
     *checkDiscription:审核说明
     */
    private String checkDiscription;

    /**
     *cancelId:下架人id
     */
    private String cancelId;

    /**
     *cancelTime:下架时间
     */
    private Date cancelTime;

    /**
     *cancelDiscription:下架说明
     */
    private String cancelDiscription;

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

    public Integer getTopSort() {
        return topSort;
    }

    public void setTopSort(Integer topSort) {
        this.topSort = topSort;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
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
        this.contributorId = contributorId == null ? null : contributorId.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT")
    public Date getContributeTime() {
        return contributeTime;
    }

    public void setContributeTime(Date contributeTime) {
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
        this.reviewerId = reviewerId == null ? null : reviewerId.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT")
    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckDiscription() {
        return checkDiscription;
    }

    public void setCheckDiscription(String checkDiscription) {
        this.checkDiscription = checkDiscription == null ? null : checkDiscription.trim();
    }

    public String getCancelId() {
        return cancelId;
    }

    public void setCancelId(String cancelId) {
        this.cancelId = cancelId == null ? null : cancelId.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT")
    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getCancelDiscription() {
        return cancelDiscription;
    }

    public void setCancelDiscription(String cancelDiscription) {
        this.cancelDiscription = cancelDiscription == null ? null : cancelDiscription.trim();
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
        this.browsingAmount = browsingAmount == null ? null : browsingAmount.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getPluginUrl() {
        return pluginUrl;
    }

    public void setPluginUrl(String pluginUrl) {
        this.pluginUrl = pluginUrl == null ? null : pluginUrl.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}