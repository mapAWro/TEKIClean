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

<div>
<br><a href="/app/Cleaner_res">Cleaner_res</a>
<br><a href="/app/Cleaner">Cleaner</a>
<br><a href="/app/Customer">Customer</a>
<br><a href="/app/Offer">Offer</a>
<br><a href="/app/Opinion">Opinion</a>
<br><a href="/app/Order">Order</a>
<br><a href="/app/Resource">Resource</a>
<br><a href="/app/Schedule">Schedule</a>
<br><a href="/app/User">User</a>
</div>
		
	<div class="top">
	<div class="text">
		<br><a href="/app/login">zaloguj się</a><span>| nie masz konta?</span>
		<a href="/app/signIn">zarejestruj się</a>
		<br><a href="/app/userManagement">Panel admina </a><span>||||</span>
		<a href="/app/offers"> Oferty</a><br><b>Użytkownik:</b><b><a href="/app/userPRed"><c:out value="${userLogin}"/></a></b><span>||||</span>
		<a href="/app/logOut">Wyloguj</a><br>
	</div>
	</div>
    <div class="content"></div>
    <div class="tech"></div>
    <div class="footer"></div>

	</body>
</html>