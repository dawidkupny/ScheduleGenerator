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

<body>
	
	<div class="bg">
		<div class="bg-overlay">
			
			<nav class="navbar navbar-inverse navbar-fixed-top">
				<div class="container">
					<a href="${pageContext.request.contextPath}" class="navbar-brand"><span><img src="resources/css/img/logo.png"/></span>generatorgrafiku.pl</a>
			
					<button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
          				<span class="glyphicon glyphicon-list"></span>
       				</button>
			
					<div class="collapse navbar-collapse navHeaderCollapse">
	          			<form class="form-signin" method="post" action="login">
	         	 			<ul class="nav navbar-nav navbar-right">
	           					<li><input id="inp1" name="username" type="text" class="form-control" placeholder="Nazwa użytkownika" required autofocus /></li>
	            				<li><input id="inp1" name="password" type="password" class="form-control" placeholder="Hasło" required /></li>
	            				<li><input id="inp1" type="submit" class="btn btn-info" value="Zaloguj się"></li>
	          				</ul>
	          			</form>
	        		</div>
				</div>
			</nav>
			
			<div class="container main">
				<div class="row">
					<div class="col col-lg-1 col-md-1">
					</div>
					<section class="col col-lg-4 col-md-5 col-sm-6 ">
						<h2> Witaj w Generatorze Grafiku! </h2>
						<br/>
						<p>Nasza aplikacja z łatwością pomoże przygotować grafik pracy dla Twoich pracowników. 
						Dzięki niej w łatwy sposób uwzględnisz wnioski urlopowe, święta, a także przepisy wynikające bezpośrednio 
						z Kodeksu Pracy. Rozwiązanie problemu harmonogramowania nigdy nie było tak proste! Zapraszamy do rejestracji!
						</p>
					</section>
					<section class="col col-lg-4 col-lg-offset-2 col-md-5 col-sm-6 ">
						<form class="form-signin" method="post" action="registerCompany">
						<h2 class="form-signin-heading">Zarejestruj swoją firmę!</h2>
							<input id="inp2" name="inputCompany" type="text" class="form-control" placeholder="Nazwa firmy" required/>
							<input id="inp2" name="inputNip" type="text" class="form-control" placeholder="NIP" required />
							<input id="inp3" name="inputFirstName" type="text" class="form-control" placeholder="Imię" required />
							<input id="inp4" name="inputLastName" type="text" class="form-control" placeholder="Nazwisko" required />
							<input id="inp2" name="inputEmail" type="email" class="form-control" placeholder="Email" required />
							<input id="inp2" name="inputUsername" type="text" class="form-control" placeholder="Nazwa użytkownika" required />
							<input id="inp2" name="inputPassword" type="password" class="form-control" placeholder="Hasło" required />
							<hr/>
							<p>Klikając przycisk Zarejestruj, akceptujesz nasz <a href="${pageContext.request.contextPath}/regulations">Regulamin</a>.</p>
							<hr/>
							<button class="btn btn-lg btn-primary " type="submit">Zarejestruj</button>
						</form>
					</section>
				</div>
			
			</div>
			
		</div>
	</div>
  	
</body>

</html>