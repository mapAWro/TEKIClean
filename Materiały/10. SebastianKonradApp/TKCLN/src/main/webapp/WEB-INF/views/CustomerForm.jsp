<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New or Edit Customer</title>
</head>
<body>< 
	<div align="center">
		<h1>New/Edit Customer</h1>
		<table>
			<form:form action="save" method="post" modelAttribute="customer">
			<form:hidden path="customer_id"/>
			<tr>
				<td>Customer user ID:</td>
				<td><form:input path="user_id"/></td>
			</tr>
			<tr>
				<td>Customer dorm number:</td>
				<td><form:input path="dorm_num"/></td>
			</tr>
			<tr>
				<td>Customer room:</td>
				<td><form:input path="room"/></td>
			</tr>
			<tr>
				<td>Customer dorm address:</td>
				<td><form:input path="dorm_addres"/></td>
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