package com.cqut.building.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class VoteDto {
    String voteId;
    String title;
    String content;
    List<VoteOptionDto> optionDtos;
    String name;
    String organizationName;
    Date voteBeginTime;
    Date voteEndTime;

    public String getVoteId() {
        return voteId;
    }

    public void setVoteId(String voteId) {
        this.voteId = voteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<VoteOptionDto> getOptionDtos() {
        return optionDtos;
    }

    public void setOptionDtos(List<VoteOptionDto> optionDtos) {
        this.optionDtos = optionDtos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @JsonFormat(pattern = "yyyy年YY月dd日" ,timezone = "GMT+8")
    public Date getVoteBeginTime() {
        return voteBeginTime;
    }

    public void setVoteBeginTime(Date voteBeginTime) {
        this.voteBeginTime = voteBeginTime;
    }

    @JsonFormat(pattern = "yyyy年YY月dd日" ,timezone = "GMT+8")
    public Date getVoteEndTime() {
        return voteEndTime;
    }

    public void setVoteEndTime(Date voteEndTime) {
        this.voteEndTime = voteEndTime;
    }
}
