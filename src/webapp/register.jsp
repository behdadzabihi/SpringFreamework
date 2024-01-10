<%--
  Created by IntelliJ IDEA.
  User: ahmadseddighi
  Date: 4/29/21
  Time: 9:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register new user</title>
</head>
<body>
<form action="/register" method="post">
    <input type="text" name="first_name"/>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <input type="submit" name="submit" value="Register">
</form>
</body>
</html>
