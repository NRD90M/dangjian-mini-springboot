package com.cqut.building.serviceImp;


import com.cqut.building.dao.ServiceQuestionCategoryMapper;
import com.cqut.building.entity.ServiceQuestionCategory;
import com.cqut.building.service.ServiceQuestionCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_question_category
 */
@Service
public class ServiceQuestionCategoryServiceImp implements ServiceQuestionCategoryService {
    @Autowired(required = false)
    ServiceQuestionCategoryMapper serviceQuestionCategoryMapper;
    @Override
    public List<ServiceQuestionCategory> selectAllCategoryName() {
        return serviceQuestionCategoryMapper.selectAllCategoryName();
    }
}
