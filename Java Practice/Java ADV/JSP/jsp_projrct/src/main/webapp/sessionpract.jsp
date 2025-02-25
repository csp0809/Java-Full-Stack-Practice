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
            out.println("session id:"+session.getId()+"<br>");
            out.println("session Time:"+session.getCreationTime()+"<br>");
            out.println("session last Access time:"+session.getLastAccessedTime()+"<br>");
            out.println("session Boolead:"+session.isNew()+"<br>");

        %>

</body>
</html>