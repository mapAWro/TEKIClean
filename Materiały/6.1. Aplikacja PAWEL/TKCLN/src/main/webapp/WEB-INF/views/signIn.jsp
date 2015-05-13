<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
    pageEncoding="ISO-8859-2"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
<title>TEKIClean</title>
</head>
<body>
		<h2>	
			Rejestracja użytkownika 
		</h2>
		<form:form action="/app/signIn" method="post">
		
    	<p><form:label path="name">Imię: </form:label><form:input path="name" /></p>
    	
        <p><form:label path="lastName">Nazwisko: </form:label><form:input path="lastName" /></p>
        
        <p><form:label path="login">Login: </form:label><form:input path="login" /></p>
        
        <p><form:label path="password">Hasło: </form:label><form:input type="password" path="password" /></p>
        
        <p><form:label path="email">Twój email: </form:label><form:input path="email" />@student.pwr.edu.pl</p>
        
        <p><form:label path="dormNum">Akademik: </form:label><form:input path="dormNum" /></p>
        <p><form:label path="room">Nr pokoju: </form:label><form:input path="room" /></p>
        
        <p><input type="submit" value="Zarejestruj" /></p>
    </form:form>
	</body>
</html>