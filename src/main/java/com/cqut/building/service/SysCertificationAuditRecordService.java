package com.cqut.building.service;

import com.cqut.building.entity.SysCertificationAuditRecord;

/**
 * 小程序>>>>我的>>>认证
 * 对应表：sys_certification_audit_record
 */
public interface SysCertificationAuditRecordService {

    int deleteByPrimaryKey(String id);

    int insertSelective(SysCertificationAuditRecord record);

    SysCertificationAuditRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysCertificationAuditRecord record);
}
