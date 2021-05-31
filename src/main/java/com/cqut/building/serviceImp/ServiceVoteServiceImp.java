package com.cqut.building.serviceImp;

import com.cqut.building.dao.ServiceVoteMapper;
import com.cqut.building.dto.ServiceVoteNameDto;
import com.cqut.building.dto.VoteDto;
import com.cqut.building.dto.VoteOptionDto;
import com.cqut.building.dto.VoteTitleDto;
import com.cqut.building.entity.ServiceVoteRecord;
import com.cqut.building.service.ServiceVoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 小程序>>>>应用>>>投票调查
 * 对应表：service_participate_three_session_one_class
 */
@Service
public class ServiceVoteServiceImp implements ServiceVoteService {
    @Autowired(required = false)
    ServiceVoteMapper mapper;


    //根据学院名字查询投票的标题、开始时间、结束时间、发起人、状态
    @Override
    public List<ServiceVoteNameDto> selectByName(String sysUserDepartment) {
        return null;
    }


    @Override
    public List<VoteTitleDto> getVoteByPartyId(String partyId) {
        return mapper.getVoteByPartyId(partyId);
    }

    @Override
    public VoteDto getVoteByVoteId(String voteId) {
        return mapper.getVoteByVoteId(voteId);
    }

    @Override
    public List<VoteOptionDto> getVoteOption(String voteId) {
        return mapper.getVoteOption(voteId);
    }

    @Override
    public int insertVoteOption(ServiceVoteRecord serviceVoteRecord) {
        return mapper.insertVoteOption(serviceVoteRecord);
    }

    @Override
    public String isOptioned(ServiceVoteRecord serviceVoteRecord) {
        return mapper.isOptioned(serviceVoteRecord);
    }
}
