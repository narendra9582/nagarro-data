package com.abhi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.abhi.model.ModelLogin;

public class DaoLogin 
{

	public String check( ModelLogin m)
	{
		String i = "";
		try
		{
			Connection con = Dao.getCon();
			String sqll="select fullname from RegisterUser where emailid=? and password=?"; 
			PreparedStatement pst=con.prepareStatement(sqll); 
			pst.setString(1,m.getUser_name());
			pst.setString(2,m.getPass());
			ResultSet rs = pst.executeQuery();
			if( rs.next())
			{
				i = rs.getString(1);
			}
						
			
		} catch (Exception e) {
			System.out.println(e);
			}
		return i;
	}
	
	
	
	
	
}
