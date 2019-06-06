package com.spring.cloud.feign.client.function;

import com.spring.cloud.feign.client.domain.EureKaClientFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
        Map<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "as");
        return eureKaClientFeign.sayHello(map);
    }


}
