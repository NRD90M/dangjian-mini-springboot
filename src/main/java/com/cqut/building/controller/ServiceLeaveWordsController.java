package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.dto.LeaveWordsDto;
import com.cqut.building.entity.ServiceLeaveWords;
import com.cqut.building.service.ServiceLeaveWordsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

/**
 * 小程序>>>>应用>>>留言
 * 对应表：service-leave-words
 */

@RestController
@CrossOrigin
@RequestMapping("/serviceLeaveWords")
public class ServiceLeaveWordsController {

    @Autowired(required = false)
    ServiceLeaveWordsService service;

    /**
     * 留言
     * 参数留言人partyId和留言内容
     *
     */
    @PostMapping("insertLeaveWords")
    public JsonResult insertLeaveWords(@Validated @RequestBody LeaveWordsDto leaveWordsDto){
        ServiceLeaveWords serviceLeaveWords = new ServiceLeaveWords();
        JsonResult jsonResult = new JsonResult();

        //随机生成32位的投票id
        UUID uuid = UUID.randomUUID();
        //id
        serviceLeaveWords.setId(uuid.toString().replaceAll("-", ""));

        //留言人id
        serviceLeaveWords.setWxUserId(leaveWordsDto.getWxUserId());

        serviceLeaveWords.setLeavePostId(leaveWordsDto.getLeavePostId());

        serviceLeaveWords.setLeaveOrganizationId(leaveWordsDto.getLeaveOrganizationId());

        //留言内容
        serviceLeaveWords.setLeaveWordsContent(leaveWordsDto.getLeaveWordsContent());
        Date time = new Date();
        Timestamp timestamp=new Timestamp(time.getTime());
        //留言时间
        serviceLeaveWords.setLeaveWordsTime(timestamp);

        if(service.insert(serviceLeaveWords)==1){
            jsonResult.setData(true);
            jsonResult.setMessage("新增留言成功");
        }else{
            jsonResult.setData(false);
            jsonResult.setMessage("新增留言失败");
        }

        return jsonResult;
    }

    @GetMapping("/getLeaveWordsList")
    public JsonResult getLeaveWordsList(@Validated @RequestParam("partyId") String partyId ){
        JsonResult jsonResult = new JsonResult();

        jsonResult.setData(service.getLeaveWordsList(partyId));
        return jsonResult;
    }

}
