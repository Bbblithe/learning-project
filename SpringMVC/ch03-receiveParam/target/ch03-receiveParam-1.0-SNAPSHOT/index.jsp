<%--
  Created by IntelliJ IDEA.
  User: xuwenjie
  Date: 2022/3/4
  Time: 6:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>提交参数给Controller</p>
    <br>
    <form action="receiveProperty.do" method="post">
        姓名：<input type="text" name="name"><br>
        年龄：<input type="text" name="age">
        <input type="submit" value="提交参数">
    </form>

    <br>
    <!--请求参数名和处理器方法的形参名不一样-->
    <p>请求参数和处理器方法的形参不一样</p>
    <form action="receiveParam.do" method="post">
        姓名：<input type="text" name="rname"><br>
        年龄：<input type="text" name="rage">
        <input type="submit" value="提交参数">
    </form>

    <p>使用java对象接收请求参数</p>
    <form action="receiveObject.do" method="post">
        姓名：<input type="text" name="name"><br>
        年龄：<input type="text" name="age">
        <input type="submit" value="提交参数">
    </form>
</body>
</html>
