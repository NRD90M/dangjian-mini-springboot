package com.cqut.building.service;

import com.cqut.building.dto.GetServiceThemeDayAllDto;
import com.cqut.building.dto.GetServiceThemeDayDto;

import java.util.List;

public interface ServiceThemeDayService {
    List<GetServiceThemeDayDto> selectAllThemeDay(GetServiceThemeDayAllDto getServiceThemeDayAllDto);
    GetServiceThemeDayDto selectByThemeDayId(String id);
    int updateBrowsingByPrimaryKey(String id);
    int updatePraiseByPrimaryKeyAdd(String id);
    int updatePraiseByPrimaryKeyReduce(String id);
}
