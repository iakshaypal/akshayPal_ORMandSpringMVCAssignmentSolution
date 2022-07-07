<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<title>CUSTOMER RELATIONSHIP MANAGEMENT</title>
</head>

<body>

	<div class="container">

		<h1 style="background-color: green" > <center>CUSTOMER RELATIONSHIP
			MANAGEMENT</center></h1>
		<hr>

		<!-- Add a search form -->

		<form action="/CustomerRelationshipMgmtApp/books/search"
			class="form-inline">

			<!-- Add a button -->
			<a href="/CustomerRelationshipMgmtApp/customer/showFormForAdd"
				class="btn btn-primary btn-sm mb-3"> Add Customer </a>

		</form>

		<table class="table table-bordered table-striped">
			<thead class="thead-dark">
				<tr style="text-align: center">
					<th style="background-color: green">FirstName</th>
					<th style="background-color: green">LastName</th>
					<th style="background-color: green">Email</th>
					<th style="background-color: green">Action</th>

				</tr>
			</thead>

			<tbody>
				<c:forEach items="${customers}" var="tempCustomer">
					<tr style = "text-align: center;">
						<td><c:out value="${tempCustomer.firstName}" /></td>
						<td><c:out value="${tempCustomer.lastName}" /></td>
						<td><c:out value="${tempCustomer.email}" /></td>
						<td>
							<!-- Add "update" button/link --> <a
							href="/CustomerRelationshipMgmtApp/customer/showFormForUpdate?id=${tempCustomer.id}"
							class="btn btn-info btn-sm"> Update </a> <!-- Add "delete" button/link -->
							<a
							href="/CustomerRelationshipMgmtApp/customer/delete?id=${tempCustomer.id}"
							class="btn btn-danger btn-sm"
							onclick="if (!(confirm('Are you sure you want to delete this Student?'))) return false">
								Delete </a>

						</td>

					</tr>
				</c:forEach>

			</tbody>
		</table>

	</div>

</body>
</html>