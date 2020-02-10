<%--
  Created by IntelliJ IDEA.
  User: slrh5
  Date: 2020/2/10
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="left.jsp"%>
<html>
<head>
    <title>首页</title>
</head>
<body>
<table>
    <tr>
        <th>序号</th>
        <th>姓名</th>
        <th>生日</th>
        <th>兴趣爱好</th>
        <th>手机号</th>
        <th>QQ</th>
        <th>相识时间</th>
    </tr>
    <c:forEach items="${li}" var="u">
        <tr>
            <td>${u.id}</td>
            <td>${u.userName}</td>
            <td>${u.birthDay}</td>
            <td>${u.interest}</td>
            <td>${u.phoneNum}</td>
            <td>${u.qq}</td>
            <td>${u.creatTime}</td>
        </tr>
    </c:forEach>


</table>
</body>
</html>
