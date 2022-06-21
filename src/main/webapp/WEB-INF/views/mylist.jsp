<%@page import="com.test.dto.UserDto"%>
<%@page import="java.util.List"%>
<%@page import="com.test.dao.MyUserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	MyUserDao dao = new MyUserDao();
	List<UserDto> list = dao.selectAll();
%>
<h1>LIST PAGE</h1>
<table border="1">
	<tr>
		<th>NAME</th>
		<th>ADDR</th>
		<th>TEL</th>
	</tr>
	<%
		for(int i=0; i<list.size(); i++){
%>
		<tr>
			<td><%=list.get(i).getUserNm() %></td>
			<td><%=list.get(i).getUserAddr() %></td>
			<td><%=list.get(i).getUserTel() %></td>
			
		</tr>
<%

		}
	%>
	
	<tr>
		<td colspan="3" align="right">
			<button onclick="location.href='welcome'">뒤로가기</button>
		</td>
	</tr>
</table>
</body>
</html>