package com.mzx;

import ribbonconfig.MyRule_MZX;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author ZhenXinMa
 * @date 2020/1/15 16:52
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyRule_MZX.class)
public class SpringBootApplication_Consumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication_Consumer_80.class,args);
    }
}
