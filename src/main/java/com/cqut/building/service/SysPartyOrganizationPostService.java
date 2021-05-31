package com.cqut.building.service;


import com.cqut.building.dto.OrganizationPositionDto;
import com.cqut.building.entity.SysPartyOrganizationPost;

import java.util.List;

public interface SysPartyOrganizationPostService {
    int deleteByPrimaryKey(String id);

    int insert(SysPartyOrganizationPost record);

    int insertSelective(SysPartyOrganizationPost record);

    SysPartyOrganizationPost selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysPartyOrganizationPost record);

    int updateByPrimaryKey(SysPartyOrganizationPost record);
}