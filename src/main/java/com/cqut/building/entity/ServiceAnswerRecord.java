package com.cqut.building.entity;

import java.util.Date;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_answer_record
 */
public class ServiceAnswerRecord {

    /**
     * id:答题记录id
     */
    private String id;

    /**
     * examinationId:所属考题id
     */
    private String examinationId;

    /**
     * userId:用户id
     */
    private String userId;

    /**
     * answerTime:答题时间
     */
    private Date answerTime;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(String examinationId) {
        this.examinationId = examinationId == null ? null : examinationId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(Date answerTime) {
        this.answerTime = answerTime;
    }

    public Integer getCorrectQuestionNumber() {
        return correctQuestionNumber;
    }

    public void setCorrectQuestionNumber(Integer correctQuestionNumber) {
        this.correctQuestionNumber = correctQuestionNumber;
    }
}