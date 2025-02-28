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
String data= config.getInitParameter("userName");
out.print(data);

String info=application.getInitParameter("password");
out.print("<br>"+info);

%>

</body>
</html>