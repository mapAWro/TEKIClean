<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New or Edit Offer</title>
</head>
<body>< 
	<div align="center">
		<h1>New/Edit Offer</h1>
		<table>
			<form:form action="save" method="post" modelAttribute="offer">
			<form:hidden path="offer_id"/>
			<tr>
				<td>Offer cleaner ID:</td>
				<td><form:input path="cleaner_id"/></td>
			</tr>
			<tr>
				<td>Offer type:</td>
				<td><form:input path="offer_type"/></td>
			</tr>
			<tr>
				<td>Offer description:</td>
				<td><form:input path="descr"/></td>
			</tr>
			<tr>
				<td>Offer scheduled:</td>
				<td><form:input path="scheduled"/></td>
			</tr>
			<tr>
				<td>Offer day:</td>
				<td><form:password path="day"/></td>
			</tr>
			<tr>
				<td>Offer time:</td>
				<td><form:input path="time"/></td>
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