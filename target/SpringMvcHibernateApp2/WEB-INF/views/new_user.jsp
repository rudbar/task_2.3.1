<%--
  Created by IntelliJ IDEA.
  User: yan
  Date: 06.12.2021
  Time: 1:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Новый пользователь</title>
</head>
<body>
<div>
    <h2>Новый пользователь</h2>
    <form:form action="save" method="post" modelAttribute="user">
        <table border="0" cellpadding="5">
            <tr>
                <td>Имя:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Фамилия:</td>
                <td><form:input path="surname" /></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Сохранить"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>
