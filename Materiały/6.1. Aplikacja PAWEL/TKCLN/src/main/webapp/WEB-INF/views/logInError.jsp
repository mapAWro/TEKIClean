<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
    pageEncoding="ISO-8859-2"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head lang="">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/loginErr.css"/>
    <title>Login error</title>
</head>
<body>

<h2>B��d logowania!</h2>
<br><h1>Nieprawid�owa nazwa u�ytkownika lub has�o.</h1>
<br><a href="/app/login">Spr�buj jeszcze raz</a>
	<br><br><a href="/app/">Powr�t</a>  
</body>
</html>