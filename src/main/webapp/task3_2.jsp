<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 4/13/2021
  Time: 5:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/task3" method="post">
    <%String s=request.getAttribute("numb").toString();%>
    <input type="hidden" name="Border" id="BorderId" value="<%=s%>" readonly>
    <%String start=request.getAttribute("start").toString();%>
    <input type="hidden" name="start" id="startId" value="<%=start%>" readonly>
    <%String finish=request.getAttribute("finish").toString();%>
    <input type="hidden" name="finish" id="finishId" value="<%=finish%>" readonly>


    <label><input type="radio" name="more" id="moreId"> Число больше <%=s%></label>
    <br>
    <label><input type="radio" name="less" id="lessId">Число меньше <%=s%></label>
    <br>
    <label><input type="radio" name="equal" id="equalId">Число равно <%=s%></label>
    <br>
    <input type="submit" value="Next Guess">
</form>
</body>
</html>
