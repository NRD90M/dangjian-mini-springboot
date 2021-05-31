package com.cqut.building.dao;

import com.cqut.building.dto.GetServiceThemeDayAllDto;
import com.cqut.building.dto.GetServiceThemeDayDto;
import com.cqut.building.entity.ServiceThemeDay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ServiceThemeDayMapper {
    int deleteByPrimaryKey(String id);

    int insert(ServiceThemeDay record);

    int insertSelective(ServiceThemeDay record);

    ServiceThemeDay selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ServiceThemeDay record);

    int updateByPrimaryKey(ServiceThemeDay record);

    GetServiceThemeDayDto selectByThemeDayId(String id);

    int updateBrowsingByPrimaryKey(String id);

    List<GetServiceThemeDayDto> selectAllThemeDay(GetServiceThemeDayAllDto getServiceThemeDayAllDto);

    int updatePraiseByPrimaryKeyAdd(String id);

    int updatePraiseByPrimaryKeyReduce(String id);
}