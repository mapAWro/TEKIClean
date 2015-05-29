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
	    					<p class="navbar-text navbar-right"><a href="/app/login" class="navbar-link">Zaloguj sie</a>||<a href="/app/signIn" class="navbar-link">Zarejestruj</a></p>
	    				</div>
	  				</div>
				</nav> <!-- /navbar -->
			</div>
			<div class="col-sm-1"></div>
			<div class="col-sm-10 text-center">
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" data-whatever="@student.pwr.edu.pl">Chce byc sprzatajacym!!</button>
				<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
				  <div class="modal-dialog">
				    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        <h4 class="modal-title" id="exampleModalLabel">Nowa wiadomość </h4>
				      </div>
				      <div class="modal-body">
				        <form>
				          <div class="form-group">
				            <label for="recipient-name" class="control-label">Adres email: </label>
				            <input type="text" class="form-control" id="recipient-name">
				          </div>
				          <div class="form-group">
				            <label for="message-text" class="control-label">Treść wiadomości:</label>
				            <textarea class="form-control" id="message-text"></textarea>
				          </div>
				        </form>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-danger" data-dismiss="modal">Zamknij</button>
				        <button type="button" class="btn btn-success">Wyslij!</button>
				      </div>
				    </div>
				  </div>
				</div>
			</div> <!-- /col-sm-10 thumbnail -->
			<div class="col-sm-1"></div>
			<div class="col-sm-12"><p>&nbsp;</p></div>
			<div class="col-sm-12 text-center">
			<!-- Button trigger modal -->
				<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
				  Uzupelnij swoje dane
				</button>
				
				<!-- Modal -->
				<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				  <div class="modal-dialog">
				    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        <h4 class="modal-title" id="myModalLabel">Dane szczegolowe</h4>
				      </div>
				      
				      <div class="modal-body">
					  	<form class="form-horizontal">
						  <div class="form-group">
						    <label for="exampleInputName2" class="col-sm-2 control-label">Nr tel: </label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" id="inputEmail3" placeholder="phone_num">
						    </div>
						  </div>
  						  <div class="form-group">
						    <div class="col-sm-offset-2 col-sm-10">
						      <div class="text-left">
						        <label class="radio-inline">
						          <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> M
						        </label>
						        <label class="radio-inline">
						          <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> K
						        </label>
						      </div>
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="exampleInputName2" class="col-sm-2 control-label">Miasto: </label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" id="inputEmail3" placeholder="locality">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="exampleInputName2" class="col-sm-2 control-label">Adres: </label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" id="inputEmail3" placeholder="street_addr">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="inputEmail3" class="col-sm-2 control-label">Kod pocztowy:</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" id="inputEmail3" placeholder="postal_code">
						    </div>
						  </div>
						</form>
					  </div>				      					  	
				      
				      <div class="modal-footer">
				        <button type="button" class="btn btn-danger" data-dismiss="modal">zamknij</button>
				        <button type="button" class="btn btn-success" >Zachowaj zmiany</button>
				      </div> <!-- /modal-footer -->
				  		Chciałbym aby z bazy pobierać dane i w "placeholderach" pokazywalo co aktualnie jest. submitem aktualizować.
				      
				      </div> <!-- /modal-body -->    
				    </div> <!-- /modal-content -->
				  </div>
				</div> <!-- /modal -->
			<div class="col-sm-12">
				<!-- Small modal -->
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target=".bs-example-modal-sm">Dodaj date</button>
				<div class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
				  <div class="modal-dialog modal-sm">
				    <div class="modal-content">
				      	http://tarruda.github.io/bootstrap-datetimepicker/
				    </div>
				  </div>
				</div>
			</div>
			<div class="col-sm-12"><p>&nbsp;</p></div>
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
	
		    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script type="text/javascript">
    $('#exampleModal').on('show.bs.modal', function (event) {
    	  var button = $(event.relatedTarget) // Button that triggered the modal
    	  var recipient = button.data('whatever') // Extract info from data-* attributes
    	  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
    	  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
    	  var modal = $(this)
    	  modal.find('.modal-title').text('Nowa wiadomość na studecka poczte do admina:  ' + recipient)
    	  modal.find('.modal-body input').val(recipient)
    	})
    </script>
</body>
</html>