package com.cqut.building.dao;

import com.cqut.building.dto.MinutesMeetingIdDto;
import com.cqut.building.dto.ServiceThreeSessionOneClassShowDto;
import com.cqut.building.dto.ThreeSessionOneClassDto;
import com.cqut.building.entity.ServiceThreeSessionOneClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 小程序>>>>应用>>>三会一课
 * 对应表：service_three_session_one_class
 */

@Mapper
public interface ServiceThreeSessionOneClassMapper {
    int deleteByPrimaryKey(String id);

    int insert(ServiceThreeSessionOneClass record);

    int insertSelective(ServiceThreeSessionOneClass record);

    ThreeSessionOneClassDto selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ServiceThreeSessionOneClass record);

    int updateByPrimaryKeyWithBLOBs(ServiceThreeSessionOneClass record);

    int updateByPrimaryKey(ServiceThreeSessionOneClass record);

    //根据三会一课id查询标题、会议时间、发表时间
    ServiceThreeSessionOneClassShowDto selectById(String id);

    //通过id更新会议纪要id
    int updateByPrimaryKeyMinutesMeetingId(MinutesMeetingIdDto minutesMeetingIdDto);

    //通过id得到参会人员id
    Map< String, String > selectHostParticipate(String id);
}