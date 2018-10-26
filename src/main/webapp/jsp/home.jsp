<%--
  Created by IntelliJ IDEA.
  User: chist
  Date: 22.10.2018
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Coockie</title>
</head>
<body>
<h2 style="color: ${cookie.colorCookName.value}">Цвет</h2>
<div>
    <form method="post" action="/home">
        <label for="color">

            <select id="color" name="color">
                <option value="red">r</option>
                <option value="green">g</option>
                <option value="blue">b</option>
            </select>
        </label>
        <input type="submit" value="send color">
    </form>
</div>

</body>
</html>
