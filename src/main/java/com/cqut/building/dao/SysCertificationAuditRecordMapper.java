package com.cqut.building.dao;

import com.cqut.building.entity.SysCertificationAuditRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * 小程序>>>>我的>>>认证
 * 对应表：sys_certification_audit_record
 */
@Mapper
public interface SysCertificationAuditRecordMapper {
    int deleteByPrimaryKey(String id);

    int insertSelective(SysCertificationAuditRecord record);

    SysCertificationAuditRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysCertificationAuditRecord record);

}