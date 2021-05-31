package com.cqut.building.serviceImp;

import com.cqut.building.dao.ServiceAnswerDetailsMapper;
import com.cqut.building.entity.ServiceAnswerDetails;
import com.cqut.building.service.ServiceAnswerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_answer_details
 */

@Service
public class ServiceAnswerDetailsServiceImpl implements ServiceAnswerDetailsService {
    @Autowired(required = false)
    ServiceAnswerDetailsMapper serviceAnswerDetailsMapper;

    @Override
    public int insert(Map<Integer, ServiceAnswerDetails> serviceAnswerDetailMap) {
        return serviceAnswerDetailsMapper.insert(serviceAnswerDetailMap);
    }

    @Override
    public List<ServiceAnswerDetails> selectByAnswerRecordId(String id) {
        return serviceAnswerDetailsMapper.selectByAnswerRecordId(id);
    }
}
