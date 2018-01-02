package com.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/2 0002.
 */
public class ItripHotelExtendProperty {

    private Integer id;
    private Integer hotelId;//酒店id
    private Integer extendPropertyId;//推广属性
    private Date creationDate;
    private Integer createdBy;
    private Date modifyDate;
    private Integer modifiedBy;

    @Override
    public String toString() {
        return "ItripHotelExtendProperty{" +
                "id=" + id +
                ", hotelId=" + hotelId +
                ", extendPropertyId=" + extendPropertyId +
                ", creationDate=" + creationDate +
                ", createdBy=" + createdBy +
                ", modifyDate=" + modifyDate +
                ", modifiedBy=" + modifiedBy +
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

    public Integer getExtendPropertyId() {
        return extendPropertyId;
    }

    public void setExtendPropertyId(Integer extendPropertyId) {
        this.extendPropertyId = extendPropertyId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
