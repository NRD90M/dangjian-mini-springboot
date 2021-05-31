package com.cqut.building.dto;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_examination_management
 */

public class GetServiceExaminationManagementDto {
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
     * questionCategoryName:所属分类名称
     */
    private String questionCategoryName;

    /**
     * founderId:创建人id
     */
    private String founderId;

    /**
     * founderName:创建人名称
     */
    private String founderName;

    /**
     * organizationName:创建人组织
     */
    private String organizationName;

    /**
     *state:状态：1-未发布，2-未开始，3-进行中，4-已结束
     */
    private Integer state;

    /**
     * correctQuestionNumber:答对题目数量
     */
    private Integer correctQuestionNumber;

    /**
     * questionTotalNumber:考题总数
     */
    private Integer questionTotalNumber;

    public Integer getQuestionTotalNumber() {
        return questionTotalNumber;
    }

    public void setQuestionTotalNumber(Integer questionTotalNumber) {
        this.questionTotalNumber = questionTotalNumber;
    }

    public Integer getCorrectQuestionNumber() {
        return correctQuestionNumber;
    }

    public void setCorrectQuestionNumber(Integer correctQuestionNumber) {
        this.correctQuestionNumber = correctQuestionNumber;
    }

    public String getQuestionCategoryName() {
        return questionCategoryName;
    }

    public void setQuestionCategoryName(String questionCategoryName) {
        this.questionCategoryName = questionCategoryName;
    }

    public String getFounderName() {
        return founderName;
    }

    public void setFounderName(String founderName) {
        this.founderName = founderName;
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

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}