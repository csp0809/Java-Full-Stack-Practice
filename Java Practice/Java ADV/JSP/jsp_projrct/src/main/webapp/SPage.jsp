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
		String a=request.getParameter("uid");
		String b=request.getParameter("pass");
		if(a.equals("admin")&&b.equals("1234"))
			{
				session.setAttribute("user", a);
				response.sendRedirect("TPage.jsp");
			}
		else
		{
			response.sendRedirect("FPage.jsp");
		}
	%>
</body>
</html>