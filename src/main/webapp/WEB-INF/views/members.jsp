<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hibernate Demo</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
<!-- Custom CSS goes below Bootstrap CSS -->
<link rel="stylesheet" href="main.css">

</head>
<body>
	<div class="container">
		<div class="jumbotron">
			
			<h1>Member Info</h1>
			<a href="/main"><button class="btn btn-primary">Home</button></a>
			<a href="/team-admin"><button class="btn btn-primary">Add/View Teams</button></a>
			<a class="btn btn-primary" href="logout">Logout</a>
		</div>
		
		<div class="row">
		<div class="col-lg-6">
			<h1>Add a Member</h1>
		</div>
		<!-- </div>
		<div class="row"> -->
		<div class="col-lg-6">
			<form class="mb-2 mr-2" action="add-member">
			
				<div class="form-group mx-sm-3 mb-2 ">
					<div class="form-group">
					
						<label class="mx-sm-3 mb-2" for="name">Name: </label>
						<input id="name" class="form-control mx-sm-3 mb-2" type="text" name="membername"> 
					</div>
					<div class="form-group">
						<label class="mx-sm-3 mb-2" for="role">Role: </label>
						<input id="role" class="form-control mx-sm-3 mb-2"  type="text" name="memberrole">
					</div>
					<div class="form-group">
						<label class="mx-sm-3 mb-2" for="help">Select Team: </label>
						<select class="form-control mx-sm-3 mb-2" id="help" name="teamname">
						<!-- Here I am using a for each to show the options of distinct teams from my special query in the repository -->
						<c:forEach var="team" items="${teams }">
						<option  value="${team}">${team }
						</c:forEach>
						</select>
					</div>
			
					<input class=" form-control btn btn-primary mx-sm-3 mb-2" type="submit" value="Add"></div>
	
			</form>
		</div>
		</div>
		<div class="row">
			<h1>Members</h1>
			<table class="table">
				<thead>
					<tr>
						<td>ID</td>
						<td>Member</td>
						<td>Role</td>
						<td>Team Name</td>
						<td>Edit</td>
						<td>Remove</td>
					</tr>
				</thead>
	
				<c:forEach var="m" items="${memberlist}">
	
					<tr>
						<td>${m.memberid }</td>
						<td>${m.membername }</td>
						<td>${m.memberrole }</td>
						<td>${m.team.teamname }</td>
						<td><a class="btn btn-primary" href="/update?personid=${m.memberid }&teamid=${m.teamid}">Edit</a></td>
						<td><a class="btn btn-primary" href="/delete?personid=${m.memberid }">Delete</a></td>
					</tr>
	
				</c:forEach>
	
	
			</table>
			</div>
			

	</div>

</body>
</html>