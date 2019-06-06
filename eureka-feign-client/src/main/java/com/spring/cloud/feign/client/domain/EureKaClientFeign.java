package com.spring.cloud.feign.client.domain;

import feign.Headers;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author guokai
 */
@FeignClient(value = "service-zuul")
public interface EureKaClientFeign {
    @RequestMapping(value = "hi/hello", method = RequestMethod.POST, headers = {"content-type=application/json;charset=UTF-8"})
    String sayHello(Map<String, Object> name);

}
