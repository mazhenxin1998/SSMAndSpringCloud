package com.mzx.config;

import com.netflix.loadbalancer.IRule;
import ribbonconfig.MyRule_MZX;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZhenXinMa
 * @date 2020/1/15 16:40
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced  //LoadBalanced 只需要该注解即可实现负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule getIRule(){
//        // 随机负载均衡算法
////        return new RandomRule();
//        return new MyRule_MZX();
//    }


}
