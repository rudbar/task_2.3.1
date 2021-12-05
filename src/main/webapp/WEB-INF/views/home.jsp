<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 05.12.2021
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="new">Добавить пользователя</a>

<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Email</th>
        <th>Действие</th>
    </tr>
    <c:forEach items="${listUser}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.surname}</td>
            <td>${user.email}</td>
            <td>
                <a href="/edit?id=${user.id}">Изменить</a>
                &nbsp;&nbsp;&nbsp;
                <a href="/delete?id=${user.id}">Удалить</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
