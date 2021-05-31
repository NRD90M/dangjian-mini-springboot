package com.cqut.building.service;

import com.cqut.building.dto.SelectCollectedArticleDto;
import com.cqut.building.dto.WxUserCollectDTO;
import com.cqut.building.entity.WxUserCollect;
import com.cqut.building.util.PageResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 小程序>>>>我的>>>我的收藏
 * 对应表：wx_user_collect
 */

public interface WxUserCollectService {

    //删除id收藏的文章
    int deleteByPrimaryKey(String id);

    //新增收藏文章
    int insertSelective(WxUserCollect record);

    //查询收藏文章
    PageResult<WxUserCollect> selectByPrimaryKey(String id);

    //修改收藏文章
    int updateByPrimaryKeySelective(WxUserCollect record);

    //渲染 小程序 我的收藏列表显示
    List<WxUserCollectDTO> selectCollect(String id);

    /**
     * 通过文章id和党员id查询是否收藏这篇文章
     * @param articleId
     * @param partyId
     * @return
     */
    WxUserCollect isCollected(String  partyId,String articleId);

    /**
     * 通过文章id和党员id删除记录
     * @param partyId
     * @param articleId
     */
    int deleteByUserIdAndArticleId(String partyId,String articleId);

    /**
     * 通过党员di查询收藏了哪些文章
     * @param partyId
     * @return
     */
    List<SelectCollectedArticleDto> getMyCollectedArticle(String partyId);
}
