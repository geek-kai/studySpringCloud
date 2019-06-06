package com.guokai.study.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 菠萝
 * @Description:
 * @Date: Created in 2019-06-06
 * @Modified By:
 */

@RestController
public class UserServiceController {

    @GetMapping("hi")
    public String hello() {
        return "hello";
    }
}
