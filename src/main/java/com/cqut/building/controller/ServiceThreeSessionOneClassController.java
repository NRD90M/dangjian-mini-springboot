package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.dto.MinutesMeetingIdDto;
import com.cqut.building.dto.ParticipateThreeSessionOneClassDto;
import com.cqut.building.dto.ThreeSessionOneClassDto;
import com.cqut.building.service.ServiceParticipateThreeSessionOneClassService;
import com.cqut.building.service.ServiceThreeSessionOneClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * 小程序>>>>应用>>>三会一课及三会一课的参会列表
 * 对应表：service_three_session_one_class
 */

@RestController
@CrossOrigin
@RequestMapping("/serviceThreeSessionOneClass")
public class ServiceThreeSessionOneClassController {

    @Autowired
    ServiceThreeSessionOneClassService serviceThreeSessionOneClassService;

    @Autowired
    ServiceParticipateThreeSessionOneClassService serviceParticipateThreeSessionOneClassService;
    /**
     * 根据会议id查询三会一课信息
     * @param id
     * @return
     */
    @GetMapping("/selectById")
    public JsonResult selectByPrimaryKey(String id){
        JsonResult jsonResult = new JsonResult();
        ThreeSessionOneClassDto threeSessionOneClassDto =serviceThreeSessionOneClassService.selectByPrimaryKey(id);
        String participateName = serviceParticipateThreeSessionOneClassService.selectParticipateNameByClassId(id).toString();
        threeSessionOneClassDto.setParticipateName(participateName);
        jsonResult.setData(threeSessionOneClassDto);
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询三会一课信息成功");
        }else {
            jsonResult.setMessage("查询三会一课信息失败");
        }
        return jsonResult;
    }


    /**
     * 根据参会人员id查询参加了哪些三会一课
     * @param participateId
     * @return
     */
    @GetMapping("/selectByParticipateId")
    public JsonResult selectByParticipateId(String participateId){
        JsonResult jsonResult = new JsonResult();
        List<ParticipateThreeSessionOneClassDto> list=serviceParticipateThreeSessionOneClassService.selectParticipateId(participateId);
        Date nowTime = new Date();
        for(int i=0;i<list.size();i++){
            if(nowTime.getTime()-list.get(i).getMeetingTime().getTime()<0){//未开始
                list.get(i).setStatus(0);
            }else if((((nowTime.getTime()-list.get(i).getMeetingTime().getTime())/(60*60*1000))%24)>2){//已经结束
                list.get(i).setStatus(2);
            }else{//进行中
                list.get(i).setStatus(1);
            }


        }
        jsonResult.setData(list);
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询三会一课成功");
        }else {
            jsonResult.setMessage("查询三会一课失败");
        }
        return jsonResult;
    }

    @PostMapping("/updateMinutesMeetingIdById")
    public JsonResult updateMinutesMeetingIdById(MinutesMeetingIdDto minutesMeetingIdDto){
        JsonResult jsonResult = new JsonResult();
        int result=serviceThreeSessionOneClassService.updateByPrimaryKeyMinutesMeetingId(minutesMeetingIdDto);
        if(result==1){
            jsonResult.setData(true);
            jsonResult.setMessage("会议纪要ID更新成功");
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("会议纪要ID更新失败");
        }
        return jsonResult;
    }
}


