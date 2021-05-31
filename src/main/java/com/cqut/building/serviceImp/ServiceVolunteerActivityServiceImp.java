package com.cqut.building.serviceImp;

import com.cqut.building.dao.ServiceVolunteerActivityMapper;
import com.cqut.building.dto.ServiceVolunteerActivityDto;
import com.cqut.building.dto.SetTimeActivityDto;
import com.cqut.building.entity.ServiceVolunteerActivity;
import com.cqut.building.service.ServiceVolunteerActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 志愿活动
 * author:包嵩
 */

@Service
public class ServiceVolunteerActivityServiceImp implements ServiceVolunteerActivityService {
    @Autowired(required = false)
    ServiceVolunteerActivityMapper activityMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return activityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ServiceVolunteerActivity record) {
        return activityMapper.insert(record);
    }

    @Override
    public int insertSelective(ServiceVolunteerActivity record) {
        return activityMapper.insertSelective(record);
    }

    @Override
    public ServiceVolunteerActivity selectByPrimaryKey(String id) {
        return activityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ServiceVolunteerActivity record) {
        return activityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(ServiceVolunteerActivity record) {
        return activityMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(ServiceVolunteerActivity record) {
        return activityMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ServiceVolunteerActivity> getAllVolunteerActivities() {
        return activityMapper.getAllVolunteerActivities();
    }

    @Override
    public int insertActivity(ServiceVolunteerActivityDto dto) {
        return activityMapper.insertActivity(dto);
    }

    @Override
    public List<SetTimeActivityDto> getActivityTime() {
        return activityMapper.getActivityTime();
    }

    @Override
    public void updateActivityTimeState(List<SetTimeActivityDto> dtos) {
        activityMapper.updateActivityTimeState(dtos);
    }
}
