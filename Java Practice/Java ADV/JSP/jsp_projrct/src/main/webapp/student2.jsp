<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.StudentInfo"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>

ID is:<jsp:getProperty property="sid" name="obj"/><br>
Name is:<jsp:getProperty property="sname" name="obj"/>
</body>
</html>