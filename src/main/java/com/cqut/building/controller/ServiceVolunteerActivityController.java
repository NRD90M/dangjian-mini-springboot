package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.dto.ServiceVolunteerActivityDto;
import com.cqut.building.entity.ServiceVolunteerActivity;
import com.cqut.building.service.ServiceVolunteerActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("ServiceVolunteerActivity")
public class ServiceVolunteerActivityController {
    @Autowired(required = false)
    ServiceVolunteerActivityService serviceVolunteerActivityService;

    /**
     * 通过活动id查询活动
     * @param activityId
     * @return
     */
    @RequestMapping(value = {"/selectById"},method = RequestMethod.GET)
    public ServiceVolunteerActivity selectById(String activityId){
        return serviceVolunteerActivityService.selectByPrimaryKey(activityId);
    }

    /**
     * 获取所有的志愿活动
     * @return
     */
    @RequestMapping(value={"/getAllVolunteerActivities"},method = RequestMethod.GET)
    public JsonResult getAllVolunteerActivities(){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(serviceVolunteerActivityService.getAllVolunteerActivities());
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询成功");
        }else {
            jsonResult.setMessage("查询失败");
        }
        return jsonResult;
    }


    /**
     * 创建活动
     */
    @PostMapping("/insertActivity")
    public JsonResult insertActivity(@RequestBody ServiceVolunteerActivityDto activity){
        JsonResult jsonResult = new JsonResult();
        activity.setActivityState("1");//活动状态
        activity.setSignUpNumber(0);//报名人数
//        activity.setReleaseTime(new Date());//发布时间
        activity.setReadingVolume(0);//阅读量
        activity.setActivitySource("1");//活动来源 小程序
        activity.setSubmissionTime(new Date());//投稿时间
        activity.setApprovalState("0");//审核状态 未审核
//        activity.setReviewerId("");//审核人
//        activity.setReviewTime();//审核时间
        activity.setLikeNumber(0);//点赞数
//        activity.setReviewDescription();//审核说明
        jsonResult.setData(serviceVolunteerActivityService.insertActivity(activity));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("添加成功");
        }else {
            jsonResult.setMessage("添加失败");
        }

        return jsonResult;
    }
}
