package com.mzx.controller;

import com.mzx.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ZhenXinMa
 * @date 2020/1/15 16:54
 */
@RestController
public class ControllerConsumer {

    //private static final String URL_PREFIX = "Http://localhost:8001";
    private static final String URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/lists",method = RequestMethod.GET)
    public List<Dept> lists (){
        return restTemplate.getForObject(URL_PREFIX+"/dept/lists",List.class);
    }

    //测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value="/consumer/dept/discovery")
    public Object discovery()
    {
        return restTemplate.getForObject(URL_PREFIX+"/dept/discovery", Object.class);
    }


}
