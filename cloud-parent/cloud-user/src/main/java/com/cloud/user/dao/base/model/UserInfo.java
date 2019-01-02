package com.cloud.user.dao.base.model;

public class UserInfo {
    private Integer id;

    private Integer userId;

    private String name;

    private String idCard;

    private String cardFrontImg;

    private String cardHandImg;

    private Byte gesture;

    private Byte status;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getCardFrontImg() {
        return cardFrontImg;
    }

    public void setCardFrontImg(String cardFrontImg) {
        this.cardFrontImg = cardFrontImg == null ? null : cardFrontImg.trim();
    }

    public String getCardHandImg() {
        return cardHandImg;
    }

    public void setCardHandImg(String cardHandImg) {
        this.cardHandImg = cardHandImg == null ? null : cardHandImg.trim();
    }

    public Byte getGesture() {
        return gesture;
    }

    public void setGesture(Byte gesture) {
        this.gesture = gesture;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}