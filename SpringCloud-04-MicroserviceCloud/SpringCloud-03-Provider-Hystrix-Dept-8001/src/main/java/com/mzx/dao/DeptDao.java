package com.mzx.dao;

import com.mzx.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ZhenXinMa
 * @date 2020/1/21 12:53
 */
@Mapper
public interface DeptDao {
    boolean addDept(@Param("dept") Dept dept);

    //Dept findById(Long id);

    List<Dept> findAll();

    Dept getById(@Param("id") int id);

}
