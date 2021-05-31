package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.service.ServiceExaminationManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_examination_management
 */

@RestController
@CrossOrigin
@RequestMapping("/serviceExaminationManagement")
public class ServiceExaminationManagementController {
    @Autowired
    ServiceExaminationManagementService serviceExaminationManagementService;

    /**
     * 查询所有考题
     * @return
     */
    @GetMapping("/selectExaminationAll")
    public JsonResult selectExaminationAll(String userId){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(serviceExaminationManagementService.selectExaminationAll(userId));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询考题成功");
        }else {
            jsonResult.setMessage("查询考题失败");
        }
        return jsonResult;
    }

    /**
     * 按照分类查询
     * @param questionCategoryId
     * @return
     */
    @GetMapping("/selectExaminationByCategory")
    public JsonResult selectExaminationByCategory(String userId,String questionCategoryId){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(serviceExaminationManagementService.selectExaminationByCategory(userId,questionCategoryId));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询该类型考题成功");
        }else {
            jsonResult.setMessage("查询该类型考题失败");
        }
        return jsonResult;
    }

    /**
     * 按照id查询
     * @param userId
     * @param id
     * @return
     */
    @GetMapping("/selectExaminationById")
    public JsonResult selectExaminationById(String userId,String id){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(serviceExaminationManagementService.selectExaminationById(userId,id));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询该考题成功");
        }else {
            jsonResult.setMessage("查询该考题失败");
        }
        return jsonResult;
    }
}
