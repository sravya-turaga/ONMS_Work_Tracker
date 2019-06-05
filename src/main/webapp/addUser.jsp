<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>
</head>
<body>
<center>
<form  action="OnmsServlet" method="get">

<table>
<tr>
  <th>User Name:</th>
  <td><input type="text" name="username" > <br><br></td>
  
 </tr>
 <br><br>
 <tr>
  <th>Employee Id:</th>
   <td><input type="number" name="employeeid" ><br><br></td>
  
  </tr>
   
  <tr>
  <th>Email Id:</th>
   <td><input type="text" name="emailid" > <br><br></td>
  
  </tr>
  
  <tr>
	<th>Mobile Number:</th>
   <td><input type="number" name="mobilenumber" > <br><br></td>
  
  </tr>
    <tr>
 		<th>Role Id:</th>
   		<td>
   		<select name="roleid">
  <option value="101">Manager</option>
  <option value="102">Team Lead</option>
  <option value="103">Developer</option>
 
		</select>
 <br><br>
 		</td>
  
  </tr>
  <tr>
 <th>Team Lead Name:</th>
   <td><input type="text" name="teamleadname" > <br><br></td>
  
  </tr>
   
  <tr>
  <th>Password:</th>
   <td><input type="password" name="password" > <br><br></td>
  
  
  </tr>
   
  <tr>
  <th><input type="submit" name="action" value="Submit">
  <input type="hidden" name="action" value="List">
  <br><br></th>
  </tr>
   
  </table>
</form> 
</center>

</body>
</html>