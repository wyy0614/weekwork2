<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
   <title>登陆</title>
    <style>

        #bk{
            height: 400px;
            width: 300px;
            margin: auto;
            margin-top: 200px;
        }
        input{
            height: 50px;
            width: 300px;
            margin-top: 10px;
        }
        #aaa a{
            margin-top: 10px;
            font-size: 20px;
            font-weight: bold;
            color: black;
            text-decoration: transparent;
        }

    </style>
</head>


<body>
<div id="bk">
    <div id="bg">
        <form action="/user/login.do" method="post">
            <input type="text" placeholder="请输入用户名" name="username">
            <input type="password" placeholder="请输入密码" name="password">
            <input type="submit" value="登陆">
        </form>

    </div>
</div>

</body>

</html>

