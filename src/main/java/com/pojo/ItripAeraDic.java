package com.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/2 0002.
 */
public class ItripAeraDic {
    private Integer id;//主键
    private String name;//区域名称
    private String areaNo;//区域编号
    private Integer parent;//父级区域
    private Integer isActivated;//0:未激活 1:已激活
    private Integer isTradingArea;//是否是商圈(0:不是 1:是)
    private Integer isHot;//(0:不是 1：是)
    private Integer level;//区域级别(0:国家级 1:省级 2:市级 3:县/区)
    private Integer isChina;//1:国内 2：国外
    private String pinyin;
    private Date creationDate;//创建时间
    private Integer createdBy;//创建人
    private Date modifyDate;//修改日期
    private Integer modifiedBy;//修改日期

    @Override
    public String toString() {
        return "ItripAeraDic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", areaNo='" + areaNo + '\'' +
                ", parent=" + parent +
                ", isActivated=" + isActivated +
                ", isTradingArea=" + isTradingArea +
                ", isHot=" + isHot +
                ", level=" + level +
                ", isChina=" + isChina +
                ", pinyin='" + pinyin + '\'' +
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getIsActivated() {
        return isActivated;
    }

    public void setIsActivated(Integer isActivated) {
        this.isActivated = isActivated;
    }

    public Integer getIsTradingArea() {
        return isTradingArea;
    }

    public void setIsTradingArea(Integer isTradingArea) {
        this.isTradingArea = isTradingArea;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getIsChina() {
        return isChina;
    }

    public void setIsChina(Integer isChina) {
        this.isChina = isChina;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
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
