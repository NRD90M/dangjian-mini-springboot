package com.cqut.building.controller;


import com.cqut.building.dto.JsonResult;
import com.cqut.building.entity.serviceChangeOrganization;
import com.cqut.building.service.serviceChangeOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

/**
 * 小程序>>>>应用>>>转组织关系

 * 对应表：change_organization
 */


@RestController
@CrossOrigin
@RequestMapping("/ServiceChangeOrganization")
public class ServiceChangeOrganizationController {

    @Autowired(required = false)
    serviceChangeOrganizationService service;


    //初始查询姓名，性别，学号/工号，原支部
//    @GetMapping("/getInformation")
//    public JsonResult getInformation(@Validated String partyId){
//        JsonResult jsonResult = new JsonResult();
//        jsonResult.setData(service.getInformation(partyId));
//        if(jsonResult.getData()!=null){
//            jsonResult.setMessage("获取信息成功");
//        }else{
//            jsonResult.setMessage("获取信息失败");
//        }
//        return jsonResult;
//
//    }

    //获取所有支部
    @GetMapping("/getTheme")
    public JsonResult getTheme(){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(service.getTheme());
        if(jsonResult.getData()!=null){
            jsonResult.setMessage("获取信息成功");
        }else{
            jsonResult.setMessage("获取信息失败");
        }
        return jsonResult;
    }

    //获取支部名称
    @GetMapping("/getThemeName")
    public String getThemeName(@Validated @RequestParam("partyId") String partyId,@RequestParam("organizationId") String organizationId,@RequestParam("postId") String postId){
       String name = service.getThemeName(partyId,organizationId,postId);
       return name;
    }

    //提交信息
    @PostMapping("/insertChangeOrganization")
    public JsonResult insertChangeOrganization(@Validated @RequestBody serviceChangeOrganization ChangeOrganization){
        JsonResult jsonResult = new JsonResult();
        UUID uuid = UUID.randomUUID();
        ChangeOrganization.setId(uuid.toString().replaceAll("-", ""));
        String orginOrganizationId = service.getThemeId(ChangeOrganization.getOrginOrganizationId());
        String TargetOrganizationId=service.getThemeId(ChangeOrganization.getTargetOrganizationId());
        ChangeOrganization.setOrginOrganizationId(orginOrganizationId);
        ChangeOrganization.setTargetOrganizationId(TargetOrganizationId);
        Date time = new Date();
        Timestamp timestamp=new Timestamp(time.getTime());
        ChangeOrganization.setApplicationDate(timestamp);
        if(service.insert(ChangeOrganization)==1){
            jsonResult.setData(true);
            jsonResult.setMessage("申请转组织成功");
        }else{
            jsonResult.setData(false);
            jsonResult.setMessage("申请转组织失败");
        }
        return jsonResult;

    }


    //获得当前信息
    @GetMapping("/isChangeing")
    public JsonResult isChangeing(@Validated String studentJobNumber){
        JsonResult jsonResult = new JsonResult();
        if(service.isChangeing(studentJobNumber)!=null){
            jsonResult.setData(true);
            jsonResult.setMessage("已提交转组织信息");
        }else{
            jsonResult.setData(false);
            jsonResult.setMessage("未提交转组织信息");
        }

        return jsonResult;

    }

    /**
     * 通过用户的partyId查询用户转组织进度
     * @param partyId
     *
     */
    @GetMapping("/getState")
    public String getState(@Validated  String partyId){

        String State=service.getState(partyId);
        return State;
    }

}
