package com.cqut.building.serviceImp;


import com.cqut.building.dao.DynamicPraiseRecordMapper;
import com.cqut.building.dto.AboutPraiseRecordDto;
import com.cqut.building.entity.DynamicPraiseRecord;
import com.cqut.building.service.DynamicPraiseRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 小程序>>>>首页>>>基层风采，党员先锋
 * 对应表：dynamic_praise_record
 */

@Service
public class DynamicPraiseRecordServiceImp implements DynamicPraiseRecordService {
    @Autowired(required = false)
    DynamicPraiseRecordMapper dynamicPraiseRecordMapper;

    @Override
    public int insertByArticleTrainId(DynamicPraiseRecord dynamicPraiseRecord) {
        return dynamicPraiseRecordMapper.insertByArticleTrainId(dynamicPraiseRecord);
    }

    @Override
    public int deletePraiseRecord(AboutPraiseRecordDto aboutPraiseRecordDto) {
        return dynamicPraiseRecordMapper.deletePraiseRecord(aboutPraiseRecordDto);
    }

    @Override
    public int selectPraiseRecordNumById(AboutPraiseRecordDto aboutPraiseRecordDto) {
        return dynamicPraiseRecordMapper.selectPraiseRecordNumById(aboutPraiseRecordDto);
    }
}
