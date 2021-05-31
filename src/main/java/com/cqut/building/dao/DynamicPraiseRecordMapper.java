package com.cqut.building.dao;

import com.cqut.building.dto.AboutPraiseRecordDto;
import com.cqut.building.entity.DynamicPraiseRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * 小程序>>>>首页>>>基层风采，党员先锋
 * 对应表：dynamic_praise_record
 */

@Mapper
public interface DynamicPraiseRecordMapper {
    int deleteByPrimaryKey(String id);

    int deletePraiseRecord(AboutPraiseRecordDto aboutPraiseRecordDto);

    int insert(DynamicPraiseRecord record);

    int insertSelective(DynamicPraiseRecord record);

    DynamicPraiseRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DynamicPraiseRecord record);

    int updateByPrimaryKey(DynamicPraiseRecord record);

    int insertByArticleTrainId(DynamicPraiseRecord dynamicPraiseRecord);

    int selectPraiseRecordNumById(AboutPraiseRecordDto aboutPraiseRecordDto);
}