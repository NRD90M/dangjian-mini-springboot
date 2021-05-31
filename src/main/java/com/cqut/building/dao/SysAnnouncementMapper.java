package com.cqut.building.dao;

import com.cqut.building.entity.SysAnnouncement;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 小程序>>>消息通知>>>>系统公告
 * 对应表：sys_announcement
 */
@Mapper
public interface SysAnnouncementMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysAnnouncement record);

    int insertSelective(SysAnnouncement record);

    SysAnnouncement selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysAnnouncement record);

    int updateByPrimaryKeyWithBLOBs(SysAnnouncement record);

    int updateByPrimaryKey(SysAnnouncement record);

    List<String> selectAllScope();

    List<SysAnnouncement> selectAnnouncementByUser(String notificationScopes);
}