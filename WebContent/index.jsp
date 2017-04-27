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

	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<a href="#" class="navbar-brand"><span><img src="resources/css/img/logo.png"/></span>generatorgrafiku.pl</a>
			
			<button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
          		<span class="glyphicon glyphicon-list"></span>
       		</button>
			
			<div class="collapse navbar-collapse navHeaderCollapse">
	          <form class="form-signin" method="post" action="register">
	         	 <ul class="nav navbar-nav navbar-right">
	           		<li><input name="inputUsername" type="text" name="inputUsername" class="form-control" placeholder="Nazwa użytkownika" required autofocus /></li>
	            	<li><input name="inputPassword" type="password" class="form-control" placeholder="Hasło" required /></li>
	            	<li><input type="submit" class="btn btn-info" value="Zaloguj się"></li>
	          	</ul>
	          </form>
	        </div>
        
		</div>
		<div id="bg">
			<div id="bg-overlay"></div>
		</div>
	</nav>
		

	<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
    <script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</body>

</html>