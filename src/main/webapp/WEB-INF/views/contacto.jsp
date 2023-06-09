<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Contacto</title>
		<!-- Agregar enlaces de Bootstrap 5.3 CDN -->
		<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
			rel="stylesheet"
			integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
			crossorigin="anonymous">
		<!-- CSS PERSONALIZADO -->
		<link rel="stylesheet" type="text/css"
			href="${pageContext.request.contextPath}/resources/css/bootstrap.min.lux.css" />
	</head>
	<body>
		<!-- Incrusta header -->
		<jsp:include page="/WEB-INF/views/partials/header.jsp" />
		
		<div class="container">
			<h1>Contacto</h1>
		</div>
		
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
			crossorigin="anonymous"></script>
	</body>
</html>