<%@ page import="com.blithe.xwj.entity.Question" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: xuwenjie
  Date: 2021/4/11
  Time: 3:06 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <table border="2px" align="center">
       <tr>
           <td>题号</td>
           <td>题目</td>
           <td>A</td>
           <td>B</td>
           <td>C</td>
           <td>D</td>
           <td>正确答案</td>
           <td colspan="2">操作</td>
       </tr>
        <%
            List<Question> questionList = (List<Question>) request.getAttribute("result");
            // 第五阶段：JSTL有效弥补EL不能遍历集合输出问题
            for(Question question : questionList){
                Integer questionId = question.getQuestionId();
                String title = question.getTitle();
                String optionA = question.getOptionA();
                String optionB = question.getOptionB();
                String optionC = question.getOptionC();
                String optionD = question.getOptionD();
                String answer = question.getAnswer();
        %>
        <tr>
            <td><%=questionId%></td>
            <td><%=title%></td>
            <td><%=optionA%></td>
            <td><%=optionB%></td>
            <td><%=optionC%></td>
            <td><%=optionD%></td>
            <td><%=answer%></td>
            <td><a href="/myWeb/question/delete?questionId=<%=questionId%>">删除试题</a></td>
            <td><a href="/myWeb/question/findById?questionId=<%=questionId%>">详细信息</a></td>
        </tr>
        <%
            }
        %>
    </table>
</center>
</body>
</html>
