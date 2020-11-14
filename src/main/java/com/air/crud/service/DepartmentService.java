package com.air.crud.service;

import com.air.crud.bean.Department;
import com.air.crud.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author air
 * @create 2020-09-27-14:15
 */
@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> getDepts() {
        List<Department> list=departmentMapper.selectByExample(null);
        return list;
    }
}
