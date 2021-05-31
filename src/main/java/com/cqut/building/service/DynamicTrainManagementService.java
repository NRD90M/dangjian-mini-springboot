package com.cqut.building.service;

import com.cqut.building.dto.GetDynamicTrainManagementDto;
import com.cqut.building.entity.DynamicTrainManagement;

import java.util.List;

/**
 * 小程序>>>>首页>>>党校培训
 * 对应表：dynamic_train_management
 */

public interface DynamicTrainManagementService {
    List<GetDynamicTrainManagementDto> selectTrainAll();
    GetDynamicTrainManagementDto selectByPrimaryKey(String id);
    int updateBrowsingByPrimaryKey(String id);
    int updatePraiseByPrimaryKeyAdd(String id);
    int updatePraiseByPrimaryKeyReduce(String id);
}
