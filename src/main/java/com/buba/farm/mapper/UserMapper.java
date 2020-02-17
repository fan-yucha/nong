package com.buba.farm.mapper;


import com.buba.farm.pojo.SecUser;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author Chang
 * @Date 2020/2/17 15:29
 * @Version 1.0
 **/
public interface UserMapper {

    /*用户登录*/
    SecUser login(String tel);
}
