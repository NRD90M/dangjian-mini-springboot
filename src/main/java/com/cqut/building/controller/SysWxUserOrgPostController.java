package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.dto.OrganizationPositionDto;
import com.cqut.building.entity.SysWxUser;
import com.cqut.building.entity.SysWxUserOrgPost;
import com.cqut.building.service.SysWxUserOrgPostService;
import com.cqut.building.service.SysWxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * author:包嵩
 */

@RestController
@CrossOrigin
@RequestMapping("/sysWxUserOrgPost")
public class SysWxUserOrgPostController {

    @Autowired
    SysWxUserOrgPostService service;

    @Autowired
    SysWxUserService userService;

    @RequestMapping(value = {"insert"},method = RequestMethod.POST)
    public void insert(@RequestBody SysWxUserOrgPost record){
        SysWxUser user = new SysWxUser();
        user.setIsAudited(0);
        userService.updateByPrimaryKey(user);
        service.insert(record);
    }

    /**
     * 用户多职务认证之后判断是否重复认证职务
     * @param post
     * @return
     */
    @GetMapping("checkIsAudited")
    public JsonResult isAudited(SysWxUserOrgPost post){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(service.checkIsAudited(post));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询成功");
        }else {
            jsonResult.setMessage("查询失败");
        }
        return jsonResult;
    }


    /**
     * 查询组织职务信息
     * @param openId
     * @return
     * OrganizationPositionDto
     */

    @RequestMapping(value = {"/selectOrganizationPosition"},method = RequestMethod.GET)
    public JsonResult selectOrganizationPosition(String openId){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(service.selectOrganizationPosition(openId));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询成功");
        }else {
            jsonResult.setMessage("查询失败");
        }
        return jsonResult;
    }


    /**
     *  查询所有已经认证的组织职务
     * @param post
     * @return
     */
    @GetMapping("/selectAllOrganizationPosition")
    public JsonResult selectAllOrganizationPosition(SysWxUserOrgPost post){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(service.selectAllOrganizationPosition(post));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询成功");
        }else {
            jsonResult.setMessage("查询失败");
        }
        return jsonResult;
    }

    /**
     * 加载页面的时候查看是否有正在认证的消息
     * @param post
     * @return
     */
    @GetMapping("/checkAuditing")
    public JsonResult checkAuditing(SysWxUserOrgPost post){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(service.checkAuditing(post));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询成功");
        }else {
            jsonResult.setMessage("查询失败");
        }
        return jsonResult;
    }
}
