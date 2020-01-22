package com.mzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author ZhenXinMa
 * @date 2020/1/21 15:16
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker  // 要配置熔断机制的服务必须添加的注解
public class DeptProviderHystrix_8002 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix_8002.class,args);
    }
}
