package com.itpros;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer num1 = Integer.parseInt(req.getParameter("Number1"));
		Integer num2 = Integer.parseInt(req.getParameter("Number2"));

		Integer tot = addition(num1,num2);
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3> Number 1 " + num1 + "</h3>");
		out.println("<h3> Number 2 " + num2 + "</h3>");
		out.println("<h3> Total    " + tot + "</h3>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}
		
    public Integer addition(Integer num1, Integer num2){
    	Integer total = num1 + num2;
    	return total;
    }
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
