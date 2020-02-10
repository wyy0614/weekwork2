<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    #login{
        height: 50px;
        width: 300px;
        background-color: cornflowerblue;
        border-radius: 2px;
        margin-top: 10px;
    }
    #aaa{
        height: 30px;
        width:42px;
        margin: auto;
        position: relative;
        top:10px;
    }
    #aaa a{
        margin-top: 10px;
        font-size: 20px;
        font-weight: bold;
        color: black;
        text-decoration: transparent;
    }

</style>

<body>
<div id="bk">
    <div id="bg">
            <input type="text" placeholder="请输入用户名" name="username">
            <input type="password" placeholder="请输入密码" name="password">
            <div id="login">
                <div id="aaa">
                    <a href="/user/getall.do">登陆</a>
                </div>
            </div>
    </div>
</div>

</body>

</html>

