<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2025/9/5
  Time: 下午9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick13" method="post">
    <%--表明是第一个user对象的username和age--%>
    <input type="text" name="userlist[0].username"><br/>
    <input type="text" name="userlist[0].age"><br/>
    <input type="text" name="userlist[1].username"><br/>
    <input type="text" name="userlist[1].age"><br/>
    <input type="submit" value="提交"><br/>
</form>
</body>
</html>
