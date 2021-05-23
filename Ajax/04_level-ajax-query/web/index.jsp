<%--
  Created by IntelliJ IDEA.
  User: xuwenjie
  Date: 2021/5/9
  Time: 9:06 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        function loadDataAjax(){
            $.ajax({
                url:"queryProvince",
                type:"get",
                dataType:"json",
                success:function(resp){
                    // 删除旧的数据，把已经存在的数据清空
                    $("#city").empty();
                    $("#province").empty();
                    $("#city").append("<option value='0'>请选择....</option>")
                    $("#province").append("<option value='0'>请选择....</option>")
                    $.each(resp,function(i,n){
                        // 获取select这个dom对象
                        $("#province").append("<option value='" + n.id + "'>"+ n.name + "</option>");
                    })
                }
            })
        }

        $(function(){
            // $(function())在页面所有dom对象加载成功后执行的函数，在此发起ajax。
            loadDataAjax();
            // 绑定事件
            $("#btnLoad").click(function(){
               loadDataAjax();
            })

            // 给省份的select绑定一个change事件，当select内容发生变化时，触发事件
            $("#province").change(function(){
                var provinceId = $("#province>option:selected").val();

                // 做一个ajax请求，获取省份的所有城市信息
                $.post("queryCity",{proid:provinceId},callback,"json");
            })

            // 定义一个处理返回数据的函数
            function callback(resp) {
                // 清空select列表
                $("#city").empty();
                $("#city").append("<option value='0'>请选择....</option>");
                $.each(resp, function (i, n) {
                    // 获取子级选项的dom对象
                    $("#city").append("<option value='" + n.id + "'>" + n.name + "</option>");
                })
            }
        })


    </script>
    <meta charset="utf-8">
    <title>省市级连查询</title>
</head>
<body>
    <p>省市级连查询，使用ajax</p>
    <div>
        <table border="1px" cellpadding="0" cellspacing="0">
            <tr>
                <td>
                    省份：
                </td>
                <td>
                    <select id="province">
                        <option value="0">请选择....</option>
                    </select>
                    <input type="button" value="load数据" id="btnLoad">
                </td>
            </tr>
            <tr>
                <td>
                    城市：
                </td>
                <td>
                    <select id="city">
                        <option value="0">请选择....</option>
                    </select>
                </td>
            </tr>
        </table>
    </div>
</body>
</html>
