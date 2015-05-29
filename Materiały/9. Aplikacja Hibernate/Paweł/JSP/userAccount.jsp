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
			<div class="col-sm-12 text-center">
				<h1><span class="label label-info">Panel klienta</span></h1>
				<h5>&nbsp;</h5>
			</div>
			<div class="col-sm-2">
				<img src="${pageContext.request.contextPath}/resources/img/UA/logo.png">
				<h1>&nbsp;</h1><img src="${pageContext.request.contextPath}/resources/img/UA/logo.png">	
				<h1>&nbsp;</h1><img src="${pageContext.request.contextPath}/resources/img/UA/logo.png">
			</div>
			
			<div class="col-sm-8">
				<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
					  <!-- Indicators -->
					  <ol class="carousel-indicators">
					    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
					    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
					    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
					  </ol>
					
					  <!-- Wrapper for slides -->
					  <div class="carousel-inner" role="listbox">
					    <div class="item active">
					    <a href="/app/offers" role="button">
					      <img src="${pageContext.request.contextPath}/resources/img/UA/grad9.png" alt="Oferty">
					    </a>
					      <div class="carousel-caption">
					      	<h1>Przegladaj dostepne oferty</h1><br>
					      	<h1>&nbsp;</h1>
					      </div>
					    </div>
					    <div class="item">
					    <a href="/app/customerOffers" role="button">
					      <img src="${pageContext.request.contextPath}/resources/img/UA/grad7.jpg" alt="COS2">
					      </a>
					      <div class="carousel-caption">
					        <h1>Wystaw opinie/anuluj oferte</h1><br>
					      	<h1>&nbsp;</h1>
					      </div>
					    </div>
					<div class="item">
					<a href="/app/customerPanel" role="button">
					      <img src="${pageContext.request.contextPath}/resources/img/UA/grad10.jpg" alt="COS3">
					      </a>
					      <div class="carousel-caption">
					        <h1>PROFIL</h1><br>
					      	<h1>&nbsp;</h1>
					      </div>
					      
					    </div>
					  </div>
					
					  <!-- Controls -->
					  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
					    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					    <span class="sr-only">Previous</span>
					  </a>
					  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
					    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					    <span class="sr-only">Next</span>
					  </a>
				</div>
			</div>
			<div class="col-sm-2">
				<h1>&nbsp;</h1><img src="${pageContext.request.contextPath}/resources/img/UA/logo.png">
				<h1>&nbsp;</h1><img src="${pageContext.request.contextPath}/resources/img/UA/logo.png">
				<h1>&nbsp;</h1><img src="${pageContext.request.contextPath}/resources/img/UA/logo.png">
			</div>
			
			<div class="col-sm-12">&nbsp;</div>
			<div class="col-sm-12">
				<ol class="breadcrumb text-center bg-success">
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
	
	    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    
    <script type="text/javascript">
    
    </script>
</body>
</html>