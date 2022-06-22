<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="./template/header.jsp" %>
 <%@ include file="./template/navbar.jsp" %>
<h1>LIST PAGE</h1>
<table border="1">
	<tr>
		<th>NAME</th>
		<th>ADDR</th>
		<th>TEL</th>
	</tr>
<c:forEach items="${list }" var="dto">
		<tr>
			<td>${dto.userNm}</td>
			<td>${dto.userAddr}</td>
			<td>${dto.userTel}</td>
			
		</tr>
</c:forEach>
	<tr>
		<td colspan="3" align="right">
			<button onclick="location.href='welcome'">뒤로가기</button>
		</td>
	</tr>
</table>
</body>
</html>