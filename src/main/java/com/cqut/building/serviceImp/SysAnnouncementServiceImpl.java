package com.cqut.building.serviceImp;

import com.cqut.building.dao.SysAnnouncementMapper;
import com.cqut.building.entity.SysAnnouncement;
import com.cqut.building.service.SysAnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 小程序>>>消息通知>>>>系统公告
 * 对应表：sys_announcement
 */
@Service
public class SysAnnouncementServiceImpl implements SysAnnouncementService {

    @Autowired(required = false)
    SysAnnouncementMapper sysAnnouncementMapper;

    @Override
    public List<String> selectAllScope() {
        return sysAnnouncementMapper.selectAllScope();
    }

    @Override
    public List<SysAnnouncement> selectAnnouncementByUser(String notificationScopes) {
        return sysAnnouncementMapper.selectAnnouncementByUser(notificationScopes);
    }

    @Override
    public SysAnnouncement selectByPrimaryKey(String id) {
        return sysAnnouncementMapper.selectByPrimaryKey(id);
    }
}
