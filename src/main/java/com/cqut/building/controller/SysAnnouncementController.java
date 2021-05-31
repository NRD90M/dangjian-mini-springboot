package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.entity.SysAnnouncement;
import com.cqut.building.service.SysAnnouncementService;
import com.cqut.building.service.SysOrganizationalStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 小程序>>>消息通知>>>>系统公告
 * 对应表：sys_announcement
 */

@RestController
@CrossOrigin
@RequestMapping("/sysAnnouncement")
public class SysAnnouncementController {
    @Autowired
    SysAnnouncementService sysAnnouncementService;

    @Autowired
    SysOrganizationalStructureService sysOrganizationalStructureService;

    @GetMapping("/getSysAnnouncementById")
    public JsonResult getSysAnnouncementById(String organizationId){
        List<String> sysAnnouncementScope=sysAnnouncementService.selectAllScope();

        boolean []checker = new boolean [sysAnnouncementScope.size()];
        StringBuffer stringBuffer =new StringBuffer();
        for (int i=0;i<sysAnnouncementScope.size();i++){
            checker[i]=sysOrganizationalStructureService.selectAllSubordinateOrganization(sysAnnouncementScope.get(i)).contains(organizationId);
            if (checker[i]){
                stringBuffer.append("'").append(sysAnnouncementScope.get(i)).append("'").append(",");
            }
        }
        JsonResult jsonResult = new JsonResult();
        if (stringBuffer.length()>0){
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            System.out.println(stringBuffer.toString());
            jsonResult.setData(sysAnnouncementService.selectAnnouncementByUser(stringBuffer.toString()));
            if (jsonResult.getData()!=null){
                jsonResult.setMessage("系统公告成功");
            }else {
                jsonResult.setMessage("系统公告失败");
            }
        }else {
            jsonResult.setData(false);
        }
        return jsonResult;
    }


    @GetMapping("/getSysAnnouncementByIdOne")
    public JsonResult getSysAnnouncementByIdOne( String id){
        System.out.println(id);
        System.out.println("123");
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(sysAnnouncementService.selectByPrimaryKey(id));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询该消息成功");
        }else {
            jsonResult.setMessage("查询该消息失败");
        }
        return jsonResult;
    }

}
