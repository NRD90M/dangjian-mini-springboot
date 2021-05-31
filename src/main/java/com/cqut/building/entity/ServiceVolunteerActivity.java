package com.cqut.building.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ServiceVolunteerActivity {
    /**
     * 志愿活动id
     */
    private String id;

    /**
     * 活动标题
     */
    private String activityTitle;

    /**
     * 活动联系人
     */
    private String activityContact;

    /**
     * 联系电话
     */
    private String contactNumber;

    /**
     * 活动地点
     */
    private String activityLocation;

    /**
     * 集合地点
     */
    private String meetingPlace;

    /**
     * 报名截止时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT")
    private Date registrationDeadline;

    /**
     * 活动时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT")
    private Date activityTime;

    /**
     * 活动状态
     */
    private String activityState;

    /**
     * 图片
     */
    private String picture;

    /**
     * 附件
     */
    private String annex;

    /**
     * 活动发起人id
     */
    private String activitySponsorId;

    /**
     * 报名人数
     */
    private Integer signUpNumber;

    /**
     * 发布时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT")
    private Date releaseTime;

    /**
     * 阅读量
     */
    private Integer readingVolume;

    /**
     * 活动来源1-小程序  2-管理端
     */
    private String activitySource;

    /**
     * 投稿时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT")
    private Date submissionTime;

    /**
     * 审核状态 1-未审核   2-未通过   3-审核通过
     */
    private String approvalState;

    /**
     * 审核人id
     */
    private String reviewerId;

    /**
     * 审核时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT")
    private Date reviewTime;

    /**
     * 点赞数
     */
    private Integer likeNumber;

    /**
     * 审核说明
     */
    private String reviewDescription;

    /**
     * 活动内容
     */
    private String activityContent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle == null ? null : activityTitle.trim();
    }

    public String getActivityContact() {
        return activityContact;
    }

    public void setActivityContact(String activityContact) {
        this.activityContact = activityContact == null ? null : activityContact.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public String getActivityLocation() {
        return activityLocation;
    }

    public void setActivityLocation(String activityLocation) {
        this.activityLocation = activityLocation == null ? null : activityLocation.trim();
    }

    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace == null ? null : meetingPlace.trim();
    }

    public Date getRegistrationDeadline() {
        return registrationDeadline;
    }

    public void setRegistrationDeadline(Date registrationDeadline) {
        this.registrationDeadline = registrationDeadline;
    }

    public Date getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(Date activityTime) {
        this.activityTime = activityTime;
    }

    public String getActivityState() {
        return activityState;
    }

    public void setActivityState(String activityState) {
        this.activityState = activityState == null ? null : activityState.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getAnnex() {
        return annex;
    }

    public void setAnnex(String annex) {
        this.annex = annex == null ? null : annex.trim();
    }

    public String getActivitySponsorId() {
        return activitySponsorId;
    }

    public void setActivitySponsorId(String activitySponsorId) {
        this.activitySponsorId = activitySponsorId == null ? null : activitySponsorId.trim();
    }

    public Integer getSignUpNumber() {
        return signUpNumber;
    }

    public void setSignUpNumber(Integer signUpNumber) {
        this.signUpNumber = signUpNumber;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Integer getReadingVolume() {
        return readingVolume;
    }

    public void setReadingVolume(Integer readingVolume) {
        this.readingVolume = readingVolume;
    }

    public String getActivitySource() {
        return activitySource;
    }

    public void setActivitySource(String activitySource) {
        this.activitySource = activitySource == null ? null : activitySource.trim();
    }

    public Date getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(Date submissionTime) {
        this.submissionTime = submissionTime;
    }

    public String getApprovalState() {
        return approvalState;
    }

    public void setApprovalState(String approvalState) {
        this.approvalState = approvalState == null ? null : approvalState.trim();
    }

    public String getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId == null ? null : reviewerId.trim();
    }

    public Date getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewTime = reviewTime;
    }

    public Integer getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(Integer likeNumber) {
        this.likeNumber = likeNumber;
    }

    public String getReviewDescription() {
        return reviewDescription;
    }

    public void setReviewDescription(String reviewDescription) {
        this.reviewDescription = reviewDescription == null ? null : reviewDescription.trim();
    }

    public String getActivityContent() {
        return activityContent;
    }

    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent == null ? null : activityContent.trim();
    }
}