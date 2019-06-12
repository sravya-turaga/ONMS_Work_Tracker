package com.tcs.onms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LeaveRequestDBUtility {
	
	private static Connection connection = null;
	private static String url="jdbc:mysql://135.254.237.39:3306/ONMS_WORK_TRACKER";
	private static String username="sravya";
	private static String password="sravya123";
		
	public static Connection createConnection() throws ClassNotFoundException, SQLException {		
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection(url, username, password);
		System.out.println("Connection successfull");
		return connection;
	}
	
	public static void closeConnection()
	{
		try
		{
			if(connection!=null && connection.isClosed()==false)
			{
				connection.close();
				connection=null;
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public static void closePreparedStatement(Statement ps){
		if(ps!=null){
			try {
				ps.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}
	
	public static void closeResultSet(ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
	}

}
