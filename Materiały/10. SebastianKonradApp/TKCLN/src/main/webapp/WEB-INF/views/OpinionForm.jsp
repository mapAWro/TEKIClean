<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New or Edit Opinion</title>
</head>
<body>< 
	<div align="center">
		<h1>New/Edit Opinion</h1>
		<table>
			<form:form action="save" method="post" modelAttribute="opinion">
			<form:hidden path="opinion_id"/>
			<tr>
				<td>Opinion offer ID:</td>
				<td><form:input path="offer_id"/></td>
			</tr>
			<tr>
				<td>Opinion cleaner ID:</td>
				<td><form:input path="cleaner_id"/></td>
			</tr>
			<tr>
				<td>Opinion text:</td>
				<td><form:input path="text"/></td>
			</tr>
			<tr>
				<td>Opinion rate:</td>
				<td><form:input path="rate"/></td>
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