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
			<h1>Team Info</h1>
			<a href="/main"><button class="btn btn-primary">Home</button></a>
			<a href="/member-admin"><button class="btn btn-primary">Add/View Members</button></a>
			<a class="btn btn-primary" href="logout">Logout</a>
		</div>
		
				<div class="row">
		<div class="col-lg-6">
			<h1>Add a Team</h1>
		</div>
		<!-- </div>
		<div class="row"> -->
		<div class="col-lg-6">
			<form class="mb-2 mr-2" action="add-team">
			
				<div class="form-group mx-sm-3 mb-2 ">
					<div class="form-group">
					
						<label class="mx-sm-3 mb-2" for="name">Name: </label>
						<input id="name" class="form-control mx-sm-3 mb-2" type="text" name="teamname"> 
					</div>
			
					<input class=" form-control btn btn-primary mx-sm-3 mb-2" type="submit" value="Add"></div>
	
			</form>
		</div>
		</div>

		<table class="table">
			<thead>
				<tr>
					<td>TeamID</td>
					<td>Team Name</td>
					<td>Team Members</td>
					<td>Edit</td>
					<td>Remove</td>
				</tr>
			</thead>
			<c:forEach var="m" items="${teamlist}">

				<tbody>
					<tr>
						<td>${m.teamid }</td>
						<td>${m.teamname }</td>

						<td>
						<!-- this is a nested foreach to see all of the members that belong to a team 
						      varStatus allows me to use the index as a counter variable for my list of members -->
						<c:forEach var="n" items="${m.members}" varStatus="count">
						<!-- here I am adding 1 to the index because it starts at 0 -->
							${count.index + 1}. ${n.membername} : ${n.memberrole }<br>
					</c:forEach></td>
					<td><a class="btn btn-primary"
							href="/update-team?teamid=${m.teamid }">Edit</a></td>
					<td><a class="btn btn-primary"
							href="/deleteteam?teamid=${m.teamid }">Delete</a></td>
					</tr>
				</tbody>


			</c:forEach>

		</table>

	</div>

</body>
</html>