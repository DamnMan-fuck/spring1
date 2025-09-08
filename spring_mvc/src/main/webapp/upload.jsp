<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2025/9/8
  Time: 下午1:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/quick21" method="post" enctype="multipart/form-data">
        <input type="text" name="username"><br>
        <input type="file" name="uploadFile"><br>
        <input type="submit" name="提交"><br>
    </form>
</body>
</html>
