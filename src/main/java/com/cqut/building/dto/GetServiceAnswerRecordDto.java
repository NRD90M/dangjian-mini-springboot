package com.cqut.building.dto;

import java.util.Date;

public class GetServiceAnswerRecordDto {
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
     * correctQuestionNumber:答对题目数量
     */
    private Integer correctQuestionNumber;

    /**
     * questionTotalNumber:考题总数
     */
    private Integer questionTotalNumber;

    /**
     * answerContent:用户输入
     */
    private String answerContent;

    /***
     * questionId:问题id
     */
    private String questionId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExaminationId() {
        return examinationId;
    }

    public void setExaminationId(String examinationId) {
        this.examinationId = examinationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }
}
