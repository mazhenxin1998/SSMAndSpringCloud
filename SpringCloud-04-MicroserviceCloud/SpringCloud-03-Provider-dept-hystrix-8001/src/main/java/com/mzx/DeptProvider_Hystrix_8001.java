package com.mzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZhenXinMa
 * @date 2020/1/15 15:07
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient    // 服务发现注解
//@EnableCircuitBreaker     // 对Hystrix熔断机制的支持
public class DeptProvider_Hystrix_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_Hystrix_8001.class,args);
    }
}
