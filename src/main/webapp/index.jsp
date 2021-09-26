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
<form action="${pageContext.request.contextPath}/users" method="get">
    <input type="hidden" name="method" value="searchAll">
    <input type="submit" value="查询所有">
</form>



</body>
</html>
