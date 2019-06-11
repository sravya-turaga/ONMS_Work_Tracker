package com.tcs.onms.bean;

import java.sql.Date;
//Sravya
public class Onms {
long employeeId;
String userName;
String password;
long roleId;
String emailId;
String mobileNumber;
String teamLeadName;
Date lastLogin;

public Date getLastLogin() {
	return lastLogin;
}
public void setLastLogin(Date lastLogin) {
	this.lastLogin = lastLogin;
}
public Long getRoleId() {
	return roleId;
}
public void setRoleId(Long roleId) {
	this.roleId = roleId;
}
public void setRoleId(long roleId) {
	this.roleId = roleId;
}
public String getTeamLeadName() {
	return teamLeadName;
}
public void setTeamLeadName(String teamLeadName) {
	this.teamLeadName= teamLeadName;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getPassword() {
	return password;
}
public Onms(long employeeId, String userName, String password, long roleId,
		String emailId, String mobileNumber, String teamLeadName) {
	super();
	this.employeeId = employeeId;
	this.userName = userName;
	this.password = password;
	this.roleId = roleId;
	this.emailId = emailId;
	this.mobileNumber = mobileNumber;
	this.teamLeadName = teamLeadName;
	//this.lastLogin=lastLogin;
}
public Onms(long employeeId, String userName, String password, long roleId,
		String emailId, String mobileNumber, String teamLeadName,Date lastLogin) {
	super();
	this.employeeId = employeeId;
	this.userName = userName;
	this.password = password;
	this.roleId = roleId;
	this.emailId = emailId;
	this.mobileNumber = mobileNumber;
	this.teamLeadName = teamLeadName;
	this.lastLogin=lastLogin;
}
public void setPassword(String password) {
	this.password = password;
}
public long getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(long employeeId) {
	this.employeeId = employeeId;
}
public Onms() {
	super();
}

}
