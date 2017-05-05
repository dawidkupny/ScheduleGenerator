<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Generator grafiku</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" type="text/css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Lato:400,700&amp;subset=latin-ext" rel="stylesheet">
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</head>

<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">
	
	<div class="bg">
		<div class="bg-overlay">
			
			<nav class="navbar navbar-inverse navbar-fixed-top">
				<div class="container">
					<a href="#myPage" class="navbar-brand"><span><img src="resources/css/img/logo.png"/></span>generatorgrafiku.pl</a>
			
					<button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
          				<span class="glyphicon glyphicon-list"></span>
       				</button>
			
					<div class="collapse navbar-collapse navHeaderCollapse">
	         	 			<ul class="nav navbar-nav navbar-right">
	           					<li><a href="#regEmployee">Zarejestruj pracownika</a></li>
            					<li><a href="#appliEmployee">Wnioski pracowników</a></li>
            					<li><a href="#geneSchedule">Generuj grafik</a></li>
            					<li><a href="#checkSchedule">Podejrzyj grafik</a></li>
            					<li><a href="#empList">Lista pracowników</a></li>
            					<li><a href="logout">Wyloguj się</a></li>
	          				</ul>
	        		</div>
        
				</div>
			</nav>
			
			
			
			<div class="container main">
				<div class="row">
				 	<div class="col col-lg-1 col-md-1">
					</div>
				    <div class="col col-sm-8">
				      <h2>Our Values</h2><br>
				      <h4><strong>Tresc dla kierownika(?):</strong> Our mission lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</h4><br>
				      <p><strong>VISION:</strong> Our vision Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
				      Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
				    </div>
			  	 </div>
				<div id="regEmployee" class="row">
					<div class="col col-lg-1 col-md-1">
					</div>
			    	<div class="col col-sm-6">
				    	<form class="form-signin" method="post" action="registerUser">
						<h2 class="form-signin-heading">Zarejestruj pracownika</h2><br>
							<input id="inp2" name="inputEmail" type="email" class="form-control" placeholder="Email" required />
							<input id="inp2" name="inputUsername" type="text" class="form-control" placeholder="Nazwa użytkownika" required />
							<input id="inp2" name="inputPassword" type="password" class="form-control" placeholder="Hasło" required />
							<input id="inp2" name="inputNip" type="text" class="form-control" placeholder="NIP" required />
							<hr/>
							<p>Klikając przycisk Zarejestruj, akceptujesz nasz <a href="#">Regulamin</a>.</p>
							<hr/>
							<button class="btn btn-lg btn-primary " type="submit">Zarejestruj</button>
						</form>
				    </div>
			  	 </div>
			</div>	
			<br/>
		</div>
	</div>
	
	<div id="appliEmployee" class="container content">
		<div class="row">
	    <div class="col col-lg-1 col-md-1">
		</div>
	    	<div class="col col-sm-8">
		      <h2>About Company Page</h2><br>
		      <h4>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</h4><br>
		      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
			</div>
		</div>
		<div class="row">
			<div class="col col-lg-1 col-md-1">
			</div>
	    	<div class="col col-sm-8">
		      <h2>Our Values</h2><br>
		      <h4><strong>MISSION:</strong> Our mission lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</h4><br>
		      <p><strong>VISION:</strong> Our vision Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
		      Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
	    	</div>
	  	</div>
	</div>	
	<br/>
		
	<div id="geneSchedule" class="container content">
		<div class="row">
	    <div class="col col-lg-1 col-md-1">
		</div>
	    	<div class="col col-sm-8">
		      <h2>About Company Page</h2><br>
		      <h4>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</h4><br>
		      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
			</div>
		</div>
		<div class="row">
			<div class="col col-lg-1 col-md-1">
			</div>
	    	<div class="col col-sm-8">
		      <h2>Our Values</h2><br>
		      <h4><strong>MISSION:</strong> Our mission lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</h4><br>
		      <p><strong>VISION:</strong> Our vision Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
		      Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
	    	</div>
	  	</div>
	</div>	
	<br/>
	
	<div id="checkSchedule" class="container content">
		<div class="row">
	    <div class="col col-lg-1 col-md-1">
		</div>
	    	<div class="col col-sm-8">
		      <h2>About Company Page</h2><br>
		      <h4>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</h4><br>
		      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
			</div>
		</div>
		<div class="row">
			<div class="col col-lg-1 col-md-1">
			</div>
	    	<div class="col col-sm-8">
		      <h2>Our Values</h2><br>
		      <h4><strong>MISSION:</strong> Our mission lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</h4><br>
		      <p><strong>VISION:</strong> Our vision Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
		      Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
	    	</div>
	  	</div>
	</div>	
	<br/>
	
	<div id="empList" class="container content">
		<div class="row">
	    <div class="col col-lg-2 col-md-2">
		</div>
	    	<div class="col col-sm-8">
		    	<h2>Lista pracowników</h2><br>
		   		<table style="width:50%" border="1">
		   		<tr>
		   			<th>Imie</th><th>Nazwisko</th><th>E-mail</th>
		   		</tr>
		   		<tr>
		   			<td>Jan</td><td>Kowalski</td><td>jan@kowalski.com</td>
		   		</tr>
		   		</table>
		   </div>
		</div>
	</div>	
	<br/>		
			

<script>
$(document).ready(function(){
  // Add smooth scrolling to all links in navbar + footer link
  $(".navbar a, footer a[href='#myPage']").on('click', function(event) {

   // Make sure this.hash has a value before overriding default behavior
  if (this.hash !== "") {

    // Prevent default anchor click behavior
    event.preventDefault();

    // Store hash
    var hash = this.hash;

    // Using jQuery's animate() method to add smooth page scroll
    // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
    $('html, body').animate({
      scrollTop: $(hash).offset().top
    }, 900, function(){

      // Add hash (#) to URL when done scrolling (default click behavior)
      window.location.hash = hash;
      });
    } // End if
  });
})

</script>

</body>
</html>