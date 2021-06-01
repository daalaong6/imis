package com.iotch.dao;


import com.iotch.dao.sqlprovider.UserInfoProvider;
import com.iotch.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface UserInfoDao {
    int insert(UserInfo userInfo);
    int delete(UserInfo userInfo);
    int update(UserInfo userInfo);
    UserInfo selectById(@Param("userCode") String userCode);//@Param("userCode")与mapper中sql与的命名参数一致#{userCode}
    List<UserInfo> selectAll();
    List<UserInfo> selectMatchEntity(UserInfo userInfo);

    /*-----------------对于特殊业务新增查询可以使用注解形式快速生成DAO-------------------*/
    @Select("SELECT * FROM tt_user_info WHERE User_Name = #{userName}")
    List<UserInfo> selectByUserName(@Param("userName") String userName);

    @SelectProvider(type = UserInfoProvider.class,method = "selectByUserCode")
    List<UserInfo> selectByUserCode(@Param("userCode") String userCode);

}
