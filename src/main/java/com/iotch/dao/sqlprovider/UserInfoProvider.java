package com.iotch.dao.sqlprovider;

public class UserInfoProvider {

    public String selectByUserCode(){
        return "SELECT * FROM tt_user_info WHERE User_Code = #{userCode}";
    }
}
