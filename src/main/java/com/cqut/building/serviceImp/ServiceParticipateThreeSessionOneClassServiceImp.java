package com.cqut.building.serviceImp;


import com.cqut.building.dao.ServiceParticipateThreeSessionOneClassMapper;
import com.cqut.building.dto.ParticipateThreeSessionOneClassDto;
import com.cqut.building.service.ServiceParticipateThreeSessionOneClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 小程序>>>>应用>>>三会一课的参会人员
 * 对应表：service_participate_three_session_one_class
 */
@Service
public class ServiceParticipateThreeSessionOneClassServiceImp implements ServiceParticipateThreeSessionOneClassService {
    @Autowired(required = false)
    ServiceParticipateThreeSessionOneClassMapper mapper;

    //根据个人id（参会人员id）查询三会一课id
    @Override
    public List<ParticipateThreeSessionOneClassDto> selectParticipateId(String participateId) {
        return mapper.selectParticipateId(participateId);
    }

    @Override
    public List<String> selectParticipateNameByClassId(String id) {
        return mapper.selectParticipateNameByClassId(id);
    }
}
