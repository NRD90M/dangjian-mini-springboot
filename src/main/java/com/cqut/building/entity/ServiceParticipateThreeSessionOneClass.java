package com.cqut.building.entity;

/**
 * 小程序>>>>应用>>>三会一课的参会人员
 * 对应表：service_participate_three_session_one_class
 */
public class ServiceParticipateThreeSessionOneClass {
    //会议-参会人员id
    private String id;

    //三会一课id
    private String threeSessionOneClassId;

    //参会人员id
    private String participateId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getThreeSessionOneClassId() {
        return threeSessionOneClassId;
    }

    public void setThreeSessionOneClassId(String threeSessionOneClassId) {
        this.threeSessionOneClassId = threeSessionOneClassId == null ? null : threeSessionOneClassId.trim();
    }

    public String getParticipateId() {
        return participateId;
    }

    public void setParticipateId(String participateId) {
        this.participateId = participateId == null ? null : participateId.trim();
    }
}