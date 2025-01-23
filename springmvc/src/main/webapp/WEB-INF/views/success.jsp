<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3 class="text-center">${Header}</h3>
	<p class="text-center">${Desc}</p>
	
	<h1 style="color: green">${msg}</h1>
	
	<hr/>

	<h1>This is the success page</h1>

	<%-- <h1>Welcome, ${name }</h1>
	<h1>Your email address is ${email }</h1>
	
	<h1>Your password is ${password }</h1> --%>
	
	<h1>Welcome, ${user.userName }</h1>
	<h1>Your email address is ${user.email }</h1>
	
	<h1>Your password is ${user.password }</h1>

</body>
</html>