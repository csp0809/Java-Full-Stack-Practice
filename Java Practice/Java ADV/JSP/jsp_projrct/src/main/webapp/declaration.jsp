<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Implicit Object</h1>
	
	<%!
	int a=1000;
	%>
	<%
	out.println(a);
	%>
	
</body>
</html>