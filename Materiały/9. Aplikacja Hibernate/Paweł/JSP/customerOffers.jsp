<%@ page language="java" contentType="text/html; charset=ISO-8859-2"
    pageEncoding="ISO-8859-2"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<title>TEKIClean</title>
</head>
<body>
<div class="container">
		<div class="row">
			<div class="col-sm-12">
				<nav class="navbar navbar-inverse">
	  				<div class="container-fluid">
	    				<div class="navbar-header">
	      					<a class="navbar-brand a" href="/app">TekiClean</a>
	    				</div>
	    				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	    					<p class="navbar-text navbar-right"><b>Użytkownik:&nbsp;</b><b><a href="/app/userPRed"><c:out value="${users.login}"/></a>&nbsp;||</b>
	    					<a href="/app/logOut">Wyloguj</a></p>
	    				</div>
	  				</div>
				</nav> <!-- /navbar -->
			</div>
			<div class="col-sm-12 text-center"><br>
				<a href="/app/login">Strona główna</a><br>
				<h3>Aktualne/Zakończone Oferty użytkownika</h3>
			</div>
			<div class="row">
			  
			</div>
				<div class="col-sm-1"></div>
				<div class="col-sm-10">					
				
					<c:forEach items="${offersList}" var="offer">
						<div class="col-sm-6 col-md-4">
						    <div class="thumbnail">
						      <img src="${pageContext.request.contextPath}/resources/img/CustomerOff/uzytkownik.png" alt="...">
						      <div class="caption">
						        Oferta #<c:out value="${offer.offerId}"/> <c:out value="${offer.day}"/> <c:out value="${offer.time}"/><br>
								-----------------------------------<br> 
								<c:out value="${offer.desc}"/><br>
								<a href="/app/offerDetails/<c:out value="${offer.offerId}"/>">Więcej</a><br>
								-----------------------------------<br>
						        <p><a href="#" class="btn btn-danger" role="button">Anuluj oferte</a> 
						        <a href="#" class="btn btn-info" role="button">Ocen</a></p>
						      </div>
						    </div>
			  			</div>
					</c:forEach>
				
				</div>
				<div class="col-sm-1"></div>
				<div class="col-sm-12">
				<ol class="breadcrumb text-center breadcrumb-inverse">
					<li class="active">Nawigacja:</li>
  					<li><a href="/app">Strona glowna</a></li>
  					<li class="active">Uzywamy Cookies</li>
					<li class="active">Regulamin</li>
					<li class="active">Kontakt</li>
					<li class="active">Reklama</li>
					<li class="active">Prasa</li>
					<li class="active">O nas</li>
					<li class="active">Forum</li>
					<li class="active">Program Partnerski</li>
					<li class="active">Partnerzy</li>
				</ol>
			</div>
		</div> <!-- /row -->
	</div> <!-- /container -->
</body>
</html>