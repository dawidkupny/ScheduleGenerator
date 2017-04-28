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
</head>

<body>
	
	<div id="bg">
		<div id="bg-overlay">
			
			<nav class="navbar navbar-inverse navbar-fixed-top">
				<div class="container">
					<a href="#" class="navbar-brand"><span><img src="resources/css/img/logo.png"/></span>generatorgrafiku.pl</a>
			
					<button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
          				<span class="glyphicon glyphicon-list"></span>
       				</button>
			
					<div class="collapse navbar-collapse navHeaderCollapse">
	          			<form class="form-signin" method="post" action="register">
	         	 			<ul class="nav navbar-nav navbar-right">
	           					<li><input id="inp1" name="inputUsername" type="text" name="inputUsername" class="form-control" placeholder="Nazwa użytkownika" required autofocus /></li>
	            				<li><input id="inp1" name="inputPassword" type="password" class="form-control" placeholder="Hasło" required /></li>
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
						<h2>
						Lorem ipsum
						</h2>
						<p>
						dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
						Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure 
						dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non 
						proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
						</p>
					</section>
					<section class="col col-lg-4 col-lg-offset-2 col-md-5 col-sm-6 ">
						<form class="form-signin" method="post" action="#">
						<h2 class="form-signin-heading">Zarejestruj swoją firmę!</h2>
							<input id="inp2" name="inputCompany" type="text" class="form-control" placeholder="Nazwa firmy" required/>
							<input id="inp2" name="inputNip" type="text" class="form-control" placeholder="NIP" required />
							<input id="inp2" name="inputEmail" type="text" class="form-control" placeholder="Email" required />
							<input id="inp2" name="inputUsername" type="text" class="form-control" placeholder="Nazwa użytkownika" required />
							<input id="inp2" name="inputPassword" type="password" class="form-control" placeholder="Hasło" required />
							<hr/>
							<p>Klikając przycisk Zarejestruj, akceptujesz nasz <a href="#">Regulamin</a>.</p>
							<hr/>
							<button class="btn btn-lg btn-primary " type="submit">Zarejestruj</button>
						</form>
					</section>
				</div>
			
			</div>
			
		</div>
	</div>
  	

	<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
    <script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</body>

</html>