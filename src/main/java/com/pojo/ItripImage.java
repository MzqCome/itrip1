package com.pojo;

import java.sql.Timestamp;

public class ItripImage {
  private Long id;
  private Long itrId;
  private Long itrId2;
  private String type;
  private Long targetId;
  private Long position;
  private String imgUrl;
  private java.sql.Timestamp creationDate;
  private Long createdBy;
  private java.sql.Timestamp modifyDate;
  private Long modifiedBy;

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

  public Long getItrId2() {
    return itrId2;
  }

  public void setItrId2(Long itrId2) {
    this.itrId2 = itrId2;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Long getTargetId() {
    return targetId;
  }

  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }

  public Long getPosition() {
    return position;
  }

  public void setPosition(Long position) {
    this.position = position;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
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
