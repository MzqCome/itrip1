package com.service;

import com.github.pagehelper.PageInfo;
import com.pojo.ItripHotel;

import java.util.Date;
import java.util.List;

/**
 * Created by dell on 2018/1/2.
 */
public interface HotelService {


    public PageInfo<ItripHotel> queryAllByName(Integer pageNum, Integer pageSize,Integer cityId, String Name, Date checkInDate, Date checkOutDate);

    public List<ItripHotel> queryAllByAddress(String hotel);

    //没有参数 查所有
    public List<ItripHotel> queryAll();

    public List<ItripHotel> queryAllByCity(Integer cityId);
}
