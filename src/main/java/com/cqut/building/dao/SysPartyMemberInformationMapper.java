package com.cqut.building.dao;

import com.cqut.building.dto.GetSponsorAndReviewerNameDto;
import com.cqut.building.dto.IsAuditedDataDto;
import com.cqut.building.entity.SysPartyMemberInformation;
import org.apache.ibatis.annotations.Mapper;

/**
 * 党员信息表
 * 对应表：sys_party_member_information
 */
@Mapper
public interface SysPartyMemberInformationMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysPartyMemberInformation record);

    int insertSelective(SysPartyMemberInformation record);

    SysPartyMemberInformation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysPartyMemberInformation record);

    int updateByPrimaryKey(SysPartyMemberInformation record);

    //用户初次登陆时进行信息比对，判断是否为后台以填入的党员
    String compareTo(IsAuditedDataDto record);

    /**
     * 通过id查询名字
     * @param id
     * @return
     */
    String getNameByPartyId(String id);



}