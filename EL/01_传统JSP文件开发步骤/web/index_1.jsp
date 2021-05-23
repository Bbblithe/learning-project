<%@ page import="jakarta.servlet.http.HttpSession" %><%--
  Created by IntelliJ IDEA.
  User: xuwenjie
  Date: 2021/4/12
  Time: 8:12 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Integer sid = (Integer) application.getAttribute("sid");
    HttpSession session1 = request.getSession();
    String sname = (String) session1.getAttribute("sname");
    String home = (String) request.getAttribute("home");
%>
学员ID:<%=sid%></br>
学员姓名:<%=sname%></br>
学员地址:<%=home%></br>

<hr/>
学员ID:${applicationScope.sid}</br>
学员姓名:${sessionScope.sname}</br>
学员地址:${requestScope.home}</br>