<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2020/06/27
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/2/MvcPojo" method="post">
    username:<input type="text" name="username">
    <br><br>
    password:<input type="password" name="password">
    <br><br>
    email:<input type="text" name="email">
    <br><br>
    age:<input type="text" name="age">
    <br><br>
    city:<input type="text" name="address.city">
    <br><br>
    province:<input type="text" name="address.province">
    <br><br>
    <input type="submit" name="Submit">

</form>


<a href="/2/RestTest/1">Test Rest Get</a>

<form action="/2/RestTest" method="post">
    <input type="submit" value="submit">
</form>
<form action="/2/RestTest/1" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="submit">
</form>
<form action="/2/RestTest/1" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="submit">
</form>

</body>
</html>
