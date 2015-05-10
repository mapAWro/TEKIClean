<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>


<html>

	<head>
		<title><fmt:message key="messages.title"/></title>
	</head>

	<body>
		<h1>	
			User management 
		</h1>
	
		<p>Server time: <c:out value="${serverTime}"/></p>
	
		<h3>Users</h3>
		
		<c:forEach items="${users}" var="usr">
			<c:out value="${usr.name}"/> <i><c:out value="${usr.lastName}"/></i>  <c:out value="${usr.authLvl}"/><br>
		</c:forEach>
		
		<br><br><a href="/app/user">Add new user</a>
		
	</body>
</html>
