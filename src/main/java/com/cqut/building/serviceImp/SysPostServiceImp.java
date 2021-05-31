package com.cqut.building.serviceImp;

import com.cqut.building.dao.SysPostMapper;
import com.cqut.building.entity.SysPost;
import com.cqut.building.service.SysPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 小程序>>>>我的>>>职务下拉框
 * 对应表：sys_post
 */
@Service
public class SysPostServiceImp implements SysPostService {

    @Autowired(required = false)
    SysPostMapper sysPostMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return sysPostMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysPost record) {
        return sysPostMapper.insert(record);
    }

    @Override
    public int insertSelective(SysPost record) {
        return sysPostMapper.insertSelective(record);
    }

    @Override
    public SysPost selectByPrimaryKey(String id) {
        return sysPostMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysPost record) {
        return sysPostMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysPost record) {
        return sysPostMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SysPost> selectPosts() {
        return sysPostMapper.selectPosts();
    }
}
