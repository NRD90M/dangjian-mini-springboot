package com.cqut.building.entity;

import java.util.Date;


/**
 * 小程序>>>>首页>>>基层风采，党员先锋
 * 对应表：dynamic_praise_record
 */

public class DynamicPraiseRecord {

    /**
     * id:点赞记录id
     */
    private String id;

    /**
     *articleId:被点赞的文章或者是培训id
     */
    private String articleId;

    /**
     *time:点赞时间
     */
    private Date time;

    /**
     *userId:点赞人id
     */
    private String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId == null ? null : articleId.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}