package com.tcs.onms.service;


import java.util.ArrayList;

import com.tcs.onms.Dao.OnmsDao;
import com.tcs.onms.bean.Onms;

public class OnmsService {
	public ArrayList<Onms> getAllUsers() 
	{
		OnmsDao dao=new OnmsDao();
		return dao.getAllUsers();
	}

	public boolean addUsers(Onms emp) {
		// TODO Auto-generated method stub
		OnmsDao dao=new OnmsDao();
		return dao.addUsers(emp);
		
	}
	public boolean deleteUsers(long eNo) {
		// TODO Auto-generated method stub
		OnmsDao dao=new OnmsDao();
		return dao.deleteUsers(eNo);
	}
	public ArrayList<Onms> searchUsers(long eNo) {
		// TODO Auto-generated method stub
		OnmsDao dao=new OnmsDao();
		return dao.searchUsers(eNo);
	}
	public boolean updateUsers(Onms emp) {
		// TODO Auto-generated method stub
		OnmsDao dao=new OnmsDao();
		return dao.updateUsers(emp);
	}
	
}
