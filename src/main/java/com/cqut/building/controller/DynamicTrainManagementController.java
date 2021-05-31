package com.cqut.building.controller;


import com.cqut.building.dto.JsonResult;
import com.cqut.building.service.DynamicTrainManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 小程序>>>>首页>>>党校培训
 * 对应表：dynamic_train_management
 */

@RestController
@CrossOrigin
@RequestMapping("/dynamicTrainManagement")
public class DynamicTrainManagementController {
    @Autowired
    DynamicTrainManagementService dynamicTrainManagementService;

    /**
     * 查询全部党校培训
     * @return
     */
    @GetMapping("/selectTrainAll")
    public JsonResult selectTrainAll(){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(dynamicTrainManagementService.selectTrainAll());
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询成功");
        }else {
            jsonResult.setMessage("查询失败");
        }
        return jsonResult;
    }

    /**
     * 按照id查询
     * 增加浏览量
     * @param id
     * @return
     */
    @GetMapping("/selectTrainByPrimaryKey")
    public JsonResult selectByPrimaryKey(String id){
        JsonResult jsonResult = new JsonResult();
        int browsing=dynamicTrainManagementService.updateBrowsingByPrimaryKey(id);
        if (browsing!=1){
            jsonResult.setMessage("浏览量增加失败");
        }
        jsonResult.setData(dynamicTrainManagementService.selectByPrimaryKey(id));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询该党校培训文章成功");
        }else {
            jsonResult.setMessage("查询该党校培训文章文章失败");
        }
        return jsonResult;
    }
}
