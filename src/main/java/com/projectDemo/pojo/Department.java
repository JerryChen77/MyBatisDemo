package com.projectDemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Cjl
 * @date 2021/7/3 10:10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private int id;
    private String deptName;
    private List<Employee> employees;
}
