<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<style type="text/css">
#main_div {
	margin-left: 400px;
	margin-top: 20px;
	position: absolute;
}
table{
	margin-left:50px;
	margin-top:50px;
	width: 700px;
}
#location_list{
	 font-weight: bolder;
	 font-size: 20px;
	 position: absolute;
	 margin-top: 30px;
	 margin-left: 450px;
}
</style>
</head>
<body>
	<%@ include file="./template/header.jsp"%>
	 <%@ include file="./template/navbar.jsp"%>
<span id="location_list" style="text-align: center;">공지사항 글쓰기</span>
	<div id="main_div">
	<form action="updateBoard" method="post">
	<input type="hidden" name="board_seq" value="${dto.board_seq}">
	
		<table border="1"
			class="table table-condensed table-bordered table-hover">
			<tr>
				<th>공지사항 제목</th>
				<td><input type="text" name="board_title" value="${dto.board_title}"></td>
			</tr>
			<tr>
				<th>공지사항 내용</th>
				<td><textarea rows="10" cols="120" name="board_content">${dto.board_content }</textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="button" value="취소" onclick="location.href='boardList'">
					<input type="submit" value="수정">
				</td>
			</tr>
		</table>
	</form>	
	</div>
</body>
</html>