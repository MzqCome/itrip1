package com.pojo;

import java.sql.Date;

public class ItripImage {
  private Integer id;
  private Integer itrId;
  private Integer itrId2;
  private String type;
  private Integer targetId;
  private Integer position;
  private String imgUrl;
  private Date creationDate;
  private Integer createdBy;
  private Date modifyDate;
  private Integer modifiedBy;

  @Override
  public String toString() {
    return "ItripImage{" +
            "id=" + id +
            ", itrId=" + itrId +
            ", itrId2=" + itrId2 +
            ", type='" + type + '\'' +
            ", targetId=" + targetId +
            ", position=" + position +
            ", imgUrl='" + imgUrl + '\'' +
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

  public Integer getItrId2() {
    return itrId2;
  }

  public void setItrId2(Integer itrId2) {
    this.itrId2 = itrId2;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Integer getTargetId() {
    return targetId;
  }

  public void setTargetId(Integer targetId) {
    this.targetId = targetId;
  }

  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
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
