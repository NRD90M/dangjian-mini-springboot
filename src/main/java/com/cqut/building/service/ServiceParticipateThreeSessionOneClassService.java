package com.cqut.building.service;


import com.cqut.building.dto.ParticipateThreeSessionOneClassDto;

import java.util.List;

/**
 * 小程序>>>>应用>>>三会一课的参会人员
 * 对应表：service_participate_three_session_one_class
 */
public interface ServiceParticipateThreeSessionOneClassService {
    //根据个人id（参会人员id）查询三会一课id
    List<ParticipateThreeSessionOneClassDto> selectParticipateId(String participateid);

    //根据会议id查询参会人员名称
    List<String> selectParticipateNameByClassId(String id);
}
