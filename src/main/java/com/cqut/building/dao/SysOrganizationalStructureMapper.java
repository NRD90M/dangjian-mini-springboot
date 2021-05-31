package com.cqut.building.dao;

import com.cqut.building.dto.OrganizationMember;
import com.cqut.building.dto.OrganizationStructureDto;
import com.cqut.building.entity.SysOrganizationalStructure;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * author：包嵩
 */
@Mapper
public interface SysOrganizationalStructureMapper {
    int deleteByPrimaryKey(String organizationId);

    int insert(SysOrganizationalStructure record);

    int insertSelective(SysOrganizationalStructure record);

    SysOrganizationalStructure selectByPrimaryKey(String organizationId);

    int updateByPrimaryKeySelective(SysOrganizationalStructure record);

    int updateByPrimaryKey(SysOrganizationalStructure record);

    /**
     * 通过级别获取信息
     * author：包嵩
     * @param rank
     * @return
     */
    List<SysOrganizationalStructure> getInfoByRank(int rank);

    /**
     * 获取所有的组织信息
     * author:baosong
     * @return
     */
    List<SysOrganizationalStructure> selectAll();

    /**
     * 得到该组织所有下级组织
     * @param organizationId
     * @return
     */
    List<String> selectAllSubordinateOrganization(String organizationId);

    /**
     * selectAllOrganization
     * @return
     */
    List<OrganizationStructureDto> selectAllOrganization();

    /**
     * getOrganizationMember
     * @return
     */
    List<OrganizationMember> getOrganizationMember(String organizationId);
}