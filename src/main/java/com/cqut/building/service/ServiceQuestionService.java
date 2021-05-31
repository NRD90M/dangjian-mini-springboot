package com.cqut.building.service;

import com.cqut.building.entity.ServiceQuestion;

import java.util.List;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_question
 */
public interface ServiceQuestionService {
    List<ServiceQuestion> selectExaminationQuestionById(String examinationId);
    List<ServiceQuestion> selectExaminationQuestionByIdNoAnswer(String examinationId);
}
