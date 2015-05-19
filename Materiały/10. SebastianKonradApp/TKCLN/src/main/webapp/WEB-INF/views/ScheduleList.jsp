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
	        <h1>Schedule List</h1>
	        <h2><a href="/new">New Schedule</a></h2>
        	<table border="1">
	        	<th>ID</th>
	        	<th>Cleaner ID</th>
	        	<th>Day</th>
	        	<th>Time Range</th>	        	
				<c:forEach var="schedule" items="${scheduleList}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
					<td>${schedule.cleaner_id}</td>
					<td>${schedule.day}</td>
					<td>${schedule.time_range}</td>

					<td>
						<a href="edit?schedule_id=${schedule.schedule_id}">Edit</a>
					    &nbsp;&nbsp;&nbsp;&nbsp;
						<a href="delete?schedule_id=${schedule.schedule_id}">Delete</a>
					</td>		
	        	</tr>
				</c:forEach>	        	
        	</table>
        </div>
    </body>
</html>