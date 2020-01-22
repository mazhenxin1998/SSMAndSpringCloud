package com.mzx.service;

import com.mzx.entity.Dept;

import java.util.List;

/**
 * @author ZhenXinMa
 * @date 2020/1/15 16:09
 */
public interface DeptService {

    List<Dept> lists();

    Dept get(int id);
}
