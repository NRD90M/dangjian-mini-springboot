package com.cqut.building.service;


import com.cqut.building.dto.OrganizationPositionDto;
import com.cqut.building.dto.SecondAuditedDataDto;
import com.cqut.building.entity.SysWxUserOrgPost;

import java.util.List;

public interface SysWxUserOrgPostService {
    int deleteByPrimaryKey(String id);

    int insert(SysWxUserOrgPost record);

    int insertSelective(SysWxUserOrgPost record);

    SysWxUserOrgPost selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysWxUserOrgPost record);

    int updateByPrimaryKey(SysWxUserOrgPost record);
    /**
     * 通过openId查询是否有这条数据
     * @param openId
     * @return
     */
    SysWxUserOrgPost selectByOpenId(String openId);


    /**
     * 添加二次认证组织职务到列表
     * @param dataDto
     * @return
     */
    int insertOrganizationPosition(SecondAuditedDataDto dataDto);


    /**
     * 通过openId修改信息
     * @param dataDto
     * @return
     */
    int updateOrganizationPosition(SecondAuditedDataDto dataDto);

    /**
     * 通过党员id来获取他的一条组织和职务信息
     * @return
     */
    OrganizationPositionDto selectOrganizationPosition(String openId);

    /**
     * 通过openId查找他已经注册过的组织和职务
     * @param post
     * @return
     */
    List<OrganizationPositionDto> selectAllOrganizationPosition(SysWxUserOrgPost post);

    /**
     * 通过微信号和认证状态判断是否已经认证了这个职务
     * @param post
     * @return
     */
    SysWxUserOrgPost checkIsAudited(SysWxUserOrgPost post);


    /**
     * 查看是否有正在认证的组织职务消息
     * @param post
     * @return
     */
    SysWxUserOrgPost checkAuditing(SysWxUserOrgPost post);
}