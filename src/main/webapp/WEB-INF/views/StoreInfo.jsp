
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="./template/header.jsp" %>
 <%@ include file="./template/navbar.jsp" %>
<h1>CHAIN PAGE</h1>
<table border="1">
	<tr>
		<th>STORENAME</th>
		<th>ADDR</th>
		<th>TEL</th>
	</tr>

		<tr>
			<td>${list.userNm}</td>
			<td>${list.userAddr}</td>
			<td>${list.userTel}</td>
		</tr>
		
	<tr>
		<td colspan="3" align="right">
			<button onclick="location.href='welcome'">뒤로가기</button>
		</td>
	</tr>
</table> 
</body>
</html>