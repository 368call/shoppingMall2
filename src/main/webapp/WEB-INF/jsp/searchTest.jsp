<%--
  Created by IntelliJ IDEA.
  User: Leslie
  Date: 2020/2/14
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table align="center" border="1" cellspacing="0" >
    <tr>
        <td>id</td>
        <td>name</td>
        <td>描述</td>
        <td>商家</td>
    </tr>
    <c:forEach items="${goodslist}" var="c" varStatus="user2">
        <tr>
            <td>${c.goods_Id}</td>
            <td>${c.goods_name}</td>
            <td>${c.goods_des}</td>
            <td>${c.seller_name}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
