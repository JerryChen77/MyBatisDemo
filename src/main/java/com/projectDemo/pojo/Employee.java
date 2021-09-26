package com.projectDemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Cjl
 * @date 2021/7/3 10:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String empName;
    private double salary;
    private int deptId;


}
