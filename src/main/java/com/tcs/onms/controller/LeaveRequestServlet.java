package com.tcs.onms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;








import com.tcs.onms.bean.LeaveRequest;
import com.tcs.onms.service.LeaveRequestService;



/**
 * Servlet implementation class LeaveRequestServlet
 */
@WebServlet("/LeaveRequestServlet")
public class LeaveRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LeaveRequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		LeaveRequestService service=new LeaveRequestService();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		boolean result=false;
		if("save".equals(action))
		{
			
			int empId=Integer.parseInt(request.getParameter("empid"));
			Date startDate=null;
			 java.sql.Date sqlStartDate=null;
			SimpleDateFormat startDate1 = new SimpleDateFormat("yyyy-MM-dd");
			startDate1.setLenient(false);
			try{
		    startDate=(Date)startDate1.parse(request.getParameter("startdate"));
		   sqlStartDate = new java.sql.Date(startDate.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date endDate=null;
			java.sql.Date sqlEndDate=null;
			SimpleDateFormat endDate1 = new SimpleDateFormat("yyyy-MM-dd");
			startDate1.setLenient(false);
			try{
			endDate=(Date)endDate1.parse(request.getParameter("enddate"));
			 sqlEndDate = new java.sql.Date(endDate.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Date submitDate=null;
			java.sql.Date sqlSubmitDate=null;
			SimpleDateFormat submitDate1 = new SimpleDateFormat("yyyy-MM-dd");
			submitDate1.setLenient(false);
			try{
			submitDate=(Date)submitDate1.parse(request.getParameter("submitdate"));
			sqlSubmitDate = new java.sql.Date(submitDate.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String leaveType=request.getParameter("leavetype");
			String reason=request.getParameter("detailedreason");
			
			LeaveRequest ob=new LeaveRequest(empId,sqlStartDate,sqlEndDate,sqlSubmitDate,leaveType,reason);
			try {
				result=service.insertLeaveRequest(ob);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(result==true) {
				LeaveRequestService service1 = new LeaveRequestService();
				ArrayList<LeaveRequest> leaveRequestList=null;
				try {
					leaveRequestList = service1.getLeaveRequestDetails(empId);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				request.setAttribute("LeaveRequestList",leaveRequestList);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/LeaveRequestList.jsp");
	            requestDispatcher.forward(request, response);
			}
			else
			{
				out.println("<p align='center'><font color='red'>Leave Details insertion failed!!!</font></p>");
			}
		}
		if("view".equals(action))
		{
			ArrayList<LeaveRequest> lr=new ArrayList<LeaveRequest>();
			try {
				lr=service.viewPendingRequest();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("LeaveRequestList",lr);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/LeaveApproval.jsp");
            requestDispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		doGet(request, response);
		
		}
	

}
