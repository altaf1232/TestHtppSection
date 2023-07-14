package com.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestHttpSessionA extends HttpServlet
{
	private static final long serialVersionUID = 1L;

  public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException 
  {
	try 
	{
	
	  res.setContentType("text/html");
	  PrintWriter out=res.getWriter();
	  
	  String n=req.getParameter("userName");
	  out.print("Welcome"+n);
	  
	  HttpSession session=req.getSession();
	  session.setAttribute("uname", n);
	  out.print("<a> href='TestHttpSessionB'>visit<a/>");
	  out.close();
	}
	catch(Exception e) 
	{
		System.out.println(e);
	}
  }
}
