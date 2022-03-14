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
    <script type="text/javascript" src="js/jquery-3.4.1.js" ></script>
    <script type="text/javascript">
        $(function (){
            $("#btn").click(function (){
                $.ajax({
                    // url:"returnVoid-ajax.do",
                    // url:"returnStudentJsonArray.do",
                    url:"returnStringData.do",
                    data:{
                        name:"zhangsan",
                        age:20
                    },
                    type:"post",
                    dataType:"text",
                    success:function(resp){
                        // resp从服务器端返回的是json格式的字符串：{"name":"zhangsan","age":20}
                        // jquery会把字符串转为json对象，赋值给resp形参。

                        // alert(resp.name + "    " + resp.age)
                        // $.each(resp,function (i,n){
                        //     alert(n.name + "  " + n.age)
                        // })

                        alert("返回的是文本数据：" + resp);
                    }
                })
            })
        })
    </script>
</head>
<body>
    <p>处理器方法返回String表示视图名称</p>
    <br>
    <form action="returnString-view.do" method="post">
        姓名：<input type="text" name="name"><br>
        年龄：<input type="text" name="age">
        <input type="submit" value="提交参数">
    </form>

    <p>处理器方法返回String表示视图完整路径</p>
    <br>
    <form action="returnString-view2.do" method="post">
        姓名：<input type="text" name="name"><br>
        年龄：<input type="text" name="age">
        <input type="submit" value="提交参数">
    </form>
    <br>
    <button id="btn">发起Ajax请求</button>
</body>
</html>
