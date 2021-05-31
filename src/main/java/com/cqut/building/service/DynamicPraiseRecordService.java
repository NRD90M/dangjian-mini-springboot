package com.cqut.building.service;

import com.cqut.building.dto.AboutPraiseRecordDto;
import com.cqut.building.entity.DynamicPraiseRecord;

/**
 * 小程序>>>>首页>>>基层风采，党员先锋
 * 对应表：dynamic_praise_record
 */
public interface DynamicPraiseRecordService {
    int insertByArticleTrainId(DynamicPraiseRecord dynamicPraiseRecord);
    int deletePraiseRecord(AboutPraiseRecordDto aboutPraiseRecordDto);
    int selectPraiseRecordNumById(AboutPraiseRecordDto aboutPraiseRecordDto);
}
