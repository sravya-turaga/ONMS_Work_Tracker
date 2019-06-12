package com.tcs.onms.bean;

import java.util.Date;


public class LeaveRequest {
	int LeaveId;
	int empId;
	Date startDate;
	Date endDate;
	Date submitDate;
	String leaveType;
	String reason;
	String status;
	public LeaveRequest(int leaveId, Date startDate, Date endDate,
			Date submitDate, String leaveType, String reason, String status) {
		super();
		LeaveId = leaveId;
		this.empId = empId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.submitDate = submitDate;
		this.leaveType=leaveType;
		this.reason = reason;
		this.status = status;
	}
	public int getLeaveId() {
		return LeaveId;
	}
	public void setLeaveId(int leaveId) {
		LeaveId = leaveId;
	}
	public String getStatus() {
		return status;
	}
	
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public LeaveRequest(int empId, Date startDate, Date endDate,
			Date submitDate,String leaveType, String reason) {
		super();
		this.empId = empId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.submitDate = submitDate;
		this.leaveType = leaveType;
		this.reason = reason;
	}
	public LeaveRequest(int leaveId, int empId, Date startDate, Date endDate,
			Date submitDate, String leaveType, String reason) {
		super();
		LeaveId = leaveId;
		this.empId = empId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.submitDate = submitDate;
		this.leaveType = leaveType;
		this.reason = reason;
		this.status = status;
	}
	
	
	
}
	