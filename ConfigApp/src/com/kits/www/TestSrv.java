package com.kits.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestSrv extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		ServletConfig config=getServletConfig();
		
		pw.println(config.getInitParameter("driver")+"<br>");
		pw.println(config.getInitParameter("url")+"<br>");
		
		Enumeration<String> e=config.getInitParameterNames();
		while(e.hasMoreElements())
		{
			String s=e.nextElement();
			pw.println(s+"<br>");
		}
		
		pw.println(config.getServletName()+"<br>");
		
		pw.close();
	}
}













