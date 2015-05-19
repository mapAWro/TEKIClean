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
	        <h1>Users List</h1>
	        <h2><a href="app/EditUser">New Resource</a></h2>
        	<table border="1">
	        	<th>No</th>
	        	<th>Name</th>
	        	<th>Last_Name</th>
	        	<th>Sex</th>
	        	<th>Login</th>
	        	<th>Password</th>
	        	<th>Email</th>
	        	<th>Phone_Num</th>
	        	<th>Auth_Lvl</th>
	        	<th>Locality</th>
	        	<th>Street_Addr</th>
	        	<th>Postal_Code</th>
	        	<th>Post_Loc</th>		        	
				<c:forEach var="user" items="${userList}" varStatus="status">
	        	<tr>
	        		<td>${status.index + 1}</td>
					<td>${user.name}</td>
					<td>${user.last_name}</td>
					<td>${user.sex}</td>
					<td>${user.login}</td>
					<td>${user.password}</td>
					<td>${user.email}</td>
					<td>${user.phone_num}</td>
					<td>${user.auth_lvl}</td>
					<td>${user.locality}</td>
					<td>${user.street_addr}</td>
					<td>${user.postal_code}</td>
					<td>${user.post_loc}</td>
					
					<td>
						<a href="editUser?user_id=${user.user_id}">Edit</a>
					    &nbsp;&nbsp;&nbsp;&nbsp;
						<a href="deleteUser?user_id=${user.user_id}">Delete</a>
					</td>		
	        	</tr>
				</c:forEach>	        	
        	</table>
        </div>
    </body>
</html>
