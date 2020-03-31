package com.abhi.conttroler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abhi.dao.DaoLogin;
import com.abhi.model.ModelLogin;

public class Login extends HttpServlet {
	
	
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
	  String email = req.getParameter("e_mail");
	  String password = req.getParameter("password");
	  
	  
	  pw.print(email);
	  ModelLogin ml = new ModelLogin();
	  ml.setUser_name(email);
	  ml.setPass(password);
	  
	  DaoLogin dl = new DaoLogin();
	  String s = dl.check(ml);
	  
	  if(s!="")
	  {
		  pw.print(s);
	  }
	  else
	  {
		  pw.print("Failled!");
	  }
	}
	

}
