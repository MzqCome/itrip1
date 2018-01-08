package com.service;

import com.dao.hotel.HotelMapper;
import com.pojo.ItripHotel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dell on 2018/1/2.
 */
@Service
public class HotelServiceImpl implements HotelService {
    @Resource
    private HotelMapper hotelMapper;


    public List<ItripHotel> queryAllByHotelName(String hotel) {
        return hotelMapper.queryAllByHotelName(hotel);
    }

    public List<ItripHotel> queryAllByAddress(String hotel) {
        return hotelMapper.queryAllByAddress(hotel);
    }

    public List<ItripHotel> queryAll() {
        return null;
    }
}
