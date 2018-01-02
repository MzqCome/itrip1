package com.pojo;

import java.util.Date;

/**
 * 商品类
 */
public class ItripHotelTempStore {
  private Integer id;
  private Integer hotelId;
  private Integer roomId; //商品id
  private Date recordDate; //记录时间
  private Integer store; //库存
  private Date creationDate; //预订时间
  private Integer createdBy; //
  private Date modifyDate; //支付完成时间
  private Integer modifiedBy;

  @Override
  public String toString() {
    return "ItripHotelTempStore{" +
            "id=" + id +
            ", hotelId=" + hotelId +
            ", roomId=" + roomId +
            ", recordDate=" + recordDate +
            ", store=" + store +
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

  public Integer getRoomId() {
    return roomId;
  }

  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  public Date getRecordDate() {
    return recordDate;
  }

  public void setRecordDate(Date recordDate) {
    this.recordDate = recordDate;
  }

  public Integer getStore() {
    return store;
  }

  public void setStore(Integer store) {
    this.store = store;
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
