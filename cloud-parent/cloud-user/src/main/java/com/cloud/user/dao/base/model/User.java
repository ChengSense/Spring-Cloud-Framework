package com.cloud.user.dao.base.model;

public class User {
    private Integer userId;

    private String userName;

    private String password;

    private String payPassword;

    private String name;

    private String phone;

    private String qq;

    private String idCard;

    private Byte certiStatus;

    private Byte hbStatus;

    private Byte cardStatus;

    private Long createTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Byte getCertiStatus() {
        return certiStatus;
    }

    public void setCertiStatus(Byte certiStatus) {
        this.certiStatus = certiStatus;
    }

    public Byte getHbStatus() {
        return hbStatus;
    }

    public void setHbStatus(Byte hbStatus) {
        this.hbStatus = hbStatus;
    }

    public Byte getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(Byte cardStatus) {
        this.cardStatus = cardStatus;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}