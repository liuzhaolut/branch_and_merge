<%--
  Created by IntelliJ IDEA.
  User: 刘昭
  Date: 2022/6/22
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        .box{
            background: url(img/123.jpg) no-repeat;
            z-index:0;
            width: 100%;
            height: 100%;
            background-size: cover;
        }
    </style>
</head>
<body>
<div class="box">
    <form action="/lz_user" method="post">
        <table align="center" >
            <tr>
                <td >用户名：</td>
                <td><input name="userName" type="text" /></td>
            </tr>
            <tr>
                <td >密  码：</td>
                <td><input name="passWord" type="password" /></td>
            </tr>
            <tr>
                <td>
                </td>
                <td >
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <input  align="left" name="submit" type="submit" value="登录"/>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input  name="rewrite" type="reset" value="重置"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
