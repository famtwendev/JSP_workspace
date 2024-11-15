<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thanh toán</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
	integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
	crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
	integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
	crossorigin="anonymous"></script>
</head>
<body>
	<%
	double tongTien = 0;
	String processor = request.getParameter("processor");
	double processorPrice = 0;
	if (processor != null) {
		if (processor.equals("Core I9")) {
			processorPrice += 5000000;
		} else if (processor.equals("Core I7")) {
			processorPrice += 4000000;
		} else if (processor.equals("Core I5")) {
			processorPrice += 3000000;
		}
		tongTien += processorPrice;
	}

	double ramPrice = 0;
	String ram = request.getParameter("ram");
	if (ram != null) {
		if (ram.equals("RAM 8GB")) {
			ramPrice += 500000;
		} else if (ram.equals("RAM 16GB")) {
			ramPrice += 1000000;
		} else if (ram.equals("RAM 32GB")) {
			ramPrice += 2000000;
		}
		tongTien += ramPrice;
	}

	//Checkbox => name
	String monitor = request.getParameter("monitor");
	double monitorPrice = 0;
	if (monitor != null) {
		monitorPrice = 1500000;
	}
	tongTien += monitorPrice;

	//Select Option
	String[] accessories = request.getParameterValues("accessories");
	if (accessories != null)
		for (String luachon : accessories) {
			if (luachon.equals("Camera")) {
		tongTien += 800000;
			} else if (luachon.equals("Printer")) {
		tongTien += 1500000;
			} else if (luachon.equals("Scanner")) {
		tongTien += 1500000;
			}
		}
	%>
	<h1>HÓA ĐƠN</h1>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Tên sản phẩm</th>
				<th scope="col">Giá tiền</th>

			</tr>
		</thead>
		<tbody>
			<%
			if (processor != null) {
			%>
			<tr>
				<td><%=processor%></td>
				<td><%=processorPrice%></td>
			</tr>
			<%
			}
			%>
			<%
			if (ram != null) {
			%>
			<tr>
				<td><%=ram%></td>
				<td><%=ramPrice%></td>
			</tr>
			<%
			}
			%>
			<%
			if (monitor != null) {
			%>
			<tr>
				<td><%=monitor%></td>
				<td><%=monitorPrice%></td>
			</tr>
			<%
			}
			%>
			<%
			if (accessories != null)
				for (String luaChon : accessories) {
					double accessoriesPrice = 0;
					if (luaChon.equals("Camera")) {
				accessoriesPrice = 800000;
					} else if (luaChon.equals("Printer")) {
				accessoriesPrice = 1500000;
					} else if (luaChon.equals("Scanner")) {
				accessoriesPrice = 1500000;
					}
			%>
			<tr>
				<td><%=luaChon%></td>
				<td><%=accessoriesPrice%></td>
			</tr>
			<%
			}
			%>
			<tr>
				<td>Tổng tiền</td>
				<td><b><%=tongTien%></b></td>
			</tr>
		</tbody>
	</table>
</body>
</html>