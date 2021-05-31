package com.cqut.building.serviceImp;

import com.cqut.building.dao.SysWxUserMapper;
import com.cqut.building.dto.SecondAuditedDataDto;
import com.cqut.building.dto.SelectPersonalInformationDto;
import com.cqut.building.entity.SysWxUser;
import com.cqut.building.service.SysWxUserService;
import com.cqut.building.util.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 小程序>>>>我的>>>个人信息
 * 对应表：sys_wx_user
 */

@Service
public class SysWxUserServiceImp implements SysWxUserService {

    @Autowired(required = false)
    SysWxUserMapper mapper;

    //新增微信用户
    @Override
    public int insertSelective(SysWxUser record) {
        return mapper.insertSelective(record);
    }

    //删除微信用户
    @Override
    public int deleteByPrimaryKey(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

    //不带判空的新增
    @Override
    public int insert(SysWxUser record) {
        return mapper.insert(record);
    }

    //修改微信用户信息
    @Override
    public int updateByPrimaryKeySelective(SysWxUser record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    //不带判空的整体修改
    @Override
    public int updateByPrimaryKey(SysWxUser record) {
        return mapper.updateByPrimaryKey(record);
    }

    //根据id查询微信用户信息
    @Override
    public SysWxUser selectByPrimaryKey(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    //根据用户id查询用户所属学院id
    @Override
    public String selectById(String id) {
        return mapper.selectById(id);
    }

    //根据个人id查询用户名字
    @Override
    public String selectByName(String id) {
        return mapper.selectByName(id);
    }

    @Override
    public SelectPersonalInformationDto selectByOpenId(String openId) {
        SelectPersonalInformationDto dto = mapper.selectByOpenId(openId);
        return dto;
    }

    @Override
    public int secondAudited(SecondAuditedDataDto dto) {
        return mapper.secondAudited(dto);
    }
}
