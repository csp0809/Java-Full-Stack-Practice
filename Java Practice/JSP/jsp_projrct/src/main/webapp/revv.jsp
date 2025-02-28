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
		int no;
		no=Integer.parseInt(request.getParameter("num1"));
		
		int rem;
        while(no>0)
        {
            rem=no%10;
            out.print(rem);
            no=no/10;
        }
    }
	
	catch(Exception e){}
	
	%>
</body>
</html>