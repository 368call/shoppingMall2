<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Leslie
  Date: 2020/2/10
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
<form method="post" action="insert">
      id: <input type="text" name="user_ID">
    姓名：<input type="text" name="user_pwd">
    <input type="submit" value="提交">
</form>
</body>
</html>
