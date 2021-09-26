package com.projectDemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Cjl
 * @date 2021/7/3 11:26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String stuName;
    private int sex;

    private List<Subject> subjects;
}
