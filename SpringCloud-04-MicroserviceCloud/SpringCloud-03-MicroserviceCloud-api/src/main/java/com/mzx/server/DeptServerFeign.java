package com.mzx.server;

import com.mzx.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author ZhenXinMa
 * @date 2020/1/19 21:03
 *
 *      Feign 是针对于某个服务来提供负载均衡的 默认是负载机制是轮询
 *
 */
@FeignClient(name = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptServerFallBackFactory.class)
public interface DeptServerFeign {

    @RequestMapping(value = "/dept/lists",method = RequestMethod.GET)
    List<Dept> findAll();

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    Dept get(@PathVariable("id") int id);
}
