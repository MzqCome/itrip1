package com.dao.hotel;

import com.pojo.ItripHotel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by dell on 2018/1/2.
 */
public interface HotelMapper {
    //通過酒店名稱查询所有酒店
    public List<ItripHotel> queryAllByHotelName(@Param("hotelName") String hotelName);
    //通過酒店地址查询所有酒店
    public List<ItripHotel> queryAllByAddress(@Param("queryAllByAddress") String queryAllByAddress);

}
