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
		
		int b=1,i;
        for (i=1;i<=a;i++)
        {
            b = b*i;
        }
        out.print("Factorial is : " +b);
    }
	
	catch(Exception e){}
	
	%>
</body>
</html>