package com.cqut.building.controller;


import com.cqut.building.dto.JsonResult;
import com.cqut.building.dto.OrganizationStructureDto;
import com.cqut.building.entity.SysOrganizationalStructure;
import com.cqut.building.service.SysOrganizationalStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/organizational")
public class SysOrganizationalStructureController {

    @Autowired
    SysOrganizationalStructureService service;

    /**
     * 通过用户的partyId查询用户有哪些投票可以进行
     *
     */
    @RequestMapping(value = {"/getOrganizations"},method = RequestMethod.GET)
    public JsonResult  getOrganizations(){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(service.selectAll());
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("success");
        }else {
           jsonResult.setMessage("fail");
        }
        return jsonResult;
    }

    /**
     * 通过用户的partyId查询用户有哪些投票可以进行
     *
     */
    @GetMapping("/selectAllOrganization")
     public JsonResult  selectAllOrganization(){
        JsonResult jsonResult = new JsonResult();
        List<OrganizationStructureDto> organizationStructureDtos=service.selectAllOrganization();
        for(int i=0;i<organizationStructureDtos.size();i++){
            String organizationId = organizationStructureDtos.get(i).getOrganizationId();
            organizationStructureDtos.get(i).setOrganizationMemberList(service.getOrganizationMember(organizationId));
        }
        jsonResult.setData(organizationStructureDtos);
        jsonResult.setMessage("获取支部信息");
        return jsonResult;
    }
}
