package com.service.pre;

import com.pojo.ItripHotelOrder;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 订单业务层
 */
public interface ItripHotelOrderService {


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
    List<ItripHotelOrder> listOradeBySelect(Integer orderStatus,
                                            Integer orderNo,
                                            Integer orderType,
                                            Date creationDate,
                                            String linkUserName);

    /**
     * 根据订单查询详细信息
     * 酒店名称 酒店地址 房间类型 房间名称 房间价格 酒店床型 满意度 入住时间 是否支付
     * @param orderId
     * @return
     */
    ItripHotelOrder queryOradeById(Integer orderId);


    /**
     * 删除订单
     * @param orderId
     * @return
     */
    Integer delOrder(Integer orderId);
}
