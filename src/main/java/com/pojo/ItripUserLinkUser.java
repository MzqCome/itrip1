package com.pojo;

import java.util.Date;

/**
 * Created by dell on 2018/1/2.
 * FieldTypeComment
    idbigint(20) NOT NULL主键
    linkUserNamevarchar(255) NULL
    linkIdCardvarchar(255) NULL
    linkPhonevarchar(255) NULL
    userIdint(11) NULL用户id
    creationDatedatetime NULL
    createdBybigint(11) NULL
    modifyDatedatetime NULL
    modifiedBybigint(11) NULL
    linkIdCardTypeint(1) NULL证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)
 */
public class ItripUserLinkUser {
    private Integer id;
    private String linkUserName;//
    private String linkIdCard;
    private String linkPhone;
    private Integer userId;
    private Date creationDate;//创建时间
    private Integer createdBy;//创建者
    private Date modifyDate;//修改时间
    private Integer modifiedBy;//修改者
    private Integer linkIdCardType;//证件类型

    @Override
    public String toString() {
        return "ItripUserLinkUserMapper{" +
                "id=" + id +
                ", linkUserName='" + linkUserName + '\'' +
                ", linkIdCard='" + linkIdCard + '\'' +
                ", linkPhone='" + linkPhone + '\'' +
                ", userId=" + userId +
                ", creationDate=" + creationDate +
                ", createdBy=" + createdBy +
                ", modifyDate=" + modifyDate +
                ", modifiedBy=" + modifiedBy +
                ", linkIdCardType=" + linkIdCardType +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLinkUserName() {
        return linkUserName;
    }

    public void setLinkUserName(String linkUserName) {
        this.linkUserName = linkUserName;
    }

    public String getLinkIdCard() {
        return linkIdCard;
    }

    public void setLinkIdCard(String linkIdCard) {
        this.linkIdCard = linkIdCard;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getLinkIdCardType() {
        return linkIdCardType;
    }

    public void setLinkIdCardType(Integer linkIdCardType) {
        this.linkIdCardType = linkIdCardType;
    }
}
