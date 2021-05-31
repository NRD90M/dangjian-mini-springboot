package com.cqut.building.serviceImp;

import com.cqut.building.dao.ServiceQuestionMapper;
import com.cqut.building.entity.ServiceQuestion;
import com.cqut.building.service.ServiceQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_question
 */
@Service
public class ServiceQuestionServiceImp implements ServiceQuestionService {

    @Autowired(required = false)
    ServiceQuestionMapper serviceQuestionMapper;

    @Override
    public List<ServiceQuestion> selectExaminationQuestionById(String examinationId) {
        return serviceQuestionMapper.selectExaminationQuestionById(examinationId);
    }

    @Override
    public List<ServiceQuestion> selectExaminationQuestionByIdNoAnswer(String examinationId) {
        return serviceQuestionMapper.selectExaminationQuestionByIdNoAnswer(examinationId);
    }
}
