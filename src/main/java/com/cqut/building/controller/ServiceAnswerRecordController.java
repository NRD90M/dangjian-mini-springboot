package com.cqut.building.controller;


import com.cqut.building.dto.GetServiceAnswerRecordDto;
import com.cqut.building.dto.JsonResult;
import com.cqut.building.entity.ServiceAnswerDetails;
import com.cqut.building.entity.ServiceAnswerRecord;
import com.cqut.building.entity.ServiceQuestion;
import com.cqut.building.service.ServiceAnswerDetailsService;
import com.cqut.building.service.ServiceAnswerRecordService;
import com.cqut.building.service.ServiceQuestionService;
import org.apache.ibatis.ognl.IntHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.*;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_answer_record
 */

@RestController
@CrossOrigin
@RequestMapping("/serviceAnswerRecord")
public class ServiceAnswerRecordController {

    @Autowired
    ServiceAnswerRecordService serviceAnswerRecordService;

    @Autowired
    ServiceQuestionService serviceQuestionService;

    @Autowired
    ServiceAnswerDetailsService serviceAnswerDetailsService;

    /**
     * 新增答题记录
     * @param getServiceAnswerRecordDto
     * @return
     */
    @PostMapping("/insertServiceAnswerRecord")
    public JsonResult insertServiceAnswerRecord(@Validated @RequestBody GetServiceAnswerRecordDto getServiceAnswerRecordDto){

        JsonResult jsonResult = new JsonResult();
        /**
         * 答题记录表
         */
        ServiceAnswerRecord serviceAnswerRecord=new ServiceAnswerRecord();
        //随机生成32位的答题记录id
        UUID uuid = UUID.randomUUID();
        serviceAnswerRecord.setId(uuid.toString().replaceAll("-", ""));
        //答题记录答题时间
        Date date = new Date();
        Timestamp timeStamp = new Timestamp(date.getTime());
        serviceAnswerRecord.setAnswerTime(timeStamp);
        //答题记录考题id
        serviceAnswerRecord.setExaminationId(getServiceAnswerRecordDto.getExaminationId());
        //答题记录用户id
        serviceAnswerRecord.setUserId(getServiceAnswerRecordDto.getUserId());

        int rightNum=0;
        //拆分回答的答案
        String[] answererInput=getServiceAnswerRecordDto.getAnswerContent().split(";");
        StringBuilder rightAnswerer = new StringBuilder();

        List<ServiceQuestion> right=serviceQuestionService.selectExaminationQuestionById(serviceAnswerRecord.getExaminationId());
        //获得题目总数
        serviceAnswerRecord.setQuestionTotalNumber(right.size());

        for (int i=0;i<right.size();i++){
            rightAnswerer.append(right.get(i).getCorrectAnswer()).append(";");
        }


        String[] answer=rightAnswerer.toString().split(";");
        for (int j=0;j<answer.length;j++){
            if (answer[j].equals(answererInput[j])){
                rightNum++;
            }
        }
        //答题记录答对数量
        serviceAnswerRecord.setCorrectQuestionNumber(rightNum);

        /**
         * 答题记录详情表
         */
        //获得考题的问题id集合
        System.out.println(getServiceAnswerRecordDto.getQuestionId());
        String[] questionIds =getServiceAnswerRecordDto.getQuestionId().split(";");
        //获得考题的用户回答集合
        String[] useAnswers = getServiceAnswerRecordDto.getAnswerContent().split(";");
        Map<Integer,ServiceAnswerDetails> serviceAnswerDetailMap=new HashMap<>();
        for (int s=0;s<questionIds.length;s++){
            System.out.println(questionIds.length + " "+s);
            //(考题有多少题就循环多少次)
            ServiceAnswerDetails serviceAnswerDetails =new ServiceAnswerDetails();
//            //随机生成32位的答题记录详情id
//            UUID uuidd = UUID.randomUUID();
//            serviceAnswerDetails.setId(uuidd.toString().replaceAll("-", ""));
            //答题记录详情 答题记录id
            serviceAnswerDetails.setAnswerRecordId(serviceAnswerRecord.getId());
            //答题记录详情 问题id
            serviceAnswerDetails.setQuestionId(questionIds[s]);
            //答题记录详情 用户回答
            serviceAnswerDetails.setAnswerContent(useAnswers[s]);

            serviceAnswerDetailMap.put(s,serviceAnswerDetails);

        }

        if (serviceAnswerRecordService.insert(serviceAnswerRecord)==1){
            if (serviceAnswerDetailsService.insert(serviceAnswerDetailMap)>0){
                jsonResult.setData(rightNum);
                jsonResult.setMessage("答题记录添加成功");
            }else {
                jsonResult.setData(false);
                jsonResult.setMessage("答题记录添加失败");
            }
        }else {
            jsonResult.setData(false);
            jsonResult.setMessage("答题记录添加失败");
        }
        return jsonResult;
    }
}
