<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/16/2023
  Time: 7:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="for" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<html>
<head>
  <title>Home</title>
</head>
<body>



<h1>All dojos</h1>
<div>
  <c:forEach items="${allDojo}" var="dojo">
    <p><a href="/details/${dojo.id}"> <c:out value="${dojo.name}"/> </a></p>
  </c:forEach>
</div>
<br>
<div>
  <h3><a href="/dojo" >Create a new Dojo</a></h3>
  <h3><a href="/ninja">Create a new Ninja</a></h3>
</div>
</body>
</html>
