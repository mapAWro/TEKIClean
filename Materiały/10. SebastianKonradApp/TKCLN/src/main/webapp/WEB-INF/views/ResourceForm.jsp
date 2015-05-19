<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New or Edit Resource</title>
</head>
<body> 
	<div align="center">
		<h1>New/Edit Resource</h1>
		<table>
			<form:form action="save" method="post" modelAttribute="resource">
			<form:hidden path="resource_id"/>
			<tr>
				<td>Resource Name:</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>Resource Quantity:</td>
				<td><form:input path="quantity"/></td>
			</tr>
			<tr>
				<td>Resource Desc:</td>
				<td><form:input path="descr"/></td>
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