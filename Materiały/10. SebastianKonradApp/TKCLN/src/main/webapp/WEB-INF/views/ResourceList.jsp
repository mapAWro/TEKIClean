<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <div align="center">
	        <h1>Resources List</h1>
	        <h2><a href="/EditResource">New Resource</a></h2>
        	<table border="1">
	        	<th>No</th>
	        	<th>Username</th>
	        	<th>Email</th>
	        	
				<c:forEach var="resource" items="${resourceList}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
					<td>${resource.name}</td>
					<td>${resource.quantity}</td>
					<td>${resource.descr}</td>
					<td>
						<a href="edit?resource_id=${resource.resource_id}">Edit</a>
					    &nbsp;&nbsp;&nbsp;&nbsp;
						<a href="delete?resource_id=${resource.resource_id}">Delete</a>
					</td>		
	        	</tr>
				</c:forEach>	        	
        	</table>
        </div>
    </body>
</html>
