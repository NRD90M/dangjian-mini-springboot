package com.cqut.building.serviceImp;


import com.cqut.building.dao.ServiceExaminationManagementMapper;
import com.cqut.building.dto.GetExaminationManagementByIdDto;
import com.cqut.building.dto.GetServiceExaminationManagementDto;
import com.cqut.building.service.ServiceExaminationManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 小程序>>>>应用>>>趣味答题
 * 对应表：service_examination_management
 */

@Service
public class ServiceExaminationManagementServiceImp implements ServiceExaminationManagementService {

    @Autowired(required = false)
    ServiceExaminationManagementMapper serviceExaminationManagementMapper;

    @Override
    public List<GetServiceExaminationManagementDto> selectExaminationAll(String userId) {
        return serviceExaminationManagementMapper.selectExaminationAll(userId);
    }

    @Override
    public List<GetServiceExaminationManagementDto> selectExaminationByCategory(String userId,String questionCategoryId) {
        return serviceExaminationManagementMapper.selectExaminationByCategory(userId,questionCategoryId);
    }

    @Override
    public GetExaminationManagementByIdDto selectExaminationById(String userId, String id) {
        return serviceExaminationManagementMapper.selectExaminationById(userId,id);
    }
}
