package com.cqut.building.serviceImp;

import com.cqut.building.dao.SysCertificationAuditRecordMapper;
import com.cqut.building.entity.SysCertificationAuditRecord;
import com.cqut.building.service.SysCertificationAuditRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 小程序>>>>我的>>>认证
 * 对应表：sys_certification_audit_record
 */
@Service
public class SysCertificationAuditRecordServiceImp implements SysCertificationAuditRecordService {
    @Autowired(required = false)
    SysCertificationAuditRecordMapper certificationAuditRecordMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return certificationAuditRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(SysCertificationAuditRecord record) {
        return certificationAuditRecordMapper.insertSelective(record);
    }

    @Override
    public SysCertificationAuditRecord selectByPrimaryKey(String id) {
        return certificationAuditRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysCertificationAuditRecord record) {
        return certificationAuditRecordMapper.updateByPrimaryKeySelective(record);
    }
}
