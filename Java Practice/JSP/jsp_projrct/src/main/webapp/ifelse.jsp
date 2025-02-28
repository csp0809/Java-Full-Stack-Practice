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
	try{
		int a;
		a=Integer.parseInt(request.getParameter("num1"));
		if (a % 4 == 0)
        {
         out.print(a+" : is a leap year");
        }
         else
        {
        	 out.print(a+" : is not a leap year");
        }
	}
	catch(Exception e){}
	
	%>
</body>
</html>