package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.dto.OrganizationPositionDto;
import com.cqut.building.service.SysPartyOrganizationPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.jar.JarEntry;

@RestController
@CrossOrigin
@RequestMapping("/sysPartyOrganizationPost")
public class SysPartyOrganizationPostController {
    @Autowired
    SysPartyOrganizationPostService service;

}
