<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>



<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Omikuji</title>
</head>
<body>
    <h3>Here's your Omikuji</h3>
    <p>In <c:out value="${number}"/> years, you will live in  <c:out value="${city}"/> with  <c:out value="${celebrity}"/> as your roomate,  <c:out value="${profession}"/> for a living. The next time you see a  <c:out value="${biotic}"/>, you will have good luck. Also,  <c:out value="${compliment}"/>. 
    </p>
    
    




	
</body>
</html>