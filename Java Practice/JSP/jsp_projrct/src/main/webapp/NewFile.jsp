<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	
	<div class="d-flex justify-content-center align-items-center vh-100">
  <div class="col-md-4 p-4 border border-primary rounded shadow bg-light">
	
	<form action="ifelse.jsp" method="post" >
 <div class="p-2 bg-warning flex-fill">
    <label for="Enter 1st Number:" class="form-label">Enter Year:</label>
    <input type="Enter 1st Number:" class="form-control" id="Num" placeholder="Enter Year" name="num1">
  </div>
  
  <div class="d-grid gap-2">
  <button type="submit" class="btn btn-primary " value="click">Submit</button>
  </div>
</form>

</div>
</div>
</body>
</html>