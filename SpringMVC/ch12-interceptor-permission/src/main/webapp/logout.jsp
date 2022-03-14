<%--
  Created by IntelliJ IDEA.
  User: xuwenjie
  Date: 2022/3/10
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>退出系统</title>
</head>
<body>
    <p>
        退出系统，从Session中删除数据
    </p>
    <%
        session.removeAttribute("name");
    %>
</body>
</html>
