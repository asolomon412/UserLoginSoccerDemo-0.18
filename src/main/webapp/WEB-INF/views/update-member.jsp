<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Member</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
<!-- Custom CSS goes below Bootstrap CSS -->
<link rel="stylesheet" href="main.css">
</head>
<body>

	<div class="container">
		<div class="jumbotron">
			<h1>Update Member</h1>
		</div>
		<form action="updateperson">
			<input type="hidden" name="memberid" value="${id}"> <input
				type="hidden" name="teamid" value="${tid}"> Member Name: <input
				type="text" name="membername" value="Grant Chirpus"> Member
			Role: <input type="text" name="memberrole"> <input
				type="submit" value="Update">
		</form>
	</div>
</body>
</html>