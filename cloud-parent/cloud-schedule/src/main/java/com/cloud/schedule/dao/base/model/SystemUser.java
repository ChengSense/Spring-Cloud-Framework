package com.cloud.schedule.dao.base.model;

import java.util.Date;

public class SystemUser {
    private Integer systemId;

    private String phone;

    private String name;

    private String userName;

    private String email;

    private Integer ownedStores;

    private Integer ownedTeam;

    private String password;

    private Integer isStar;

    private Integer isDelete;

    private Date createTime;

    private Date lastChangeTime;

    private Integer careteUser;

    private Integer lastChangeUser;

    private Integer storehouseId;

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getOwnedStores() {
        return ownedStores;
    }

    public void setOwnedStores(Integer ownedStores) {
        this.ownedStores = ownedStores;
    }

    public Integer getOwnedTeam() {
        return ownedTeam;
    }

    public void setOwnedTeam(Integer ownedTeam) {
        this.ownedTeam = ownedTeam;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getIsStar() {
        return isStar;
    }

    public void setIsStar(Integer isStar) {
        this.isStar = isStar;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastChangeTime() {
        return lastChangeTime;
    }

    public void setLastChangeTime(Date lastChangeTime) {
        this.lastChangeTime = lastChangeTime;
    }

    public Integer getCareteUser() {
        return careteUser;
    }

    public void setCareteUser(Integer careteUser) {
        this.careteUser = careteUser;
    }

    public Integer getLastChangeUser() {
        return lastChangeUser;
    }

    public void setLastChangeUser(Integer lastChangeUser) {
        this.lastChangeUser = lastChangeUser;
    }

    public Integer getStorehouseId() {
        return storehouseId;
    }

    public void setStorehouseId(Integer storehouseId) {
        this.storehouseId = storehouseId;
    }
}