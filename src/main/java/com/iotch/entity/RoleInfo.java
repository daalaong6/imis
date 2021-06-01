package com.iotch.entity;

public class RoleInfo {
    private String roleCode;//角色编码
    private String roleName;//角色名称
    private String roleNote;//角色备注
    private String roleLevel;//角色等级
    private String superiorLevel;//上级角色等级

    public RoleInfo() {
    }

    public RoleInfo(String roleCode, String roleName, String roleNote, String roleLevel, String superiorLevel) {
        this.roleCode = roleCode;
        this.roleName = roleName;
        this.roleNote = roleNote;
        this.roleLevel = roleLevel;
        this.superiorLevel = superiorLevel;
    }

    @Override
    public String toString() {
        return "RoleInfo{" +
                "roleCode='" + roleCode + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleNote='" + roleNote + '\'' +
                ", roleLevel='" + roleLevel + '\'' +
                ", superiorLevel='" + superiorLevel + '\'' +
                '}';
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleNote() {
        return roleNote;
    }

    public void setRoleNote(String roleNote) {
        this.roleNote = roleNote;
    }

    public String getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(String roleLevel) {
        this.roleLevel = roleLevel;
    }

    public String getSuperiorLevel() {
        return superiorLevel;
    }

    public void setSuperiorLevel(String superiorLevel) {
        this.superiorLevel = superiorLevel;
    }
}
