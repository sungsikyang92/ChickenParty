<%@page import="com.test.dto.OrderDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center;">${param.userid }재고목록</h1>
 
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">상품코드</th>
					<th scope="col">상품명</th>
					<th scope="col">남은수량</th>
					<th scope="col">가격</th>
					<th scope="col">주문</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${empty product }">
						<td colspan="4">-------------재고가 없습니다.-------------</td>
					</c:when>
					<c:otherwise>
						<c:forEach items="${product }" var="dto">
							<form action="/order/orderlist" method="get">
								<tr>
									<input type="hidden" name="userid" value="${param.userid }">
									<input type="hidden" name="proKey" value="${dto.proKey }">
									<td><b>${dto.proKey }</b></td>
									<td>${dto.proNm }</td>
									<td>${dto.proCnt }</td>
									<td>${dto.proPrice }</td>
									<td><div class="input-group mb-3">
											<input type="text" class="form-control" style="width: 1px;"
												name="proCnt">
											<div class="input-group-append">
												<button class="btn btn-primary" type="submit">주문</button>
											</div>
										</div>
									</td>
								</tr>
							</form>
						</c:forEach>
					</c:otherwise>
				</c:choose>

			</tbody>
		</table>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
		crossorigin="anonymous"></script>
</body>
</html>