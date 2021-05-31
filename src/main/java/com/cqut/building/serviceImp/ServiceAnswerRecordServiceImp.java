package com.cqut.building.serviceImp;

import com.cqut.building.dao.ServiceAnswerRecordMapper;
import com.cqut.building.entity.ServiceAnswerRecord;
import com.cqut.building.service.ServiceAnswerRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_answer_record
 */

@Service
public class ServiceAnswerRecordServiceImp implements ServiceAnswerRecordService {

    @Autowired(required = false)
    ServiceAnswerRecordMapper serviceAnswerRecordMapper;

    @Override
    public int insert(ServiceAnswerRecord record) {
        return serviceAnswerRecordMapper.insert(record);
    }
}
