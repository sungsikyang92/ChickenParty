<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<style type="text/css">

#menu1{
	margin-top: 100px;
		background-color: #0054FF;
	color:white;
	border-style: none;
	border-radius: 3px;
	padding :7px;
	position: absolute;
	margin-left: 220px;
	width: 130px;
}
#menu2{
	margin-top: 150px;
		background-color: #0054FF;
	color:white;
	border-style: none;
	border-radius: 3px;
	padding :7px;
	position: absolute;
	margin-left: 220px;
	width: 130px;
}
#menu3{
	margin-top: 200px;
		background-color: #0054FF;
	color:white;
	border-style: none;
	border-radius: 3px;
	padding :7px;
	position: absolute;
	margin-left: 220px;
	width: 130px;
}

</style>
</head>
<body>
		<button name="menu_btn" id="menu1" onclick="location.href='../storeList.jsp'">가게정보확인</button>
		<button name="menu_btn" id="menu2" onclick="location.href='/product/userlist?userId=${param.userId}'">재고목록확인</button>
		<button name="menu_btn" id="menu3" onclick="location.href='../storeList.jsp'">매출확인</button>
</body>
</html>