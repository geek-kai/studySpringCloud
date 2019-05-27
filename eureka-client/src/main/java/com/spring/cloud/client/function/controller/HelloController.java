package com.spring.cloud.client.function.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 郭凯
 * @date 2019/5/27 17:20
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }

}
