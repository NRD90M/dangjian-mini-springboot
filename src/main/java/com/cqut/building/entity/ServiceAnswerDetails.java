package com.cqut.building.entity;


/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_answer_details
 */
public class ServiceAnswerDetails {
    /**
     * id:详情id
     */
    private String id;

    /**
     * answerRecordId:答题记录id
     */
    private String answerRecordId;

    /**
     * answerContent:每道题的用户输入
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
        this.id = id == null ? null : id.trim();
    }

    public String getAnswerRecordId() {
        return answerRecordId;
    }

    public void setAnswerRecordId(String answerRecordId) {
        this.answerRecordId = answerRecordId == null ? null : answerRecordId.trim();
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent == null ? null : answerContent.trim();
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId == null ? null : questionId.trim();
    }
}