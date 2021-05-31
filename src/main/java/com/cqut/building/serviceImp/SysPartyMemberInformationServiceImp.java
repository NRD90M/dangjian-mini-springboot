package com.cqut.building.serviceImp;

import com.cqut.building.dao.SysPartyMemberInformationMapper;
import com.cqut.building.dto.GetSponsorAndReviewerNameDto;
import com.cqut.building.dto.IsAuditedDataDto;
import com.cqut.building.entity.SysPartyMemberInformation;
import com.cqut.building.service.SysPartyMemberInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 党员信息表
 * 对应表：sys_party_member_information
 */
@Service
public class SysPartyMemberInformationServiceImp implements SysPartyMemberInformationService {

    @Autowired(required = false)
    SysPartyMemberInformationMapper sysPartyMemberInformationMapper;

    /**
     * 根据党员id查询信息，小程序初次登陆时，根据什么来判断是否认证，学号？
     * @param id
     * @return
     */
    @Override
    public SysPartyMemberInformation selectByPrimaryKey(String id) {
        return sysPartyMemberInformationMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据党员id删除
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(String id) {
        return sysPartyMemberInformationMapper.deleteByPrimaryKey(id);
    }

    /**
     * 新增党员
     * @param record
     * @return
     */
    @Override
    public int insert(SysPartyMemberInformation record) {
        return sysPartyMemberInformationMapper.insert(record);
    }

    /**
     * 含判空的新增党员
     * @param record
     * @return
     */
    @Override
    public int insertSelective(SysPartyMemberInformation record) {
        return sysPartyMemberInformationMapper.insertSelective(record);
    }

    /**
     * 含判空的修改
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(SysPartyMemberInformation record) {
        return sysPartyMemberInformationMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 修改
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(SysPartyMemberInformation record) {
        return sysPartyMemberInformationMapper.updateByPrimaryKey(record);
    }

    @Override
    public String compareTo(IsAuditedDataDto record) {
        return sysPartyMemberInformationMapper.compareTo(record);
    }

    @Override
    public String getNameByPartyId(String id) {
        return sysPartyMemberInformationMapper.getNameByPartyId(id);
    }
}
