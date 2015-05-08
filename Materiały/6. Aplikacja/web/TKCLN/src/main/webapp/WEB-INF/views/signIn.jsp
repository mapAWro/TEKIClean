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
		<form action="#" th:action="@{/signIn}" th:object="${user}" method="post">
    	<p>Imie: <input type="text" th:field="*{name}" /></p>
        <p>Nazwisko: <input type="text" th:field="*{lastName}" /></p>
        <p>Login: <input type="text" th:field="*{login}" /></p>
        <p>Haslo: <input type="password" th:field="*{password}" /></p>
        <p>E-mail: <input type="text" th:field="*{email}" /></p>
        <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
    </form>
	</body>
</html>