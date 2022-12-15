<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container mx-auto" style="width:800px;">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var= "expense" items="${allExpenses}">
				<tr>
					<td><a href="/expenses/one/${expense.id}"><c:out value="${expense.expenseName}"/></a></td>
					<td><c:out value="${expense.vendor}"/></td>
					<td><c:out value="${expense.amount}"/></td>
					<td>
						<form action="/expenses/${expense.id}" method="post">
	    					<input type="hidden" name="_method" value="delete">
	    					<input type="submit" value="Delete">
						</form>
						<form action="/expenses/edit/${expense.id}" method="get">
							    <input type="hidden" name="_method" value="edit">
							    <input type="submit" value="Edit">
						</form>
			
					
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>

</body>
</html>