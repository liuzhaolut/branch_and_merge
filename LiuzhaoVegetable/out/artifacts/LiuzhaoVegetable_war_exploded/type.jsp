<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: 刘昭
<<<<<<< .merge_file_a21416
2222
=======
11111
>>>>>>> .merge_file_a23616
  Date: 2022/6/22
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js" type="text/javascript"></script>
    <script type="text/javascript">
        window.onload=function(){
            $("table tbody tr:odd").css("background-color","#0000ff");
            $("body").css("background-color","black").css("color","#ffffff");
        }

    </script>
</head>
<body>
<div align="center">
    <table border="1" >
        <thead>
        <tr style="background-color: #cccccc;color: white">
            <th>菜品信息编号</th>
            <th>菜品名称</th>
            <th>菜品价格</th>
            <th>菜品制作原材料</th>
            <th>菜品味道特色</th>
            <th>菜品效果配图</th>
        </tr>
        </thead>
        <c:forEach var="l" items="${list}">
            <tr style="color: white;background-color: #00ff00">
                <td>${l.liuzhaoVegetableInfoID}</td>
                <td>${l.liuzhaoVegetableName}</td>
                <td>${l.liuzhaoVegetablePrice}</td>
                <td>${l.liuzhaoVegetableMaterial}</td>
                <td>${l.liuzhaoVegetableTaste}</td>
                <td>${l.liuzhaoVegetablePhoto}</td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
