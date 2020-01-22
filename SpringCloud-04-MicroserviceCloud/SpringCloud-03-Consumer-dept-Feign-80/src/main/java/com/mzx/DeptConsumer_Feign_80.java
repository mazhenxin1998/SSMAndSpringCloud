package com.mzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author ZhenXinMa
 * @date 2020/1/19 20:50
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.mzx.server"})
public class DeptConsumer_Feign_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_Feign_80.class,args);
    }
}
