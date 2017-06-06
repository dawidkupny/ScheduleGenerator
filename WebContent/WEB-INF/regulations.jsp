<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Generator grafiku - Regulamin</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" type="text/css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Lato:400,700&amp;subset=latin-ext" rel="stylesheet">
</head>
<body>
	<div class="bg">
		<div class="bg-overlay">
			
			<nav class="navbar navbar-inverse navbar-fixed-top">
				<div class="container">
					<a href="${pageContext.request.contextPath}" class="navbar-brand"><span><img src="resources/css/img/logo.png"/></span>generatorgrafiku.pl</a>
			
				</div>
			</nav>
			
			<div class="container main">
				<div class="row">
					<div class="col col-lg-1 col-md-1">
					</div>
					<section class="col col-lg-10 col-md-9 col-sm-8 ">
						<h2>
						Regulamin.
						</h2>
						<ol id="reglist">
						<li> Aplikacja powstała na potrzeby przedmiotu Projekt Aplikacji Webowej. </li>
						<li> Celem aplikacji jest umożliwienie generowania grafików pracy dla określonych pracowników przy zadanych kryteriach, do których należą między innymi:</li>
							<ul>
							<li>zasady Kodeksu Pracy - m.in. pięciodniowy tydzień pracy</li>
							<li>wnioski urlopowe składane przez pracowników (kierownik decyduje, które z nich uwzględnia)</li>
							<li>życzenia związane z dniami wolnymi składane przez pracowników (kierownik decyduje, które z nich uwzględnia)</li>
							<li>dni wolne wynikające z kalendarza - święta</li>
							<li>określona liczba pracowników w ciągu jednej zmiany</li>
							<li>sprawiedliwy przydział zmiany niedzielnej</li>
							</ul>
						<li>Kierownik rejestruje swoją firmę na stronie głównej Aplikacji, a następnie w Panelu Kierownika może dokonać rejestracji swoich pracowników.</li>
						<li>Kierownik ma uprawnienia do przeglądania i uzupełniania listy pracowników, wybierania wniosków pracowników do uwzględnienia i generowania grafiku.</li>
						<li>Pracownik może zgłaszać swoje wnioski i przeglądać wygenerowany grafik.</li>
						<li>Zabrania się korzystania z Aplikacji w sposób niezgodny z jej przeznaczeniem.</li>
						<li>Autorami Aplikacji są:</li>
						<ul>
						<li>Dawid Kupny </li>
						<li>Mariusz Krzyżowski</li>
						studenci specjalności Inżynieria Oprogramowania na studiach inżynierskich kierunku Informatyka.
						</ul>
						</ol>
						<br/>
						<p><a href="${pageContext.request.contextPath}">Powrót do strony głównej.</a></p>
					</section>
				</div>
			
			</div>
			
		</div>
	</div>
  	
</body>
</html>