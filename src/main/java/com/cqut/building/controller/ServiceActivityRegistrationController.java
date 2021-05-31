package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.entity.ServiceActivityRegistration;
import com.cqut.building.entity.ServiceVolunteerActivity;
import com.cqut.building.service.ServiceActivityRegistrationService;
import com.cqut.building.service.ServiceVolunteerActivityService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("/ServiceActivityRegistration")
public class ServiceActivityRegistrationController {
    @Autowired
    ServiceActivityRegistrationService registrationService;

    /**
     * 活动
     */
    @Autowired
    ServiceVolunteerActivityService  activityService;

    /**
     * 先根据党员id查询活动id 然后再通过活动id查询活动
     * @param partyId
     * @return
     */
    @RequestMapping(value = {"selectActivityIdByPartyId"},method = RequestMethod.GET)
    public JsonResult selectActivityIdByUserId(String partyId){
        JsonResult jsonResult = new JsonResult();
        List<ServiceActivityRegistration> list = new LinkedList<>();//获取活动用户中间表
        list = registrationService.selectActivityIdByUserId(partyId);//获取活动的id
        List<ServiceVolunteerActivity> volunteerActivities = new LinkedList<>();//获取活动
        for (int i = 0;i<list.size();i++){
            volunteerActivities.add(activityService.selectByPrimaryKey(list.get(i).getVolunteerActivityId()));
        }
        jsonResult.setData(volunteerActivities);
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询成功");
        }else {
            jsonResult.setMessage("查询失败");
        }
        return jsonResult;
    }

    /**
     * 检测是否报名
     * author:包嵩
     * @param activityId
     * @param partyId
     * @return
     */
    @RequestMapping(value = {"/isSignUp"},method = RequestMethod.GET)
    public JsonResult isSignUp(String activityId,String partyId){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(registrationService.isSignUp(activityId,partyId));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("success");
        }else {
            jsonResult.setMessage("fail");
        }
        return jsonResult;
    }


    @RequestMapping(value = {"/add"},method = RequestMethod.POST)
    public void addActivity(@RequestBody ServiceActivityRegistration record){
        System.out.println(record.getVolunteerActivityId());
        System.out.println(record.getApplicantId());
        Date date = new Date();
        date.setHours(date.getHours()+8);
        UUID uuid = UUID.randomUUID();
        String uuid1 = uuid.toString().replace("-", "");
        record.setId(uuid1);
        record.setRegistrationTime(date);
        registrationService.insert(record);
    }
}
