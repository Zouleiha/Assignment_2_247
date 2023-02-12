<%--
  Created by IntelliJ IDEA.
  User: haddy
  Date: 2/25/2022
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

<form method="post" action="user-details.jsp">
    Enter Your Name <input type="text" name="username">
    <br><br>
    Enter Your Password <input type="password" name="password">
    <br><br>
    Enter Your Age: <input type="text" name="age">
    <br><br>
    <input type="submit" name="submit">
</form>

</body>
</html>
