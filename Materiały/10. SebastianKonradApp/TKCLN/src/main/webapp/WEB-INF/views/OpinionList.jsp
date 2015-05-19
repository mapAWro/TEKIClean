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
	        <h1>Opinions List</h1>
	        <h2><a href="/new">New Opinion</a></h2>
        	<table border="1">
	        	<th>ID</th>
	        	<th>Offer ID</th>
	        	<th>Cleaner ID</th>
	        	<th>Text</th>
	        	<th>Rate</th>
		        	
				<c:forEach var="opinion" items="${opinionList}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
					<td>${opinion.name}</td>
					<td>${opinion.last_name}</td>
					<td>${opinion.sex}</td>
					<td>${opinion.login}</td>
					
					<td>
						<a href="edit?opinion_id=${opinion.opinion_id}">Edit</a>
					    &nbsp;&nbsp;&nbsp;&nbsp;
						<a href="delete?opinion_id=${opinion.opinion_id}">Delete</a>
					</td>		
	        	</tr>
				</c:forEach>	        	
        	</table>
        </div>
    </body>
</html>