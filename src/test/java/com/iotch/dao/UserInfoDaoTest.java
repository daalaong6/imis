package com.iotch.dao;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iotch.BaseTest;

import com.iotch.entity.UserInfo;
import com.iotch.util.MD5Util;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserInfoDaoTest extends BaseTest {
    @Autowired
    private UserInfoDao userInfoDao;

    @Test
    public void selectAllTest(){
        PageHelper.startPage(1,3);
        List<UserInfo> list = userInfoDao.selectAll();
        PageInfo<UserInfo> pageInfo = new PageInfo<UserInfo>(list);
        String jsonString = JSON.toJSONString(pageInfo);
        System.out.println(jsonString);
    }

    @Test
    public  void selectByUserNameTest(){
        List<UserInfo> list = userInfoDao.selectByUserName("高瞻");
        String jsonString = JSON.toJSONString(list);
        System.out.println(jsonString);
    }

    @Test
    public void selectMatchEntityTest(){
        UserInfo loginUser = new UserInfo();
        String pass = MD5Util.string2MD5("123456");
        loginUser.setUserCode("00001");
        loginUser.setUserPassword(pass);
        List<UserInfo> userInfoList = userInfoDao.selectMatchEntity(loginUser);
        String jsonString = JSON.toJSONString(userInfoList);
        System.out.println(jsonString);
    }

    @Test
    public void selectByUserCodeTest(){
        List<UserInfo> list = userInfoDao.selectByUserCode("00001");
        String jsonString = JSON.toJSONString(list);
        System.out.println(jsonString);
    }
}
