package com.cqut.building.serviceImp;

import com.cqut.building.dao.WxUserCollectMapper;
import com.cqut.building.dto.SelectCollectedArticleDto;
import com.cqut.building.dto.WxUserCollectDTO;
import com.cqut.building.entity.WxUserCollect;
import com.cqut.building.service.WxUserCollectService;
import com.cqut.building.util.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 小程序>>>>我的>>>我的收藏
 * 对应表：wx_user_collect
 */

@Service
public class WxUserCollectServiceImp implements WxUserCollectService {

    @Autowired(required = false)
    WxUserCollectMapper mapper;

    /**
     * 根据id删除用户的收藏
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(String id) {
        return mapper.deleteByPrimaryKey(id);
    }

    /**
     * 新增用户的收藏
     * @param record
     * @return
     */
    @Override
    public int insertSelective(WxUserCollect record) {
        return mapper.insertSelective(record);
    }

    /**
     * 根据user_id查询该用户的所有收藏
     * @param id
     * @return
     */
    @Override
    public PageResult<WxUserCollect> selectByPrimaryKey(String id) {
        PageHelper.startPage(1,10);

        List<WxUserCollect> list = mapper.selectByPrimaryKey(id);
        PageInfo pageInfo = new PageInfo(list);

        PageResult result = new PageResult();
        result.setTotal((int)pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }

    /**
     * 根据id修改收藏
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKeySelective(WxUserCollect record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 渲染 小程序 我的收藏列表显示
     * @param id
     * @return
     */
    @Override
    public List<WxUserCollectDTO> selectCollect(String id) {
        return mapper.selectCollect(id);
    }

    /**
     * 通过党员id和文章id查询是否收藏
     * @param partyId
     * @param articleId
     * @return
     */
    @Override
    public WxUserCollect isCollected(String partyId,String articleId) {
        return mapper.isCollected(partyId,articleId);
    }

    /**
     * 通过党员id和文章id取消收藏
     * @param partyId
     * @param articleId
     * @return
     */
    @Override
    public int deleteByUserIdAndArticleId(String partyId, String articleId) {
        return mapper.deleteByUserIdAndArticleId(partyId,articleId);
    }

    /**
     * 通过党员id查询自己收藏的文章
     * @param partyId
     * @return
     */
    @Override
    public List<SelectCollectedArticleDto> getMyCollectedArticle(String partyId) {
        return mapper.getMyCollectedArticle(partyId);
    }
}
