package com.cqut.building.serviceImp;

import com.cqut.building.dao.DynamicTrainManagementMapper;
import com.cqut.building.dto.GetDynamicTrainManagementDto;
import com.cqut.building.entity.DynamicTrainManagement;
import com.cqut.building.service.DynamicTrainManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 小程序>>>>首页>>>党校培训
 * 对应表：dynamic_train_management
 */

@Service
public class DynamicTrainManagementServiceImp implements DynamicTrainManagementService {

    @Autowired(required = false)
    DynamicTrainManagementMapper dynamicTrainManagementMapper;

    @Override
    public List<GetDynamicTrainManagementDto> selectTrainAll() {
        return dynamicTrainManagementMapper.selectTrainAll();
    }

    @Override
    public GetDynamicTrainManagementDto selectByPrimaryKey(String id) {
        return dynamicTrainManagementMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateBrowsingByPrimaryKey(String id) {
        return dynamicTrainManagementMapper.updateBrowsingByPrimaryKey(id);
    }

    @Override
    public int updatePraiseByPrimaryKeyAdd(String id) {
        return dynamicTrainManagementMapper.updatePraiseByPrimaryKeyAdd(id);
    }

    @Override
    public int updatePraiseByPrimaryKeyReduce(String id) {
        return dynamicTrainManagementMapper.updatePraiseByPrimaryKeyReduce(id);
    }
}
