package com.cqut.building.serviceImp;

import com.cqut.building.dao.MessagePersonMapper;
import com.cqut.building.service.MessagePersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MessagePersonServiceImpl implements MessagePersonService {

    @Autowired(required = false)
    MessagePersonMapper messagePersonMapper;

    @Override
    public int deleteByMessagePerson(String id) {
        return messagePersonMapper.deleteByMessagePerson(id);
    }

    @Override
    public int updateByIsRead(String id) {
        return messagePersonMapper.updateByIsRead(id);
    }

    @Override
    public int insertMessagePerson(Map<String, String> map) {
        return messagePersonMapper.insertMessagePerson(map);
    }
}
