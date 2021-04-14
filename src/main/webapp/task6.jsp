<%--
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
<%
    String message="";
if(request.getAttribute("errorMessage")!=null){
    message=request.getAttribute("errorMessage").toString();
}
%>
<label><%=message%></label>
<form method="post" action="/task6">
    <input type="text" name="name" id="NameId" placeholder="Name">
    <br>
    <input type="text" name="phone" id="phoneId" placeholder="+38063636663">
    <br>
    <input type="text" name="email" id="emailId" placeholder="yourEmail@gmail.com">
    <br>
    <input type="text" name="age" id="ageId" placeholder="Age">
    <br>
    <label>
        Subscribe
        <input type="checkbox" name="subscribe" id="subscribeId" >
    </label>
    <br>
    <label>
        Male
        <input type="checkbox" name="male" id="maleId" >
    </label>
    <label>
        Female
        <input type="checkbox" name="female" id="femaleId" >
    </label>
    <label>
        Alien
        <input type="checkbox" name="alien" id="alienId" >
    </label>
    <br>
    <input type="submit" value="Next Page">
</form>
</body>
</html>
