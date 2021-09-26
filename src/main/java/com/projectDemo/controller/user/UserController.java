package com.projectDemo.controller.user;

import com.projectDemo.controller.BaseServlet;
import com.projectDemo.dao.IUserDao;
import com.projectDemo.pojo.User;
import com.projectDemo.utils.MyBatisUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Cjl
 * @date 2021/7/2 16:42
 */
@WebServlet("/users")
public class UserController  extends BaseServlet {
    public String searchAll(HttpServletRequest request, HttpServletResponse response){

        IUserDao userDao = MyBatisUtils.getMapper(IUserDao.class);
        List users = userDao.findAll();


        request.setAttribute("users",users);
        MyBatisUtils.closeSession();
        return "forward:/showAll.jsp";
    }

    public String update(HttpServletRequest request, HttpServletResponse response){

        IUserDao userDao = MyBatisUtils.getMapper(IUserDao.class);

        User user= new User("","张三","7901em",100,1,null,null);

        int update = userDao.update(user);
        System.out.println("update===="+update);
        MyBatisUtils.commit();
        return "forward:/users?method=searchAll";
    }
}
