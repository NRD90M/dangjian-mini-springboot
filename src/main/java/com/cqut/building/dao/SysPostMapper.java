package com.cqut.building.dao;

import com.cqut.building.entity.SysPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * author:baosong
 */
@Mapper
public interface SysPostMapper {
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