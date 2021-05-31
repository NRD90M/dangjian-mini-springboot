package com.cqut.building.serviceImp;

import com.cqut.building.dao.serviceChangeOrganizationMapper;
import com.cqut.building.dto.WxUserChangeOrganizaDto;
import com.cqut.building.entity.serviceChangeOrganization;
import com.cqut.building.service.serviceChangeOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceChangeOrganizationServiceImp implements serviceChangeOrganizationService {

    @Autowired(required = false)
    serviceChangeOrganizationMapper serviceChangeOrganization;

    @Override
    public int deleteByPrimaryKey(String id) {
       return serviceChangeOrganization.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(serviceChangeOrganization record) {
      return serviceChangeOrganization.insert(record);
    }

    @Override
    public int insertSelective(serviceChangeOrganization record) {
        return serviceChangeOrganization.insertSelective(record);
    }

    @Override
    public serviceChangeOrganization selectByPrimaryKey(String id) {
        return serviceChangeOrganization.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(serviceChangeOrganization record) {
        return serviceChangeOrganization.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(serviceChangeOrganization record) {
        return serviceChangeOrganization.updateByPrimaryKey(record);
    }

    @Override
    public WxUserChangeOrganizaDto getInformation(String partyId) {
        return serviceChangeOrganization.getInformation(partyId);
    }


    @Override
    public List<String> getTheme() {
        return serviceChangeOrganization.getTheme();
    }

    @Override
    public String getThemeId(String newTheme) {
        return serviceChangeOrganization.getThemeId(newTheme);
    }

    @Override
    public String getThemeName(String id, String organizationId, String postId) {
        return serviceChangeOrganization.getThemeName(id,organizationId,postId);
    }

    @Override
    public serviceChangeOrganization isChangeing(String studentJobNumber) {
        return serviceChangeOrganization.isChangeing(studentJobNumber);
    }

    @Override
    public String getState(String partyId) {
        return serviceChangeOrganization.getState(partyId);
    }
}
