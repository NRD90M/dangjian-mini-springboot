package com.cqut.building.dto;

public class LeaveWordsDto {
    //留言人ID
    private String wxUserId;

    //留言内容
    private String leaveWordsContent;

    private String leaveOrganizationId;

    private String leavePostId;

    public String getLeaveOrganizationId() {
        return leaveOrganizationId;
    }

    public void setLeaveOrganizationId(String leaveOrganizationId) {
        this.leaveOrganizationId = leaveOrganizationId;
    }

    public String getLeavePostId() {
        return leavePostId;
    }

    public void setLeavePostId(String leavePostId) {
        this.leavePostId = leavePostId;
    }

    public String getWxUserId() {
        return wxUserId;
    }

    public void setWxUserId(String wxUserId) {
        this.wxUserId = wxUserId;
    }

    public String getLeaveWordsContent() {
        return leaveWordsContent;
    }

    public void setLeaveWordsContent(String leaveWordsContent) {
        this.leaveWordsContent = leaveWordsContent;
    }
}
