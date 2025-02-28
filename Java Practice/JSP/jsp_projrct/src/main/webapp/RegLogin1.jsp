<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.LoginDao"%>
<jsp:useBean id="obj" class="com.User"/>

<jsp:setProperty property="*" name="obj"/>

<%  
boolean status=LoginDao.validate(obj);  
out.print(status);
if(status){  
//out.println("You are successfully logged in");  
session.setAttribute("session","TRUE");  
response.sendRedirect("RegFormNav.jsp");
}  
else  
{  
out.print("Sorry, email or password error");  
%>
<jsp:include page="RegLogin.jsp"></jsp:include>
<%  
}  
%>

</body>
</html>