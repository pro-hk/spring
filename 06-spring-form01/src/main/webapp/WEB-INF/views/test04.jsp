<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	div {margin-bottom: 50px}
	form label span {display: inline-block; margin: 0 20px; width: 80px}
	form div {margin-bottom: 10px}
</style>
<body>
	<h1>Form</h1>
	<div>
		<form:form modelAttribute="memberDto" action="Result.do" method="post">
			<div><label><span>no : </span><form:input path="no" /></label></div>
			<div><label><span>name : </span><form:input path="name" /></label></div>
			<div><label><span>id : </span><form:input path="id" /></label></div>
			<div><label><span>password : </span><form:password path="password" showPassword="true" /></label></div>
			
			<button>전송</button>
		</form:form>
	</div>
</body>
</html>