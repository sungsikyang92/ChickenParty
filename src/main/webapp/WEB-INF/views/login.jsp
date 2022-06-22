<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<h2>${errorMsg }</h2>
<form action="login" method="post">
	<input type="text" name="userId" placeholder="User ID">
	<br>
	<input type="password" name="userPw" placeholder="User PW">
	<br>
	<input type="submit" value="로그인">
</form>
</body>
</html>