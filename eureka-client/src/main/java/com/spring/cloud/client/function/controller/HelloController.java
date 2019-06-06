package com.spring.cloud.client.function.controller;

import com.spring.cloud.client.function.param.UserParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 郭凯
 * @date 2019/5/27 17:20
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @PostMapping("hello")
    public String hello(@RequestBody UserParam user) {

        return "hello:" + user.getName() + "port:" + port;
    }

}
