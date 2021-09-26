package com.projectDemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Cjl
 * @date 2021/7/3 11:28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {
    private int id;
    private String subName;
    private int grade;
}
