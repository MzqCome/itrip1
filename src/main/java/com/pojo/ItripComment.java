package com.pojo;

import java.util.Date;

/**
 * Created by Administrator on 2018/1/2 0002.
 */
public class ItripComment {
    private Integer id;//主键
    private Integer hotelId;//如果产品是酒店的话 改字段保存酒店id
    private Integer productId;//商品id
    private Integer orderId;//订单id
    private Integer productType;//商品类型(0:旅游产品 1:酒店产品 2:机票产品)
    private String content;//评论内容
    private Integer userId;//用户编号
    private Integer isHavingImg;//是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
    private Integer positionScore;//位置评分
    private Integer facilitiesScore;//设施评分
    private Integer serviceScore;//服务评分
    private Integer hygieneScore;//卫生评分
    private Integer score;//综合评分
    private Integer tripMode;//出游类型
    private Integer isok;//是否满意（0：有待改善 1：值得推荐）
    private Date creationDate;
    private Integer createdBy;
    private Date modifyDate;
    private Integer modifiedBy;

    @Override
    public String toString() {
        return "ItripComment{" +
                "id=" + id +
                ", hotelId=" + hotelId +
                ", productId=" + productId +
                ", orderId=" + orderId +
                ", productType=" + productType +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                ", isHavingImg=" + isHavingImg +
                ", positionScore=" + positionScore +
                ", facilitiesScore=" + facilitiesScore +
                ", serviceScore=" + serviceScore +
                ", hygieneScore=" + hygieneScore +
                ", score=" + score +
                ", tripMode=" + tripMode +
                ", isok=" + isok +
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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIsHavingImg() {
        return isHavingImg;
    }

    public void setIsHavingImg(Integer isHavingImg) {
        this.isHavingImg = isHavingImg;
    }

    public Integer getPositionScore() {
        return positionScore;
    }

    public void setPositionScore(Integer positionScore) {
        this.positionScore = positionScore;
    }

    public Integer getFacilitiesScore() {
        return facilitiesScore;
    }

    public void setFacilitiesScore(Integer facilitiesScore) {
        this.facilitiesScore = facilitiesScore;
    }

    public Integer getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(Integer serviceScore) {
        this.serviceScore = serviceScore;
    }

    public Integer getHygieneScore() {
        return hygieneScore;
    }

    public void setHygieneScore(Integer hygieneScore) {
        this.hygieneScore = hygieneScore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getTripMode() {
        return tripMode;
    }

    public void setTripMode(Integer tripMode) {
        this.tripMode = tripMode;
    }

    public Integer getIsok() {
        return isok;
    }

    public void setIsok(Integer isok) {
        this.isok = isok;
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
