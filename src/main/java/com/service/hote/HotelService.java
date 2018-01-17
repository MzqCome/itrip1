package com.service.hote;

import com.github.pagehelper.PageInfo;
import com.pojo.ItripHotel;

import java.util.Date;

/**
 * Created by dell on 2018/1/2.
 */
public interface HotelService {

    //根据 商圈 搜索 酒店列表
    public PageInfo<ItripHotel> queryAllByName
    (Integer pageNum, Integer pageSize,Integer cityId, String Name, Date checkInDate, Date checkOutDate);

    //根据酒店 地址 查询所有酒店(模糊查询)
    public PageInfo<ItripHotel> queryAllByAddress
    (Integer pageNum, Integer pageSize,Integer cityId, String address, Date checkInDate, Date checkOutDate);

    //根据酒店 名称 查询所有酒店(模糊查询)
    public PageInfo<ItripHotel> queryAllByHotelName
    (Integer pageNum, Integer pageSize,Integer cityId, String hotelName, Date checkInDate, Date checkOutDate);




}
