<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="#">
	Enter Username:<input type="text" name="username">
	<input type="submit" value="Ok">	
	</form>
	<%
	String a=request.getParameter("username");
	out.print("user Name: "+a);
	%>
	<%="username:"+a %>
</body>
</html>