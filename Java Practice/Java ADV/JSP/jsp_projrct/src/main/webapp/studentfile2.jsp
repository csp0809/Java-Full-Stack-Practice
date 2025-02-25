<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="comm.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="comm.Studentinfo1"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>

ID is:<jsp:getProperty property="sid" name="obj"/><br>
 is:<jsp:getProperty property="sname" name="obj"/><br>
</body>
</html>