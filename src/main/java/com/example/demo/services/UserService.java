package com.example.demo.services;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lijn
 * @version 1.0
 * @date 2019/9/16 14:05
 */
@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    public User getUserByNamePassword(String username, String password) {

        User user = userMapper.getUserByNamePassword(username, password);

        return user;
    }

}
