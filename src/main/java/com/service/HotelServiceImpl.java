package com.service;

import com.dao.hotel.HotelMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.ItripHotel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by dell on 2018/1/2.
 */
@Service
public class HotelServiceImpl implements HotelService {
    @Resource
    private HotelMapper hotelMapper;

    public PageInfo<ItripHotel> queryAllByName(Integer pageNum, Integer pageSize,Integer cityId,String Name,Date checkInDate,Date checkOutDate){
        PageHelper.startPage(pageNum, pageSize);
        List<ItripHotel> list = hotelMapper.queryAllByName(cityId, Name, checkInDate, checkOutDate);
        PageInfo<ItripHotel> pageInfo = new PageInfo<ItripHotel>(list);
        return pageInfo;
    }

//    public List<ItripHotel> queryAllByHotelName(Integer cityId,String Name,Date checkInDate,Date checkOutDate) {
//        return hotelMapper.queryAllByHotelName(cityId,Name,checkInDate,checkOutDate);
//    }

    public List<ItripHotel> queryAllByAddress(String hotel) {
        return hotelMapper.queryAllByAddress(hotel);
    }

    public List<ItripHotel> queryAll() {
        return hotelMapper.queryAll();
    }

    public List<ItripHotel> queryAllByCity(Integer cityId) {
        return hotelMapper.queryAllByCity(cityId);
    }
}
