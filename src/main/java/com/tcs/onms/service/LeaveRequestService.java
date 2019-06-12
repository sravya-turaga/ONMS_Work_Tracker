package com.tcs.onms.service;

import java.util.ArrayList;

import com.tcs.onms.Dao.LeaveRequestDao;
import com.tcs.onms.bean.LeaveRequest;

public class LeaveRequestService {

	public boolean insertLeaveRequest(LeaveRequest lr) throws ClassNotFoundException{
		LeaveRequestDao ob=new LeaveRequestDao();
		return ob.insertLeaveRequest(lr);
	}
	public ArrayList<LeaveRequest> getLeaveRequestDetails(int empId) throws ClassNotFoundException{
		LeaveRequestDao ob=new LeaveRequestDao();
		return ob.getLeaveRequestDetails(empId);
	}
	public ArrayList<LeaveRequest> viewPendingRequest() throws ClassNotFoundException{
		LeaveRequestDao ob=new LeaveRequestDao();
		return ob.viewPendingRequest();	
	}
		
}
