package com.service;

import com.pojo.ItripHotel;

import java.util.List;

/**
 * Created by dell on 2018/1/2.
 */
public interface HotelService {
    public List<ItripHotel> queryAllByHotelName(String hotelName);
}
