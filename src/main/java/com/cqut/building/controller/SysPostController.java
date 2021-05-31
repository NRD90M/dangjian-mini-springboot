package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.entity.SysPost;
import com.cqut.building.service.SysPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 小程序>>>>我的>>>职务下拉框
 * 对应表：sys_post
 */
@CrossOrigin
@RestController
@RequestMapping("/sysPost")
public class SysPostController {

    @Autowired
    SysPostService sysPostService;

    @GetMapping("/selectById")
    public JsonResult selectByPrimaryKey(String id){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(sysPostService.selectByPrimaryKey(id));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询成功");
        }else {
            jsonResult.setMessage("查询失败");
        }
        return jsonResult;
    }

    /**
     * 查询职务
     * author：包嵩
     * @return
     */
    @GetMapping("/selectPosts")
    public JsonResult selectPosts(){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(sysPostService.selectPosts());
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询成功");
        }else {
            jsonResult.setMessage("查询失败");
        }
        return jsonResult;
    }
}
