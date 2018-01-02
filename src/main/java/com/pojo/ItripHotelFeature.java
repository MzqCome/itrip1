package com.pojo;

import java.util.Date;

public class ItripHotelFeature {
  private Integer id;
  private Integer hotelId;
  private Integer featureId;
  private Date creationDate; //预订时间
  private Integer createdBy; //
  private Date modifyDate; //支付完成时间
  private Integer modifiedBy; //

  @Override
  public String toString() {
    return "ItripHotelFeature{" +
            "id=" + id +
            ", hotelId=" + hotelId +
            ", featureId=" + featureId +
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

  public Integer getFeatureId() {
    return featureId;
  }

  public void setFeatureId(Integer featureId) {
    this.featureId = featureId;
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
