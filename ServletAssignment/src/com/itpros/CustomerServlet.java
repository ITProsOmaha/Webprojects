package com.itpros;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itpros.dto.Customer;

@WebServlet("/customer")
public class CustomerServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","lakshmi","lakshmi");
                        Statement st =   con.createStatement();
                        ResultSet rs = st.executeQuery("select * from customer");
                        List<Customer> customers = new ArrayList<Customer>();
                        
                        while(rs.next())
                        { 
                        //Create a new customer object
                          Customer cust = new Customer();
                        //Populate customer data from Database to DTO
                          cust.setCustomerID(rs.getInt(1));
                          cust.setStoreID(rs.getInt(2));
                          cust.setFirstName(rs.getString(3));
                          cust.setLastName(rs.getString(4));
                          cust.setEmail(rs.getString(5));
                          cust.setAddressID(rs.getInt(6)); 
                          System.out.println("Customer "+ cust);
                          //add this customer to List
                          customers.add(cust);
                        }
                        request.setAttribute("customerList", customers);
                        request.getRequestDispatcher("/JSP/customers.jsp").forward(request, response);
                        /*PrintWriter out =  response.getWriter();
                          out.println("<html> <table border = '1'>");
                          while(rs.next())
                          {		out.println("<tr>");
                                out.println("<td >"+ rs.getString(3)  +"</td>");
                                out.println("<td >"+ rs.getString(4) +"</td>");
                                out.println("</tr>");
                          }
                        	out.println("</table> </html>");*/

                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println(req.getParameter("fname"));
			System.out.println(req.getParameter("lname"));
			System.out.println(req.getParameter("email"));
			String sql;
			
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","lakshmi","lakshmi");
					Statement st =   con.createStatement();
					/*sql ="INSERT INTO customer(store_id,first_name,last_name,email,address_id) values" +
					           "(1,'"+req.getParameter("fname")+"','"+req.getParameter("lname")+"','" +req.getParameter("email")+"',5)";*/
					/*sql = "INSERT INTO customer(store_id,first_name,last_name,email,address_id)" 
					         +"values" +
			           "(1,'"+req.getParameter("fname")+"','"
			           		 +req.getParameter("lname")+"','" 
			           		 +req.getParameter("email")+"',5)";*/
					StringBuffer sb = new StringBuffer();
					sb.append("INSERT INTO customer(store_id,first_name,last_name,email,address_id)");
					sb.append("values");
					sb.append("(1,'");
					sb.append(req.getParameter("fname"));
					sb.append("','");
					sb.append(req.getParameter("lname"));
					sb.append("','");
					sb.append(req.getParameter("email"));
					sb.append("',5)");
					sql = sb.toString();

					//int status = st.executeUpdate("INSERT INTO customer(store_id,first_name,last_name,email,address_id) values" +
						//	                       "(1,'"+req.getParameter("fname")+"','"+req.getParameter("lname")+"','" +req.getParameter("email")+"',5)");
					int status = st.executeUpdate(sql);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	             

			
		}
}