package com.example.demo.model;

public class AmUser {
    private String userId;

    private String userOpenId;

    private String userMobile;

    private String userNo;

    private String userName;

    private String userPhoto;

    private Byte userTypeId;

    private Byte userFocusStateId;

    private String accountId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserOpenId() {
        return userOpenId;
    }

    public void setUserOpenId(String userOpenId) {
        this.userOpenId = userOpenId == null ? null : userOpenId.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    public Byte getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Byte userTypeId) {
        this.userTypeId = userTypeId;
    }

    public Byte getUserFocusStateId() {
        return userFocusStateId;
    }

    public void setUserFocusStateId(Byte userFocusStateId) {
        this.userFocusStateId = userFocusStateId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }
}