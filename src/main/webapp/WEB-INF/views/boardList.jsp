<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<style type="text/css">
#main_div{
	margin-left: 400px;
	margin-top: 20px;
	position: absolute;
	
}
table{
	margin-left:50px;
	margin-top:50px;
	width: 500px;
	
}
tr{
	width: 150px;
}
#titleTd{
	width: 500px;
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

 <%@ include file="./template/header.jsp" %>
 <%@ include file="./template/navbar.jsp" %>
<span id="location_list" style="text-align: center;">공지사항</span>
<div id="main_div">
	<table border="1" class="table table-condensed table-bordered table-hover" method="post">
		<tr>	
			<th>MYNO</th>
			<th>MYTITLE</th>
			<th>MYDATE</th>
		</tr>
		<c:choose>
			<c:when test="${empty boardDto }">
				<tr>
					<td >----작성된글이 존재하지 않습니다----</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${boardDto }" var="boardDto">
					<tr>
						<td>${boardDto.board_seq }</td>
						<td id="titleTd"><a href="boardDetail?board_seq=${boardDto.board_seq}">${boardDto.board_title }</a></td>
						<td>${boardDto.board_date }</td>
					</tr>				
				</c:forEach>
			</c:otherwise>
		</c:choose>
		<tr>
				<td colspan="3" align="right">
					<input type="button" value="글작성" onclick="location.href='insertBoardForm'">
				</td>
			</tr>
	</table>
	</div>
</body>
</html>