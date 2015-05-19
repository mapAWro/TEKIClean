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
	        <h1>Order List</h1>
	        <h2><a href="/EditOrder">New Order</a></h2>
        	<table border="1">
	        	<th>ID</th>
	        	<th>Customer ID</th>
	        	<th>Offers ID</th>
	        	<th>Term</th>
	        	<th>State</th>
		        	
				<c:forEach var="order" items="${orderList}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
					<td>${order.customer_id}</td>
					<td>${order.Offers_offer_id}</td>
					<td>${order.term}</td>
					<td>${order.state}</td>
					
					<td>
						<a href="edit?order_id=${order.order_id}">Edit</a>
					    &nbsp;&nbsp;&nbsp;&nbsp;
						<a href="delete?order_id=${order.order_id}">Delete</a>
					</td>		
	        	</tr>
				</c:forEach>	        	
        	</table>
        </div>
    </body>
</html>