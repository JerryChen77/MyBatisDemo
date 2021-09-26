<%--
  Created by IntelliJ IDEA.
  User: 79016
  Date: 2021/7/2
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


    <table border="">
        <tr align="center" valign="middle" id="TableTitle">
            <td>用户ID</td>
            <td>用户名</td>
            <td>密码</td>
            <td>年龄</td>
            <td>性别</td>
            <td>创建时间</td>
            <td>修改时间</td>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr class="TableDetail1" align="center" valign="middle">
                <td>${user.uid}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>${user.age}</td>
                <td>${user.gender}</td>
                <td>${user.createTime}</td>
                <td>${user.updateTime}</td>
            </tr>
        </c:forEach>

    </table>
<form action="users" method="get">
    <input type="hidden" name="method" value="update">
    <input type="submit" value="更新">

</form>

</body>
</html>
