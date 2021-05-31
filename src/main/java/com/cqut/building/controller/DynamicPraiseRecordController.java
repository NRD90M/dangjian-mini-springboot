package com.cqut.building.controller;


import com.cqut.building.dto.AboutPraiseRecordDto;
import com.cqut.building.dto.GetAddPraiseDto;
import com.cqut.building.dto.JsonResult;
import com.cqut.building.entity.DynamicPraiseRecord;
import com.cqut.building.service.DynamicArticleManagementService;
import com.cqut.building.service.DynamicPraiseRecordService;
import com.cqut.building.service.DynamicTrainManagementService;
import com.cqut.building.service.ServiceThemeDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

/**
 * 小程序>>>>首页>>>基层风采，党员先锋
 * 对应表：dynamic_praise_record
 */

@RestController
@CrossOrigin
@RequestMapping("/dynamicPraiseRecord")
public class DynamicPraiseRecordController {
    @Autowired
    DynamicPraiseRecordService dynamicPraiseRecordService;

    @Autowired
    DynamicArticleManagementService dynamicArticleManagementService;

    @Autowired
    DynamicTrainManagementService dynamicTrainManagementService;

    @Autowired
    ServiceThemeDayService serviceThemeDayService;

    /**
     * 添加点赞记录
     * @param getAddPraiseDto
     * @return
     */
    @GetMapping("/insertByArticleTrainId")
    public JsonResult insertByArticleTrainId(GetAddPraiseDto getAddPraiseDto){
        DynamicPraiseRecord dynamicPraiseRecord= new DynamicPraiseRecord();
        //随机生成32位的点赞id
        UUID uuid = UUID.randomUUID();
        dynamicPraiseRecord.setId(uuid.toString().replaceAll("-", ""));
        //当前时间
        dynamicPraiseRecord.setTime(new Date());
        //文章id
        dynamicPraiseRecord.setArticleId(getAddPraiseDto.getArticleId());
        //点赞用户id
        dynamicPraiseRecord.setUserId(getAddPraiseDto.getUserId());

        JsonResult jsonResult = new JsonResult();

        if (getAddPraiseDto.getPraiseType()==1){
            int praise=dynamicArticleManagementService.updatePraiseByPrimaryKeyAdd(getAddPraiseDto.getArticleId());
            if (praise!=1){
                jsonResult.setMessage("点赞失败");
                return jsonResult;
            }
        }else if (getAddPraiseDto.getPraiseType()==2){
            int praise=dynamicTrainManagementService.updatePraiseByPrimaryKeyAdd(getAddPraiseDto.getArticleId());
            if (praise!=1){
                jsonResult.setMessage("点赞失败");
                return jsonResult;
            }
        }else if (getAddPraiseDto.getPraiseType()==3){
            int praise=serviceThemeDayService.updatePraiseByPrimaryKeyAdd(getAddPraiseDto.getArticleId());
            if (praise!=1){
                jsonResult.setMessage("点赞失败");
                return jsonResult;
            }
        }

        if (dynamicPraiseRecordService.insertByArticleTrainId(dynamicPraiseRecord)==1){
            jsonResult.setData(true);
            jsonResult.setMessage("点赞成功");
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("点赞失败");
        }
        return jsonResult;
    }

    /**
     * 取消点赞（删除点赞记录）
     * @param getAddPraiseDto
     * @return
     */
    @PostMapping("/deletePraiseRecord")
    public JsonResult deletePraiseRecord(@RequestBody GetAddPraiseDto getAddPraiseDto){
        AboutPraiseRecordDto aboutPraiseRecordDto=new AboutPraiseRecordDto();
        aboutPraiseRecordDto.setUserId(getAddPraiseDto.getUserId());
        aboutPraiseRecordDto.setArticleId(getAddPraiseDto.getArticleId());

        JsonResult jsonResult = new JsonResult();
        if (getAddPraiseDto.getPraiseType()==1){
            int praise=dynamicArticleManagementService.updatePraiseByPrimaryKeyReduce(getAddPraiseDto.getArticleId());
            if (praise!=1){
                jsonResult.setMessage("点赞取消失败");
                return jsonResult;
            }
        }else if (getAddPraiseDto.getPraiseType()==2){
            int praise=dynamicTrainManagementService.updatePraiseByPrimaryKeyReduce(getAddPraiseDto.getArticleId());
            if (praise!=1){
                jsonResult.setMessage("点赞取消失败");
                return jsonResult;
            }
        }else if (getAddPraiseDto.getPraiseType()==3){
            int praise=serviceThemeDayService.updatePraiseByPrimaryKeyReduce(getAddPraiseDto.getArticleId());
            if (praise!=1){
                jsonResult.setMessage("点赞取消失败");
                return jsonResult;
            }
        }
        if (dynamicPraiseRecordService.deletePraiseRecord(aboutPraiseRecordDto)==1){
            jsonResult.setData(false);
            jsonResult.setMessage("删除点赞记录成功");
        }else {
            jsonResult.setData(true);
            jsonResult.setMessage("删除点赞记录失败");
        }
        return jsonResult;
    }


    /**
     * 判断是否点赞查询记录
     * @param aboutPraiseRecordDto
     * @return
     */
    @PostMapping("/selectPraiseRecordNumById")
    public JsonResult selectPraiseRecordById(@RequestBody AboutPraiseRecordDto aboutPraiseRecordDto){
        JsonResult jsonResult = new JsonResult();
        if (dynamicPraiseRecordService.selectPraiseRecordNumById(aboutPraiseRecordDto)!=0){
            jsonResult.setData(true);
            jsonResult.setMessage("查询点赞成功");
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("查询点赞失败");
        }
        return jsonResult;
    }

}
