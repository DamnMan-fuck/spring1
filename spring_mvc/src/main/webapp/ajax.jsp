<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2025/9/7
  Time: 上午10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.7.1.min.js"></script>}
    <script>
        var userlist=new Array();
        userlist.push({username:"zhangsan",age:18});
        userlist.push({username:"lisi",age:18});

        $.ajax({
            type:"post",
            url:"${pageContext.request.contextPath}/user/quick14",
            data:JSON.stringify(userlist),
            contentType:"application/json;charset=utf-8",
        })
    </script>

</head>
<body>

</body>
</html>
