<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.RegisterDao"%>
<jsp:useBean id="obj" class="com.User"/>

<jsp:setProperty property="*" name="obj"/>

<%  
int status=RegisterDao.register(obj);  
if(status>0)  
out.print("You are successfully registered");  

%>

</body>
</html>