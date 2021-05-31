package com.cqut.building.dto;

import java.util.Date;

public class ServiceMinuteMeetingDto {
    /**
     * id:会议纪要id
     */
    private String id;

    /**
     * minuteType：类型（会议、党课）
     */
    private String minuteType;

    /**
     * meetingId：会议id
     */
    private String meetingId;

    /**
     * meetingTitle：会议标题
     */
    private String meetingTitle;

    /**
     * meetingRecorderId：记录人id
     */
    private String meetingRecorderId;

    /**
     * recorderTime：记录时间
     */
    private String recorderTime;

    /**
     * minuteContent：内容
     */
    private String minuteContent;

    /**
     * meetingRecorderName：记录人姓名
     */
    private String meetingRecorderName;

    /**
     * hostParticipateName：参会人员姓名
     */
    private String hostParticipateName;

    /**
     * minuteImage:图片地址
     */
    private String minuteImage;

    public String getMinuteImage() {
        return minuteImage;
    }

    public void setMinuteImage(String minuteImage) {
        this.minuteImage = minuteImage;
    }

    public String getMeetingTitle() {
        return meetingTitle;
    }

    public void setMeetingTitle(String meetingTitle) {
        this.meetingTitle = meetingTitle;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMinuteType() {
        return minuteType;
    }

    public void setMinuteType(String minuteType) {
        this.minuteType = minuteType;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingRecorderId() {
        return meetingRecorderId;
    }

    public void setMeetingRecorderId(String meetingRecorderId) {
        this.meetingRecorderId = meetingRecorderId;
    }

    public String getRecorderTime() {
        return recorderTime;
    }

    public void setRecorderTime(String recorderTime) {
        this.recorderTime = recorderTime;
    }

    public String getMinuteContent() {
        return minuteContent;
    }

    public void setMinuteContent(String minuteContent) {
        this.minuteContent = minuteContent;
    }

    public String getMeetingRecorderName() {
        return meetingRecorderName;
    }

    public void setMeetingRecorderName(String meetingRecorderName) {
        this.meetingRecorderName = meetingRecorderName;
    }

    public String getHostParticipateName() {
        return hostParticipateName;
    }

    public void setHostParticipateName(String hostParticipateName) {
        this.hostParticipateName = hostParticipateName;
    }
}
