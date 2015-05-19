<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New or Edit User</title>
</head>
<body> 
	<div align="center">
		<h1>New/Edit User</h1>
		<table>
			<form:form action="saveUser" method="post" modelAttribute="user">
			<form:hidden path="user_id"/>
			<tr>
				<td>User name:</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>User last name:</td>
				<td><form:input path="last_name"/></td>
			</tr>
			<tr>
				<td>User sex:</td>
				<td><form:input path="sex"/></td>
			</tr>
			<tr>
				<td>User login:</td>
				<td><form:input path="login"/></td>
			</tr>
			<tr>
				<td>User password:</td>
				<td><form:password path="password"/></td>
			</tr>
			<tr>
				<td>User email:</td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td>User phone number:</td>
				<td><form:input path="phone_num"/></td>
			</tr>
			<tr>
				<td>User auth level:</td>
				<td><form:input path="auth_lvl"/></td>
			</tr>
			<tr>
				<td>User locality:</td>
				<td><form:input path="locality"/></td>
			</tr>
			<tr>
				<td>User street address:</td>
				<td><form:input path="street_addr"/></td>
			</tr>
			<tr>
				<td>User postal code:</td>
				<td><form:input path="postal_code"/></td>
			</tr>
			<tr>
				<td>User post location:</td>
				<td><form:input path="post_loc"/></td>
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