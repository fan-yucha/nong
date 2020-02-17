package com.buba.farm.service;


import com.buba.farm.pojo.SecUser;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author Chang
 * @Date 2020/2/17 15:29
 * @Version 1.0
 **/
public interface UserService {

    /*用户登录*/
    SecUser login(String tel, String password);
}
