<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		out.print("Welcome User:"+session.getAttribute("user"));
	%>
	<a href="LogU.jsp">Go TO Back HOME</a>
</body>
</html>