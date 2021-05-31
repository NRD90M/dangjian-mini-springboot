package com.cqut.building.controller;

import com.cqut.building.dto.GetArticleBySourceDto;
import com.cqut.building.dto.JsonResult;
import com.cqut.building.entity.DynamicArticleManagement;
import com.cqut.building.entity.SysOrganizationalStructure;
import com.cqut.building.service.DynamicArticleManagementService;
import com.cqut.building.service.SysOrganizationalStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 小程序>>>>首页>>>基层风采，党员先锋
 * 小程序>>>>应用>>>发布文章
 * 对应表：dynamic_article_management
 */

@RestController
@CrossOrigin
@RequestMapping("/dynamicArticleManagement")
public class DynamicArticleManagementController {

    @Autowired
    DynamicArticleManagementService service;

    @Autowired
    SysOrganizationalStructureService sysOrganizationalStructureService;

    /**
     * 按照院校和文章类型查询文章
     * @param getArticleBySourceDto
     * @return
     */
    @GetMapping("/selectArticleBySource")
    public JsonResult selectArticleBySource(GetArticleBySourceDto getArticleBySourceDto){
        //党员先锋1或者基层风采2

        //确定他的一级组织id
        List<SysOrganizationalStructure> sysOrganizationalStructureList= sysOrganizationalStructureService.getInfoByRank(1);
        getArticleBySourceDto.setFirstLevelOrganizationId(sysOrganizationalStructureList.get(0).getOrganizationId());

        SysOrganizationalStructure sysOrganizationalStructure =sysOrganizationalStructureService.selectByPrimaryKey(getArticleBySourceDto.getOrganizationId());
        //通过用户组织id 确定他的上级组织id
        getArticleBySourceDto.setHigherOrganizationId(sysOrganizationalStructure.getHigherOrganizationId());
        //通过用户组织id 确定他的级别
        getArticleBySourceDto.setRank(sysOrganizationalStructure.getRank());

        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(service.selectArticleBySource(getArticleBySourceDto));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询该类型成功");
        }else {
            jsonResult.setMessage("查询该类型失败");
        }
        return jsonResult;
    }

    /**
     * 点击进入文章详情
     * 增加浏览量（只要点进就加）
     * @param id
     * @return
     */
    @GetMapping("/selectArticleByPrimaryKey")
    public JsonResult selectByPrimaryKey(String id){
        JsonResult jsonResult = new JsonResult();
        int browsing=service.updateBrowsingByPrimaryKey(id);
        if (browsing!=1){
            jsonResult.setMessage("浏览量增加失败");
        }
        jsonResult.setData(service.selectByPrimaryKey(id));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询该文章成功");
        }else {
            jsonResult.setMessage("查询该文章失败");
        }
        return jsonResult;
    }

    /**
     * 上传文件
     * @param uploadFile
     * @param request
     * @return
     * @throws IOException
     */
    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile uploadFile, HttpServletRequest request) throws IOException {
        String realPath = null;
        try {
            realPath = ResourceUtils.getURL("").getPath()+"src/main/resources/static/";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        File folder = new File(realPath);
        if(!folder.isDirectory())
        {
            folder.mkdirs();
        }
        String oldName = uploadFile.getOriginalFilename();
        try {
            uploadFile.transferTo(new File(folder,oldName));
            return "http://localhost:8090/"+oldName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }

    /**
     * 添加文章
     * @param dynamicArticleManagement
     * @return
     */
    @PostMapping("/insertArticle")
    public JsonResult insertArticle(@Validated @RequestBody DynamicArticleManagement dynamicArticleManagement){
        //随机生成32位的文章id
        UUID uuid = UUID.randomUUID();
        dynamicArticleManagement.setId(uuid.toString().replaceAll("-", ""));

        //发布时间
        Date date = new Date();
        Timestamp timeStamp = new Timestamp(date.getTime());
        dynamicArticleManagement.setContributeTime(timeStamp);

        //默认置顶状态
        dynamicArticleManagement.setTopSort(1);
        //默认状态0未审核
        dynamicArticleManagement.setCheckStatus(0);
        //默认点赞量 浏览量
        dynamicArticleManagement.setPraiseAmount(0);
        dynamicArticleManagement.setBrowsingAmount("0");

        JsonResult jsonResult = new JsonResult();
        if (service.insert(dynamicArticleManagement)==1){
            jsonResult.setData(true);
            jsonResult.setMessage("文章添加成功");
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("文字添加失败");
        }
        return jsonResult;
    }


    @PostMapping("/deleteFile")
    public String delFile(@RequestBody String path) {
        String resultInfo = null;
        int lastIndexOf = path.lastIndexOf("/");
        String img_path = path.substring(lastIndexOf + 1, path.length());
//        System.out.println(img_path);
        img_path = "src/main/resources/static/" + img_path;
//        System.out.println(img_path);//输出测试一下文件路径是否正确
        File file = new File(img_path);
        if (file.exists()) {//文件是否存在
            if (file.delete()) {//存在就删了，返回1
                resultInfo =  "1";
            } else {
                resultInfo =  "0";
            }
        } else {
            resultInfo = "文件不存在！";
        }
        return resultInfo;
    }
}

