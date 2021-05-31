package com.cqut.building.dto;

import java.util.Date;

/**
 * 包嵩
 * 活动时间的判断
 */
public class SetTimeActivityDto {
    /**
     * 活动id
     */
    private String id;

    /**
     * 活动截止时间
     */
    private Date registrationDeadline;

    /**
     * 活动状态
     */
    private String activityState;

    /**
     * 审核状态
     */
    private String approvalState;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRegistrationDeadline() {
        return registrationDeadline;
    }

    public void setRegistrationDeadline(Date registrationDeadline) {
        this.registrationDeadline = registrationDeadline;
    }

    public String getActivityState() {
        return activityState;
    }

    public void setActivityState(String activityState) {
        this.activityState = activityState;
    }

    public String getApprovalState() {
        return approvalState;
    }

    public void setApprovalState(String approvalState) {
        this.approvalState = approvalState;
    }
}
