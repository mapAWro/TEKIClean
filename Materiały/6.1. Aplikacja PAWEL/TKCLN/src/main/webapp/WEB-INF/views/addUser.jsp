<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
    pageEncoding="ISO-8859-2"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
		<title>Dodaj sprzątacza</title>
	</head>
	<body>
		<h2>User information</h2>
		<form:form method="POST" action="/app/addUser"> 
		<table>
    	<tr>
	        <td><form:label path="name">Name</form:label></td>
	        <td><form:input path="name" /></td>
	    </tr>
	    <tr>
	        <td><form:label path="lastName">Last name</form:label></td>
	        <td><form:input path="lastName" /></td>
	    </tr>
	    <tr>
	        <td colspan="2">
	            <input type="submit" value="Submit"/>
	        </td>
    	</tr>
		</table>   
		</form:form>
	</body>
</html>