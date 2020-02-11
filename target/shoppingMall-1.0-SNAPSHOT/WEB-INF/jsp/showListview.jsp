<%@ page import="java.util.List" %>
<%@ page import="com.xzy.model.User" %><%--
  Created by IntelliJ IDEA.
  User: Leslie
  Date: 2020/2/10
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table align="center" border="1" cellspacing="0">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>编辑</td>
        <td>删除</td>
    </tr>
    <c:forEach items="${userlist}" var="c" varStatus="user2">
        <tr>
            <td>${c.user_ID}</td>
            <td>${c.user_name}</td>
            <td><a href="editStudent?id=${c.user_ID}">编辑</a></td>
            <td><a href="deleteStudent?id=${c.user_ID}">删除</a></td>
        </tr>
    </c:forEach>
</table>


<%--分页显示--%>
<div style="text-align:center">
    <a href="?start=0">首页</a>
    <a href="?start=${page.start-page.count<0?0:page.start-page.count}">上一页</a>
    <a href="?start=${page.start+page.count>page.end?page.end:page.start+page.count }">下一页</a>
    <a href="?start=${page.end}">末页</a>
</div>

//增加
<div style="text-align:center;margin-top:40px">

    <form method="post" action="addStudent">
        分类名称： <input name="name" value="" type="text"> <br><br>
        <input type="submit" value="增加分类">
    </form>
</div>

</body>
</html>
