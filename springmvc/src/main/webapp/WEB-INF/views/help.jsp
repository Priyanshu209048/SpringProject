<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page isELIgnored="false" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	
	<%
		/* String name = (String)request.getAttribute("name");
		Integer age = (Integer)request.getAttribute("age");
		LocalDateTime time = (LocalDateTime)request.getAttribute("time"); */
	%>
	
	<h1>This is Help page</h1>
	
	<h1>Hello My name is <%-- <%= name %> --%>
		${name}
	</h1>
	
	<h1>My age is <%-- <%= age %> --%>
		${age}
	</h1>
	
	<h1>Current date and time is <%-- <%= time.toString() %> --%>
		${time}
	</h1>
	
	<hr/>
	
	<c:forEach var="item" items="${marks}">
	
		<%-- <h1>${item}</h1> --%>
		<!-- or -->
		<h1><c:out value="${item}"></c:out></h1>
	
	</c:forEach>

</body>
</html>