package com.cqut.building.service;

import com.cqut.building.entity.ServiceLeaveWords;

import java.util.List;

public interface ServiceLeaveWordsService {
    int deleteByPrimaryKey(String id);


    int insert(ServiceLeaveWords record);


    ServiceLeaveWords selectByPrimaryKey(String id);


    int updateByPrimaryKeySelective(ServiceLeaveWords record);


    int updateByPrimaryKey(ServiceLeaveWords record);

    List<ServiceLeaveWords> getLeaveWordsList(String partyId);
}
