package com.cqut.building.dto;


import java.util.Date;

/**
 * 小程序>>>>消息通知
 * 对应表：message
 */
public class selectMessageDto {
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
    private String messagePublishTime;

    /**
     * partyId:消息发布人的id
     */
    private String partyId;

    /**
     * messageReceiveId:消息接收人的id
     */
    private String messageReceiveId;

    /**
     * messagePersonId:消息-人表id
     */
    private String messagePersonId;

    /**
     * read:已读未读
     */
    private String isRead;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getMessagePublishTime() {
        return messagePublishTime;
    }

    public void setMessagePublishTime(String messagePublishTime) {
        this.messagePublishTime = messagePublishTime;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getMessageReceiveId() {
        return messageReceiveId;
    }

    public void setMessageReceiveId(String messageReceiveId) {
        this.messageReceiveId = messageReceiveId;
    }

    public String getMessagePersonId() {
        return messagePersonId;
    }

    public void setMessagePersonId(String messagePersonId) {
        this.messagePersonId = messagePersonId;
    }

    public String getRead() {
        return isRead;
    }

    public void setRead(String isRead) {
        this.isRead = isRead;
    }
}
