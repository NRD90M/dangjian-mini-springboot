package com.cqut.building.service;

import com.cqut.building.entity.SysPost;

import java.util.List;

public interface SysPostService {
    int deleteByPrimaryKey(String id);

    int insert(SysPost record);

    int insertSelective(SysPost record);

    SysPost selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysPost record);

    int updateByPrimaryKey(SysPost record);

    /**
     * 查询所有职务
     * author：包嵩
     * @return
     */
    List<SysPost> selectPosts();
}