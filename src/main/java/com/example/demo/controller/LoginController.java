package com.example.demo.controller;

import com.example.demo.constants.ResponseData;
import com.example.demo.model.param.UserParam;
import com.example.demo.sdk.LoginClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 登陆
 *
 * @author lijn
 * @version 1.0
 * @date 2019/9/16 10:46
 */
@Slf4j
@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    LoginClient loginClient;

    /**
     * @api {get} /login/login 登陆
     * @apiDescription 登录接口
     * @apiName login
     * @apiGroup login
     * @apiVersion 1.0.0
     * @apiParam {String} [username] 用户名
     * @apiParam {String} [password] 密码
     * @apiSampleRequest http://localhost:8080/login/login
     * @apiSuccess (success 5000) {ResponseData}   responseData   登录结果
     */
    @PostMapping("login")
    ResponseData login(@Valid @RequestBody UserParam userParam) {

        String token = loginClient.login(userParam.getUsername(), userParam.getPassword());

        if (StringUtils.isEmpty(token)) {
            return ResponseData.failure();
        }

        return ResponseData.success(token);
    }

}
