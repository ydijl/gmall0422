package com.atguigu.gmall0422.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall0422.bean.UserAddress;
import com.atguigu.gmall0422.bean.UserInfo;
import com.atguigu.gmall0422.service.UserService;
import com.atguigu.gmall0422.user.mapper.UserAddressMapper;
import com.atguigu.gmall0422.user.mapper.UserInfoMapper;

import org.springframework.beans.factory.annotation.Autowired;

import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class UserInfoServieImpl implements UserService{
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserAddressMapper userAddressMapper;
    @Override
    public List<UserInfo> getAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserInfo> getUserByCondition(UserInfo userInfo) {
        return null;
    }

    @Override
    public List<UserInfo> getUserByLoginName(String loginName) {
        return null;
    }

    @Override
    public void updateUser(UserInfo userInfo) {

    }

    @Override
    public void updateUserByName(UserInfo userInfo) {

    }

    @Override
    public void addUser(UserInfo userInfo) {

    }

    @Override
    public void deleteUser(UserInfo userInfo) {

    }

    /**
     * 获得收获地址
     * @param userId
     * @return
     */
    @Override
    public List<UserAddress> getUserAddressByUserId(String userId) {
        Example example = new Example(UserAddress.class);
        example.createCriteria().andEqualTo("userId",userId);
        return userAddressMapper.selectByExample(example);

    }
}
