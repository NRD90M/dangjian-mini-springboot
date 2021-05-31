package com.cqut.building.controller;

import com.cqut.building.dto.*;
import com.cqut.building.entity.SysCertificationAuditRecord;
import com.cqut.building.entity.SysPartyMemberInformation;
import com.cqut.building.entity.SysWxUser;
import com.cqut.building.service.SysCertificationAuditRecordService;
import com.cqut.building.service.SysPartyMemberInformationService;
import com.cqut.building.service.SysWxUserOrgPostService;
import com.cqut.building.service.SysWxUserService;
import com.cqut.building.unicode.Unicode;
import com.cqut.building.util.AesCbcUtil;
import com.cqut.building.util.HttpRequest;
import org.apache.ibatis.annotations.Param;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 小程序>>>>我的>>>个人信息
 * 对应表：sys_wx_user
 */

@RestController
@CrossOrigin
@RequestMapping("/sysWxUser")
public class SysWxUserController {

    @Autowired
    SysWxUserService service;

    //注入党员表的service
    @Autowired
    SysPartyMemberInformationService sysPartyMemberInformationService;


    /**
     * author:包嵩
     * 添加认证记录表
     */
    @Autowired
    SysCertificationAuditRecordService certificationAuditRecordService;

    /**
     * author：包嵩
     * 职务组织中间表
     */
    @Autowired
    SysWxUserOrgPostService wxUserOrgPostService;

    /**
     * 新增个人信息
     * @param record
     * @return
     */
    @PostMapping("insert")
    public JsonResult insertSelective(@Validated @RequestBody InsertUserDto record){
        Unicode unicode = new Unicode();
        SysWxUser sysWxUser = new SysWxUser();
        sysWxUser.setNickname(unicode.unicode(record.getNickname()));
        sysWxUser.setAvatarurl(record.getAvatarurl());
        sysWxUser.setId(record.getId());
        sysWxUser.setIsSecretary(record.getIsSecretary());
        sysWxUser.setName(record.getName());
        sysWxUser.setSex(record.getSex());
        sysWxUser.setStudentJobNumber(record.getStudentJobNumber());
        sysWxUser.setTelNumber(record.getTelNumber());
        sysWxUser.setType(record.getType());
        sysWxUser.setVerifyTime(new Date());
        //将微信用户所填数据赋值给党员的entity

        IsAuditedDataDto dataDto = new IsAuditedDataDto();
        dataDto.setName(record.getName());
        dataDto.setSnoOrJobNumber(record.getStudentJobNumber());
        dataDto.setOrganizationId(record.getOrganizationId());
        dataDto.setContact(record.getTelNumber());
        dataDto.setPositionId(record.getPositionId());
        dataDto.setClassification(String.valueOf(record.getType()));
        //根据五种属性进行查询，为空，则认证失败，否则认证成功
        String partyId = sysPartyMemberInformationService.compareTo(dataDto);
        SysCertificationAuditRecord sysCertificationAuditRecord = new SysCertificationAuditRecord();
        JsonResult jsonResult = new JsonResult();
        Date date = new Date();
        if (partyId!=null){
            jsonResult.setMessage("认证成功");
            sysWxUser.setIsAudited(1);
            sysWxUser.setPartyId(partyId);//认证成功就传入党员id
            //添加认证记录信息
            Date date1 = new Date();
            UUID uuid = UUID.randomUUID();
            String uuid1 = uuid.toString().replace("-", "");
            sysCertificationAuditRecord.setId(uuid1);
            sysCertificationAuditRecord.setAuditResult(1);
            sysCertificationAuditRecord.setAuditTime(date1);
            sysCertificationAuditRecord.setRemarks("系统认证成功");
            sysCertificationAuditRecord.setWxUserId(record.getId());

            SecondAuditedDataDto dataDto1 = new SecondAuditedDataDto();
            dataDto1.setIsAudited(1);
            dataDto1.setId(record.getId());
            dataDto1.setOrganizationId(record.getOrganizationId());
            dataDto1.setPositionId(record.getPositionId());
            wxUserOrgPostService.insertOrganizationPosition(dataDto1);

            certificationAuditRecordService.insertSelective(sysCertificationAuditRecord);
        }else {
            jsonResult.setMessage("认证失败");
            Date date1 = new Date();
            UUID uuid = UUID.randomUUID();
            String uuid1 = uuid.toString().replace("-", "");
            sysCertificationAuditRecord.setId(uuid1);
            sysCertificationAuditRecord.setAuditResult(2);
            sysCertificationAuditRecord.setAuditTime(date1);
            sysCertificationAuditRecord.setRemarks("系统认证失败");
            sysCertificationAuditRecord.setWxUserId(record.getId());
            certificationAuditRecordService.insertSelective(sysCertificationAuditRecord);
            sysWxUser.setIsAudited(2);
        }



        sysWxUser.setCreateTime(date);
        if (service.insertSelective(sysWxUser)==1){
            jsonResult.setData(true);

        }else {
            jsonResult.setData(false);

        }
        return jsonResult;
    }

    /**
     * 删除个人信息
     * @param id
     * @return
     */
    @GetMapping("delete")
    public JsonResult deleteByPrimaryKey(String id){
        JsonResult jsonResult = new JsonResult();
        if (service.deleteByPrimaryKey(id)==1){
            jsonResult.setData(true);
            jsonResult.setMessage("删除微信用户成功");
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("删除微信用户失败");
        }
        return jsonResult;
    }

    /**
     * 修改个人信息
     * @param record
     * @return
     */
    @PostMapping("update")
    public JsonResult updateByPrimaryKeySelective(@Validated @RequestBody SecondAuditedDataDto record){
        JsonResult jsonResult = new JsonResult();
        Date date = new Date();
        record.setCreateTime(date);
        record.setIsAudited(0);

        //如果中间表里面没有信息 就添加一条
        if (wxUserOrgPostService.selectByOpenId(record.getId())==null){
            //修改个人表信息  添加信息到职务组织中间表
            if (service.secondAudited(record)==1&&wxUserOrgPostService.insertOrganizationPosition(record)==1){
                jsonResult.setData(true);
                jsonResult.setMessage("修改微信用户成功");
            }else {
                jsonResult.setData(false);
                jsonResult.setMessage("修改微信用户失败");
            }
        }else {//如果有信息就直接通过openId更新信息
            //修改个人表信息  添加信息到职务组织中间表
            if (service.secondAudited(record)==1&&wxUserOrgPostService.updateOrganizationPosition(record)==1){
                jsonResult.setData(true);
                jsonResult.setMessage("修改微信用户成功");
            }else {
                jsonResult.setData(false);
                jsonResult.setMessage("修改微信用户失败");
            }
        }



        return jsonResult;
    }

    /**
     * 根据openId查询个人信息
     * @param id
     * @return
     */
    @GetMapping("/selectById")
    public JsonResult selectById(String id){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(service.selectByPrimaryKey(id));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询单个用户成功");
        }else {
            jsonResult.setMessage("查询单个用户失败");
        }
        return jsonResult;
    }

    /**
     * 根据openId查询个人信息,显示个人信息
     * @param openId
     * @return
     */
    @GetMapping("/selectByOpenId")
    public JsonResult selectByOpenId(String openId){
        JsonResult jsonResult = new JsonResult();
        SelectPersonalInformationDto dto=service.selectByOpenId(openId);
        //判断书记党员
        if (dto.getIsSecretary().equals("1")){
            dto.setIsSecretary("书记");
        }else {
            dto.setIsSecretary("党员");
        }
        //判断学生教师
        if (dto.getType().equals("1")){
            dto.setType("教师");
        }else {
            dto.setType("学生");
        }
        jsonResult.setData(dto);
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询单个用户成功");
        }else {
            jsonResult.setMessage("查询单个用户失败");
        }
        return jsonResult;
    }

    @ResponseBody
    @RequestMapping(value = "/decodeUserInfo", method = RequestMethod.POST)
    public Map decodeUserInfo(String encryptedData, String iv, String code) throws JSONException {

        Map map = new HashMap();

        // 登录凭证不能为空
        if (code == null || code.length() == 0) {
            map.put("status", 0);
            map.put("msg", "code 不能为空");
            return map;
        }

        // 小程序唯一标识 (在微信小程序管理后台获取)
        String wxspAppid = "wxc6c3652bf047b246";
        // 小程序的 app secret (在微信小程序管理后台获取)
        String wxspSecret = "d1721cc441550405ee418408db115ce1";
        // 授权（必填）
        String grant_type = "authorization_code";

        //////////////// 1、向微信服务器 使用登录凭证 code 获取 session_key 和 openid
        //////////////// ////////////////
        // 请求参数
        String params = "appid=" + wxspAppid + "&secret=" + wxspSecret + "&js_code=" + code + "&grant_type="
                + grant_type;
        // 发送请求
        String sr = HttpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session", params);
        // 解析相应内容（转换成json对象）
        JSONObject json = new JSONObject(sr);
        // 获取会话密钥（session_key）
        String session_key = json.get("session_key").toString();
        // 用户的唯一标识（openid）
        String openid = (String) json.get("openid");

        //////////////// 2、对encryptedData加密数据进行AES解密 ////////////////
        try {
            String result = AesCbcUtil.decrypt(encryptedData, session_key, iv, "UTF-8");
            if (null != result && result.length() > 0) {
                map.put("status", 1);
                map.put("msg", "解密成功");

                JSONObject userInfoJSON = new JSONObject(result);
                Map userInfo = new HashMap();
                userInfo.put("openId", userInfoJSON.get("openId"));
                userInfo.put("nickName", userInfoJSON.get("nickName"));
                userInfo.put("gender", userInfoJSON.get("gender"));
                userInfo.put("city", userInfoJSON.get("city"));
                userInfo.put("province", userInfoJSON.get("province"));
                userInfo.put("country", userInfoJSON.get("country"));
                userInfo.put("avatarUrl", userInfoJSON.get("avatarUrl"));
                // 解密unionId & openId;

               // userInfo.put("unionId", userInfoJSON.get("unionId"));
                map.put("userInfo", userInfo);
            } else {
                map.put("status", 0);
                map.put("msg", "解密失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
