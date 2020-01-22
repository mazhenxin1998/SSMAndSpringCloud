package com.mzx.controller;

import com.mzx.entity.Dept;
import com.mzx.server.DeptServerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ZhenXinMa
 * @date 2020/1/19 21:15
 */
@RestController
public class FeignController {

    @Autowired
    private DeptServerFeign server;

    @RequestMapping(value = "/consumer/dept/lists")
    public List<Dept> list(){
        return this.server.findAll();
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") int id){
        return this.server.get(id);
    }

}
