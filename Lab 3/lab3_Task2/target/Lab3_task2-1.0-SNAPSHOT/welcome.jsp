<%@ page import="Beans.GreeterBean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Page</title>
</head>

<body>

<%
    GreeterBean g = new GreeterBean();
    String n = g.greetMeInReverse(request.getParameter("myName"));


%>
<h1>Welcome to the Page, <%=n%></h1>

</body>
</html>
