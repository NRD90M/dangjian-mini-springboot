package com.cqut.building.serviceImp;

import com.cqut.building.dao.ServiceActivityRegistrationMapper;
import com.cqut.building.entity.ServiceActivityRegistration;
import com.cqut.building.service.ServiceActivityRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceActivityRegistrationImp implements ServiceActivityRegistrationService {
    @Autowired(required = false)
    ServiceActivityRegistrationMapper registrationMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return registrationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ServiceActivityRegistration record) {
        return registrationMapper.insert(record);
    }

    @Override
    public int insertSelective(ServiceActivityRegistration record) {
        return registrationMapper.insertSelective(record);
    }

    @Override
    public ServiceActivityRegistration selectByPrimaryKey(String id) {
        return registrationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ServiceActivityRegistration record) {
        return registrationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ServiceActivityRegistration record) {
        return registrationMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ServiceActivityRegistration> selectActivityIdByUserId(String userId) {
        return registrationMapper.selectActivityIdByUserId(userId);
    }

    @Override
    public ServiceActivityRegistration isSignUp(String activityId, String partyId) {
        return registrationMapper.isSignUp(activityId,partyId);
    }
}
