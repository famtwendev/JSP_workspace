<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Order</title>
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
	<form action="trangDatHang.jsp" method="Get">
		<div class="mb-3 row">
			<label for="hoVaTen" class="col-sm-2 col-form-label">Họ Và Tên</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="hoVaTen" value="hoVaTen">
			</div>
		</div>
		<div class="form-group row">
			<label for="email" class="col-sm-2 col-form-label">Email</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="email" value="email">
			</div>
		</div>
		<div class="form-group row">
			<label for="soLuong" class="col-sm-2 col-form-label">Số lượng mua</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="soLuong" name="soLuong">
			</div>
		</div>
		<div class="form-group row">
			<button type="submit" class="btn btn-primary">Đặt hàng</button>
		</div>
	</form>
</body>
</html>