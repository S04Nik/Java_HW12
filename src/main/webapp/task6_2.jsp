<%@ page import="com.example.HW12.model.User" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 4/13/2021
  Time: 5:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%User first= (User) request.getAttribute("user");%>
<label>Name : <%=first.name%></label>
<br>
<label>Email : <%=first.email%></label>
<br>
<label>Age : <%=first.age%></label>
<br>
<label>Phone : <%=first.phone%></label>
<br>
<label>Gender : <%=first.gender%></label>
<br>
<label>Subscription : <%=first.subscr%></label>
</body>
</html>
