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
		if (a < 18)
        {
         out.print(a+" : Not adult");
        }
         else if(a > 18)
        {
        	 out.print(a+" : is Adult");
        }
         else
         {
         	 out.print(a+" : Please provide correct input");
         }
	}
	catch(Exception e){}
	
	%>
</body>
</html>