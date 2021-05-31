package com.cqut.building.service;

import com.cqut.building.entity.Message;

import java.util.List;

/**
 * 小程序>>>>消息通知
 * 对应表：message
 */
public interface MessageService {
    List<Message> selectMessage(String messageReceiveId);
    int insertMessage(Message record);
}
