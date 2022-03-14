<%--
  Created by IntelliJ IDEA.
  User: xuwenjie
  Date: 2022/3/7
  Time: 8:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%
    String basePath = request.getScheme() + "://"  + request.getServerName() + ":"
            + request.getServerPort() + request.getContextPath() + "/";
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>功能入口</title>
    <base href="<%=basePath%>">
</head>
<body>
    <div align="center">
        <p>ssm整合的例子</p>
        <img src="static/images/p2.JPG" alt="加载出错了"/>
        <table>
            <tr>
                <th><a href="addStudent.jsp">注册学生</a></th>
            </tr>
            <tr>
                <td><a href="showStudents.jsp"> 浏览学生</a></td>
            </tr>
        </table>
    </div>
</body>
</html>
