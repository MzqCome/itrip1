package com.pojo;

import java.sql.Date;

public class ItripOrderLinkUser {
  private Integer id;//主键
  private Integer itrId;//主键
  private Integer orderId;//订单id
  private Integer linkUserId;//联系人id
  private String linkUserName;
  private Date creationDate;
  private Integer createdBy;
  private Date modifyDate;
  private Integer modifiedBy;

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

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getItrId() {
    return itrId;
  }

  public void setItrId(Integer itrId) {
    this.itrId = itrId;
  }

  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public Integer getLinkUserId() {
    return linkUserId;
  }

  public void setLinkUserId(Integer linkUserId) {
    this.linkUserId = linkUserId;
  }

  public String getLinkUserName() {
    return linkUserName;
  }

  public void setLinkUserName(String linkUserName) {
    this.linkUserName = linkUserName;
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
