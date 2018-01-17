package com.service.hote;

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

    //通过商圈 分页搜索酒店列表
    public PageInfo<ItripHotel> queryAllByName(Integer pageNum, Integer pageSize,Integer cityId,String Name,Date checkInDate,Date checkOutDate){
        PageHelper.startPage(pageNum, pageSize);
        List<ItripHotel> list = hotelMapper.queryAllByName(cityId, Name, checkInDate, checkOutDate);
        PageInfo<ItripHotel> pageInfo = new PageInfo<ItripHotel>(list);
        return pageInfo;
    }

    //通过地址 分页搜索酒店列表（模糊查询）
    public PageInfo<ItripHotel> queryAllByAddress(Integer pageNum, Integer pageSize, Integer cityId, String address, Date checkInDate, Date checkOutDate) {
        PageHelper.startPage(pageNum, pageSize);
        List<ItripHotel> list2 = hotelMapper.queryAllByAddress(cityId, address, checkInDate, checkOutDate);
        PageInfo<ItripHotel> pageInfo2 = new PageInfo<ItripHotel>(list2);
        return pageInfo2;
    }

    //通过地址 分页搜索酒店列表（模糊查询）
    public PageInfo<ItripHotel> queryAllByHotelName(Integer pageNum, Integer pageSize, Integer cityId, String hotelName, Date checkInDate, Date checkOutDate) {
        PageHelper.startPage(pageNum, pageSize);
        List<ItripHotel> list3 = hotelMapper.queryAllByAddress(cityId, hotelName, checkInDate, checkOutDate);
        PageInfo<ItripHotel> pageInfo3 = new PageInfo<ItripHotel>(list3);
        return pageInfo3;
    }

    /*查询所有酒店*/
    public PageInfo<ItripHotel> queryAll(Integer pageNum, Integer pageSize, Integer cityId, Date checkInDate, Date checkOutDate) {
        PageHelper.startPage(pageNum, pageSize);
        List<ItripHotel> list =hotelMapper.queryAll(cityId, checkInDate, checkOutDate);
        PageInfo<ItripHotel> pageInfo = new PageInfo<ItripHotel>(list);
        return pageInfo;
    }






}
