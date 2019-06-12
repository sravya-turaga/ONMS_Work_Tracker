package com.tcs.onms.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;







import com.tcs.onms.util.LeaveRequestDBUtility;
import com.tcs.onms.bean.LeaveRequest;



public class LeaveRequestDao {
	public boolean insertLeaveRequest(LeaveRequest lr) throws ClassNotFoundException {
		boolean result=false;
		try {
			Connection cn=LeaveRequestDBUtility.createConnection();
			PreparedStatement ps=cn.prepareStatement("INSERT INTO LeaveDetails (EmpId,StartDate,EndDate,SubmitDate,LeaveType,Reason) VALUES(?,?,?,?,?,?)");
			ps.setInt(1, lr.getEmpId());
			ps.setDate(2, (Date) lr.getStartDate());
			ps.setDate(3, (Date) lr.getEndDate());
			ps.setDate(4,(Date) lr.getSubmitDate());
			ps.setString(5,lr.getLeaveType());
			ps.setString(6,lr.getReason());
			int t=ps.executeUpdate();
			System.out.println("The value of t "+t);
			if(t>0) {
				result=true;
			}
			else
			{
				result=false;
			}
			LeaveRequestDBUtility.closePreparedStatement(ps);
			LeaveRequestDBUtility.closeConnection();
		
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	
		System.out.println("the value of result "+result);
		return result;
	}
	public ArrayList<LeaveRequest> getLeaveRequestDetails(int empId) throws ClassNotFoundException
	{
		ArrayList<LeaveRequest> leaveRequestList=new ArrayList<LeaveRequest>();
		try {
			Connection cn=LeaveRequestDBUtility.createConnection();
			PreparedStatement ps=cn.prepareStatement("select * from LeaveDetails where EmpId=?");
			ps.setInt(1,empId);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
			
				LeaveRequest lr=new LeaveRequest(rs.getInt(1),rs.getDate(3), rs.getDate(4), rs.getDate(5),rs.getString(6),rs.getString(7),rs.getString(8));
				leaveRequestList.add(lr);
			}
			LeaveRequestDBUtility.closeResultSet(rs);
			LeaveRequestDBUtility.closePreparedStatement(ps);
			LeaveRequestDBUtility.closeConnection();
		}  catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return leaveRequestList;
	}
	public ArrayList<LeaveRequest> viewPendingRequest() throws ClassNotFoundException
	{
		ArrayList<LeaveRequest> leaveRequestList=new ArrayList<LeaveRequest>();	
		try {
			Connection cn=LeaveRequestDBUtility.createConnection();
			PreparedStatement ps=cn.prepareStatement("select * from LeaveDetails where Status='PENDING'");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				LeaveRequest lr=new LeaveRequest(rs.getInt(1),rs.getInt(2),rs.getDate(3), rs.getDate(4), rs.getDate(5),rs.getString(6),rs.getString(7));
				leaveRequestList.add(lr);
			}
			LeaveRequestDBUtility.closeResultSet(rs);
			LeaveRequestDBUtility.closePreparedStatement(ps);
			LeaveRequestDBUtility.closeConnection();
		}  catch(SQLException e) {	
			System.out.println(e.getMessage());
		}
		return leaveRequestList;
	}
	
	}


