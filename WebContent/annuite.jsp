<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Calcul Annuité!</title>
	<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<!-- Font-->
	<link rel="stylesheet" type="text/css" href="css/nunito-font.css">
	<!-- Main Style Css -->
    <link rel="stylesheet" href="css/styletableau.css"/>
</head>
<body class="form-v6">
	<div class="page-content">
		<div class="form-v6-content">
			<div class="form-left">
				<img src="images/annuite1.jpeg" width=460px height=583px alt="form">
			</div>
			<form class="form-detail" action="Annuite" method="post">
				<h2>Calcul Annuité</h2>
				<div class="form-row">
					<input type="text" name="cap" id="full-name" class="input-text" placeholder="Capital (DH)" required>
				</div>
				<div class="form-row">
					<input type="text" name="duree" id="your-email" class="input-text" placeholder="Durée (Mois)" required>
				</div>
				<div class="form-row">
					<input type="text" name="taux" id="password" class="input-text" placeholder="Taux (decimal)" required>
				</div>
				
				<div class="form-row">
					<input type="text" name="result" id="full-name1" class="input-text" placeholder="Resultat"
					 value="<%= session.getAttribute("Annuité") %>"  >
				</div>
				
				<div class="form-row-last">
					<input type="submit" name="register" class="register" value="Calculer">
				</div>
			</form>
		</div>
	</div>
</body>
</html>
