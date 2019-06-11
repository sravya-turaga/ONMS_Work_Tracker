package com.tcs.onms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;






import com.tcs.onms.bean.Onms;
import com.tcs.onms.service.OnmsService;


/**
 * Servlet implementation class OnmsServlet
 */
@WebServlet("/OnmsServlet")
public class OnmsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OnmsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		OnmsService service=new OnmsService();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		if("List".equals(action)) {
			ArrayList<Onms> empList=service.getAllUsers();
			out.println("<h1 align='center'>ONMS_WORK_TRACKER</h1>");
			out.println("<hr><br>");
			out.println("<table width='80%' align='center' border='1'>");
			out.println("<tr><th>Emp Id</th><th>User Name</th><th>TempPwd</th><th>RoleId</th><th>Email Id</th><th>Mobile No</th><th>Team Lead ID</th><th>Last Login</th></tr>");
			for(Onms e:empList) {
				out.println("<tr><td>"+e.getEmployeeId()+"</td>");
				out.println("<td>"+e.getUserName()+"</td>");
				out.println("<td>"+e.getPassword()+"</td>");
				out.println("<td>"+e.getRoleId()+"</td>");
				out.println("<td>"+e.getEmailId()+"</td>");
				out.println("<td>"+e.getMobileNumber()+"</td>");
				out.println("<td>"+e.getTeamLeadName()+"</td>");
				out.println("<td><a href='OnmsServlet?action=Delete&empNo="+e.getEmployeeId()+"'>Delete</a></td></tr>");
			}
			out.println("</table>");
			out.println("<br><br>");
			out.println("<p align='center'><a href='index.jsp'>Back</a></p>");
		}
		else if("Submit".equals(action)) {
			String username=request.getParameter("username");
			String emailid=request.getParameter("emailid");
			String  teamleadname=request.getParameter("teamleadname");
			String mobilenumber=request.getParameter("mobilenumber");
			String password =request.getParameter("password");
			long roleid=Long.parseLong(request.getParameter("roleid"));
			long employeenumber=Long.parseLong(request.getParameter("employeeid"));
			
			
			Onms emp=new Onms(employeenumber,username,password,roleid,emailid,mobilenumber,teamleadname);
			boolean result=service.addUsers(emp);
			out.println("<h1 align='center'>ONMS WORK TRACKER</h1>");
			out.println("<hr><br>");
			if(result==true) {
				 RequestDispatcher requestDispatcher = request
		                    .getRequestDispatcher("/searchUser.jsp");
		            requestDispatcher.forward(request, response);
				out.println("<p align='center'><font color='green'>User inserted succefully!!!</font></p>");
			} else {
				out.println("<p align='center'><font color='red'>User insertion failed!!!</font></p>");
			}
			out.println("<br><br>");
			out.println("<p align='center'><a href='index.jsp'>Back</a>");
		}
		else if("Delete".equals(action)) {
			String empNo=request.getParameter("empNo");
			long eNo=0;
			if(empNo!=null) {
				eNo=Long.parseLong(empNo);
			}
			boolean result=service.deleteUsers(eNo);
			out.println("<h1 align='center'>ONMS Managment System</h1>");
			out.println("<hr><br>");
			if(result==true) {
				out.println("<p align='center'><font color='green'>User deleted succefully!!!</font></p>");
			} else {
				out.println("<p align='center'><font color='red'>User deletion failed!!!</font></p>");
			}
			out.println("<br><br>");
			out.println("<p align='center'><a href='index.jsp'>Back</a>");
		}
		else if("search".equals(action)) {
			
			
			
			long eNo=Long.parseLong(request.getParameter("search1"));
			/*ArrayList<Onms> empList=service.searchUsers(eNo);
			request.setAttribute("search1",empList);
		      request.getRequestDispatcher("searchUser1.jsp").forward(request, response);*/

			
			ArrayList<Onms> empList=service.searchUsers(eNo);
			out.println("<h1 align='center'>ONMS WORK TRACKER</h1>");
			out.println("<hr><br>");
			out.println("<table color='blue' border-collapse='collapse' width='80%' align='center' border='1'>");
			out.println("<tr><th>Emp Id</th><th>User Name</th><th>TempPwd</th><th>RoleId</th><th>Email Id</th><th>Mobile No</th><th>Team Lead ID</th><th>Last Login</th><th>  </th></tr>");
			for(Onms e:empList) {
				out.println("<tr><td>"+e.getEmployeeId()+"</td>");
				out.println("<td>"+e.getUserName()+"</td>");
				out.println("<td>"+e.getPassword()+"</td>");
				out.println("<td>"+e.getRoleId()+"</td>");
				out.println("<td>"+e.getEmailId()+"</td>");
				out.println("<td>"+e.getMobileNumber()+"</td>");
				out.println("<td>"+e.getTeamLeadName()+"</td>");
				out.println("<td>"+e.getLastLogin()+"</td>");
				out.println("<td><a href='OnmsServlet?action=Delete&empNo="+e.getEmployeeId()+"'>Delete</a></td></tr>");
			}
			out.println("</table>");
			out.println("<br><br>");
			out.println("<p align='center'><a href='searchUser.jsp'>Back</a></p>");
		}
		else if("update".equals(action)) {
			
			
			String username=request.getParameter("username");
			String emailid=request.getParameter("emailid");
			String  teamleadname=request.getParameter("teamleadname");
			String mobilenumber=request.getParameter("mobilenumber");
			String password =request.getParameter("password");
			long rolename=Long.parseLong(request.getParameter("roleid"));
			long employeenumber=Long.parseLong(request.getParameter("employeeid"));
			
			
			Onms emp=new Onms(employeenumber,username,password,rolename,emailid,mobilenumber,teamleadname);
			boolean result=service.updateUsers(emp);
			out.println("<h1 align='center'>ONMS WORK TRACKER</h1>");
			out.println("<hr><br>");
			if(result==true) {
				 RequestDispatcher requestDispatcher = request
		                    .getRequestDispatcher("/searchUser.jsp");
		            requestDispatcher.forward(request, response);
				
				out.println("<p align='center'><font color='green'>User updated succefully!!!</font></p>");
			} else {
				out.println("<p align='center'><font color='red'>User update failed!!!</font></p>");
			}
			out.println("<br><br>");
			out.println("<p align='center'><a href='index.jsp'>Back</a>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
