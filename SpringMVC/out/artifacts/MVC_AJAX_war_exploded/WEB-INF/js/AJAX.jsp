<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2020/07/03
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AJAX</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.js"></script>
    <script>
        function a() {
            $.post({
                url:"${pageContext.request.contextPath}/Ajax01",
                data:"aaa",
                success:function ss() {
                    alert("dadadada")
                    alert("${pageContext.request.contextPath}")
                }
            })
        }
    </script>
</head>
<body>
<input type="text" name="user" onblur="a()">
</body>
</html>
