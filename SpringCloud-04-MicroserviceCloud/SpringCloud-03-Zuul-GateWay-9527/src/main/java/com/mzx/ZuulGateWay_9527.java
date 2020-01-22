package com.mzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author ZhenXinMa
 * @date 2020/1/21 17:34
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient   // 将当前服务注册到Eureka注册中心中
public class ZuulGateWay_9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGateWay_9527.class,args);
    }
}
