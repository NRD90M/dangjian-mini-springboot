package com.cqut.building.dao;

import com.cqut.building.dto.ServiceMinuteMeetingDto;
import com.cqut.building.entity.ServiceMinuteMeeting;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface ServiceMinuteMeetingMapper {
    int deleteByPrimaryKey(String id);

    int insert(ServiceMinuteMeeting record);

    int insertSelective(ServiceMinuteMeeting record);

    ServiceMinuteMeetingDto selectMinuteInfoByMeetingId(String id);

    Map< String, Object > isHaveMinuteByMeetingId(String id);

    int updateByPrimaryKeySelective(ServiceMinuteMeeting record);

    int updateByPrimaryKeyWithBLOBs(ServiceMinuteMeeting record);

    int updateByPrimaryKey(ServiceMinuteMeeting record);
}