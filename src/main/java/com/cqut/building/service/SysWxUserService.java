package com.cqut.building.service;

import com.cqut.building.dto.SecondAuditedDataDto;
import com.cqut.building.dto.SelectPersonalInformationDto;
import com.cqut.building.entity.SysWxUser;
import com.cqut.building.util.PageResult;

/**
 * 小程序>>>>我的>>>个人信息
 * 对应表：sys_wx_user
 */

public interface SysWxUserService {
    int deleteByPrimaryKey(String id);

    int insert(SysWxUser record);

    int insertSelective(SysWxUser record);

    SysWxUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysWxUser record);

    int updateByPrimaryKey(SysWxUser record);

    String selectById(String id);

    String selectByName(String id);

    /**
     * 根据openId查询个人信息
     * @param openId
     * @return
     */
    SelectPersonalInformationDto selectByOpenId(String openId);

    /**
     * 第二次认证修改数据
     * @param dto
     * @return
     */
    int secondAudited(SecondAuditedDataDto dto);
}
