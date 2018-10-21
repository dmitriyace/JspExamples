<%@ page import="java.util.ArrayList" %>
<%@ page import="ru.dmitriyace.models.Act" %><%--
  Created by IntelliJ IDEA.
  User: chist
  Date: 21.10.2018
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Лиза кмс</title>
</head>
<body>
<%
    ArrayList<Act>acts = (ArrayList) request.getAttribute("actsFromServer");
    for (Act act: acts){
        %>
    <br>Если
<%=act.getCondition()%>
спорт,
<%=act.getName()%>
кмс...
<%
    }
%>

</body>
</html>
