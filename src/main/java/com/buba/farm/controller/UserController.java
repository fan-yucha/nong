package com.buba.farm.controller;

import com.buba.farm.pojo.SecUser;
import com.buba.farm.service.UserService;
import jdk.nashorn.internal.runtime.Undefined;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController 用户
 * @Description TODO
 * @Author Chang
 * @Date 2020/2/17 15:29
 * @Version 1.0
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /*用户登录*/
    @RequestMapping("/user/login")
    public SecUser login (String tel,String password){
        SecUser user=userService.login(tel,password);
        System.out.println(user);
        return user;
    }
    /*获取验证码*/
    @RequestMapping("/user/getCode")
    public Integer getCode (String phone){
        SecUser user=userService.login(phone);
        if(user!=null){
            Integer code=(int)((Math.random()*9+1)*1000);
            System.out.println(code);
            return code;
        }
            return null;
    }

}
