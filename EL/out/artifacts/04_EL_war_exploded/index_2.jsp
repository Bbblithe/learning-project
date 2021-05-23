<%--
  Created by IntelliJ IDEA.
  User: xuwenjie
  Date: 2021/4/13
  Time: 7:11 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!--传统Java命令方式实现关系运算输出-->
<%
    String age = (String) request.getAttribute("age");
    if(Integer.valueOf(age) >= 18){
%>
    欢迎光临<br/>
<%
    }else{
%>
    谢绝入内<br/>
<%
    }
%>

EL表达式输出关系运算:${age ge 18?"欢迎光临":"谢绝入内"}
