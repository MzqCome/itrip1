package com.dao.hotel;

import com.pojo.ItripHotel;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by dell on 2018/1/2.
 */
public interface HotelMapper {

    //通過酒店名称模糊查询所有酒店
    public List<ItripHotel> queryAllByName(@Param("cityId") Integer cityId,
                                                @Param("Name") String Name,
                                                @Param("checkInDate")Date checkInDate,
                                                @Param("checkOutDate")Date checkOutDate
                                                );
    //根据酒店 地址 查询所有酒店(模糊查询)
    public List<ItripHotel> queryAllByAddress(@Param("cityId") Integer cityId,
                                              @Param("address") String address,
                                              @Param("checkInDate")Date checkInDate,
                                              @Param("checkOutDate")Date checkOutDate
                                              );

    //根据酒店 名称 查询所有酒店(模糊查询)
    public List<ItripHotel> queryAllByHotelName(@Param("cityId") Integer cityId,
                                              @Param("hotelName") String hotelName,
                                              @Param("checkInDate")Date checkInDate,
                                              @Param("checkOutDate")Date checkOutDate);

    //查询所有酒店（当前城市下的所有酒店列表）
    public List<ItripHotel> queryAll(@Param("cityId") Integer cityId,
                                     @Param("checkInDate")Date checkInDate,
                                     @Param("checkOutDate")Date checkOutDate);


}
