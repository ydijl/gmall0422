package com.atguigu.gmall0422.service;

import com.atguigu.gmall0422.bean.UserAddress;
import com.atguigu.gmall0422.bean.UserInfo;

import java.util.List;


public interface UserService {
    //获取所有的用户信息
    List<UserInfo> getAll();
    //按条件查询用户
    List<UserInfo> getUserByCondition(UserInfo userInfo);
    //模糊查询
    List<UserInfo> getUserByLoginName(String loginName);
    //根据主键修改
    void updateUser(UserInfo userInfo);
    //根据name修改
    void updateUserByName(UserInfo userInfo);
    //添加数据
    void addUser(UserInfo userInfo);
    //删除数据
    void deleteUser(UserInfo userInfo);
    //获取地址
    List<UserAddress> getUserAddressByUserId(String userId);
}

