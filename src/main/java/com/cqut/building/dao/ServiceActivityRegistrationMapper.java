package com.cqut.building.dao;


import com.cqut.building.entity.ServiceActivityRegistration;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 志愿活动报名记录表
 * author:包嵩
 * 对应表：service_activity_registration
 */
@Mapper
public interface ServiceActivityRegistrationMapper {
    int deleteByPrimaryKey(String id);

    int insert(ServiceActivityRegistration record);

    int insertSelective(ServiceActivityRegistration record);

    ServiceActivityRegistration selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ServiceActivityRegistration record);

    int updateByPrimaryKey(ServiceActivityRegistration record);

    List<ServiceActivityRegistration> selectActivityIdByUserId(@Param("userId")String userId);

    /**
     * 检测是否报名
     * @param activityId
     * @param partyId
     * @return
     */
    ServiceActivityRegistration isSignUp(@Param("activityId")String activityId, @Param("partyId")String partyId);
}