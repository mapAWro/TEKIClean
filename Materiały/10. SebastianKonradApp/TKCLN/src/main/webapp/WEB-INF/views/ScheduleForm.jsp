<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New or Edit Schedule</title>
</head>
<body>< 
	<div align="center">
		<h1>New/Edit Schedule</h1>
		<table>
			<form:form action="save" method="post" modelAttribute="schedule">
			<form:hidden path="schedule_id"/>
			<tr>
				<td>Schedule cleaner id:</td>
				<td><form:input path="cleaner_id"/></td>
			</tr>
			<tr>
				<td>Schedule day:</td>
				<td><form:input path="day"/></td>
			</tr>
			<tr>
				<td>Schedule time range:</td>
				<td><form:input path="time_range"/></td>
			</tr>

			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Save">
				</td>
			</tr>			
			</form:form>
		</table>
	</div>     
</body>
</html>