package com.itheima.provider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.exmple.api.entity.User;
import com.exmple.api.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setUsername("没想到吧");
        user.setPassword("123456");
        return user;
    }
}
