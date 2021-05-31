package com.cqut.building.dao;

import com.cqut.building.entity.MessagePerson;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

@Mapper
public interface MessagePersonMapper {
    int deleteByPrimaryKey(String id);

    int deleteByMessagePerson(String id);

    int updateByIsRead(String id);

    int insert(MessagePerson record);

    int insertMessagePerson(@Param("messagePersonMap") Map<String, String> map);

    int insertSelective(MessagePerson record);

    MessagePerson selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MessagePerson record);

    int updateByPrimaryKey(MessagePerson record);
}