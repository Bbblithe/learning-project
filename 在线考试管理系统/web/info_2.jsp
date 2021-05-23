<%--
  Created by IntelliJ IDEA.
  User: xuwenjie
  Date: 2021/4/11
  Time: 4:01 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <%
            int result = (int)request.getAttribute("result");
            if(result == 1){
        %>
        <font style="color:red;font-size:45px;">删除成功</font>
        <%
            }else{
        %>
        <font style="color:red;font-size:45px;">删除失败</font>
        <%
            }
        %>
    </center>


</body>
</html>
