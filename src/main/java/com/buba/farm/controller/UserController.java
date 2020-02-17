package com.buba.farm.controller;

import com.buba.farm.pojo.SecUser;
import com.buba.farm.service.UserService;
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
        return user;
    }

}
