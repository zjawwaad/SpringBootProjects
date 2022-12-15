<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css"> 
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
</head>
<body>
<form:form action="/expenses/process" method="post" modelAttribute="expense">
    <div class="form-group">
        <form:label path="expenseName">Expense</form:label>
        <form:input type="text" path="expenseName" class="form-control"/>
        <form:errors path= "expenseName"/>
    </div>
    <div class="form-group">
        <form:label path="vendor">Vendor</form:label>
        <form:input type="text" path="vendor" class="form-control"/>
        <form:errors path="vendor"/>
    </div>
    <div class="form-group">
        <form:label path="amount">Amount</form:label>
        <form:input type="number" path="amount" class="form-control"/>
        <form:errors path="amount"/>
    </div>
    <input type="submit" value="Add Expense" class="btn btn-primary"/>
</form:form>
</body>
</html>