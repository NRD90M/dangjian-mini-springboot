package com.cqut.building.entity;

public class SysWxUserOrgPost {
    private String id;

    private String wxUserId;

    private String organizationId;

    private String postId;

    private int isAudited;

    public int getIsAudited() {
        return isAudited;
    }

    public void setIsAudited(int isAudited) {
        this.isAudited = isAudited;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWxUserId() {
        return wxUserId;
    }

    public void setWxUserId(String wxUserId) {
        this.wxUserId = wxUserId == null ? null : wxUserId.trim();
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId == null ? null : postId.trim();
    }
}