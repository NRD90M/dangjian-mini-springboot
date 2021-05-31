package com.cqut.building.dao;

import com.cqut.building.entity.ServiceQuestion;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_question
 */
@Mapper
public interface ServiceQuestionMapper {
    int deleteByPrimaryKey(String id);

    int insert(ServiceQuestion record);

    int insertSelective(ServiceQuestion record);

    ServiceQuestion selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ServiceQuestion record);

    int updateByPrimaryKey(ServiceQuestion record);

    List<ServiceQuestion> selectExaminationQuestionByIdNoAnswer(String examinationId);
    List<ServiceQuestion> selectExaminationQuestionById(String examinationId);
}