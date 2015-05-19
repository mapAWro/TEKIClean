<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User</title>
    </head>
    <body>
        <div align="center">
	        <h1>Customers List</h1>
	        <h2><a href="/EditCustomer">New Customer</a></h2>
        	<table border="1">
	        	<th>ID</th>
	        	<th>User ID</th>
	        	<th>Dorm Number</th>
	        	<th>Room</th>
	        	<th>Dorm Address</th>
		        	
				<c:forEach var="customer" items="${customerList}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
					<td>${customer.user_id}</td>
					<td>${customer.dorm_num}</td>
					<td>${customer.room}</td>
					<td>${customer.dorm_addres}</td>
					
					<td>
						<a href="edit?customer_id=${customer.customer_id}">Edit</a>
					    &nbsp;&nbsp;&nbsp;&nbsp;
						<a href="delete?customer_id=${customer.customer_id}">Delete</a>
					</td>		
	        	</tr>
				</c:forEach>	        	
        	</table>
        </div>
    </body>
</html>
