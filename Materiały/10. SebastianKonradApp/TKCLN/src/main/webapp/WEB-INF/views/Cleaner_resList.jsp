<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>opinion</title>
    </head>
    <body>
        <div align="center">
	        <h1>Cleaner_res List</h1>
	        <h2><a href="/EditCleaner_res">New Cleaner_res</a></h2>
        	<table border="1">
	        	<th>ID</th>
	        	<th>Resource ID</th>
	        	<th>Cleaner ID</th>
	        	<th>Quantity</th>
	        	<th>State</th>
		        	
				<c:forEach var="cleaner_res" items="${cleaner_resList}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
					<td>${cleaner_res.resource_id}</td>
					<td>${cleaner_res.cleaner_id}</td>
					<td>${cleaner_res.quantity}</td>
					<td>${cleaner_res.state}</td>
					
					<td>
				<a href="editCleaner_res?cleaner_res_id=${cleaner_res.cleaner_res_id}">Edit</a>
					    &nbsp;&nbsp;&nbsp;&nbsp;
				<a href="deleteCleaner_res?cleaner_res_id=${cleaner_res.cleaner_res_id}">Delete</a>
					</td>		
	        	</tr>
				</c:forEach>	        	
        	</table>
        </div>
    </body>
</html>