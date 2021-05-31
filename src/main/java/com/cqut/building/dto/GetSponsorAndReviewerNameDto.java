package com.cqut.building.dto;

public class GetSponsorAndReviewerNameDto {
    /**
     * author:包嵩
     * 用于保存查询的发起人姓名和审核人姓名
     */

    /**
     * id
     */
    private String id;

    /**
     * 发起人姓名
     */
    private String sponsor;

    /**
     * 审核人姓名
     */
    private String reviewer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
}
