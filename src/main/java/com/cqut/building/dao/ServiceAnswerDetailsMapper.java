package com.cqut.building.dao;

import com.cqut.building.entity.ServiceAnswerDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_answer_details
 */

@Mapper
public interface ServiceAnswerDetailsMapper {
    int deleteByPrimaryKey(String id);

    int insert(@Param("serviceAnswerDetailMap") Map<Integer,ServiceAnswerDetails> serviceAnswerDetailMap);

    int insertSelective(ServiceAnswerDetails record);

    List<ServiceAnswerDetails> selectByAnswerRecordId(String id);

    int updateByPrimaryKeySelective(ServiceAnswerDetails record);

    int updateByPrimaryKey(ServiceAnswerDetails record);
}