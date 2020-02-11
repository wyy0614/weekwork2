<%--
  Created by IntelliJ IDEA.
  User: slrh5
  Date: 2020/2/11
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>查看好友</title>
    <style>
        body{
            margin: 0;
            padding: 0;
        }
        a{
            text-decoration: none;
            color: lightcoral;
        }

        #left{
            height: 50px;
            width: 80px;
            /*border: 1px black solid;*/
        }

        #left input{
            margin-top: 20px;
            margin-left: 10px;
        }
        #right{
            height: 15px;
        }
        #a{
            position: absolute;
            left: 93px;
            top: 22px;

        }
        .hz{
            height: 30px;
            width: 80px;
            /*border: black 1px solid;*/
        }
        #c{
            position: absolute;
            left: 170px;
            top: 22px;

        }

    </style>
</head>
<body>
<table>
    <form action="/user/login.do">
        <div id="left">
            <input type="submit" value="返回首页">
            <div id="a">
                <a href="/index/deleteview.do">
                    <div class="hz">删除好友</div>
                </a>
            </div>
            <div id="c">
                <a href="/user/getallhui.do">
                    <div class="hz">好友回收站</div>
                </a>
            </div>
        </div>
       <div id="right"></div>
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

    </form>



</table>
</body>
</html>
