package com.cqut.building.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 小程序>>>>应用>>>三会一课
 * 对应表：service_three_session_one_class
 */

public class ServiceThreeSessionOneClass {
    //开会id/课程id
    private String id;

    //标题名字
    private String title;

    //组织人员
    private String hostParticipate;

    //会议形式
    private String meetingForm;

    //会议类型
    private String meetingCategory;

    //院级/校级
    private String schoolOrCollege;

    //会议时间
    private Date meetingTime;

    //会议时长
    private String meetingDuration;

    //会议状态
    private String meetingStatus;

    //会议级别
    private String meetingLevel;

    //发布时间
    private Date releaseTime;

    //编辑人id
    private String meetingEditorId;

    //会议纪要id
    private String minutesMeetingId;

    //会议内容
    private String mainContent;

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

    public String getHostParticipate() {
        return hostParticipate;
    }

    public void setHostParticipate(String hostParticipate) {
        this.hostParticipate = hostParticipate == null ? null : hostParticipate.trim();
    }

    public String getMeetingForm() {
        return meetingForm;
    }

    public void setMeetingForm(String meetingForm) {
        this.meetingForm = meetingForm == null ? null : meetingForm.trim();
    }

    public String getMeetingCategory() {
        return meetingCategory;
    }

    public void setMeetingCategory(String meetingCategory) {
        this.meetingCategory = meetingCategory == null ? null : meetingCategory.trim();
    }

    public String getSchoolOrCollege() {
        return schoolOrCollege;
    }

    public void setSchoolOrCollege(String schoolOrCollege) {
        this.schoolOrCollege = schoolOrCollege == null ? null : schoolOrCollege.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT")
    public Date getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(Date meetingTime) {
        this.meetingTime = meetingTime;
    }

    public String getMeetingDuration() {
        return meetingDuration;
    }

    public void setMeetingDuration(String meetingDuration) {
        this.meetingDuration = meetingDuration == null ? null : meetingDuration.trim();
    }

    public String getMeetingStatus() {
        return meetingStatus;
    }

    public void setMeetingStatus(String meetingStatus) {
        this.meetingStatus = meetingStatus == null ? null : meetingStatus.trim();
    }

    public String getMeetingLevel() {
        return meetingLevel;
    }

    public void setMeetingLevel(String meetingLevel) {
        this.meetingLevel = meetingLevel == null ? null : meetingLevel.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT")
    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getMeetingEditorId() {
        return meetingEditorId;
    }

    public void setMeetingEditorId(String meetingEditorId) {
        this.meetingEditorId = meetingEditorId == null ? null : meetingEditorId.trim();
    }

    public String getMinutesMeetingId() {
        return minutesMeetingId;
    }

    public void setMinutesMeetingId(String minutesMeetingId) {
        this.minutesMeetingId = minutesMeetingId == null ? null : minutesMeetingId.trim();
    }

    public String getMainContent() {
        return mainContent;
    }

    public void setMainContent(String mainContent) {
        this.mainContent = mainContent == null ? null : mainContent.trim();
    }
}