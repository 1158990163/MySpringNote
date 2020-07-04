<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2020/07/04
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/download" method="post" enctype="multipart/form-data">
    用户名：<input type="text" name="name"/>
    照片文件：<input type="file" name="image"/>
    <input type="submit" value="提交"/>
  </form>
  </body>
</html>
