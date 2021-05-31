package com.cqut.building.dao;


import com.cqut.building.dto.OrganizationPositionDto;
import com.cqut.building.entity.SysPartyOrganizationPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysPartyOrganizationPostMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysPartyOrganizationPost record);

    int insertSelective(SysPartyOrganizationPost record);

    SysPartyOrganizationPost selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysPartyOrganizationPost record);

    int updateByPrimaryKey(SysPartyOrganizationPost record);
}