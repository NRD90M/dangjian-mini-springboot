package com.cqut.building.serviceImp;

import com.cqut.building.dao.SysWxUserOrgPostMapper;
import com.cqut.building.dto.OrganizationPositionDto;
import com.cqut.building.dto.SecondAuditedDataDto;
import com.cqut.building.entity.SysWxUserOrgPost;
import com.cqut.building.service.SysWxUserOrgPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysWxUserOrgPostServiceImpl implements SysWxUserOrgPostService {
    @Autowired(required = false)
    SysWxUserOrgPostMapper mapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysWxUserOrgPost record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(SysWxUserOrgPost record) {
        return mapper.insertSelective(record);
    }

    @Override
    public SysWxUserOrgPost selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysWxUserOrgPost record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysWxUserOrgPost record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public SysWxUserOrgPost selectByOpenId(String openId) {
        return mapper.selectByOpenId(openId);
    }

    @Override
    public int insertOrganizationPosition(SecondAuditedDataDto dataDto) {
        return mapper.insertOrganizationPosition(dataDto);
    }

    @Override
    public int updateOrganizationPosition(SecondAuditedDataDto dataDto) {
        return mapper.updateOrganizationPosition(dataDto);
    }

    @Override
    public OrganizationPositionDto selectOrganizationPosition(String openId) {
        return mapper.selectOrganizationPosition(openId);
    }

    @Override
    public List<OrganizationPositionDto> selectAllOrganizationPosition(SysWxUserOrgPost post) {
        return mapper.selectAllOrganizationPosition(post);
    }

    @Override
    public SysWxUserOrgPost checkIsAudited(SysWxUserOrgPost post) {
        return mapper.checkIsAudited(post);
    }

    @Override
    public SysWxUserOrgPost checkAuditing(SysWxUserOrgPost post) {
        return mapper.checkAuditing(post);
    }
}
