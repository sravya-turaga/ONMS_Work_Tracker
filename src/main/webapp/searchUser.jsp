<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="searchUser.css">
 <%@ page import="com.tcs.onms.bean.*" %>
 <%@ page import="com.tcs.onms.service.*" %>
 <%@ page import="com.tcs.onms.controller.*" %>
 <%@ page import="com.tcs.onms.Dao.*" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.util.*" %>
    
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search User</title>
</head>
<body>


<div>
 <form  class="searchbar" action="UserServlet" method="get">
	<input type="text" name="search1" style='margin-right:80px' >
	<input  class="button" style='margin-right:80px' type="submit" name="action" value="search"  >
	
</form>
<button class="button" style='margin-right:80px' onclick="window.location.href='addUser.jsp'">addUser</button>
 <button class="button"  style='margin-right:10px' onclick="window.location.href='updateUser.jsp'">updateUser</button>
 </div>

  <br><br><br><br><br>
  
  <table id="customers" bgcolor='#4CAF50' border=1 align=center style="text-align: center">
   <tr>
  	 <td>Emp Id</td>
    <td>User Name</td>
     <td>Password</td>
      <td>Role Id</td>
       <td>Email Id</td>
        <td>Mobile Number</td>
         <td>Team Lead Name</td> 
         <td>Last Login</td>
   </tr>
        <%
        	UserService service=new UserService();
                        ArrayList<User> empList=service.getAllUsers();
                        for(User e:empList)
                        {
        %>
           <% 
          
           		out.println("<tr><td>"+e.getEmployeeId()+"</td>");
				out.println("<td>"+e.getUserName()+"</td>");
				out.println("<td>"+e.getPassword()+"</td>");
				out.println("<td>"+e.getRoleId()+"</td>");
				out.println("<td>"+e.getEmailId()+"</td>");
				out.println("<td>"+e.getMobileNumber()+"</td>");
	
				out.println("<td>"+e.getTeamLeadName()+"</td>");
				out.println("<td>"+e.getLastLogin()+"</td>");
				out.println("<td><a href='OnmsServlet?action=Delete&empNo="+e.getEmployeeId()+"'>Delete</a></td></tr>");
				
				%>
            <%
        }%>
        </table><br>
 
			     
			 
</body>
</html>