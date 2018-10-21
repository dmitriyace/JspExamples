<%@ page import="java.util.ArrayList" %>
<%@ page import="ru.dmitriyace.models.User" %><%--
  Created by IntelliJ IDEA.
  User: chist
  Date: 21.10.2018
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<html>
<head>
    <title>Sign Up!</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div style="width: 400px    ;">
    <form method="post" action="/signup">
        <label for="name">User name
            <input type="text" id="name" name="name">
        </label>
        <label for="pass">password
            <input type="password" id="pass" name="pass">
        </label>
        <label for="birthDate">birth date
            <input type="date" id="birthDate" name="birthDate">
        </label>
        <input type="submit" value="sign up">

    </form>
</div>

<%
    ArrayList<User> users = (ArrayList) request.getAttribute("usersFromServer");
%>
<table>
    <tr>
        <th>Имя</th>
        <th>Дата рождения</th>
    </tr>
    <c:forEach items="${usersFromServer}" var="user">
        <tr>
        <td>${user.name}</td>
        <td>${user.birthDate}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
