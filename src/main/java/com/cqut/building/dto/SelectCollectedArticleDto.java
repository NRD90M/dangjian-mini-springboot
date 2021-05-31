package com.cqut.building.dto;

import java.util.Date;

/**
 * author：包嵩
 * 用来存我的收藏的列表
 */
public class SelectCollectedArticleDto {
    /**
     * 文章id
     */
    private String articleId;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 审核时间
     */
    private Date CheckTime;

    /**
     * 图片路径
     */
    private String pictureUrl;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCheckTime() {
        return CheckTime;
    }

    public void setCheckTime(Date checkTime) {
        CheckTime = checkTime;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
