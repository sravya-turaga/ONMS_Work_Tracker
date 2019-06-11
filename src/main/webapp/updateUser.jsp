<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="searchUser.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UpdateUser</title>
</head>
<body>
<h1 style="text-align: center">Update User</h1>
<form action="OnmsServlet" style="text-align: center" method="get">
Employee Id:<br>
  <input type="number" name="employeeid" >
  <br>
  User Name:<br>
  <input type="text" name="username" >
  <br>
  Email Id:<br>
  <input type="text" name="emailid" >
  <br><br>
	Mobile Number:<br>
  <input type="number" name="mobilenumber" >
  <br><br>
Role Id:<br>
  <input type="number" name="roleid" >
  <br><br>
 Team Lead:<br>
  <input type="text" name="teamleadname" >
  <br><br>
  Password:<br>
  <input type="password" name="password" >
  <br><br>
  <br>
  <input type="submit" name="action" value="update" >
</form> 
</body>
</html>