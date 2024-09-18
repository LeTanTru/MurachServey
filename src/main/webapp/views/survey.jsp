<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Information</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div style="max-width: 800px; margin: 0 auto">
		<h1 style="color: #0c7b85;">Thanks for taking our survey !!!</h1>

		<p>Here is the information that you entered:</p>
		<h2><span style="color: #0c7b85;">FirstName: </span>${user.firstName}</h2>

		<h2><span style="color: #0c7b85;">LastName: </span>${user.lastName}</h2>

		<h2><span style="color: #0c7b85;">Email: </span>${user.email}</h2>

		<h2><span style="color: #0c7b85;">Date Of Birth: </span>${user.dateOfBirth}</h2>

		<h2><span style="color: #0c7b85;">How did I hear:</span>${user.hearOption}</h2>

		<h2><span style="color: #0c7b85;">Update: </span>${user.wantsUpdate}</h2>
		
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<c:if test="${user.wantsUpdate == 'Yes'}">
			<h2><span style="color: #0c7b85;">Contact via: </span>${user.contactOption}</h2>
		</c:if>

		<form action="back" method="get">
			<button type="submit" class="btn btn-primary">Back</button>
		</form>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
			crossorigin="anonymous"></script>
	</div>
</body>
</html>