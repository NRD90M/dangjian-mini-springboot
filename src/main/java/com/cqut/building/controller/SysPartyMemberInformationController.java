package com.cqut.building.controller;

import com.cqut.building.dto.GetSponsorAndReviewerNameDto;
import com.cqut.building.dto.JsonResult;
import com.cqut.building.entity.SysPartyMemberInformation;
import com.cqut.building.service.SysPartyMemberInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 党员信息表
 * 对应表：sys_party_member_information
 */

@RestController
@CrossOrigin
@RequestMapping("/SPMInformation")
public class SysPartyMemberInformationController {

    //注入党员信息表的service层
    @Autowired
    SysPartyMemberInformationService sysPartyMemberInformationService;

    /**
     * author:包嵩
     * @return
     * 通过发起人和审核人党员id查询党员名字
     */
    @RequestMapping(value = {"/selectNameByPartyId"},method = RequestMethod.GET)
    public JsonResult selectByPartyId(String sponsorId,String reviewerId){
        JsonResult jsonResult = new JsonResult();
        GetSponsorAndReviewerNameDto getSponsorAndReviewerNameDto = new GetSponsorAndReviewerNameDto();
        getSponsorAndReviewerNameDto.setSponsor(sysPartyMemberInformationService.getNameByPartyId(sponsorId));
        getSponsorAndReviewerNameDto.setReviewer(sysPartyMemberInformationService.getNameByPartyId(reviewerId));
        jsonResult.setData(getSponsorAndReviewerNameDto);
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询成功");
        }else {
            jsonResult.setMessage("查询失败");
        }
        return jsonResult;
    }



}
