package com.cqut.building.dao;


import com.cqut.building.dto.ServiceVolunteerActivityDto;
import com.cqut.building.dto.SetTimeActivityDto;
import com.cqut.building.entity.ServiceVolunteerActivity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 志愿活动表
 * author:包嵩
 * 对应表：service_volunteer_activity
 */
@Mapper
public interface ServiceVolunteerActivityMapper {
    int deleteByPrimaryKey(String id);

    int insert(ServiceVolunteerActivity record);

    int insertSelective(ServiceVolunteerActivity record);

    ServiceVolunteerActivity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ServiceVolunteerActivity record);

    int updateByPrimaryKeyWithBLOBs(ServiceVolunteerActivity record);

    int updateByPrimaryKey(ServiceVolunteerActivity record);

    List<ServiceVolunteerActivity> getAllVolunteerActivities();

    /**
     * 添加活动
     * @param dto
     * @return
     */
    int insertActivity(ServiceVolunteerActivityDto dto);


    /**
     * 获取志愿活动的截止时间进行判断
     * @return
     */
    List<SetTimeActivityDto> getActivityTime();


    /**
     * 更新活动状态
     * @param dtos
     */
    void updateActivityTimeState(@Param(value = "list") List<SetTimeActivityDto> dtos);
}