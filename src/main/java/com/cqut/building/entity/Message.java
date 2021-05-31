package com.cqut.building.entity;

import java.util.Date;

public class Message {
    /**
     * id:消息表的id
     */
    private String id;

    /**
     * messageTitle:消息的标题
     */
    private String messageTitle;

    /**
     * messageContent:消息表的内容
     */
    private String messageContent;

    /**
     * messageType:1 一对一的消息或者1对多的消息，2是会议纪要发送的消息，3是会议纪要上传的消息消息表的id
     */
    private String messageType;

    /**
     * meetingId:会议id，包括会议纪要提醒以及会议纪要上传
     */
    private String meetingId;

    /**
     * messagePublishTime:消息发布时间
     */
    private Date messagePublishTime;

    /**
     * partyId:消息发布人的id
     */
    private String partyId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle == null ? null : messageTitle.trim();
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType == null ? null : messageType.trim();
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId == null ? null : meetingId.trim();
    }

    public Date getMessagePublishTime() {
        return messagePublishTime;
    }

    public void setMessagePublishTime(Date messagePublishTime) {
        this.messagePublishTime = messagePublishTime;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
    }
}