package com.projectDemo.dao;

import com.projectDemo.pojo.PassPort;

/**
 * @author Cjl
 * @date 2021/7/2 21:09
 */
public interface PassPortMapper {
    PassPort findPassportWithPassengerById(int id);
}
