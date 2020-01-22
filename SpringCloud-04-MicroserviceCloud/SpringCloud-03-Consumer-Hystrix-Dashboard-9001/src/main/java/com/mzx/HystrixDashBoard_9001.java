package com.mzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ZhenXinMa
 * @date 2020/1/21 16:21
 */
@SpringBootApplication
@EnableHystrixDashboard    // 开启SpringCloud实时监控
public class HystrixDashBoard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoard_9001.class,args);
    }
}
