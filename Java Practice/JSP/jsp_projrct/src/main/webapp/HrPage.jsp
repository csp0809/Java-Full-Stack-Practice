<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HR Portal</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
    
        <a class="navbar-brand" href="#">Employee</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="RegForm.jsp"><i class="bi bi-person"></i> Sign Up</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="RegLogin.jsp"><i class="bi bi-box-arrow-in-right"></i> Login</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
  


<div class="container mt-3">
  <h2>Registration Form</h2>
  <form action="HrProcess.jsp" method="post">
  
  <div class="mb-3 mt-3">
      <label for="id">Employee ID:</label>
      <input type="text" class="form-control" id="id" placeholder="Enter Employee ID" name="eid" onclick="this.value">
    </div>
  
  <div class="mb-3 mt-3">
      <label for="name">Employee Name:</label>
      <input type="text" class="form-control" id="name" placeholder="Enter Name" name="ename" onclick="this.value">
    </div>
    
    <div class="mb-3 mt-3">
      <label for="email">Email:</label>
      <input type="text" class="form-control" id="email" placeholder="Enter email" name="eemail" onclick="this.value">
    </div>
    
    <div class="mb-3 mt-3">
      <label for="department">Department:</label>
      <input type="text" class="form-control" id="dept" placeholder="Enter department" name="edept" onclick="this.value">
    </div>
    
    <div class="mb-3 mt-3">
      <label for="date">Date:</label>
      <input type="text" class="form-control" id="date" placeholder="Enter date" name="edate" onclick="this.value">
    </div>
    
    <h5>Schedule</h5>
    <div class="mb-3 mt-3">
      <label for="week1">Week-1 :</label>
      <input type="text" class="form-control" id="week1" placeholder="Enter schedule for week1" name="eweek1" onclick="this.value">
    </div>
    <div class="mb-3 mt-3">
      <label for="week2">Week-2 :</label>
      <input type="text" class="form-control" id="week2" placeholder="Enter schedule for week2" name="eweek2" onclick="this.value">
    </div>
    <div class="mb-3 mt-3">
      <label for="week3">Week-3 :</label>
      <input type="text" class="form-control" id="week3" placeholder="Enter schedule for week3" name="eweek3" onclick="this.value">
    </div>
    <div class="mb-3 mt-3">
      <label for="week4">Week-4 :</label>
      <input type="text" class="form-control" id="week4" placeholder="Enter schedule for week4" name="eweek4" onclick="this.value">
    </div>
    
    <h2>Choose an Action</h2>
    
    <input type="submit" class="btn btn-warning" name="action" value="Save Data" >
    <input type="submit" name="action" value="Insert">
    <input type="submit" name="action" value="Update">
    <input type="submit" name="action" value="Delete">
    <input type="submit" name="action" value="View">
  </form>
</div>


</body>
</html>