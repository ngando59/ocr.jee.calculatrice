<%@page import="com.ocr.beans.Calculator"%>
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
	<h3><%= request.getAttribute("resultatMessage") %></h3>
	<form action="" method="post">
	    <input type="number" name="number1" value="" />
	    <select name="operator" required>
	      <option value="+">+</option>
	      <option value="-">-</option>
	      <option value="*">*</option>
	      <option value="/">/</option>
	    </select>
	    <input type="number" name="number2" value="" />
	    <button type="submit">calculer</button>
	</form>
</body>
</html>
