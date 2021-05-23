<%--
  Created by IntelliJ IDEA.
  User: xuwenjie
  Date: 2021/4/25
  Time: 9:12 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用json格式的数据</title>
    <script type="text/javascript">
        function doSearch(){
            // 1.创建异步对象
            var vmlHttp = new XMLHttpRequest();

            // 2.绑定事件
            vmlHttp.onreadystatechange = function(){
                if(vmlHttp.readyState == 4 && vmlHttp.status == 200){
                    var data = vmlHttp.responseText;
                    var jsonObj = eval("(" + data +")");
                    // 更新dom对象
                    callback(jsonObj);
                }
            }

            // 3.初始化请求对象
            var proid = document.getElementById("proid").value;

            // ture：异步处理请求。使用异步对象发起请求后，不用等待数据处理完毕，就可以执行其他的操作。
            // false：同步，异步对象必须处理完成请求，从服务器端获取数据后，你才能执行send之后的代码。任意时刻只能执行一个异步请求。
            vmlHttp.open("get","queryjson?proid="+proid,false);

            // 4.发送请求
            vmlHttp.send();

            //也可以创建其他的异步对象XMLHttpRequest,发送其他请求处理。

            alert("====在send之后的代码====");
        }

        // 定义函数，处理服务端返回的数据
        function callback(json){
            document.getElementById("proname").value = json.name;
            document.getElementById("projiancheng").value = json.jiancheng;
            document.getElementById("proshenhui").value = json.shenghui;
        }
    </script>
</head>
<body>
    <p>ajax请求使用json格式的数据</p>
    <table>
        <tr>
            <td>省份编号：</td>
            <td><input type="text" id="proid">
                <input type="button" value="搜索" onclick="doSearch()">
            </td>
        </tr>
        <tr>
            <td>省份名称：</td>
            <td><input type="text" id="proname"></td>
        </tr>
        <tr>
            <td>身份简称：</td>
            <td><input type="text" id="projiancheng"></td>
        </tr>
        <tr>
            <td>省会名称：</td>
            <td><input type="text" id="proshenhui"></td>
        </tr>
    </table>
</body>
</html>
