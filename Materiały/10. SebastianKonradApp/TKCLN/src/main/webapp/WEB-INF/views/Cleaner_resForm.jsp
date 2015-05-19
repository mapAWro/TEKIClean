<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New or Edit Cleaner_res</title>
</head>
<body>< 
	<div align="center">
		<h1>New/Edit Cleaner_res</h1>
		<table>
			<form:form action="saveCleaner_res" method="post" modelAttribute="cleaner_res">
			<form:hidden path="cleaner_res_id"/>
			<tr>
				<td>Cleaner_res resource ID:</td>
				<td><form:input path="resource_id"/></td>
			</tr>
			<tr>
				<td>Cleaner_res cleaner ID:</td>
				<td><form:input path="cleaner_id"/></td>
			</tr>
			<tr>
				<td>Cleaner_res quantity:</td>
				<td><form:input path="quantity"/></td>
			</tr>
			<tr>
				<td>Cleaner_res state:</td>
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