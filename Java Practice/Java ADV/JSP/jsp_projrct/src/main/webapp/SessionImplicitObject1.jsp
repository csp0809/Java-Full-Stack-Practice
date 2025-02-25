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
		out.print("session id:"+session.getId()+"<br>");
		out.print("session Time:"+session.getCreationTime()+"<br>");
		out.print("session last Access time:"+session.getLastAccessedTime()+"<br>");
		out.print("session Boolean:"+session.isNew()+"<br>");
	%>
</body>
</html>