package com.cqut.building.entity;

import java.util.Date;

/**
 * 小程序>>>消息通知>>>>系统公告
 * 对应表：sys_announcement
 */

public class SysAnnouncement {
    /**
     * id:系统公告id
     */
    private String id;

    /**
     * publishedTime:发布时间
     */
    private String publishedTime;

    /**
     * notificationScope:通知范围
     */
    private String notificationScope;

    /**
     * partyId:用户党员id
     */
    private String partyId;

    /**
     * content:发布内容
     */
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
    }

    public String getNotificationScope() {
        return notificationScope;
    }

    public void setNotificationScope(String notificationScope) {
        this.notificationScope = notificationScope == null ? null : notificationScope.trim();
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId == null ? null : partyId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}