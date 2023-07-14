package com.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestHttpSessionB extends HttpServlet
{
  
	private static final long serialVersionUID = 1L;

  public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
  {
	try
	{
	 res.setContentType("text/html");
	 PrintWriter out=res.getWriter();
	 
	 HttpSession session=req.getSession(false);
	 String n=(String)session.getAttribute("uname");
	 
	 out.print("Hello "+n);
	 out.close();  
	}
	catch(Exception e) 
	{
		System.out.println(e);
	}
  }
}
