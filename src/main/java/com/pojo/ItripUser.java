package com.pojo;

import java.util.Date;

/**
 * Created by dell on 2018/1/2.
 * FieldTypeComment
 idbigint(11) NOT NULL主键
 userCodevarchar(255) NULL若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
 userPasswordvarchar(255) NULL若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
 userTypeint(5) NULL用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
 flatIDbigint(20) NULL平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
 userNamevarchar(255) NOT NULL用户昵称
 weChatvarchar(255) NULL微信号
 QQvarchar(255) NULLqq账号
 weibovarchar(255) NULL微博账号
 baiduvarchar(255) NULL百度账号
 creationDatedatetime NULL
 createdBybigint(11) NULL
 modifyDatedatetime NULL
 modifiedBybigint(11) NULL
 activatedint(1) NULL是否激活,(0 false，1 true,默认是0)
 */
public class ItripUser {
    private Integer id;
    private String userCode;
    private String userPassword;
    private Integer userType;
    private Integer flatId;
    private String userName;
    private String weChat;
    private String QQ;
    private String baidu;
    private Date creationDate;
    private Integer createdBy;
    private Date modifyDate;
    private Integer modifiedBy;
    private Integer activated;

    @Override
    public String toString() {
        return "ItripUser{" +
                "id=" + id +
                ", userCode='" + userCode + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userType=" + userType +
                ", flatId=" + flatId +
                ", userName='" + userName + '\'' +
                ", weChat='" + weChat + '\'' +
                ", QQ='" + QQ + '\'' +
                ", baidu='" + baidu + '\'' +
                ", creationDate=" + creationDate +
                ", createdBy=" + createdBy +
                ", modifyDate=" + modifyDate +
                ", modifiedBy=" + modifiedBy +
                ", activated=" + activated +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getFlatId() {
        return flatId;
    }

    public void setFlatId(Integer flatId) {
        this.flatId = flatId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getBaidu() {
        return baidu;
    }

    public void setBaidu(String baidu) {
        this.baidu = baidu;
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

    public Integer getActivated() {
        return activated;
    }

    public void setActivated(Integer activated) {
        this.activated = activated;
    }
}
