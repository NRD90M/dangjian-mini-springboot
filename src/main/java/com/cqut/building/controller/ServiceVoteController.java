package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.dto.ServiceVoteNameDto;
import com.cqut.building.dto.VoteDto;
import com.cqut.building.dto.VoteTitleDto;
import com.cqut.building.entity.ServiceVote;
import com.cqut.building.entity.ServiceVoteRecord;
import com.cqut.building.service.ServiceVoteService;
import com.cqut.building.service.SysWxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * 小程序>>>>应用>>>投票调查
 * 对应表：service_vote
 */
@RestController
@CrossOrigin
@RequestMapping("/serviceVote")
public class ServiceVoteController {

    @Autowired(required = false)
    ServiceVoteService serviceVoteService;
    /**
     * 通过用户的partyId查询用户有哪些投票可以进行
     * @param partyId
     *
     */
    @GetMapping("/getVoteByPartyId")
    public JsonResult getVoteByPartyId(@Validated String partyId){
        JsonResult jsonResult = new JsonResult();
        List<VoteTitleDto> data=serviceVoteService.getVoteByPartyId(partyId);

        if(data.size()==0){
            jsonResult.setMessage("无可投票记录或是获取失败");
        }else{
            jsonResult.setData(data);
            jsonResult.setMessage("查询成功");
        }
        return jsonResult;
    }


    /**
     * 通过voteId查询投票的详情内容及选项等
     *
     */
    @GetMapping("/getVoteByVoteId")
    public JsonResult getVoteByVoteId(@Validated String voteId){
        JsonResult jsonResult = new JsonResult();
        VoteDto voteDto =serviceVoteService.getVoteByVoteId(voteId);
        voteDto.setOptionDtos(serviceVoteService.getVoteOption(voteId));
        jsonResult.setData(voteDto);
        jsonResult.setMessage("查找成功");
        return jsonResult;
    }

    /**
     * 通过用户的partyId和投票的VoteId查询是否已经投过票了
     *
     */
    @GetMapping("/isOptioned")
    public JsonResult isOptioned(@Validated ServiceVoteRecord serviceVoteRecord){
        JsonResult jsonResult = new JsonResult();
        String theOption=serviceVoteService.isOptioned(serviceVoteRecord);
        if(theOption==null){
            jsonResult.setData(false);
            jsonResult.setMessage("尚未投票");
        }else{
            jsonResult.setData(theOption);
            jsonResult.setMessage("投票结果");
        }
        return jsonResult;
    }

    /**
     * 插入投票记录
     * 传入投票id，选项id,投票人partyId
     *
     */
    @PostMapping("/insertVoteOption")
    public JsonResult insertVoteOption(@Validated @RequestBody ServiceVoteRecord serviceVoteRecord){
        JsonResult jsonResult = new JsonResult();
        UUID uuid = UUID.randomUUID();
        serviceVoteRecord.setId(uuid.toString().replaceAll("-",""));
        if(serviceVoteService.insertVoteOption(serviceVoteRecord)==1){
            jsonResult.setData(true);
            jsonResult.setMessage("投票成功");
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("投票失败");
        }
        return jsonResult;
    }








}
