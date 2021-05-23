<%@ page import="com.blithe.entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: xuwenjie
  Date: 2021/4/12
  Time: 9:01 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!--传统写法-->
<%
    Student stu = (Student)request.getAttribute("key");
%>
学员编号:<%=stu.getSid()%></br>
学员姓名:<%=stu.getName()%>

<hr/>
学员编号:${requestScope.key.sid}</br><!--sid来自于Student类属性名，大小写完全一致-->
学员姓名:${requestScope.key.name}</br>


