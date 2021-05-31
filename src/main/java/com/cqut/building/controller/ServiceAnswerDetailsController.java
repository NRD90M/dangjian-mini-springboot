package com.cqut.building.controller;


import com.cqut.building.dto.JsonResult;
import com.cqut.building.service.ServiceAnswerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_answer_details
 */

@RestController
@CrossOrigin
@RequestMapping("/serviceAnswerDetails")
public class ServiceAnswerDetailsController {

    @Autowired
    ServiceAnswerDetailsService serviceAnswerDetailsService;

    @GetMapping("/selectByAnswerRecordId")
    public JsonResult selectByRecordId(String answerRecordId){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(serviceAnswerDetailsService.selectByAnswerRecordId(answerRecordId));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询成功");
        }else {
            jsonResult.setMessage("查询失败");
        }
        return jsonResult;
    }
}
