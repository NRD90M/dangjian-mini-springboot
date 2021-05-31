package com.cqut.building.serviceImp;

import com.cqut.building.dao.SysPartyOrganizationPostMapper;
import com.cqut.building.dto.OrganizationPositionDto;
import com.cqut.building.entity.SysPartyOrganizationPost;
import com.cqut.building.service.SysPartyOrganizationPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysPartyOrganizationPostServiceImpl implements SysPartyOrganizationPostService {
    @Autowired(required = false)
    SysPartyOrganizationPostMapper mapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysPartyOrganizationPost record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(SysPartyOrganizationPost record) {
        return mapper.insertSelective(record);
    }

    @Override
    public SysPartyOrganizationPost selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysPartyOrganizationPost record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysPartyOrganizationPost record) {
        return mapper.updateByPrimaryKey(record);
    }
}
