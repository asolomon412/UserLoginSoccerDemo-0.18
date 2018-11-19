<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome!</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
<!-- Custom CSS goes below Bootstrap CSS -->
<link rel="stylesheet" href="main.css">
</head>
<body>

	<div class="container">
		<div class="jumbotron">
			<h1>Welcome to my Soccer League App!</h1>
		</div>
		
				${message }
			<div class="row">
		<div class="col-lg-3">
			<h1>Login</h1>
		</div>
		</div>
		<div class="row"> 
		<div class="col-lg-3">
			<form class="mb-2 mr-2" action="login-request">
			
				<div class="form-group mx-sm-3 mb-2 ">
					<div class="form-group">
						<label class="mx-sm-3 mb-2" for="help">Username: </label>
						<input id="help" class="form-control mx-sm-3 mb-2"  type="text" name="username" required>
					</div>
					<div class="form-group">
						<label class="mx-sm-3 mb-2" for="pass">Password: </label>
						<input id="pass" class="form-control mx-sm-3 mb-2"  type="password" name="password" required>
					</div>
			
					<input class="form-control btn btn-primary mx-sm-3 mb-2" type="submit" value="Login"></div>
	
			</form>
		</div>
		</div>
				
	<div class="row">
		<div class="col-lg-3">
			<h1>Register</h1>
		</div>
		</div>
		<div class="row"> 
		<div class="col-lg-3">
			<form class="mb-2 mr-2" action="login-confirmed">
			
				<div class="form-group mx-sm-3 mb-2 ">
					<div class="form-group">
					
						<label class="mx-sm-3 mb-2" for="fname"> First Name: </label>
						<input id="fname" class="form-control mx-sm-3 mb-2" type="text" name="firstname" required> 
					</div>
					<div class="form-group">
						<label class="mx-sm-3 mb-2" for="lname">Last Name: </label>
						<input id="lname" class="form-control mx-sm-3 mb-2"  type="text" name="lastname" required>
					</div>
					<div class="form-group">
						<label class="mx-sm-3 mb-2" for="uname">Username: </label>
						<input id="uname" class="form-control mx-sm-3 mb-2"  type="text" name="username" required>
					</div>
					<div class="form-group">
						<label class="mx-sm-3 mb-2" for="pass">Password: </label>
						<input id="pass" class="form-control mx-sm-3 mb-2"  type="password" name="password" required>
					</div>
			
					<input class=" form-control btn btn-primary mx-sm-3 mb-2" type="submit" value="Register"></div>
	
			</form>
		</div>
		</div>

	</div>
</body>
</html>