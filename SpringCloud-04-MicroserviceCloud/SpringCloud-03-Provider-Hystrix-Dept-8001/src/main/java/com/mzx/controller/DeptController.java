package com.mzx.controller;

import com.mzx.entity.Dept;
import com.mzx.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhenXinMa
 * @date 2020/1/21 12:59
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") int id){
        Dept dept = deptService.get(id);
        if(dept == null){
            // 模拟服务出错 体现Hystrix容错机制
            throw new RuntimeException("null");
        }else{
            return dept;
        }
    }

    public Dept fallBackMethod_Get(@PathVariable("id") int id){
        Dept dept = new Dept();
        dept.setDb_source("This ID"+id+"No DataBaseSource")
                .setDeptno(id)
                .setDname("该ID"+id+"不存在");
        return dept;
    };

}
