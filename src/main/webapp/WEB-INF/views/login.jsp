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
						<input id="help" class="form-control mx-sm-3 mb-2"  type="text" name="username">
					</div>
					<div class="form-group">
						<label class="mx-sm-3 mb-2" for="pass">Password: </label>
						<input id="pass" class="form-control mx-sm-3 mb-2"  type="text" name="password">
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
					
						<label class="mx-sm-3 mb-2" for="name"> First Name: </label>
						<input id="name" class="form-control mx-sm-3 mb-2" type="text" name="firstname"> 
					</div>
					<div class="form-group">
						<label class="mx-sm-3 mb-2" for="role">Last Name: </label>
						<input id="role" class="form-control mx-sm-3 mb-2"  type="text" name="lastname">
					</div>
					<div class="form-group">
						<label class="mx-sm-3 mb-2" for="help">Username: </label>
						<input id="help" class="form-control mx-sm-3 mb-2"  type="text" name="username">
					</div>
					<div class="form-group">
						<label class="mx-sm-3 mb-2" for="pass">Password: </label>
						<input id="pass" class="form-control mx-sm-3 mb-2"  type="text" name="password">
					</div>
			
					<input class=" form-control btn btn-primary mx-sm-3 mb-2" type="submit" value="Register"></div>
	
			</form>
		</div>
		</div>

	</div>
</body>
</html>