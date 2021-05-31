package com.cqut.building.dto;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_examination_management
 */

public class GetExaminationManagementByIdDto {
    /**
     * id:考题id
     */
    private String id;

    /**
     * answerRecordId:答题记录id
     */
    private String answerRecordId;

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
     * founderId:创建人id
     */
    private String founderId;

    /**
     * founderName:创建人名称
     */
    private String founderName;

    /**
     *state:状态：1-未发布，2-未开始，3-进行中，4-已结束
     */
    private Integer state;

    /**
     * correctQuestionNumber:答对题目数量
     */
    private Integer correctQuestionNumber ;

    /**
     * questionTotalNumber:考题总数
     */
    private Integer questionTotalNumber;

    public String getAnswerRecordId() {
        return answerRecordId;
    }

    public void setAnswerRecordId(String answerRecordId) {
        this.answerRecordId = answerRecordId;
    }

    public Integer getCorrectQuestionNumber() {
        return correctQuestionNumber;
    }

    public void setCorrectQuestionNumber(Integer correctQuestionNumber) {
        this.correctQuestionNumber = correctQuestionNumber;
    }

    public Integer getQuestionTotalNumber() {
        return questionTotalNumber;
    }

    public void setQuestionTotalNumber(Integer questionTotalNumber) {
        this.questionTotalNumber = questionTotalNumber;
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

}