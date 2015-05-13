<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
    pageEncoding="ISO-8859-2"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/rej.css"/>
</head>

<body>
    <div class="top"></div>
    <div class="content">
    <form:form action="/app/signIn" method="post">
        <form:label path="email"></form:label><form:input path="login" id="p1"/>
        <form:label path="email"></form:label><form:input path="email" id="p2"/>
        <form:label path="password"></form:label><form:input type="password" path="password" id="p3"/>
        <form:label path="password"></form:label><form:input type="password" path="password" id="p4"/>
        <form:label path="dormNum"></form:label><form:input path="dormNum" id="p5"/>
        <form:label path="room"></form:label><form:input path="room" id="p6"/>
     	<p><input type="submit" value="Zarejestruj" id="submit" /></p>
     </form:form>
        
        <div class="checkbox">
            <label><input type="checkbox"></label>
            <label><input type="checkbox"></label>
            <label><input type="checkbox"></label>
        </div> 
    </div>
    <div class="footer"></div>
</body>
</html>