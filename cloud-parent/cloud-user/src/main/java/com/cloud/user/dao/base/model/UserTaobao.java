package com.cloud.user.dao.base.model;

public class UserTaobao {
    private Integer id;

    private Integer userId;

    private Boolean sex;

    private String name;

    private Integer creditLv;

    private String tbAccount;

    private Integer tbPopularity;

    private String deliveryPhone;

    private String deliveryName;

    private String province;

    private String city;

    private String distric;

    private String deliveryAddress;

    private String orderTail;

    private Integer status;

    private String myTbImg;

    private String evalImg;

    private String alipayAuthImg;

    private String shoppingTag;

    private String hbImg;

    private Integer hbStatus;

    private Long createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCreditLv() {
        return creditLv;
    }

    public void setCreditLv(Integer creditLv) {
        this.creditLv = creditLv;
    }

    public String getTbAccount() {
        return tbAccount;
    }

    public void setTbAccount(String tbAccount) {
        this.tbAccount = tbAccount == null ? null : tbAccount.trim();
    }

    public Integer getTbPopularity() {
        return tbPopularity;
    }

    public void setTbPopularity(Integer tbPopularity) {
        this.tbPopularity = tbPopularity;
    }

    public String getDeliveryPhone() {
        return deliveryPhone;
    }

    public void setDeliveryPhone(String deliveryPhone) {
        this.deliveryPhone = deliveryPhone == null ? null : deliveryPhone.trim();
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName == null ? null : deliveryName.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistric() {
        return distric;
    }

    public void setDistric(String distric) {
        this.distric = distric == null ? null : distric.trim();
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress == null ? null : deliveryAddress.trim();
    }

    public String getOrderTail() {
        return orderTail;
    }

    public void setOrderTail(String orderTail) {
        this.orderTail = orderTail == null ? null : orderTail.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMyTbImg() {
        return myTbImg;
    }

    public void setMyTbImg(String myTbImg) {
        this.myTbImg = myTbImg == null ? null : myTbImg.trim();
    }

    public String getEvalImg() {
        return evalImg;
    }

    public void setEvalImg(String evalImg) {
        this.evalImg = evalImg == null ? null : evalImg.trim();
    }

    public String getAlipayAuthImg() {
        return alipayAuthImg;
    }

    public void setAlipayAuthImg(String alipayAuthImg) {
        this.alipayAuthImg = alipayAuthImg == null ? null : alipayAuthImg.trim();
    }

    public String getShoppingTag() {
        return shoppingTag;
    }

    public void setShoppingTag(String shoppingTag) {
        this.shoppingTag = shoppingTag == null ? null : shoppingTag.trim();
    }

    public String getHbImg() {
        return hbImg;
    }

    public void setHbImg(String hbImg) {
        this.hbImg = hbImg == null ? null : hbImg.trim();
    }

    public Integer getHbStatus() {
        return hbStatus;
    }

    public void setHbStatus(Integer hbStatus) {
        this.hbStatus = hbStatus;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}