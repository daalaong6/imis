package com.iotch.entity;

import java.sql.Timestamp;

public class UserInfo {
    private String userCode;//用户编码
    private String userPassword;//用户密码
    private String userName;//用户名
    private String userID;//用户ID
    private String userSex;//性别
    private Timestamp userBirthDate;//生日
    private Timestamp userRegDate;//注册日期
    private String userAddr;//地址
    private String userPostcode;//邮编
    private String userTel;//电话号码
    private String userPhone;//手机号码
    private String userCompany;//所属公司
    private String userStatus;//用户状态(0:待审核,1:审核通过,2:禁用)
    private String userNote;//用户备注
    private String roleAssignMenu;//菜单(权限)是否通过角色分配:0不是,1是;默认值是1
    private RoleInfo userRole;//角色编码
    private RegionInfo userRegion;//地区编码

    public UserInfo() {
    }

    public UserInfo(String userCode, String userPassword, String userName, String userID, String userSex, Timestamp userBirthDate, Timestamp userRegDate, String userAddr, String userPostcode, String userTel, String userPhone, String userCompany, String userStatus, String userNote, String roleAssignMenu, RoleInfo userRole, RegionInfo userRegion) {
        this.userCode = userCode;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userID = userID;
        this.userSex = userSex;
        this.userBirthDate = userBirthDate;
        this.userRegDate = userRegDate;
        this.userAddr = userAddr;
        this.userPostcode = userPostcode;
        this.userTel = userTel;
        this.userPhone = userPhone;
        this.userCompany = userCompany;
        this.userStatus = userStatus;
        this.userNote = userNote;
        this.roleAssignMenu = roleAssignMenu;
        this.userRole = userRole;
        this.userRegion = userRegion;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userCode='" + userCode + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", userID='" + userID + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userBirthDate=" + userBirthDate +
                ", userRegDate=" + userRegDate +
                ", userAddr='" + userAddr + '\'' +
                ", userPostcode='" + userPostcode + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userCompany='" + userCompany + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", userNote='" + userNote + '\'' +
                ", roleAssignMenu='" + roleAssignMenu + '\'' +
                ", userRole=" + userRole +
                ", userRegion=" + userRegion +
                '}';
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Timestamp getUserBirthDate() {
        return userBirthDate;
    }

    public void setUserBirthDate(Timestamp userBirthDate) {
        this.userBirthDate = userBirthDate;
    }

    public Timestamp getUserRegDate() {
        return userRegDate;
    }

    public void setUserRegDate(Timestamp userRegDate) {
        this.userRegDate = userRegDate;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public String getUserPostcode() {
        return userPostcode;
    }

    public void setUserPostcode(String userPostcode) {
        this.userPostcode = userPostcode;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }

    public String getRoleAssignMenu() {
        return roleAssignMenu;
    }

    public void setRoleAssignMenu(String roleAssignMenu) {
        this.roleAssignMenu = roleAssignMenu;
    }

    public RoleInfo getUserRole() {
        return userRole;
    }

    public void setUserRole(RoleInfo userRole) {
        this.userRole = userRole;
    }

    public RegionInfo getUserRegion() {
        return userRegion;
    }

    public void setUserRegion(RegionInfo userRegion) {
        this.userRegion = userRegion;
    }
}
