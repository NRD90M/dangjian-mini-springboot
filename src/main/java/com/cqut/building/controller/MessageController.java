package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.entity.DynamicArticleManagement;
import com.cqut.building.entity.Message;
import com.cqut.building.service.MessagePersonService;
import com.cqut.building.service.MessageService;
import com.cqut.building.service.ServiceThreeSessionOneClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 小程序>>>>消息通知
 * 对应表：message
 */
@RestController
@CrossOrigin
@RequestMapping("/message")
public class MessageController {

    @Autowired
    MessageService messageService;
    @Autowired
    MessagePersonService messagePersonService;
    @Autowired
    ServiceThreeSessionOneClassService serviceThreeSessionOneClassService;

    /**
     * 查询消息
     * @param messageReceiveId
     * @return
     */
    @GetMapping("/selectMessage")
    public JsonResult selectMessage(String messageReceiveId){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(messageService.selectMessage(messageReceiveId));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询该人消息成功");
        }else {
            jsonResult.setMessage("查询该人消息失败");
        }
        return jsonResult;
    }

    /**
     * 存储消息（会议）
     * @param message
     * @return
     */
    @PostMapping("/insertMessage")
    public JsonResult insertArticle(@RequestBody Message message){
        //随机生成32位的messaged
        UUID uuid = UUID.randomUUID();
        message.setId(uuid.toString().replaceAll("-", ""));

        //发布时间
        Date date = new Date();
        Timestamp timeStamp = new Timestamp(date.getTime());
        message.setMessagePublishTime(timeStamp);

        //获取参会人员
        Map<String,String> hostParticipate=serviceThreeSessionOneClassService.selectHostParticipate(message.getMeetingId());
        //分割存入map
        String[] strs=hostParticipate.get("hostParticipate").split(",");
        Map<String, String> map=new HashMap<>();
        for (String receive:strs) {
            map.put(receive,message.getMeetingId());
        }

        JsonResult jsonResult = new JsonResult();

        if (messageService.insertMessage(message)==1){
            if (messagePersonService.insertMessagePerson(map)>=0){
                jsonResult.setData(true);
                jsonResult.setMessage("消息+对应人添加成功");
            }else {
                jsonResult.setData(false);
                jsonResult.setMessage("消息+对应人添加失败");
            }
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("消息添加失败");
        }
        return jsonResult;
    }

}
