<%--
  Created by IntelliJ IDEA.
  User: xuwenjie
  Date: 2022/3/7
  Time: 8:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%
    String basePath = request.getScheme() + "://"  + request.getServerName() + ":"
            + request.getServerPort() + request.getContextPath() + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询学生ajax</title>
    <base href="<%=basePath%>">
    <script type="text/javascript" src="static/js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function(){
            AjaxRefresh();

            $("#refresh").click(function(){
                AjaxRefresh();
            })

            function AjaxRefresh(){
                $.ajax({
                    url:"student/queryStudents.do",
                    type:"get",
                    dataType:"json",
                    success:function(result){
                        // 清除旧的数据
                        $("#info").empty();

                        $.each(result,function(i,n){
                            // ajax增加列表
                            $("#info").append("<tr>")
                                .append("<td>" + n.id + "</td>")
                                .append("<td>" + n.name + "</td>")
                                .append("<td>" + n.age + "</td>")
                                .append("</tr>")
                        })
                    }
                })
            }
        })
    </script>
</head>
<body>
    <div align="center">
        <table>
            <thead>
                <tr>
                    <td>学号</td>
                    <td>姓名</td>
                    <td>年龄</td>
                </tr>
            </thead>
            <tbody id="info">

            </tbody>
        </table>
        <input type="button" id="refresh" value="查询数据">
    </div>
</body>
</html>
