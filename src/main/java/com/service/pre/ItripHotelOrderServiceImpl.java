package com.service.pre;

import com.dao.order.ItripHotelOrderMapper;
import com.pojo.ItripHotelOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by main on 2018/1/2.
 */
@Service
public class ItripHotelOrderServiceImpl implements ItripHotelOrderService {


    @Autowired
    private ItripHotelOrderMapper itripHotelOrderMapper;
    @Override
    public List<ItripHotelOrder> listAllOrderByUserId(Integer userId) {
        return itripHotelOrderMapper.listAllOrderByUserId(userId);
    }

    @Override
    public List<ItripHotelOrder> listOradeBySelect(Integer orderStatus, Integer orderNo, Integer orderType, Date creationDate, String linkUserName) {
        return itripHotelOrderMapper.listOradeBySelect(orderStatus, orderNo, orderType, creationDate, linkUserName);
    }

    @Override
    public ItripHotelOrder queryOradeById(Integer orderId) {
        return itripHotelOrderMapper.queryOradeById(orderId);
    }

    @Override
    public Integer delOrder(Integer order) {
        return itripHotelOrderMapper.delOrder(order);
    }
}
