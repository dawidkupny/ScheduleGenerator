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
	           					<li><a href="#schedule">Podejrzyj grafik</a></li>
            					<li><a href="#apply">Złóż wniosek</a></li>
            					<li><a href="logout">Wyloguj się</a></li>
	          				</ul>
	        		</div>
        
				</div>
			</nav>
			
			
			
			<div id="schedule" class="container main">
				<div class="row">
			    <div class="col col-lg-1 col-md-1">
				</div>
			    	<div class="col col-sm-8">
				      <h3>Witaj w panelu pracownika!</h3><br>
				      <p>Możesz w nim obejrzeć aktualny grafik, a także złożyć wniosek o urlop lub dzień wolny.</p>
					</div>
				</div>
			</div>	
			<br/>
		</div>
	</div>
	
	<div id="apply" class="container content">
		<div class="row">
	    	<div class="col col-lg-1 col-md-1">
			</div>
	    	<div class="col col-sm-8">
	    		<form class="form-signin" method="post" action="appliDay">
		      		<h2 class="form-signin-heading">Złóż wniosek o wolny dzień</h2><br>
		      		<input name="inputDay" type="date" class="form-control" />
		      		<textarea name="inputReason" rows="5" name="inputUsername" class="form-control" placeholder="Uzasadnienie" required></textarea>
		      		<input class="btn btn-lg btn-primary" type="submit" value="Wyślij" />
		      	</form>
		   </div>
		</div>
		<br/>
		<div class="row">
			<div class="col col-lg-1 col-md-1">
			</div>
	    	<div class="col col-sm-8">
		    	<form class="form-signin" method="post" action="appliLeave">
		      		<h2 class="form-signin-heading">Złóż wniosek o urlop</h2><br>
		      		<h4>Podaj dzień rozpoczęcia urlopu</h4>
		      		<input name="inputFirstDay" type="date" class="form-control" />
		      		<h4>Podaj dzień zakończenia urlopu</h4>
		      		<input name="inputLastDay" type="date" class="form-control" />
		      		<input class="btn btn-lg btn-primary" type="submit" value="Wyślij" />
		      	</form>  
		    </div>
 			</div>
		</div>	
		
			

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