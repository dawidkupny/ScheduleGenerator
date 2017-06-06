<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
				      <h3>Drogi Administratorze firmy!</h3><br/>
				      <p>Zdajemy sobie sprawę z tego, że tworzenie harmonogramów pracy nigdy nie należało do wygodnych zadań, 
				      z jakimi miałeś do czynienia. Specjalnie dla takich ludzi jak Ty przygotowaliśmy naszą aplikację. 
				      Nie zwlekaj - już teraz możesz dodać pracowników, uwzględnić wybrane wnioski urlopowe/życzenia związane 
				      z dniami wolnymi, a co najważniejsze - łatwo i szybko wygenerować grafik na najbliższy miesiąc! </p>
				    </div>
			  	 </div>
				<div id="regEmployee" class="row">
					<div class="col col-lg-1 col-md-1">
					</div>
			    	<div class="col col-sm-6">
				    	<form class="form-signin" method="post" action="registerUser">
						<h2 class="form-signin-heading">Zarejestruj pracownika</h2><br>
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
	    		<form class="form-signin input-group" method="get" action="readMonthAppli">
			    	<h2 class="form-signin-heading">Wyświetl wnioski pracowników z danego miesiąca</h2><br>
		      		<input name="inputMonth" type="month" class="form-control" />
		      		<input id="topmargin" class="btn btn-lg btn-primary" type="submit" value="Pokaż" />
	      		</form>
			</div>
		</div>
		<br/>
		<div class="row">
			<div class="col col-lg-1 col-md-1">
			</div>
	    	<div class="col col-sm-8">
	    		<form class="form-signin" method="get" action="readAllAppli">
			    	<h2 class="form-signin-heading">Wyświetl wszystkie wnioski pracowników</h2><br>
		      		<input class="btn btn-lg btn-primary" type="submit" value="Pokaż" />
	      		</form>
	    	</div>
	  	</div>
	</div>	
	<br/>
	
	<div>
		<form class="form-signin" method="post" action="generateSchedule">
			<c:if test="${not empty requestScope.applicationsDayOff}">
				<div class="container">
					<div class="col col-lg-1 col-md-1">
					</div>
					<p>Wnioski o wolny dzień:</p>
					<br/>
				</div>
				<ul>
				<c:forEach var="applicationDay" items="${requestScope.applicationsDayOff}">
					<div class="container">
						<div class="row">
			    			<div class="col col-lg-1 col-md-1">
							</div>
			    			<div class="col col-sm-8 checkbox">
			    				<li><input name="checkboxName" type="checkbox" value="-${applicationDay.day } od ${applicationDay.user.lastName}"><h4>Dodane przez: <c:out value="${applicationDay.user.firstName}"/> <c:out value="${applicationDay.user.lastName}"/>, 
			    				Dzień: <fmt:formatDate value="${applicationDay.day }" pattern="dd/MM/YYYY"/></h4>
			    				<p><c:out value="${applicationDay.reason }"></c:out></p></li>
				     		</div>
						</div>
					</div>
					<br/>	
				</c:forEach>
				</ul>
			</c:if>
			<c:if test="${not empty requestScope.applicationsLeave}">
				<br/>
				<div class="container">
					<div class="col col-lg-1 col-md-1">
					</div>
					<p>Wnioski o urlop:</p>
					<br/>
				</div>
				<ul>
				<c:forEach var="applicationLeave" items="${requestScope.applicationsLeave}">
					<div class="container">
						<div class="row">
			    			<div class="col col-lg-1 col-md-1">
							</div>
			    			<div class="col col-sm-8 checkbox">
			    				<li><input name="checkboxName" type="checkbox" value="-${applicationLeave.firstDay } - ${applicationLeave.lastDay } od ${applicationLeave.user.lastName}"><h4>Dodane przez: <c:out value="${applicationLeave.user.firstName}"/> <c:out value="${applicationLeave.user.lastName}"/><br/> </h4>
			    				<p>Od: <fmt:formatDate value="${applicationLeave.firstDay }" pattern="dd/MM/YYYY"/><br/>
			    				do: <fmt:formatDate value="${applicationLeave.lastDay }" pattern="dd/MM/YYYY"/></p></li>
				     		</div>
						</div>
					</div>
					<br/>	
				</c:forEach>
				</ul>
			</c:if>
			<c:if test="${not empty requestScope.noneApplicationsDayOff}">
				<div class="container">
						<div class="row">
			    			<div class="col col-lg-1 col-md-1">
							</div>
			    			<div class="col col-sm-8">
			    				<p>Brak wniosków</p>
				     		</div>
						</div>
					</div>	
			</c:if>
				
			<div id="geneSchedule" class="container content">
				<div class="row">
			    <div class="col col-lg-1 col-md-1">
				</div>
			    	<div class="col col-sm-8">
				    	<h2>Generuj grafik</h2><br>
				    	<h4>Przed wygenerowaniem grafiku zaznacz wnioski, które chcesz uwzględnić, oraz wybierz miesiąc, na który zamierzasz wygenerować grafik.</h4>
						<textarea class="form-control" rows="5" id="textArea" disabled></textarea>						
				    	<input id="topmargin" name="inputMonthScheduler" type="month" class="form-control" />
			      		<input id="topmargin" class="btn btn-lg btn-primary" type="submit" value="Generuj" />
					</div>
				</div>
			</div>	
		</form>
	</div>
	
	<div id="checkSchedule" class="container content">
		<div class="row">
	    	<div class="col col-lg-1 col-md-1">
			</div>
	    	<div class="col col-sm-8">
	    		<form class="form-signin input-group" method="get" action="someServlet">
		      		<input name="inputWeek" type="week" class="form-control" />
		      		<input id="topmargin" class="btn btn-md btn-primary" type="submit" value="Pokaż" />
	      		</form>
	    	</div>
    	</div>
   	</div>
   	
   	<%-- <c:if test="${not empty requestScope.someAttribute}"> --%>
		<div class="container table-responsive">
			<table class="table table-striped table-bordered">
				<thead>
					<tr id="tablenav">
						<th>Pracownik</th>
						<th>Pon 15.05</th>
						<th>Wt 16.05</th>
						<th>Śr 17.05</th>
						<th>Czw 18.05</th>
						<th>Pt 19.05</th>
						<th>Sb 20.05</th>
						<th>Nd 21.05</th>
					</tr>
				</thead>
				<c:forEach var="users" items="${requestScope.allUsers}">
					<tr>
						<td><c:out value="${users.firstName} ${users.lastName}"/></td> 
						<td><c:out value="ZM1"/></td> 
						<td><c:out value="ZM1"/></td> 
						<td><c:out value="ZM1"/></td> 
						<td><c:out value="ZM1"/></td> 
						<td><c:out value="ZM2"/></td> 
						<td><c:out value="ZM2"/></td> 
						<td><c:out value="ZMN"></c:out></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	<%-- </c:if> --%>	
	
	<div id="empList" class="container content">
		<div class="row">
	    	<div class="col col-lg-1 col-md-1">
			</div>
	    	<div class="col col-sm-8">
	    		<form class="form-signin" method="get" action="readUsers">
			    	<h2 class="form-signin-heading">Wyświetl wszystkich pracowników</h2><br>
		      		<input class="btn btn-lg btn-primary" type="submit" value="Pokaż" />
	      		</form>
			</div>
		</div>
	</div>	
			
	<c:if test="${not empty requestScope.allUsers}">
		<div class="container table-responsive">
			<table class="table table-striped table-bordered">
				<thead>
					<tr id="tablenav">
						<th>Imię</th>
						<th>Nazwisko</th>
						<th>Nick</th>
						<th>Email</th>
					</tr>
				</thead>
				<c:forEach var="users" items="${requestScope.allUsers}">
					<tr>
						<td><c:out value="${users.firstName}"/></td> 
						<td><c:out value="${users.lastName}"/></td> 
						<td><c:out value="${users.username}"/></td> 
						<td><c:out value="${users.email }"></c:out></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</c:if>
	<c:if test="${not empty requestScope.noUsers}">
		<div class="container">
				<div class="row">
	    			<div class="col col-lg-1 col-md-1">
					</div>
	    			<div class="col col-sm-8" style="margin-bottom:5%">
	    				<p>Brak Pracowników</p>
		     		</div>
				</div>
			</div>	
	</c:if>		
	
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

$("input[type='checkbox'][name*='checkboxName']").change(function(){
	if($(this).is(':checked')) {
		$('#textArea').val($('#textArea').val() + $(this).val() + "\n");
    }else{
    	$('#textArea').val($('#textArea').val().replace($(this).val(), "")); 
    }
});

</script>

</body>
</html>