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
		String a=request.getParameter("unm");
		String b=request.getParameter("pass");
		if(a.equals("admin") && b.equals("1234"))
			{
				session.setAttribute("user", a);
	%>			
<jsp:forward page="userPage.jsp"></jsp:forward>
	<%		}
		else
		{
			%>
			<jsp:include page="userPage.jsp"></jsp:include>
		<%}
	%>
</body>
</html>