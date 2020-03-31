package com.abhi.conttroler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.abhi.model.*;
import com.abhi.dao.*;


public class Register extends HttpServlet 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		 doPost(req, resp);
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
	  resp.setContentType("text/html");
	  PrintWriter pw = resp.getWriter();
	  String name = req.getParameter("full_name");
	  String mobile = req.getParameter("mobile");
	  String email = req.getParameter("e_mail");
	  String password = req.getParameter("password");
	  
	
	  pw.print(name);
	  ModelRegister rg = new ModelRegister();
	  rg.setFull_name(name);
	  rg.setEmail_id(email);
	  rg.setPhone_no(mobile);
	  rg.setPassword(password);
	  
	  DaoRegister dr = new DaoRegister();
	  int i = dr.insert(rg);
	  if(i>0)
	  {
		  pw.print("Seccess!");
	  }
	  else
	  {
		  pw.print("Failled!");
	  }
	 
	  
	}


}
