package com.mzx.service.impl;

import com.mzx.dao.DeptDao;
import com.mzx.entity.Dept;
import com.mzx.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ZhenXinMa
 * @date 2020/1/21 12:55
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public Dept get(int id) {
        return deptDao.getById(id);
    }
}
