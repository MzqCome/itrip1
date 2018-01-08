package com.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/2 0002.
 */
public class ItripHotel {
    private Integer id;//主键
    private String hotelName;//酒店名称
    private Integer countryId;//所在国家id
    private Integer provinceId;//所在省份id
    private Integer cityId;//所在城市id
    private String address;//酒店所在地址
    private String details;//酒店介绍（保存附文本）
    private String facilities;//酒店设施
    private String hotelPolicy;//酒店政策
    private Integer hotelType;//酒店类型(1:国内酒店 2:国际酒店)
    private Integer hotelLevel;//(1:经济酒店 2:二星级酒店 3:三星级 4:四星酒店 5星酒店)
    private Integer isGrouppurChase;//是否是团购酒店
    private String redundantCityName;//城市名称 冗余字段
    private String redundantProvinceName;//省名称 冗余字段
    private String redundantCountryName;//国家名称 冗余字段
    private Integer redundantHotelStore;//酒店库存（冗余，每天开定时任务的时候更新）
    private Date creationDate;
    private Integer createdBy;
    private Date modifyDate;
    private Integer modifiedBy;

    //图片表 数据
    private String type;//图片类型(0:酒店图片1:房间图片2:评论图片)
    private Integer targetId;//关联id
    private Integer position;//图片s上传顺序位置
    private String imgUrl;//图片地址

    @Override
    public String toString() {
        return "ItripHotel{" +
                "id=" + id +
                ", hotelName='" + hotelName + '\'' +
                ", countryId=" + countryId +
                ", provinceId=" + provinceId +
                ", cityId=" + cityId +
                ", address='" + address + '\'' +
                ", details='" + details + '\'' +
                ", facilities='" + facilities + '\'' +
                ", hotelPolicy='" + hotelPolicy + '\'' +
                ", hotelType=" + hotelType +
                ", hotelLevel=" + hotelLevel +
                ", isGrouppurChase=" + isGrouppurChase +
                ", redundantCityName='" + redundantCityName + '\'' +
                ", redundantProvinceName='" + redundantProvinceName + '\'' +
                ", redundantCountryName='" + redundantCountryName + '\'' +
                ", redundantHotelStore=" + redundantHotelStore +
                ", creationDate=" + creationDate +
                ", createdBy=" + createdBy +
                ", modifyDate=" + modifyDate +
                ", modifiedBy=" + modifiedBy +
                ", type='" + type + '\'' +
                ", targetId=" + targetId +
                ", position=" + position +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getHotelPolicy() {
        return hotelPolicy;
    }

    public void setHotelPolicy(String hotelPolicy) {
        this.hotelPolicy = hotelPolicy;
    }

    public Integer getHotelType() {
        return hotelType;
    }

    public void setHotelType(Integer hotelType) {
        this.hotelType = hotelType;
    }

    public Integer getHotelLevel() {
        return hotelLevel;
    }

    public void setHotelLevel(Integer hotelLevel) {
        this.hotelLevel = hotelLevel;
    }

    public Integer getIsGrouppurChase() {
        return isGrouppurChase;
    }

    public void setIsGrouppurChase(Integer isGrouppurChase) {
        this.isGrouppurChase = isGrouppurChase;
    }

    public String getRedundantCityName() {
        return redundantCityName;
    }

    public void setRedundantCityName(String redundantCityName) {
        this.redundantCityName = redundantCityName;
    }

    public String getRedundantProvinceName() {
        return redundantProvinceName;
    }

    public void setRedundantProvinceName(String redundantProvinceName) {
        this.redundantProvinceName = redundantProvinceName;
    }

    public String getRedundantCountryName() {
        return redundantCountryName;
    }

    public void setRedundantCountryName(String redundantCountryName) {
        this.redundantCountryName = redundantCountryName;
    }

    public Integer getRedundantHotelStore() {
        return redundantHotelStore;
    }

    public void setRedundantHotelStore(Integer redundantHotelStore) {
        this.redundantHotelStore = redundantHotelStore;
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
