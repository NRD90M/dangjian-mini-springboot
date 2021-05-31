package com.cqut.building.dao;

import com.cqut.building.dto.WxUserChangeOrganizaDto;
import com.cqut.building.entity.serviceChangeOrganization;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface serviceChangeOrganizationMapper {


	int deleteByPrimaryKey(String id);


	int insert(serviceChangeOrganization record);


	int insertSelective(serviceChangeOrganization record);


	serviceChangeOrganization selectByPrimaryKey(String id);


	int updateByPrimaryKeySelective(serviceChangeOrganization record);


	int updateByPrimaryKey(serviceChangeOrganization record);

	//获取初始信息
	WxUserChangeOrganizaDto getInformation(String partyId);

	//获取支部列表
	List<String> getTheme();


	//通过支部名称获取支部ID
	String getThemeId(String newTheme);

	//通过patryID获取支部名称
	String getThemeName(String id,String organizationId,String postId);

	serviceChangeOrganization isChangeing(String studentJobNumber);

	String getState(String partyId);
}