<%--
  Created by IntelliJ IDEA.
  User: chist
  Date: 23.10.2018
  Time: 23:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div style="width: 400px;">
    <form method="post" >
        <label for="name" action="/login">User name
            <input type="text" id="name" name="name">
        </label>
        <label for="password">password
            <input type="password" id="password" name="password">
        </label>

        <input type="submit" value="login">

    </form>
</div>
</body>
</html>
