package com.cqut.building.dao;

import com.cqut.building.dto.GetArticleBySourceDto;
import com.cqut.building.dto.GetArticleDto;
import com.cqut.building.entity.DynamicArticleManagement;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 小程序>>>>首页>>>基层风采，党员先锋
 * 小程序>>>>应用>>>发布文章
 * 对应表：dynamic_article_management
 */

@Mapper
public interface DynamicArticleManagementMapper {
    int deleteByPrimaryKey(String id);

    int insert(DynamicArticleManagement record);

    int insertSelective(DynamicArticleManagement record);

    GetArticleDto selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DynamicArticleManagement record);

    int updateByPrimaryKeyWithBLOBs(DynamicArticleManagement record);

    int updateByPrimaryKey(DynamicArticleManagement record);

    int updateBrowsingByPrimaryKey(String id);

    List<GetArticleDto> selectArticleBySource(GetArticleBySourceDto getArticleBySourceDto);

    int updatePraiseByPrimaryKeyAdd(String id);

    int updatePraiseByPrimaryKeyReduce(String id);
}