package com.pojo;

import java.util.Date;

/**
 * Created by dell on 2018/1/2.
 * FieldTypeComment
 idbigint(20) NOT NULL
 productTypeint(10) NOT NULL商品类型(0:旅游产品 1:酒店产品 2:机票产品)
 productIdbigint(11) NOT NULL商品id
 storeint(10) NOT NULL商品库存
 creationDatedatetime NOT NULL
 createdBybigint(11) NULL
 modifyDatedatetime NULL
 modifiedBybigint(11) NULL
 */
public class ItripProductStore {
    private Integer id;
    private Integer productType;//商品类型
    private Integer productId;//商品id
    private Integer store;//商品库存
    private Date creationDate;//创建时间
    private Integer createdBy;//创建者
    private Date modifyDate;//修改时间
    private Integer modifiedBy;//修改者

    @Override
    public String toString() {
        return "ItripProductStore{" +
                "id=" + id +
                ", productType=" + productType +
                ", productId=" + productId +
                ", store=" + store +
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

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
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
