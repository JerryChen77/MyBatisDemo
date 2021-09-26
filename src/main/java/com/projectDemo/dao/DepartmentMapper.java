package com.projectDemo.dao;

import com.projectDemo.pojo.Department;

/**
 * @author Cjl
 * @date 2021/7/3 10:12
 */
public interface DepartmentMapper {

    Department findDeptWithEmpById(int id);



}
