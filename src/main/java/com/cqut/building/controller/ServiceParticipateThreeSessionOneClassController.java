package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;

import com.cqut.building.dto.ParticipateThreeSessionOneClassDto;
import com.cqut.building.service.ServiceParticipateThreeSessionOneClassService;
import com.cqut.building.service.ServiceThreeSessionOneClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 小程序>>>>应用>>>三会一课的参会列表
 * 对应表：service_participate_three_session_one_class
 */

@RestController
@CrossOrigin
@RequestMapping("/serviceParticipateThreeSessionOneClass")
public class ServiceParticipateThreeSessionOneClassController {
    @Autowired
    ServiceParticipateThreeSessionOneClassService serviceParticipateThreeSessionOneClassService;


    /**
     * 根据参会人员id查询参加了哪些三会一课
     * @param participateId
     * @return
     */
    @GetMapping("/selectByParticipateId")
    public JsonResult selectByParticipateId(String participateId){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(serviceParticipateThreeSessionOneClassService.selectParticipateId(participateId));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询三会一课成功");
        }else {
            jsonResult.setMessage("查询三会一课失败");
        }
        return jsonResult;
    }

}
