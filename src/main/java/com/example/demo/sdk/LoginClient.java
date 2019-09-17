package com.example.demo.sdk;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lijn
 * @version 1.0
 * @date 2019/9/17 10:21
 */
@FeignClient("certification-service")
@RequestMapping("/certification")
public interface LoginClient {

    @GetMapping("/check")
    String login(@RequestParam("username") String username, @RequestParam("password") String password);
}
