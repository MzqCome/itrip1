package com.dao.order;

import com.pojo.ItripHotelOrder;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 订单数据访问层
 */
public interface ItripHotelOrderMapper {

    /**
     * 根据用户id查询订单
     * @param userId
     * @return
     */
    List<ItripHotelOrder> listAllOrderByUserId(Integer userId);

    /**
     *
     * @param orderStatus 订单状态
     * @param orderNo 订单编号
     * @param orderType 订单类型
     * @param creationDate 创建日期
     * @param linkUserName 入住人
     * @return
     */
    List<ItripHotelOrder> listOradeBySelect(@Param("orderStatus")Integer orderStatus,
                                            @Param("orderNo")Integer orderNo,
                                            @Param("orderType")Integer orderType,
                                            @Param("creationDate")Date creationDate,
                                            @Param("linkUserName")String linkUserName);

    /**
     * 根据订单查询详细信息
     * 酒店名称 酒店地址 房间类型 房间名称 房间价格 酒店床型 满意度 入住时间 是否支付
     * @param orderId
     * @return
     */
    ItripHotelOrder queryOradeById(Integer orderId);


    /**
     * 根据订单id删除订单
     * @param oradeId
     * @return
     */
    Integer delOrder(Integer oradeId);


}
