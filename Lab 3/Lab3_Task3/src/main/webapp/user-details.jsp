<%--
  Created by IntelliJ IDEA.
  User: haddy
  Date: 2/25/2022
  Time: 10:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:useBean id="userinfo" class="beans.Details"></jsp:useBean>
<jsp:setProperty property="*" name="userinfo"/>
You have entered below details:<br>
<jsp:getProperty property="username" name="userinfo"/><br>
<jsp:getProperty property="password" name="userinfo"/><br>
<jsp:getProperty property="age" name="userinfo" /><br>

</body>
</html>
