package com.spring.cloud.feign.client.domain;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author guokai
 */
@FeignClient(value = "service-zuul")
public interface EureKaClientFeign {
    @GetMapping("hi/hello")
    String sayHello(@RequestParam("name") String name);

}
