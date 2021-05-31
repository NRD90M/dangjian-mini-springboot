package com.cqut.building.dao;

import com.cqut.building.dto.ParticipateThreeSessionOneClassDto;
import com.cqut.building.entity.ServiceParticipateThreeSessionOneClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 小程序>>>>应用>>>三会一课的参会人员
 * 对应表：service_participate_three_session_one_class
 */
@Mapper
public interface ServiceParticipateThreeSessionOneClassMapper {
    int deleteByPrimaryKey(String id);

    int insert(ServiceParticipateThreeSessionOneClass record);

    int insertSelective(ServiceParticipateThreeSessionOneClass record);

    ServiceParticipateThreeSessionOneClass selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ServiceParticipateThreeSessionOneClass record);

    int updateByPrimaryKey(ServiceParticipateThreeSessionOneClass record);

    //根据个人id（参会人员id）查询三会一课id
    List<ParticipateThreeSessionOneClassDto> selectParticipateId(String participateId);

    //根据会议id查询参会人员名称
    List<String> selectParticipateNameByClassId(String id);
}