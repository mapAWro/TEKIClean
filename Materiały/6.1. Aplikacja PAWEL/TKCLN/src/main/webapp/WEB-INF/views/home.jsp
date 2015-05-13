<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
    pageEncoding="ISO-8859-2"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
<link  href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet"/>
<title>TEKIClean</title>
</head>
<body>
		
	<div class="top">
		<div class="text">
            <a href="/app/login">Zaloguj się</a><span>| nie masz konta?</span> 
            <a href="/app/signIn">zarejestruj się</a><br>
            <a href="/app/userManagement">Panel admina</a><br>
        </div>
    </div>
    <div class="content">
    <div class="form-control">
            <form:form method="POST" action="/app/home_Tsearch">
			<form:input path="searchParam" />
			<input type="submit" value="szukaj"/>
		</form:form>
     </div>
     </div>
    <div class="tech"></div>
    <div class="footer"></div>		
	</body>
</html>