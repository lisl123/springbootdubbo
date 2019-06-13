package com.itheima.comsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.exmple.api.entity.User;
import com.exmple.api.service.UserService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/getUser")
    public User getUserList() {
        return userService.getUser();
    }
}
