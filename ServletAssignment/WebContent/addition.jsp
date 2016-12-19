<%@page import="com.itpros.AdditionServlet"%>
<html>
<head>
</head>
<body>
<h3> Number 1 is <%= request.getParameter("Number1")  %> </h3>
<h3> Number 2 is <%= request.getParameter("Number2") %> </h3>
<h3> Sum of the numbers is <%= (Integer.parseInt(request.getParameter("Number1")) 
				 +Integer.parseInt(request.getParameter("Number2")))%> </h3>

</body>
</html>