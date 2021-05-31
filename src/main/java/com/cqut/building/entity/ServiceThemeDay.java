package com.cqut.building.entity;

import java.util.Date;

public class ServiceThemeDay {
    /**
     * id:党主题日id
     */
    private String id;

    /**
     * organizationId:组织id
     */
    private String organizationId;

    /**
     * editor_id:编辑人id
     */
    private String editorId;

    /**
     * status:状态
     */
    private String status;

    /**
     * title：标题
     */
    private String title;

    /**
     * partyMembersNumber:支部党员数
     */
    private String partyMembersNumber;

    /**
     * branchSecretaryId:支部书记
     */
    private String branchSecretaryId;

    /**
     * phone:支部书记联系方式
     */
    private String phone;

    /**
     * learningTime:学习时间
     */
    private String learningTime;

    /**
     * releaseTime：发布时间
     */
    private String releaseTime;

    /**
     * learningPlace:学习地点
     */
    private String learningPlace;

    /**
     * learningContent:学习内容
     */
    private String learningContent;

    /**
     * learningWay:学习方式
     */
    private String learningWay;

    /**
     * month:月份
     */
    private String month;

    /**
     * participantsId:参会人员id
     */
    private String participantsId;

    /**
     * overallEffect:总体效果
     */
    private String overallEffect;

    /**
     * top:置顶（0-置顶 1-未置顶）
     */
    private String top;

    /**
     *likes_number:点赞数
     */
    private String likesNumber;

    /**
     * views_number:浏览量
     */
    private String viewsNumber;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getLikesNumber() {
        return likesNumber;
    }

    public void setLikesNumber(String likesNumber) {
        this.likesNumber = likesNumber;
    }

    public String getViewsNumber() {
        return viewsNumber;
    }

    public void setViewsNumber(String viewsNumber) {
        this.viewsNumber = viewsNumber;
    }

    public String getEditorId() {
        return editorId;
    }

    public void setEditorId(String editorId) {
        this.editorId = editorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getPartyMembersNumber() {
        return partyMembersNumber;
    }

    public void setPartyMembersNumber(String partyMembersNumber) {
        this.partyMembersNumber = partyMembersNumber == null ? null : partyMembersNumber.trim();
    }

    public String getBranchSecretaryId() {
        return branchSecretaryId;
    }

    public void setBranchSecretaryId(String branchSecretaryId) {
        this.branchSecretaryId = branchSecretaryId == null ? null : branchSecretaryId.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLearningTime() {
        return learningTime;
    }

    public void setLearningTime(String learningTime) {
        this.learningTime = learningTime;
    }

    public String getLearningPlace() {
        return learningPlace;
    }

    public void setLearningPlace(String learningPlace) {
        this.learningPlace = learningPlace == null ? null : learningPlace.trim();
    }

    public String getLearningContent() {
        return learningContent;
    }

    public void setLearningContent(String learningContent) {
        this.learningContent = learningContent == null ? null : learningContent.trim();
    }

    public String getLearningWay() {
        return learningWay;
    }

    public void setLearningWay(String learningWay) {
        this.learningWay = learningWay == null ? null : learningWay.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getParticipantsId() {
        return participantsId;
    }

    public void setParticipantsId(String participantsId) {
        this.participantsId = participantsId == null ? null : participantsId.trim();
    }

    public String getOverallEffect() {
        return overallEffect;
    }

    public void setOverallEffect(String overallEffect) {
        this.overallEffect = overallEffect == null ? null : overallEffect.trim();
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top == null ? null : top.trim();
    }
}