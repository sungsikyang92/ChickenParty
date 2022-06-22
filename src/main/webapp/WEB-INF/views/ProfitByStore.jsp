<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
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
        <th>MONTH</th>
        <th>PROFIT</th>
    </tr>
    <c:forEach items="${list}" var="dto">
        <tr>
            <td>${dto.userId }</td>
            <td>${dto.profit }</td>
        </tr>
    </c:forEach>
</table>
<div id="curve_chart" style="width: 900px; height: 500px"></div>
</body>
</html>