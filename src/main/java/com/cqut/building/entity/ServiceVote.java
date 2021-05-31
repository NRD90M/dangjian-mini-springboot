package com.cqut.building.entity;

import java.util.Date;


/**
 * 小程序>>>>应用>>>投票调查
 * 对应表：service_vote
 */
public class ServiceVote {
    //投票id
    private String voteId;

    //投票开始时间
    private Date voteBeginTime;

    //投票结束时间
    private Date voteEndTime;

    //用户id
    private String sysUserId;

    //投票选项
    private String voteOption;

    //投票状态
    private Integer voteStatus;

    //投票标题
    private String voteTitle;

    //投票范围（院校）
    private String sysUserDepartment;

    //投票内容
    private String voteContent;

    public String getVoteId() {
        return voteId;
    }

    public void setVoteId(String voteId) {
        this.voteId = voteId == null ? null : voteId.trim();
    }

    public Date getVoteBeginTime() {
        return voteBeginTime;
    }

    public void setVoteBeginTime(Date voteBeginTime) {
        this.voteBeginTime = voteBeginTime;
    }

    public Date getVoteEndTime() {
        return voteEndTime;
    }

    public void setVoteEndTime(Date voteEndTime) {
        this.voteEndTime = voteEndTime;
    }

    public String getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(String sysUserId) {
        this.sysUserId = sysUserId == null ? null : sysUserId.trim();
    }

    public String getVoteOption() {
        return voteOption;
    }

    public void setVoteOption(String voteOption) {
        this.voteOption = voteOption == null ? null : voteOption.trim();
    }

    public Integer getVoteStatus() {
        return voteStatus;
    }

    public void setVoteStatus(Integer voteStatus) {
        this.voteStatus = voteStatus;
    }

    public String getVoteTitle() {
        return voteTitle;
    }

    public void setVoteTitle(String voteTitle) {
        this.voteTitle = voteTitle == null ? null : voteTitle.trim();
    }

    public String getSysUserDepartment() {
        return sysUserDepartment;
    }

    public void setSysUserDepartment(String sysUserDepartment) {
        this.sysUserDepartment = sysUserDepartment == null ? null : sysUserDepartment.trim();
    }

    public String getVoteContent() {
        return voteContent;
    }

    public void setVoteContent(String voteContent) {
        this.voteContent = voteContent == null ? null : voteContent.trim();
    }
}