package com.projectDemo.dao;

import com.projectDemo.pojo.User;

import java.util.List;

/**
 * @author Cjl
 * @date 2021/7/1 16:59
 */
public interface IUserDao {
   int insert(User user);

   int deleteByUsername(String username);
   int deleteByUid(String uid);

   int update(User user);

   User findByUsername(String name);
   User findByUid(String uid);

   List findAll();

   List<User> findByOrder(User user);

   List<User> findByList(List list);

   List<User> findByOrder2(User user);
}
