<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyCalculatoreJEE</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<h1>MyCalculatorJEE</h1>
	<%--Recup et affichage resultat si envoyé --%>
	<h3>Bonjour, <%= request.getAttribute("user") %></h3></body>
</html>
