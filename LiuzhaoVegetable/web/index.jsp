<%--
  Created by IntelliJ IDEA.
  User: 刘昭
  Date: 2022/6/22
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>

  <div style="margin: 0 auto;width: 1000px;height: 800px">

    <h3>
      test
    </h3>
    <h3>
      欢迎 <a>${sessionScope.user.liuzhaoUserName}</a> 登录
    </h3>
    <a href="/lz_type" target="mainframe" >查询菜品信息</a><br/><br/>
    <form action="/lz_selectVname" method="post" target="mainframe">
      <input type="text" name="vName" placeholder="请输入菜名！"  />
      <input type="submit" value="查询" />
    </form>
    <br>
    <br>
    <div>
      <iframe style="border: 1px solid black" name="mainframe" width="60%" height="50%" ></iframe>
    </div>
  </div>
  </body>
</html>