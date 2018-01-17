package com.pojo;

/**
 * Created by dell on 2018/1/16.
 *
 FieldTypeComment
 idint(100) NOT NULL主键
 hotelIdint(100) NOT NULL酒店Id
 countint(100) NOT NULL总库存
 */
public class Count {
    private Integer id;
    private Integer hotelId;
    private Integer count;

    @Override
    public String toString() {
        return "Count{" +
                "id=" + id +
                ", hotelId=" + hotelId +
                ", count=" + count +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
