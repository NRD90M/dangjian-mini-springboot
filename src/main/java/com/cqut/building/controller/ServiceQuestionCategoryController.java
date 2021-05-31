package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.service.ServiceQuestionCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_question_category
 */

@RestController
@CrossOrigin
@RequestMapping("/serviceQuestionCategory")
public class ServiceQuestionCategoryController {
    @Autowired
    ServiceQuestionCategoryService service;

    @GetMapping("/selectAllCategory")
    public JsonResult selectAllCategory(){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(service.selectAllCategoryName());
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询分类成功");
        }else {
            jsonResult.setMessage("查询分类失败");
        }
        return jsonResult;
    }
}
