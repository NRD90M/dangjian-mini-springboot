package com.cqut.building.serviceImp;

import com.cqut.building.dao.ServiceMinuteMeetingMapper;
import com.cqut.building.dto.ServiceMinuteMeetingDto;
import com.cqut.building.entity.ServiceMinuteMeeting;
import com.cqut.building.service.ServiceMinuteMeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ServiceMinuteMeetingServiceImpl implements ServiceMinuteMeetingService {

    @Autowired(required = false)
    ServiceMinuteMeetingMapper serviceMinuteMeetingMapper;

    @Override
    public ServiceMinuteMeetingDto selectMinuteInfoByMeetingId(String id) {
        return serviceMinuteMeetingMapper.selectMinuteInfoByMeetingId(id);
    }

    @Override
    public int insert(ServiceMinuteMeeting record) {
        return serviceMinuteMeetingMapper.insert(record);
    }

    @Override
    public Map<String, Object> isHaveMinuteByMeetingId(String id) {
        return serviceMinuteMeetingMapper.isHaveMinuteByMeetingId(id);
    }
}
