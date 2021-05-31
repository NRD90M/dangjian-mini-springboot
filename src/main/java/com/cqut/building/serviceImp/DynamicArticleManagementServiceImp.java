package com.cqut.building.serviceImp;

import com.cqut.building.dao.DynamicArticleManagementMapper;
import com.cqut.building.dto.GetArticleBySourceDto;
import com.cqut.building.dto.GetArticleDto;
import com.cqut.building.entity.DynamicArticleManagement;
import com.cqut.building.service.DynamicArticleManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 小程序>>>>首页>>>基层风采，党员先锋
 * 小程序>>>>应用>>>发布文章
 * 对应表：dynamic_article_management
 */

@Service
public class DynamicArticleManagementServiceImp implements DynamicArticleManagementService {

    @Autowired(required = false)
    DynamicArticleManagementMapper dynamicArticleManagementMapper;

    @Override
    public List<GetArticleDto> selectArticleBySource(GetArticleBySourceDto getArticleBySourceDto) {
        return  dynamicArticleManagementMapper.selectArticleBySource(getArticleBySourceDto);
    }

    @Override
    public GetArticleDto selectByPrimaryKey(String id) {
        return dynamicArticleManagementMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateBrowsingByPrimaryKey(String id) {
        return dynamicArticleManagementMapper.updateBrowsingByPrimaryKey(id);
    }

    @Override
    public int insert(DynamicArticleManagement record) {
        return dynamicArticleManagementMapper.insert(record);
    }

    @Override
    public int updatePraiseByPrimaryKeyAdd(String id) {
        return dynamicArticleManagementMapper.updatePraiseByPrimaryKeyAdd(id);
    }

    @Override
    public int updatePraiseByPrimaryKeyReduce(String id) {
        return dynamicArticleManagementMapper.updatePraiseByPrimaryKeyReduce(id);
    }
}
