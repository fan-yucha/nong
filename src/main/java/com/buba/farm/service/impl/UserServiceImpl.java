package com.buba.farm.service.impl;

import com.buba.farm.mapper.UserMapper;
import com.buba.farm.pojo.SecUser;
import com.buba.farm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author Chang
 * @Date 2020/2/17 15:30
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    /*用户登录*/
    public SecUser login(String tel, String password) {
        SecUser user=userMapper.login(tel);
        if(password.equals(user.getPassword())){
            return user;
        }
        return null;
    }

    @Override
    public SecUser login(String tel) {
        SecUser user=userMapper.login(tel);
        return user;
    }
}
