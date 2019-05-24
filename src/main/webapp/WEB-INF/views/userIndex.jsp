<%--
  Created by IntelliJ IDEA.
  User: steve
  Date: 2019/5/23 0023
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body style="width: 90%">
<table>
    <thead>
        <tr style="font-style: italic; color: red">
            <td>ID</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>邮箱</td>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.uid}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.email}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
