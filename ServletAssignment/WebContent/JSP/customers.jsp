<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>>
<html> 
<head>
<link rel="stylesheet" href="./css/table.css">
</head>
<body>
<form action="../customer" method="get">
<table>
	 <tr>
	 <td>First Name:</td>
	 <td><input type="text" name="fname"></td>	
	 <td><input type="button" value="Get"></td>	 
	 </tr>
</table>	 
<table border = '1'>
	<th> Customer ID</th>
	<th> First Name</th>
	<th> Last Name</th>
	<th> Store ID</th>

<c:forEach items="${customerList}" var="customer">
	 <tr> 		
           <td > ${customer.customerID} </td>
           <td > ${customer.firstName} </td>
           <td > ${customer.lastName} </td>
           <td > ${customer.storeID} </td>  
	</tr>
</c:forEach>
</table> 
</form>
</body>
</html>