package com.cqut.building.serviceImp;

import com.cqut.building.dao.ServiceThemeDayMapper;
import com.cqut.building.dto.GetServiceThemeDayAllDto;
import com.cqut.building.dto.GetServiceThemeDayDto;
import com.cqut.building.service.ServiceThemeDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceThemeDayServiceImpl implements ServiceThemeDayService {

    @Autowired(required = false)
    ServiceThemeDayMapper serviceThemeDayMapper;

    @Override
    public List<GetServiceThemeDayDto> selectAllThemeDay(GetServiceThemeDayAllDto getServiceThemeDayAllDto) {
        return serviceThemeDayMapper.selectAllThemeDay(getServiceThemeDayAllDto);
    }

    @Override
    public GetServiceThemeDayDto selectByThemeDayId(String id) {
        return serviceThemeDayMapper.selectByThemeDayId(id);
    }

    @Override
    public int updateBrowsingByPrimaryKey(String id) {
        return serviceThemeDayMapper.updateBrowsingByPrimaryKey(id);
    }

    @Override
    public int updatePraiseByPrimaryKeyAdd(String id) {
        return serviceThemeDayMapper.updatePraiseByPrimaryKeyAdd(id);
    }

    @Override
    public int updatePraiseByPrimaryKeyReduce(String id) {
        return serviceThemeDayMapper.updatePraiseByPrimaryKeyReduce(id);
    }
}
