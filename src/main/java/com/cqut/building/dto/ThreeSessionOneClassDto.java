package com.cqut.building.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ThreeSessionOneClassDto {
    //开会id/课程id
    private String id;

    //标题名字
    private String title;

    //发布时间
    private Date releaseTime;

    //组织人员兼发起人
    private String name;


    //会议内容
    private String mainContent;

    //参会人员名字
    private String participateName;

    //会议形式
    private String meetingForm;

    //会议时间
    private Date meetingTime;

    //会议时长
    private String meetingDuration;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT")
    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMainContent() {
        return mainContent;
    }

    public void setMainContent(String mainContent) {
        this.mainContent = mainContent;
    }

    public String getParticipateName() {
        return participateName;
    }

    public void setParticipateName(String participateName) {
        this.participateName = participateName;
    }

    public String getMeetingForm() {
        return meetingForm;
    }

    public void setMeetingForm(String meetingForm) {
        this.meetingForm = meetingForm;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT")
    public Date getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(Date meetingTime) {
        this.meetingTime = meetingTime;
    }

    public String getMeetingDuration() {
        return meetingDuration;
    }

    public void setMeetingDuration(String meetingDuration) {
        this.meetingDuration = meetingDuration;
    }
}
