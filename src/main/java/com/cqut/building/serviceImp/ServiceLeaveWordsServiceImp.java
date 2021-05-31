package com.cqut.building.serviceImp;

import com.cqut.building.dao.ServiceLeaveWordsMapper;
import com.cqut.building.entity.ServiceLeaveWords;
import com.cqut.building.service.ServiceLeaveWordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLeaveWordsServiceImp implements ServiceLeaveWordsService {

    @Autowired(required = false)
    ServiceLeaveWordsMapper serviceLeaveWordsMapper;


    @Override
    public int deleteByPrimaryKey(String id) {
        return serviceLeaveWordsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ServiceLeaveWords record) {
        return serviceLeaveWordsMapper.insert(record);
    }

    @Override
    public ServiceLeaveWords selectByPrimaryKey(String id) {
        return serviceLeaveWordsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ServiceLeaveWords record) {
        return serviceLeaveWordsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ServiceLeaveWords record) {
        return serviceLeaveWordsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ServiceLeaveWords> getLeaveWordsList(String partyId) {
        return serviceLeaveWordsMapper.getLeaveWordsList(partyId);
    }
}
