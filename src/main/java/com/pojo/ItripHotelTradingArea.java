package com.pojo;

import java.sql.Timestamp;

public class ItripHotelTradingArea {
  private Long id;
  private Long hotelId;
  private Long areaid;
  private java.sql.Timestamp creationDate;
  private Long createdBy;
  private java.sql.Timestamp modifyDate;
  private Long modifiedBy;

  @Override
  public String toString() {
    return "ItripHotelTradingArea{" +
            "id=" + id +
            ", hotelId=" + hotelId +
            ", areaid=" + areaid +
            ", creationDate=" + creationDate +
            ", createdBy=" + createdBy +
            ", modifyDate=" + modifyDate +
            ", modifiedBy=" + modifiedBy +
            '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getHotelId() {
    return hotelId;
  }

  public void setHotelId(Long hotelId) {
    this.hotelId = hotelId;
  }

  public Long getAreaid() {
    return areaid;
  }

  public void setAreaid(Long areaid) {
    this.areaid = areaid;
  }

  public Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Timestamp creationDate) {
    this.creationDate = creationDate;
  }

  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public Timestamp getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(Timestamp modifyDate) {
    this.modifyDate = modifyDate;
  }

  public Long getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(Long modifiedBy) {
    this.modifiedBy = modifiedBy;
  }
}
