package com.pojo;

import java.sql.Timestamp;

public class ItripOrderLinkUser {
  private Long id;
  private Long itrId;
  private Long orderId;
  private Long linkUserId;
  private String linkUserName;
  private java.sql.Timestamp creationDate;
  private Long createdBy;
  private java.sql.Timestamp modifyDate;
  private Long modifiedBy;

  @Override
  public String toString() {
    return "ItripOrderLinkUser{" +
            "id=" + id +
            ", itrId=" + itrId +
            ", orderId=" + orderId +
            ", linkUserId=" + linkUserId +
            ", linkUserName='" + linkUserName + '\'' +
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

  public Long getItrId() {
    return itrId;
  }

  public void setItrId(Long itrId) {
    this.itrId = itrId;
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public Long getLinkUserId() {
    return linkUserId;
  }

  public void setLinkUserId(Long linkUserId) {
    this.linkUserId = linkUserId;
  }

  public String getLinkUserName() {
    return linkUserName;
  }

  public void setLinkUserName(String linkUserName) {
    this.linkUserName = linkUserName;
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
