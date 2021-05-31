package com.cqut.building.dto;

/**
 * 小程序>>>>首页>>>基层风采，党员先锋
 * 对应表：dynamic_praise_record
 */
public class GetAddPraiseDto {
    /**
     *articleId:被点赞的文章或者是培训id
     */
    private String articleId;

    /**
     *userId:点赞人id
     */
    private String userId;

    /**
     * 点赞类型：praiseType(文章表:1，党校培训:2 党主题日:3)
     */
    private Integer praiseType;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getPraiseType() {
        return praiseType;
    }

    public void setPraiseType(Integer praiseType) {
        this.praiseType = praiseType;
    }
}
