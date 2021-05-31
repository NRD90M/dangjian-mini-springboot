package com.cqut.building.service;

import com.cqut.building.dto.GetArticleBySourceDto;
import com.cqut.building.dto.GetArticleDto;
import com.cqut.building.entity.DynamicArticleManagement;
import com.cqut.building.util.PageResult;

import java.util.List;

/**
 * 小程序>>>>首页>>>基层风采，党员先锋
 * 小程序>>>>应用>>>发布文章
 * 对应表：dynamic_article_management
 */
public interface DynamicArticleManagementService {
    List<GetArticleDto> selectArticleBySource(GetArticleBySourceDto getArticleBySourceDto);
    GetArticleDto selectByPrimaryKey(String id);
    int updateBrowsingByPrimaryKey(String id);
    int insert(DynamicArticleManagement record);
    int updatePraiseByPrimaryKeyAdd(String id);
    int updatePraiseByPrimaryKeyReduce(String id);
}
