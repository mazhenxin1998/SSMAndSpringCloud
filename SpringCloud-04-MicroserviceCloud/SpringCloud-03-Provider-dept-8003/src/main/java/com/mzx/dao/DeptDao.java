package com.mzx.dao;

import com.mzx.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ZhenXinMa
 * @date 2020/1/15 15:41
 */
@Mapper
public interface DeptDao {

     boolean addDept(@Param("dept") Dept dept);

     //Dept findById(Long id);

     List<Dept> findAll();

     Dept get(@Param("id") int id);

}
