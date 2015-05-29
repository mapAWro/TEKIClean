<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	    					<p class="navbar-text navbar-right"><a href="/app/login" class="navbar-link">Zaloguj sie</a>||<a href="/app/signIn" class="navbar-link">Zarejestruj</a></p>
	    				</div>
	  				</div>
				</nav> <!-- /navbar -->
			</div>
			
			<div class="col-sm-12"><h1>&nbsp;</h1></div>
			
			<div class="col-sm-4"></div>		
			<div class="col-sm-4">
			
					<form:form class="form-horizontal" action="/app/signIn" method="post">
					  <div class="form-group">
					    <label for="exampleInputName2" class="col-sm-2 control-label">Imie: </label>
					    <div class="col-sm-10">
					      <form:input type="text" path="name" class="form-control" id="exampleInputName2" placeholder="Podaj swoje imie"/>
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="exampleInputName2" class="col-sm-3 control-label">Nazwisko: </label>
					    <div class="col-sm-9">
					      <form:input type="text" path="lastName" class="form-control" id="exampleInputName2" placeholder="Podaj swoje nazwisko"/>
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputEmail3" class="col-sm-2 control-label">Email: </label>
					    <div class="col-sm-10">
					      <form:input type="text" path="email" class="form-control" id="inputEmail3" placeholder="Podaj email"/>
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="exampleInputName2" class="col-sm-2 control-label">Login: </label>
					    <div class="col-sm-10">
					      <form:input type="text" path="login" class="form-control" id="exampleInputName2" placeholder="Podaj swoj login"/>
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="inputPassword3" class="col-sm-2 control-label">Haslo</label>
					    <div class="col-sm-10">
					      <form:input type="password" path ="password" class="form-control" id="inputPassword3" placeholder="Podaj haslo"/>
					    </div>
					  </div>
					  <div class="form-group">
					    <div class="col-sm-offset-4 col-sm-8">
					      <button type="submit" class="btn btn-success btn-lg">Zarejestruj</button>
					    </div>
					  </div>
					</form:form>
			</div>
			
			<div class="col-sm-4"></div>
			
			<div class="col-sm-12"><h1>&nbsp;</h1></div>
			
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