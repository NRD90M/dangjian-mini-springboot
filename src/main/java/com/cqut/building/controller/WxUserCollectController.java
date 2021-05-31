package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.entity.WxUserCollect;
import com.cqut.building.service.WxUserCollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * 小程序>>>>我的>>>我的收藏
 * 对应表：wx_user_collect
 */

@RestController
@CrossOrigin
@RequestMapping("/WxUserCollect")
public class WxUserCollectController {

    @Autowired
    WxUserCollectService service;


    /**
     * 新增收藏文章
     * @param record
     * @return
     */
    @PostMapping("/insert")
    public JsonResult insertSelective(@Validated @RequestBody WxUserCollect record){
        //随机生成32位的收藏id
        UUID uuid = UUID.randomUUID();
        record.setId(uuid.toString().replaceAll("-", ""));

        JsonResult jsonResult = new JsonResult();
        if (service.insertSelective(record)==1){
            jsonResult.setData(true);
            jsonResult.setMessage("收藏成功");
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("收藏失败");
        }
        return jsonResult;
    }

    /**
     * 根据用户id查询所有收藏文章
     * @param id
     * @return
     */
    @GetMapping("/select")
    public JsonResult selectByPrimaryKey(String id){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(service.selectByPrimaryKey(id));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询成功");
        }else {
            jsonResult.setMessage("查询失败");
        }
        return jsonResult;
    }

    /**
     * 根据用户id查询所有收藏文章渲染小程序显示
     * @param id
     * @return
     */
    @GetMapping("/selectAll")
    public JsonResult selectAll(String id){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(service.selectCollect(id));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询成功");
        }else {
            jsonResult.setMessage("查询失败");
        }
        return jsonResult;
    }

    /**
     * 修改收藏文章
     * @param record
     * @return
     */
    @PostMapping("/update")
    public JsonResult updateByPrimaryKeySelective(@Validated @RequestBody WxUserCollect record){
        JsonResult jsonResult = new JsonResult();
        if (service.updateByPrimaryKeySelective(record)==1){
            jsonResult.setData(true);
            jsonResult.setMessage("修改成功");
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("修改失败");
        }
        return jsonResult;
    }


    /**
     * 通过文章id和党员id判断是否收藏
     * @param record
     * @return
     */
    @RequestMapping(value = {"/isCollected"},method = RequestMethod.POST)
    public JsonResult isCollected(@Validated @RequestBody WxUserCollect record){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(service.isCollected(record.getUserId(),record.getMessageId()));
        if (jsonResult.getData()!=null){
            jsonResult.setData(true);
            jsonResult.setMessage("已经收藏");
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("没有收藏");
        }
        return jsonResult;
    }

    /**
     * 通过文章id和党员id取消收藏
     * @param record
     * @return
     */
    @RequestMapping(value = {"/deleteByUserIdAndArticleId"},method = RequestMethod.POST)
    public JsonResult deleteByUserIdAndArticleId(@Validated @RequestBody WxUserCollect record){
        JsonResult jsonResult = new JsonResult();
        if (service.deleteByUserIdAndArticleId(record.getUserId(),record.getMessageId())==1){
            jsonResult.setData(true);
            jsonResult.setMessage("删除成功");
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("删除失败");
        }
        return jsonResult;
    }

    /**
     * 通过党员id查询我收藏的文章
     * @param partyId
     * @return
     */
    @RequestMapping(value = {"/getMyCollectedArticle"},method = RequestMethod.GET)
    public JsonResult getMyCollectedArticle(String partyId){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(service.getMyCollectedArticle(partyId));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询成功");
        }else {
            jsonResult.setMessage("查询失败");
        }
        return jsonResult;
    }
}
