package com.cmy.bean;

import org.springframework.stereotype.Component;

@Component
public class yonghubiao {
    /**
     * 主键:系统ID
     */
    public String sysID;
    public String brID;
    public String changed;
    public String parentID;
    public String updateTime;
    public String issuper;
    public String password;
    public String quanyuan;
    public String userId;
    public String username;

    public String getSysID() {
        return sysID;
    }

    public void setSysID(String sysID) {
        this.sysID = sysID;
    }

    public String getBrID() {
        return brID;
    }

    public void setBrID(String brID) {
        this.brID = brID;
    }

    public String getChanged() {
        return changed;
    }

    public void setChanged(String changed) {
        this.changed = changed;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getIssuper() {
        return issuper;
    }

    public void setIssuper(String issuper) {
        this.issuper = issuper;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQuanyuan() {
        return quanyuan;
    }

    public void setQuanyuan(String quanyuan) {
        this.quanyuan = quanyuan;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
