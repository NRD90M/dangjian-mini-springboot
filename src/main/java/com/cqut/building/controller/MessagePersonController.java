package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.service.MessagePersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 小程序>>>>消息通知
 * 对应表：messagePerson
 */
@RestController
@CrossOrigin
@RequestMapping("/messagePerson")
public class MessagePersonController {

    @Autowired
    MessagePersonService messagePersonService;

    /**
     * 删除消息
     * @param id
     * @return
     */
    @GetMapping("/deleteByMessagePerson")
    public JsonResult deleteByMessagePerson(String id){
        JsonResult jsonResult = new JsonResult();
        if (messagePersonService.deleteByMessagePerson(id)==1){
            jsonResult.setData(true);
            jsonResult.setMessage("删除成功");
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("删除失败");
        }
        return jsonResult;
    }

    @GetMapping("/updateByIsRead")
    public JsonResult updateByIsRead(String id){
        JsonResult jsonResult = new JsonResult();
        if (messagePersonService.updateByIsRead(id)==1){
            jsonResult.setData(true);
            jsonResult.setMessage("修改已读成功");
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("修改已读失败");
        }
        return jsonResult;
    }
}
