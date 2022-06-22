<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<html>

<head>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
        google.charts.load('current', {'packages':['corechart']});
        google.charts.setOnLoadCallback(drawChart);

        function drawChart() {
            var data = google.visualization.arrayToDataTable([
                ['STORE', 'Profits'],
                <c:forEach items="${list}" var="dto">
                ['${dto.userId}', ${dto.profit}],
                </c:forEach>
            ]);

            var options = {
                title: 'MonthlyProfit',
                curveType: 'function',
                legend: { position: 'bottom' }
            };

            var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));

            chart.draw(data, options);
        }
    </script>
<meta charset="UTF-8">
<title>돈좀벌었나~?</title>
</head>
<body>
	<table border="1">
		<col width="1">
		<col width="50">
		<col width="100">
		<col width="200">
		<tr>
			<th>STORE</th>
			<th>PROFIT</th>
		</tr>
		
		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.userId }</td>
				<td>${dto.profit }</td>
			</tr>
		</c:forEach>
	</table>
	<div class="container">
		<div class="text-center">
			<div class="dropdown">
				<a class="btn btn-secondary dropdown-toggle" href="#" role="button"
					id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Month </a>

				<div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
					<a class="dropdown-item" href="/profit/getMonthProfit?month=1">January</a>
					<a class="dropdown-item" href="/profit/getMonthProfit?month=2">February</a> 
					<a class="dropdown-item" href="/profit/getMonthProfit?month=3">March</a>
					<a class="dropdown-item" href="/profit/getMonthProfit?month=4">April</a>
					<a class="dropdown-item" href="/profit/getMonthProfit?month=5">May</a> 
					<a class="dropdown-item" href="/profit/getMonthProfit?month=6">June</a>
					<a class="dropdown-item" href="/profit/getMonthProfit?month=7">July</a>
					<a class="dropdown-item" href="/profit/getMonthProfit?month=8">August</a> 
					<a class="dropdown-item" href="/profit/getMonthProfit?month=9">September</a>
					<a class="dropdown-item" href="/profit/getMonthProfit?month=10">October</a>
					<a class="dropdown-item" href="/profit/getMonthProfit?month=11">November</a> 
					<a class="dropdown-item" href="/profit/getMonthProfit?month=12">December</a>
				</div>
			</div>
		</div>
		</div>
	<div id="curve_chart" style="width: 900px; height: 500px"></div>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
		crossorigin="anonymous"></script>
</body>
</html>