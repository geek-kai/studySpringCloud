package com.guokai.study.cloud.zuul;

import com.netflix.zuul.ZuulFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Component;

/**
 * @author geekkai
 * @create 2019/6/5
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class EurekaZuulClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulClientApplication.class);
    }
    @Component
    private class  MyFilter extends ZuulFilter{

        @Override
        public String filterType() {
            return "pre";
        }

        @Override
        public int filterOrder() {
            return 3;
        }

        @Override
        public boolean shouldFilter() {
            return true;
        }

        @Override
        public Object run() {
            System.out.println("处理");
            return null;
        }
    }
    @Component
    private class  MyFilter2 extends ZuulFilter{

        @Override
        public String filterType() {
            return "post";
        }

        @Override
        public int filterOrder() {
            return 0;
        }

        @Override
        public boolean shouldFilter() {
            return true;
        }

        @Override
        public Object run() {
            System.out.println("处理");
            return null;
        }
    }
}
