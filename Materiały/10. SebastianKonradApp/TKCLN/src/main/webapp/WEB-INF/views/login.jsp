<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
    pageEncoding="ISO-8859-2"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
<link  href="${pageContext.request.contextPath}/resources/css/log.css" rel="stylesheet"/>
<title>TEKIClean</title>
</head>
<body>
<div class="top">
	<div class="text">
            <a href="/app/login">Zaloguj się</a><span>| nie masz konta?</span> 
            <a href="/app/signIn">zarejestruj się</a>
    </div>
</div>
<div class="content">		 
		<form:form action="/app/login" method="post">
		<div class="form-group1">
        <p><form:input type="text" path="login" id="exampleInputEmail1" placeholder="Podaj login"/></p>
        </div>
        <div class="form-group2">
        <p><form:input type="password" path="password" id="exampleInputPassword1" placeholder="Podaj swoje hasło"/></p>
        </div>
        <div class="checkbox">
            <label>
                <input type="checkbox"> Zapamiętaj mnie
            </label>
        </div>
        <p><input type="submit" value="Zaloguj" id="submit"/></p>
    </form:form>
    <div class="linki">
             <a href="/app/signIn"><img src="${pageContext.request.contextPath}/resources/img/login/zarejestrujsie.png"/></a>
    </div>
</div>
	</body>
</html>