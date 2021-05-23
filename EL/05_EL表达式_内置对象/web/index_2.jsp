<%--
  Created by IntelliJ IDEA.
  User: xuwenjie
  Date: 2021/4/13
  Time: 7:33 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!--
http//localhost:8080/myWeb/index_2.jsp?deptNo=1&deptNo=2&deptNo=3
-->

第一个部门编号:${paramValues.deptNo[0]}<br/>
第二个部门编号:${paramValues.deptNo[1]}<br/>
第三个部门编号:${paramValues.deptNo[2]}


