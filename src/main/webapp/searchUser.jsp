<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <%@ page import="com.tcs.onms.bean.*" %>
 <%@ page import="com.tcs.onms.service.*" %>
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

<button onclick="window.location.href='addUser.jsp'">addUser</button>
 <button onclick="window.location.href='updateUser.jsp'">updateUser</button>
  <input type="text" name="search" placeholder="search by name">
  <input type="button" value="search" name="action">
  <br><br><br><br><br>
  
  <table border=1 align=center style="text-align: center">
   <tr>
   <td>Emp Id</td>
    <td>User Name</td>
     <td>Password</td>
      <td>Role Id</td>
       <td>Email Id</td>
        <td>Mobile Number</td>
         <td>Team Lead Id</td>
   </tr>
        <%
        OnmsService service=new OnmsService();
        ArrayList<Onms> empList=service.getAllUsers();
        for(Onms e:empList)
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
				
				%>
            <%
        }%>
        </table><br>
 
			      <button onclick="window.location.href='DeleteUser.jsp'">addUser</button>
			 
</body>
</html>