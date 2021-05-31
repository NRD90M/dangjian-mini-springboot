package com.cqut.building.dao;

import com.cqut.building.entity.ServiceQuestionCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_question_category
 */

@Mapper
public interface ServiceQuestionCategoryMapper {
    int deleteByPrimaryKey(String id);

    int insert(ServiceQuestionCategory record);

    int insertSelective(ServiceQuestionCategory record);

    ServiceQuestionCategory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ServiceQuestionCategory record);

    int updateByPrimaryKey(ServiceQuestionCategory record);

    List<ServiceQuestionCategory> selectAllCategoryName();
}