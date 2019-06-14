package com.tcs.onms.service;


import java.util.ArrayList;

import com.tcs.onms.Dao.UserDao;
import com.tcs.onms.bean.User;

public class UserService {
	public ArrayList<User> getAllUsers() 
	{
		UserDao dao=new UserDao();
		return dao.getAllUsers();
	}

	public boolean addUsers(User emp) {
		// TODO Auto-generated method stub
		UserDao dao=new UserDao();
		return dao.addUsers(emp);
		
	}
	public boolean deleteUsers(long eNo) {
		// TODO Auto-generated method stub
		UserDao dao=new UserDao();
		return dao.deleteUsers(eNo);
	}
	public ArrayList<User> searchUsers(long eNo) {
		// TODO Auto-generated method stub
		UserDao dao=new UserDao();
		return dao.searchUsers(eNo);
	}
	public boolean updateUsers(User emp) {
		// TODO Auto-generated method stub
		UserDao dao=new UserDao();
		return dao.updateUsers(emp);
	}
	
}
