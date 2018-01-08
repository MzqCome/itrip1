package com.dao.linkUser;

import com.pojo.ItripUserLinkUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户旅客信息表
 */
public interface ItripUserLinkUserMapper {

    /**
     * 查询当前登录人相关联的常用旅客的信息列表
     * @param userId
     * @return
     */
    List<ItripUserLinkUser> queryAllByUserId(Integer userId);

    /**
     * 根据用户id和旅客姓名模糊查询
     * @param userId
     * @param linkUserName
     * @return
     */
    List<ItripUserLinkUser> queryLinkUserByUserIdAndLiknUserName(@Param("userId") Integer userId,
                                                                 @Param("linkUserName") String linkUserName
    );

    /**
     * 根据id查询旅客信息
     * @param linkUserId
     * @return
     */
    ItripUserLinkUser queryLinkUserByID(Integer linkUserId);


    /**
     * 添加旅客
     * @return
     */
    Integer addLinkUser(ItripUserLinkUser itripUserLinkUser);


    /**
     * 更新旅客
     * @param itripUserLinkUser
     * @return
     */
    Integer updateLinkUser(ItripUserLinkUser itripUserLinkUser);


    /**
     * 删除旅客
     * @param linkUserId
     * @return
     */
    Integer delLinkUser(Integer linkUserId);


}
