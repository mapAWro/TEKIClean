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
	        <h1>Offers List</h1>
	        <h2><a href="/EditOffer">New Offer</a></h2>
        	<table border="1">
	        	<th>ID</th>
	        	<th>Cleaner ID</th>
	        	<th>Offer Type</th>
	        	<th>Description</th>
	        	<th>Scheduled</th>
	        	<th>Day</th>
	        	<th>Time</th>

		        	
				<c:forEach var="offer" items="${offerList}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
					<td>${offer.cleaner_id}</td>
					<td>${offer.offer_type}</td>
					<td>${offer.descr}</td>
					<td>${offer.scheduled}</td>
					<td>${offer.day}</td>
					<td>${offer.time}</td>
					
					<td>
						<a href="edit?offer_id=${offer.offer_id}">Edit</a>
					    &nbsp;&nbsp;&nbsp;&nbsp;
						<a href="delete?offer_id=${offer.offer_id}">Delete</a>
					</td>		
	        	</tr>
				</c:forEach>	        	
        	</table>
        </div>
    </body>
</html>