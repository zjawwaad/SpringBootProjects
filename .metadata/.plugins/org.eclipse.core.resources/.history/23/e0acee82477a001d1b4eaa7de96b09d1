<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>



<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Fruit Loops</title>
</head>
<body>

	<table class="table">
		<tbody>
			<tr>
				<th>Fruit</th>
				<th>Price</th>
			</tr>
				<c:forEach items="${fruitList}" var ="fruits">
				<tr>
				<td><c:out value="${fruits.name}"></c:out></td>
				<td><c:out value="${fruits.price}"></c:out></td>
				</tr>
				</c:forEach>

		</tbody>
	</table>
	
</body>
</html>