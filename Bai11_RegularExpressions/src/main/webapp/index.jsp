<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Regular Expression</title>
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
<style>
	.rq {
		color: red;
	}
</style>
<body>
	<div class="container mt-5">
		<%
		String e_soLuong = request.getAttribute("e_soLuong") + "";
		String e_soDienThoai = request.getAttribute("e_soDienThoai") + "";
		String e_email = request.getAttribute("e_email") + "";

		e_soLuong = (e_soLuong.equals("null")) ? "" : e_soLuong;
		e_soDienThoai = (e_soDienThoai.equals("null")) ? "" : e_soDienThoai;
		e_email = (e_email.equals("null")) ? "" : e_email;
		%>
		<form action="mua-hang" method="get">
			Số lượng cần mua:
			<input class="form-control" type="text" name="soLuong" required="required" />
			<span class="rq"><%=e_soLuong%></span> <br /> Số điện thoại:
			<input class="form-control" type="text" name="soDienThoai" required="required" />
			<span class="rq"><%=e_soDienThoai%></span> <br /> Email:
			<input class="form-control" type="text" name="email" required="required"
				placeholder="example@email.com" />
			<span class="rq"><%=e_email%></span><br />
			<input class="form-control" style="background-color: #FFB3BB" type="submit" value="Mua hàng" />
		</form>
	</div>

</body>
</html>