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

    //通過酒店地址查询所有酒店
    public List<ItripHotel> queryAllByAddress(String address);

    //没有参数 查所有
    public List<ItripHotel> queryAll();

    //通过地域等级 筛查酒店列表(如查询北京市或河北省下的所有酒店列表)
    public List<ItripHotel> queryAllByCity(Integer cityId);



}
