package com.cqut.building.util;


import com.cqut.building.dao.ServiceVolunteerActivityMapper;
import com.cqut.building.dto.SetTimeActivityDto;
import com.cqut.building.service.ServiceVolunteerActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *投票调查定时任务
 */
@Component
@EnableScheduling  //开启定时任务
@EnableAsync //开启多线程
public class VoteScheduleTask {
    @Autowired(required = false)
    ServiceVolunteerActivityService service;

    @Scheduled(cron = "0  */1  *  *  *  ?")
    public void updateStatus(){

        List<SetTimeActivityDto> list = service.getActivityTime();
        List<SetTimeActivityDto> newList = new LinkedList<>();
        int isSame=1;//判断是否数组遍历前后遍历后没有改变

        Date date = new Date();
        for (int i = 0;i<list.size();i++){
            //时间由报名中变为截止
            if (list.get(i).getRegistrationDeadline().before(date)){
                newList.add(list.get(i));
                isSame=0;
            }
        }
        if (isSame==0){
            service.updateActivityTimeState(newList);
        }
    }
}
