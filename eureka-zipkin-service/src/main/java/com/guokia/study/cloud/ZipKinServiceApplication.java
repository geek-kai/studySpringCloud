package com.guokia.study.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * @Author: 菠萝
 * @Description:
 * @Date: Created in 2019-06-06
 * @Modified By:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipKinServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipKinServiceApplication.class);
    }
}
