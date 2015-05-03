<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TEKIClean</title>
</head>
<body>
		<h2>	
			TekiCLEAN 
		</h2>		
		
		<br><a href="/app/login">zaloguj sie</a>
		<br><a href="/app/signIn">zarejestruj sie</a>
		<br><a href="/app/userManagement">Panel admina</a><br><br>
		
		<form:form method="POST" action="/app/home">
			<form:label path="searchParam">T</form:label>
			<form:input path="searchParam" />
			<input type="submit" value="szukaj"/>
		</form:form>
		
	</body>
</html>