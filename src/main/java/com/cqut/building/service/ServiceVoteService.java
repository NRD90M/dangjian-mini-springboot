package com.cqut.building.service;

import com.cqut.building.dto.ServiceVoteNameDto;
import com.cqut.building.dto.VoteDto;
import com.cqut.building.dto.VoteOptionDto;
import com.cqut.building.dto.VoteTitleDto;
import com.cqut.building.entity.ServiceVoteRecord;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 小程序>>>>应用>>>投票调查
 * 对应表：service_vote
 */
@Service
public interface ServiceVoteService {
    //根据学院名字查询可参与的投票
    List<ServiceVoteNameDto> selectByName(String sysUserDepartment);


    List<VoteTitleDto> getVoteByPartyId(String partyId);


    VoteDto getVoteByVoteId(String voteId);


    List<VoteOptionDto> getVoteOption(String voteId);

    int insertVoteOption(ServiceVoteRecord serviceVoteRecord);

    String isOptioned(ServiceVoteRecord serviceVoteRecord);
}
