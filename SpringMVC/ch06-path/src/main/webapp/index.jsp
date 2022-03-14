<%--
  Created by IntelliJ IDEA.
  User: xuwenjie
  Date: 2022/3/4
  Time: 6:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://"  + request.getServerName() + ":"
            + request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
</head>
<body>
    <p>第一个springmvc的项目</p>
    <p><a href="user/some.do" >发起user/first.do的get请求</a></p>
    <br>

</body>
</html>
