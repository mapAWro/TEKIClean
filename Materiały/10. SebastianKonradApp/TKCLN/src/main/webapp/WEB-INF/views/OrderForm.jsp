<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New or Edit Order</title>
</head>
<body>< 
	<div align="center">
		<h1>New/Edit Order</h1>
		<table>
			<form:form action="save" method="post" modelAttribute="order">
			<form:hidden path="order_id"/>
			<tr>
				<td>Order customer ID:</td>
				<td><form:input path="customer_id"/></td>
			</tr>
			<tr>
				<td>Order offers offer ID:</td>
				<td><form:input path="offers_offer_id"/></td>
			</tr>
			<tr>
				<td>Order term:</td>
				<td><form:input path="term"/></td>
			</tr>
			<tr>
				<td>Order state:</td>
				<td><form:input path="state"/></td>
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