<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <%@ page import="com.tcs.onms.bean.*" %>
 <%@ page import="com.tcs.onms.service.*" %>
 <%@ page import="com.tcs.onms.controller.*" %>
 <%@ page import="com.tcs.onms.Dao.*" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.util.*" %>
    <link rel="stylesheet" type="text/css" href="searchUser.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search User</title>
</head>
<body>

<button onclick="window.location.href='addUser.jsp'">addUser</button>
 <button onclick="window.location.href='updateUser.jsp'">updateUser</button>
 <br><br><br>
				 <form action="UserServlet" method="get">
				  <input type="text" name="search1" placeholder="search by name" >
				  <input type="submit" name="action" value="search"  >
				 </form>
  <br><br><br><br><br>
  
  <table id="customers" border=1 align=center style="text-align: center">
   <tr>
   <td>Emp Id</td>
    <td>User Name</td>
     <td>Password</td>
      <td>Role Id</td>
       <td>Email Id</td>
        <td>Mobile Number</td>
         <td>Team Lead Id</td>
         <td>Last Login</td>
   </tr>
        <%
        ArrayList<User> empList=(ArrayList<User>)request.getAttribute("search1");
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
				out.println("<td><a href='UserServlet?action=Delete&empNo="+e.getEmployeeId()+"'>Delete</a></td></tr>");
				
				%>
            <%
        }%>
        </table><br>
 
			      <button onclick="window.location.href='addUser.jsp'">addUser</button>
			 
</body>
</html>