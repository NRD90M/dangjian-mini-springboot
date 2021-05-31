package com.cqut.building.entity;

import java.util.Date;
/**
 * 小程序>>>>我的>>>个人信息
 * 对应表：sys_wx_user
 */

public class SysWxUser {
    /**
     * id:微信小程序的唯一标识openId
     */
    private String id;

    /**
     * nickName:微信小程序用户的昵称
     */
    private String nickname;

    /**
     * sex:微信小程序用户性别
     */
    private Integer sex;

    /**
     * name:用户的真实姓名
     */
    private String name;

    /**
     * studentJobNumber:学号
     */
    private String studentJobNumber;

    /**
     * createTime：创建时间
     */
    private Date createTime;

    /**
     * avatarurl：微信头像路径
     */
    private String avatarurl;

    /**
     * isAudited：是否认证 0--未认证，1--认证成功，2--认证失败
     */
    private Integer isAudited;

    /**
     * verifyTime：认证时间
     */
    private Date verifyTime;

    /**
     * telNumber:电话号码
     */
    private String telNumber;

    /**
     * type:类别 0--学生，1--教师
     */
    private Integer type;

    /**
     * isSecretary:是否书记 0--党员，1--书记
     */
    private Integer isSecretary;

    /**
     * 党员id
     */
    private String partyId;

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStudentJobNumber() {
        return studentJobNumber;
    }

    public void setStudentJobNumber(String studentJobNumber) {
        this.studentJobNumber = studentJobNumber == null ? null : studentJobNumber.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl == null ? null : avatarurl.trim();
    }

    public Integer getIsAudited() {
        return isAudited;
    }

    public void setIsAudited(Integer isAudited) {
        this.isAudited = isAudited;
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber == null ? null : telNumber.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsSecretary() {
        return isSecretary;
    }

    public void setIsSecretary(Integer isSecretary) {
        this.isSecretary = isSecretary;
    }
    @Override
    public String toString() {
        return "SysWxUser{" +
                "id='" + id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                ", studentJobNumber='" + studentJobNumber + '\'' +
                ", createTime=" + createTime +
                ", avatarurl='" + avatarurl + '\'' +
                ", isAudited=" + isAudited +
                ", verifyTime=" + verifyTime +
                ", telNumber='" + telNumber + '\'' +
                ", type=" + type +
                ", isSecretary=" + isSecretary +
                '}';
    }
}