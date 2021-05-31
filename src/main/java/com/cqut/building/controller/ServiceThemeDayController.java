package com.cqut.building.controller;


import com.cqut.building.dto.GetServiceThemeDayAllDto;
import com.cqut.building.dto.JsonResult;
import com.cqut.building.entity.SysOrganizationalStructure;
import com.cqut.building.service.ServiceThemeDayService;
import com.cqut.building.service.SysOrganizationalStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/serviceThemeDay")
public class ServiceThemeDayController {
    @Autowired
    ServiceThemeDayService serviceThemeDayService;

    @Autowired
    SysOrganizationalStructureService sysOrganizationalStructureService;

    /**
     * 查询全部党主题日
     * @param organizationId
     * @return
     */
    @GetMapping("/selectAllThemeDay")
    public JsonResult selectAllThemeDay(String organizationId){

        GetServiceThemeDayAllDto getServiceThemeDayAllDto =new GetServiceThemeDayAllDto();

        //自己的组织id
        getServiceThemeDayAllDto.setOrganizationId(organizationId);

        //确定他的一级组织id
        List<SysOrganizationalStructure> sysOrganizationalStructureList= sysOrganizationalStructureService.getInfoByRank(1);
        getServiceThemeDayAllDto.setFirstLevelOrganizationId(sysOrganizationalStructureList.get(0).getOrganizationId());

        SysOrganizationalStructure sysOrganizationalStructure =sysOrganizationalStructureService.selectByPrimaryKey(organizationId);
        //通过用户组织id 确定他的上级组织id
        getServiceThemeDayAllDto.setHigherOrganizationId(sysOrganizationalStructure.getHigherOrganizationId());
        //通过用户组织id 确定他的级别
        getServiceThemeDayAllDto.setRank(sysOrganizationalStructure.getRank());

        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(serviceThemeDayService.selectAllThemeDay(getServiceThemeDayAllDto));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询该党主题日成功");
        }else {
            jsonResult.setMessage("查询该党主题日失败");
        }
        return jsonResult;
    }

    /**
     * 根据id查党主题日
     * @param id
     * @return
     */
    @GetMapping("/selectByThemeDayId")
    public JsonResult selectByThemeDayId(String id){
        JsonResult jsonResult = new JsonResult();
        int browsing=serviceThemeDayService.updateBrowsingByPrimaryKey(id);
        if (browsing!=1){
            jsonResult.setMessage("浏览量增加失败");
        }

        jsonResult.setData(serviceThemeDayService.selectByThemeDayId(id));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询该党主题日成功");
        }else {
            jsonResult.setMessage("查询该党主题日失败");
        }
        return jsonResult;
    }
}
