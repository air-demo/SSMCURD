package com.air.crud.test;

import com.air.crud.bean.Department;
import com.air.crud.bean.Employee;
import com.air.crud.dao.DepartmentMapper;

import com.air.crud.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * @author air
 * @create 2020-09-23-23:26
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=("classpath:applicationContext.xml"))
public class MapperTest {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    SqlSession sqlSession;

    /**
     * 测试department
     */
    @Test
    public void testCRUD(){
        //1.创建springIOC容器
        //ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容器中获取mapper
        //ioc.getBean(DepartmentMapper.class);
        System.out.println(departmentMapper);
        //1.插入几个部门


       // departmentMapper.insertSelective(new Department(null,"开发部"));
        departmentMapper.insertSelective(new Department(null,"游戏部"));
        //2.插入几个员工
        /*employeeMapper.insertSelective(new Employee(null,"jerry","M","Jerry@qq.com",1));
        //3.批量插入多个员工
        EmployeeMapper mapper=sqlSession.getMapper(EmployeeMapper.class);
        for(int i=0;i<1000;i++){
            String uid=UUID.randomUUID().toString().substring(0,5)+i;
            mapper.insertSelective(new Employee(null,uid,"M",uid+"@air.com",1));
        }*/
    }
}
