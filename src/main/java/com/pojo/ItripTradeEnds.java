package com.pojo;

/**
 * Created by dell on 2018/1/2.
 * FieldTypeComment
 idbigint(11) NOT NULL订单ID
 orderNovarchar(255) NOT NULL订单编号(注意非支付宝交易编号tradeNo)
 flagtinyint(1) NULL标识字段(默认0：未处理；1：处理中)
 */
public class ItripTradeEnds {
    private Integer id;
    private String orderNo;//订单编号(注意非支付宝交易编号tradeNo)
    private Integer flag;//标识字段(默认0：未处理；1：处理中)
    @Override
    public String toString() {
        return "ItripTradeEnds{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", flag=" + flag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }


}
