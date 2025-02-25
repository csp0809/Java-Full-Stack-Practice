<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Employee</a>
    
      <form class="d-flex">
        <input  type="button">Login</button>
        <input  type="button"><a href="RegForm.jsp">Sign up</a></button>
      </form>
    </div>
</nav>
  


<div class="container mt-3">
  <h2>Registration Form</h2>
  <form action="RegForm1.jsp">
  <div class="mb-3 mt-3">
    
      <label for="name">Name:</label>
      <input type="text" class="form-control" id="name" placeholder="Enter Name" name="uname" onclick="this.value">
    </div>
    
    <div class="mb-3 mt-3">
      <label for="email">Email:</label>
      <input type="text" class="form-control" id="uemail" placeholder="Enter email" name="uemail" onclick="this.value">
    </div>
    
    <div class="mb-3">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="upass" placeholder="Enter password" name="upass" onclick="this.value">
    </div>
    <input type="submit" class="btn btn-primary" value="Register" >
  </form>
</div>


</body>
</html>