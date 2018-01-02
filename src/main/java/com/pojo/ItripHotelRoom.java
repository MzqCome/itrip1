package com.pojo;

import java.util.Date;

/**
 * 房间类
 */
public class ItripHotelRoom {
  private Integer id;
  private Integer hotelId; //酒店ID
  private String roomTitle; //房间名称
  private Double roomPrice; //房间价格
  private Integer roomBedTypeId; //酒店类型
  private Integer isHavingBreakfast; //是否包含早餐
  private Integer payType; //1在线付 2到店付 3不限
  private Double satisfaction; //满意度
  private Integer isBook; //是否可预订 0不可以 1可以
  private Integer isCancel; //是否可取消 0不可 1可以
  private Integer isT1imelyResponse; //是否及时响应 0不及时 1及时
  private Date creationDate; //房间创建时间
  private Integer createdBy; //创建人
  private Date modifyDate;
  private Long modifiedBy;

  @Override
  public String toString() {
    return "ItripHotelRoom{" +
            "id=" + id +
            ", hotelId=" + hotelId +
            ", roomTitle='" + roomTitle + '\'' +
            ", roomPrice=" + roomPrice +
            ", roomBedTypeId=" + roomBedTypeId +
            ", isHavingBreakfast=" + isHavingBreakfast +
            ", payType=" + payType +
            ", satisfaction=" + satisfaction +
            ", isBook=" + isBook +
            ", isCancel=" + isCancel +
            ", isT1imelyResponse=" + isT1imelyResponse +
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

  public String getRoomTitle() {
    return roomTitle;
  }

  public void setRoomTitle(String roomTitle) {
    this.roomTitle = roomTitle;
  }

  public Double getRoomPrice() {
    return roomPrice;
  }

  public void setRoomPrice(Double roomPrice) {
    this.roomPrice = roomPrice;
  }

  public Integer getRoomBedTypeId() {
    return roomBedTypeId;
  }

  public void setRoomBedTypeId(Integer roomBedTypeId) {
    this.roomBedTypeId = roomBedTypeId;
  }

  public Integer getIsHavingBreakfast() {
    return isHavingBreakfast;
  }

  public void setIsHavingBreakfast(Integer isHavingBreakfast) {
    this.isHavingBreakfast = isHavingBreakfast;
  }

  public Integer getPayType() {
    return payType;
  }

  public void setPayType(Integer payType) {
    this.payType = payType;
  }

  public Double getSatisfaction() {
    return satisfaction;
  }

  public void setSatisfaction(Double satisfaction) {
    this.satisfaction = satisfaction;
  }

  public Integer getIsBook() {
    return isBook;
  }

  public void setIsBook(Integer isBook) {
    this.isBook = isBook;
  }

  public Integer getIsCancel() {
    return isCancel;
  }

  public void setIsCancel(Integer isCancel) {
    this.isCancel = isCancel;
  }

  public Integer getIsT1imelyResponse() {
    return isT1imelyResponse;
  }

  public void setIsT1imelyResponse(Integer isT1imelyResponse) {
    this.isT1imelyResponse = isT1imelyResponse;
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

  public Long getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(Long modifiedBy) {
    this.modifiedBy = modifiedBy;
  }
}
