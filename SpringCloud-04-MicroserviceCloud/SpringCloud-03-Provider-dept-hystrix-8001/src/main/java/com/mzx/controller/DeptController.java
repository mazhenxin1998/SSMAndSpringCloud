package com.mzx.controller;

import com.mzx.entity.Dept;
import com.mzx.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ZhenXinMa
 * @date 2020/1/15 16:11
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Qualifier("discoveryClient")
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "fallBackMethod_Get")
    public Dept get(@PathVariable("id")int id){
        return deptService.get(id);
    }

    @RequestMapping(value = "/dept/lists",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.lists();
    }

    public Dept fallBackMethod_Get(@PathVariable("id") int id){
        Dept dept = new Dept();
        dept.setDname("该ID"+id+"没有对应的信息，HystrixCommand处理")
                .setDeptno(id)
                .setDb_source("No this database Message");
        return dept;
    }

    /**
     *   对外暴露的服务查询
     *   服务发现： 了解即可
     * @return
     */
    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery() {
        //获取当前Eureka中所有的服务
        List<String> list = client.getServices();
        // 打印
        System.out.println("**********" + list);
        // 获取指定服务名称的服务
        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            //   依次输出指定服务名称的信息 : 服务ID  服务的知己地址 服务的端口 服务的uri
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }
}
