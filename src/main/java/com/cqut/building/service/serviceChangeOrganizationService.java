package com.cqut.building.service;

import com.cqut.building.dto.WxUserChangeOrganizaDto;
import com.cqut.building.entity.serviceChangeOrganization;

import java.util.List;

public interface serviceChangeOrganizationService {


    int deleteByPrimaryKey(String id);


    int insert(serviceChangeOrganization record);


    int insertSelective(serviceChangeOrganization record);


    serviceChangeOrganization selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(serviceChangeOrganization record);

    int updateByPrimaryKey(serviceChangeOrganization record);

    WxUserChangeOrganizaDto getInformation(String partyId);

    List<String> getTheme();

    String getThemeId(String newTheme);

    String getThemeName(String id,String organizationId,String postId);

    serviceChangeOrganization isChangeing(String studentJobNumber);


    String getState(String partyId);
}
