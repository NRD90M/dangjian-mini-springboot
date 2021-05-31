package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.service.ServiceQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_question
 */

@RestController
@CrossOrigin
@RequestMapping("/serviceQuestion")
public class ServiceQuestionController {
    @Autowired
    ServiceQuestionService serviceQuestionService;

    /**
     * 按照考题id查询
     * @param examinationId
     * @return
     */
    @GetMapping("/selectExaminationQuestionById")
    public JsonResult selectExaminationQuestionById(String examinationId){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(serviceQuestionService.selectExaminationQuestionByIdNoAnswer(examinationId));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询考题成功");
        }else {
            jsonResult.setMessage("查询考题失败");
        }
        return jsonResult;
    }
}
