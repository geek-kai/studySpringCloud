package com.spring.cloud.feign.client.function;

import com.spring.cloud.feign.client.domain.EureKaClientFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author geekkai
 * @create 2019/5/29
 */
@RestController
public class EurekaController {

    @Resource
    private EureKaClientFeign eureKaClientFeign;

    @GetMapping("hi")
    public String hi() {
        return eureKaClientFeign.sayHello("geekKai");
    }
}
