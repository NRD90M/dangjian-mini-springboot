package com.cqut.building.serviceImp;

import com.cqut.building.dao.SysOrganizationalStructureMapper;
import com.cqut.building.dto.OrganizationMember;
import com.cqut.building.dto.OrganizationStructureDto;
import com.cqut.building.entity.SysOrganizationalStructure;
import com.cqut.building.service.SysOrganizationalStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author:baosong
 */

@Service
public class SysOrganizationalStructureServiceImp implements SysOrganizationalStructureService {
    @Autowired(required = false)
    SysOrganizationalStructureMapper mapper;

    @Override
    public int deleteByPrimaryKey(String organizationId) {
        return mapper.deleteByPrimaryKey(organizationId);
    }

    @Override
    public int insert(SysOrganizationalStructure record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(SysOrganizationalStructure record) {
        return mapper.insertSelective(record);
    }

    @Override
    public SysOrganizationalStructure selectByPrimaryKey(String organizationId) {
        return mapper.selectByPrimaryKey(organizationId);
    }

    @Override
    public int updateByPrimaryKeySelective(SysOrganizationalStructure record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysOrganizationalStructure record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SysOrganizationalStructure> getInfoByRank(int rank) {
        return mapper.getInfoByRank(rank);
    }

    @Override
    public List<SysOrganizationalStructure> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public List<OrganizationStructureDto> selectAllOrganization() {
        return mapper.selectAllOrganization();
    }

    @Override
    public List<OrganizationMember> getOrganizationMember(String organizationId) {
        return mapper.getOrganizationMember(organizationId);
    }

    @Override
    public List<String> selectAllSubordinateOrganization(String organizationId) {
        return mapper.selectAllSubordinateOrganization(organizationId);
    }
}
