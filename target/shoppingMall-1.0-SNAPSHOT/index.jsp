<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>
<body>
<h1>测试</h1>
    <a href="user/index?name=laobiao">测试页面跳转</a>
    <br>
<a href="user/select" >显示</a>
<br>
<a href="user/showList">ListoutTest</a>
//查询显示
<table align="center" border="1" cellspacing="0">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>编辑</td>
        <td>删除</td>
    </tr>
    <c:forEach items="${goods}" var="c" varStatus="user2">
        <tr>
            <td>${c.goods_id}</td>
            <td>${c.goods_name}</td>
            <td><a href="editStudent?id=${c.goods_id}">编辑</a></td>
            <td><a href="deleteStudent?id=${c.good_id}">删除</a></td>
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

<h1>测试搜索功能</h1>

<form action="search" method="post">
    模糊搜索框：<input type="text" name="key" >
                <input type="submit" value="点击搜索">
</form>

</body>
</html>
