package com.example.demo.controller;

import com.example.demo.constants.ResponseData;
import com.example.demo.model.entity.User;
import com.example.demo.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijn
 * @version 1.0
 * @date 2019/9/16 10:46
 */
@RestController
@RequestMapping("gift")
public class GiftController {

    private final UserService userService;

    public GiftController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("main")
    ResponseData gift() {
        System.out.println("进入了");
        User user = userService.getUserByNamePassword("zhangsan", "e10adc3949ba59abbe56e057f20f883e");
        return ResponseData.success(user);
    }
}
