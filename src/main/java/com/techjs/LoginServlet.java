package com.techjs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
       String name = req.getParameter("eName");
       String pass = req.getParameter("ePassword");
       
       resp.setContentType("text/html");
       RequestDispatcher rd;
       
       PrintWriter out =  resp.getWriter();
       
       if(name.equalsIgnoreCase("Candy") && pass.equalsIgnoreCase("1234"))
       {
    	   rd = req.getRequestDispatcher("welcome");
    	   rd.forward(req, resp);
       }
       else
       {
    	   out.print("! Invalid User Name or Password");
    	   rd = req.getRequestDispatcher("/index.html");
    	   rd.include(req, resp);
    	   
       }
		
	}

}
