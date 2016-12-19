package com.itpros;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryCapitalFinderServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String country = req.getParameter("countryID");
		String capital;
		
		if (country.equalsIgnoreCase("India")) {
			capital = "Delhi";
			System.out.println("Delhi");
		}		
		else if (country.equalsIgnoreCase("USA")) {
			capital = "Washington, DC";
		}
		else if (country.equalsIgnoreCase("UK"))  {
				capital = "London";
		}
		else if (country.equalsIgnoreCase("Turkey")) {
				capital = "Ankara";
		}
		else if (country.equalsIgnoreCase("ITALY")) {
				capital = "Rome";
		}
		else if (country.equalsIgnoreCase("FRANCE")) {
				capital = "Paris";
		}
		else if (country.equalsIgnoreCase("BANGLADESH")) {
				capital = "Dhaka";
		}
		else if (country.equalsIgnoreCase("GERMANY")) {
				capital = "Berlin";
		}
		else if (country.equalsIgnoreCase("POLAND")) {
				capital = "Warsaw";
		}
		else {
			capital = "Not Applicable";
		}
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3> Capital of " + country + " is " +capital + "</h3>");
		out.println("</body>");
		out.println("</html>");
	}
}
