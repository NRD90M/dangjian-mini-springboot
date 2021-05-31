package com.cqut.building.service;

import com.cqut.building.dto.ServiceMinuteMeetingDto;
import com.cqut.building.entity.ServiceMinuteMeeting;

import java.util.Map;

public interface ServiceMinuteMeetingService {
    ServiceMinuteMeetingDto selectMinuteInfoByMeetingId(String id);
    int insert(ServiceMinuteMeeting record);
    Map< String, Object > isHaveMinuteByMeetingId(String id);
}
