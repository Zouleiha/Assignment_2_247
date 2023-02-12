<%--
  Created by IntelliJ IDEA.
  User:Zouleiha
  Date: 07/02/2023
  Time: 09:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<br>
<%
    String userName = request.getParameter("myName");
    String password = request.getParameter("myPass");
%>

<h1>Your username is :  <%=userName%> </h1>
<h1>Your password is :  <%=password%> </h1>

<br>
<jsp:include page="footer.jsp"/>

</body>
</html>