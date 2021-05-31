package com.cqut.building.service;

import java.util.Map;

public interface MessagePersonService {
    int deleteByMessagePerson(String id);
    int updateByIsRead(String id);
    int insertMessagePerson(Map<String, String> map);
}
