<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="sessionsec.jsp">
	enter Username:<input type="text" name="uname">
	<input type="submit" value="Ok"> 
</form>
	<%	
	String a=request.getParameter("uname");
	out.println("UserName:"+a);
	%>
	<%="<br>"+"Username:"+a %>
</body>
</html>