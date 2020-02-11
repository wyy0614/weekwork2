<%--
  Created by IntelliJ IDEA.
  User: slrh5
  Date: 2020/2/11
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除好友</title>
</head>
<body>
    <form action="/user/huishou.do">
        <a href="/user/login.do">返回首页</a>
    <input type="text" placeholder="好友名称" name="username">
    <input type="submit" value="删除">
    </form>
</body>
</html>
