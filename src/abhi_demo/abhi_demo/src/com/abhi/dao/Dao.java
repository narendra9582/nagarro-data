package com.abhi.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao{
	
	static Connection conn;
	
	public static Connection getCon()
	{
		String driver_name = "";
		String url = "";
		String user_id = "";
		String password = "";
		
		
		try
		{
		    Class.forName(driver_name);
		    conn = DriverManager.getConnection(url,user_id,password);
		    
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		return conn;
		
	}
	
	
	
}
