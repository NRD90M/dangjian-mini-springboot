package com.cqut.building.serviceImp;

import com.cqut.building.dao.ServiceThreeSessionOneClassMapper;
import com.cqut.building.dto.MinutesMeetingIdDto;
import com.cqut.building.dto.ServiceThreeSessionOneClassShowDto;
import com.cqut.building.dto.ThreeSessionOneClassDto;
import com.cqut.building.entity.ServiceThreeSessionOneClass;
import com.cqut.building.service.ServiceThreeSessionOneClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 小程序>>>>应用>>>三会一课
 * 对应表：service_three_session_one_class
 */

@Service
public class ServiceThreeSessionOneClassServiceImp implements ServiceThreeSessionOneClassService {

    @Autowired(required = false)
    ServiceThreeSessionOneClassMapper mapper;

    //根据三会一课id查询标题、会议时间、发表时间
    @Override
    public ServiceThreeSessionOneClassShowDto selectById(String id) {
        return mapper.selectById(id);
    }

    //根据三会一课id查询所有信息
    @Override
    public ThreeSessionOneClassDto selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    //通过id更新会议纪要id
    @Override
    public int updateByPrimaryKeyMinutesMeetingId(MinutesMeetingIdDto minutesMeetingIdDto){
        return mapper.updateByPrimaryKeyMinutesMeetingId(minutesMeetingIdDto);
    }

    //通过id得到参会人员id
    @Override
    public Map<String, String> selectHostParticipate(String id) {
        return mapper.selectHostParticipate(id);
    }
}
