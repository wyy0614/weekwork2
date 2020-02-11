<%--
  Created by IntelliJ IDEA.
  User: slrh5
  Date: 2020/2/10
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #left{
            width: 15%;
            height: 100%;
            position: relative;
            float: left;
            top: 0;
            left: 0;
            background-color: salmon;
            opacity: 0.6;
        }
        #lb{
            position: absolute;
        }
        #lb ul li a{
            text-decoration: transparent;
        }
    </style>
</head>
<body>
<div id="left"></div>
<div id="lb">
    <ul>
        <li>
            <a href="/user/login.do">返回首页</a>
        </li>
        <li>
            <a href="/user/getall.do">查询好友信息</a>
        </li>
        <li>
            <a href="/index/deleteview.do">删除好友信息</a>
        </li>
        <li>
            <a href="/user/getallhui.do">好友回收站</a>
        </li>
    </ul>

</div>
</body>
</html>
