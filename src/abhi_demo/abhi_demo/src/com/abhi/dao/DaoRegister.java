package com.abhi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.abhi.model.ModelRegister;

public class DaoRegister 
{
	
	public int insert( ModelRegister m)
	{
		int i = 0;
		try
		{
			Connection con = Dao.getCon();
			String sqll="insert into RegisterUser VALUES(?,?,?,?)"; 
			PreparedStatement pst=con.prepareStatement(sqll); 
			pst.setString(1,m.getFull_name());
			pst.setString(2,m.getPhone_no());
			pst.setString(3,m.getEmail_id());
			pst.setString(4,m.getPassword());
			
			i = pst.executeUpdate();
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
			}
		return i;
	}

}
