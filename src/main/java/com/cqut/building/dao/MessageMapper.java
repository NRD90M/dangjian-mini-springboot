package com.cqut.building.dao;

import com.cqut.building.entity.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {
    int deleteByPrimaryKey(String id);

    int insertMessage(Message record);

    int insertSelective(Message record);

    List<Message> selectMessage(String messageReceiveId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}