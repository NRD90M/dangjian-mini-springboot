package com.cqut.building.serviceImp;


import com.cqut.building.dao.MessageMapper;
import com.cqut.building.entity.Message;
import com.cqut.building.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class MessageServiceImpl implements MessageService {
    @Autowired(required = false)
    MessageMapper messageMapper;

    @Override
    public List<Message> selectMessage(String messageReceiveId) {
        return messageMapper.selectMessage(messageReceiveId);
    }

    @Override
    public int insertMessage(Message record) {
        return messageMapper.insertMessage(record);
    }
}
