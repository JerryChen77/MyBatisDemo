package com.projectDemo.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

@WebServlet(name = "BaseServlet")
public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置字符编码
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        try {
            // 获取请求方法method携带的数据
            String methodName = request.getParameter("method");
            System.out.println("methodName==" + methodName);

            // 使用反射创建请求的Servlet的对象
            Class clazz = this.getClass();

            // 使用反射获取方法
            Method method = clazz.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);

            // 调用方法
            Object obj = method.invoke(this, request, response);

            // 在BaseServlet中执行跳转
            if (obj != null && obj instanceof String){
                String str = (String) obj;
                // 获取跳转的地址
                String url = str.substring(str.indexOf(":") + 1);
                // 执行跳转
                if (str.startsWith("redirect")){
                    // 重定向
                    System.out.println("重定向到："+url);
                    response.sendRedirect(request.getContextPath()+url);
                }else if (str.startsWith("forward")){
                    // 转发
                    System.out.println("转发到："+url);
                    request.getRequestDispatcher(url).forward(request,response);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
