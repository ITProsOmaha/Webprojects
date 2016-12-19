package com.itpros;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testServlet")
public class TestServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Integer num1 = Integer.parseInt(req.getParameter("num1"));
		Integer num2 = Integer.parseInt(req.getParameter("num2"));
		
		Integer tot = num1 + num2;
		//resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("Sum of " +num1 +" and "+ num2 + " is "+ tot);	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
