package com.cqut.building.dao;

import com.cqut.building.dto.ServiceVoteNameDto;
import com.cqut.building.dto.VoteDto;
import com.cqut.building.dto.VoteOptionDto;
import com.cqut.building.dto.VoteTitleDto;
import com.cqut.building.entity.ServiceVote;
import com.cqut.building.entity.ServiceVoteRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 小程序>>>>应用>>>投票调查
 * 对应表：service_vote
 */

@Mapper
public interface ServiceVoteMapper {
    int deleteByPrimaryKey(String voteId);

    int insert(ServiceVote record);

    int insertSelective(ServiceVote record);

    ServiceVote selectByPrimaryKey(String voteId);

    int updateByPrimaryKeySelective(ServiceVote record);

    int updateByPrimaryKeyWithBLOBs(ServiceVote record);

    int updateByPrimaryKey(ServiceVote record);

    List<ServiceVoteNameDto> selectByName(String sysUserDepartment);


    //通过用户的partyId查询用户有哪些可以投票的记录
    List<VoteTitleDto> getVoteByPartyId(String partyId);

    VoteDto getVoteByVoteId(String voteId);


    List<VoteOptionDto> getVoteOption(String voteId);

    int insertVoteOption(ServiceVoteRecord serviceVoteRecord);

    String isOptioned(ServiceVoteRecord serviceVoteRecord);


}