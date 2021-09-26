package com.projectDemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author Cjl
 * @date 2021/7/2 21:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PassPort {
    private int id;
    private String nationality;
    private Date expire;
    private int passengerId;

    private Passenger passenger;

}
