package com.cqut.building.entity;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_examination_management
 */

public class ServiceExaminationManagement {
    /**
     * id:考题id
     */
    private String id;

    /**
     * title:标题
     */
    private String title;

    /**
     * beginTime:开始时间
     */
    private String beginTime;

    /**
     * endTime:结束时间
     */
    private String endTime;

    /**
     * releaseTime:发布时间
     */
    private String releaseTime;

    /**
     * questionCategoryId:所属分类id
     */
    private String questionCategoryId;

    /**
     * founderId:创建人id
     */
    private String founderId;

    /**
     * founderOrganizationId:创建人组织id
     */
    private String founderOrganizationId;

    /**
     *state:状态：1-未发布，2-未开始，3-进行中，4-已结束
     */
    private Integer state;

    public String getFounderOrganizationId() {
        return founderOrganizationId;
    }

    public void setFounderOrganizationId(String founderOrganizationId) {
        this.founderOrganizationId = founderOrganizationId;
    }

    public String getFounderId() {
        return founderId;
    }

    public void setFounderId(String founderId) {
        this.founderId = founderId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

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

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getQuestionCategoryId() {
        return questionCategoryId;
    }

    public void setQuestionCategoryId(String questionCategoryId) {
        this.questionCategoryId = questionCategoryId == null ? null : questionCategoryId.trim();
    }
}