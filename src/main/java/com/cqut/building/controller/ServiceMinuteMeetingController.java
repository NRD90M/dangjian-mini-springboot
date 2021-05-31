package com.cqut.building.controller;

import com.cqut.building.dto.JsonResult;
import com.cqut.building.dto.MinutesMeetingIdDto;
import com.cqut.building.entity.ServiceMinuteMeeting;
import com.cqut.building.service.ServiceMinuteMeetingService;
import com.cqut.building.service.ServiceThreeSessionOneClassService;
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
import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("/serviceMinuteMeeting")
public class ServiceMinuteMeetingController {

    @Autowired
    ServiceMinuteMeetingService serviceMinuteMeetingService;
    @Autowired
    ServiceThreeSessionOneClassService serviceThreeSessionOneClassService;

    /**
     * 根据会议id查询会议纪要
     * @param id
     * @return
     */
    @GetMapping("/selectMinuteInfoByMeetingId")
    public JsonResult selectMinuteInfoByMeetingId(String id){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(serviceMinuteMeetingService.selectMinuteInfoByMeetingId(id));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询该会议记录成功");
        }else {
            jsonResult.setMessage("查询该会议记录失败");
        }
        return jsonResult;
    }

    /**
     * 通过会议id查询会议纪要是否存在
     * @param id
     * @return
     */
    @GetMapping("/isHaveMinuteByMeetingId")
    public JsonResult isHaveMinuteByMeetingId(String id){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(serviceMinuteMeetingService.isHaveMinuteByMeetingId(id));
        if (jsonResult.getData()!=null){
            jsonResult.setMessage("查询成功");
        }else {
            jsonResult.setMessage("查询失败");
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
    @PostMapping("/uploadMinuteFile")
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
        return "会议纪要文件上传失败";
    }

    /**
     * 添加会议纪要
     * @param serviceMinuteMeeting
     * @return
     */
    @PostMapping("/insertMinute")
    public JsonResult insertMinute(@Validated @RequestBody ServiceMinuteMeeting serviceMinuteMeeting){
        //随机生成32位的会议纪要id
        UUID uuid = UUID.randomUUID();
        serviceMinuteMeeting.setId(uuid.toString().replaceAll("-", ""));

        //记录时间
        Date date = new Date();
        Timestamp timeStamp = new Timestamp(date.getTime());
        serviceMinuteMeeting.setRecorderTime(timeStamp);

        //更新三会一课会议记录id
        MinutesMeetingIdDto minutesMeetingIdDto=new MinutesMeetingIdDto();
        minutesMeetingIdDto.setId(serviceMinuteMeeting.getMeetingId());
        minutesMeetingIdDto.setMinutesMeetingId(serviceMinuteMeeting.getId());

        JsonResult jsonResult = new JsonResult();
        if (serviceMinuteMeetingService.insert(serviceMinuteMeeting)==1){
            if (serviceThreeSessionOneClassService.updateByPrimaryKeyMinutesMeetingId(minutesMeetingIdDto)==1){
                jsonResult.setData(true);
                jsonResult.setMessage("会议纪要添加+三会一课更新成功");
            }else {
                jsonResult.setData(false);
                jsonResult.setMessage("会议纪要添加成功+三会一课更新失败");
            }
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("会议纪要添加失败");
        }
        return jsonResult;
    }

    @PostMapping("/deleteMinuteFile")
    public String delFile(@RequestBody String path) {
        String resultInfo = null;
        int lastIndexOf = path.lastIndexOf("/");
        String img_path = path.substring(lastIndexOf + 1, path.length());
        img_path = "src/main/resources/static/" + img_path;
        File file = new File(img_path);
        if (file.exists()) {//文件是否存在
            if (file.delete()) {//存在就删了，返回1
                resultInfo =  "1";
            } else {
                resultInfo =  "0";
            }
        } else {
            resultInfo = "会议纪要文件不存在！";
        }
        return resultInfo;
    }
}
