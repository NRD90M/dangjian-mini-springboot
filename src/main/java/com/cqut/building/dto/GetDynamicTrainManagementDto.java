package com.cqut.building.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 小程序>>>>首页>>>党校培训
 * 对应表：dynamic_train_management
 */

public class GetDynamicTrainManagementDto {

    /**
     * id:文章id
     */
    private String id;

    /**
     * title:党校培训标题
     */
    private String title;

    /**
     * publishTime:发布时间
     */
    private String publishTime;

    /**
     * editorId:编辑人id(外键，根据id去用户表里查姓名)
     */
    private String editorId;

    /**
     * editorName:编辑人名称
     */
    private String editorName;

    /**
     * publishStatus:状态(已发布1或预览0)
     */
    private Integer publishStatus;

    /**
     * browsingAmount:浏览量
     */
    private Integer browsingAmount;

    /**
     * praiseAmount:点赞数
     */
    private Integer praiseAmount;

    /**
     * outsiteUrl:网址
     */
    private String outsiteUrl;

    /**
     * picUrl:图片地址/路径
     */
    private String picUrl;

    /**
     * pluginUrl:附件地址/路径
     */
    private String pluginUrl;

    /**
     * content:培训内容
     */
    private String content;

    private String organizationName;

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getEditorName() {
        return editorName;
    }

    public void setEditorName(String editorName) {
        this.editorName = editorName;
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

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getEditorId() {
        return editorId;
    }

    public void setEditorId(String editorId) {
        this.editorId = editorId == null ? null : editorId.trim();
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Integer getBrowsingAmount() {
        return browsingAmount;
    }

    public void setBrowsingAmount(Integer browsingAmount) {
        this.browsingAmount = browsingAmount;
    }

    public Integer getPraiseAmount() {
        return praiseAmount;
    }

    public void setPraiseAmount(Integer praiseAmount) {
        this.praiseAmount = praiseAmount;
    }

    public String getOutsiteUrl() {
        return outsiteUrl;
    }

    public void setOutsiteUrl(String outsiteUrl) {
        this.outsiteUrl = outsiteUrl == null ? null : outsiteUrl.trim();
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