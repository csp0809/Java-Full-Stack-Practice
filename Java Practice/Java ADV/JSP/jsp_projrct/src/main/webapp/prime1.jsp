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
		
		int i,flag=0;

        for(i=2;i<no;i++)
        {
            if(no%i==0)
            {
                flag=1;
            }
        }
        if (flag==0) {
            out.print("Prime");
        }
        else
        {
            out.print("Not Prime");
        }
    }
	
	catch(Exception e){}
	
	%>
</body>
</html>