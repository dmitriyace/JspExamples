<%@ page import="java.util.ArrayList" %>
<%@ page import="ru.dmitriyace.models.User" %><%--
  Created by IntelliJ IDEA.
  User: chist
  Date: 21.10.2018
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up!</title>
</head>
<body>
<%
    ArrayList<User> users = (ArrayList) request.getAttribute("usersFromServer");
%>
<table>
    <tr>
        <th>Если рейвы спорт</th>
        <th>то лиза</th>
    </tr>
    <%
        for (User user : users) {
    %>
    <tr>
        <td>
            <%=user.getName() %>
        </td>
        <td>
            <%=user.getBirthDate() %>
        </td>

    </tr>
    <%
        }
    %>
</table>
</body>
</html>
