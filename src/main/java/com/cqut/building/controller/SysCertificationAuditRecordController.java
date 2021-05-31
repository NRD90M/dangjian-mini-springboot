package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.entity.SysCertificationAuditRecord;
import com.cqut.building.service.SysCertificationAuditRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 小程序>>>>我的>>>认证
 * 对应表：sys_certification_audit_record
 */

@RestController
@CrossOrigin
@RequestMapping("/SCAuditRecord")
public class SysCertificationAuditRecordController {

    @Autowired(required = false)
    SysCertificationAuditRecordService sysCertificationAuditRecordService;

    /**
     * 根据认证记录id删除
     * @param id
     * @return
     */
    @GetMapping("/delete")
    public JsonResult deleteByPrimaryKey(String id){
        JsonResult jsonResult = new JsonResult();
        if (sysCertificationAuditRecordService.deleteByPrimaryKey(id)==1){
            jsonResult.setData(true);
            jsonResult.setMessage("删除认证记录成功");
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("删除认证记录失败");
        }
        return jsonResult;
    }

    /**
     * 插入一条新的认证记录
     * @param record
     * @return
     */
    @PostMapping("/insert")
    public JsonResult insertSelective(@Validated @RequestBody SysCertificationAuditRecord record){
        JsonResult jsonResult = new JsonResult();
        if (sysCertificationAuditRecordService.insertSelective(record)==1){
            jsonResult.setData(true);
            jsonResult.setMessage("新增认证记录成功");
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("新增认证记录失败");
        }
        return jsonResult;
    }

    /**
     * 根据认证记录id查询
     * @param id
     * @return
     */
    @GetMapping("selectById")
    public JsonResult selectByPrimaryKey(String id){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(sysCertificationAuditRecordService.selectByPrimaryKey(id));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询单条记录成功");
        }else {
            jsonResult.setMessage("查询单条记录失败");
        }
        return jsonResult;
    }

    /**
     * 根据认证id修改认证记录
     * @param record
     * @return
     */
    @PostMapping("/update")
    public JsonResult updateByPrimaryKeySelective(@Validated @RequestBody SysCertificationAuditRecord record){
        JsonResult jsonResult = new JsonResult();
        if (sysCertificationAuditRecordService.updateByPrimaryKeySelective(record)==1){
            jsonResult.setData(true);
            jsonResult.setMessage("修改认证记录成功");
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("修改认证记录失败");
        }
        return jsonResult;
    }
}
