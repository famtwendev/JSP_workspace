<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mua Máy Tính</title>
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
	<div class="container">

		<h1>Chọn cấu hình máy tính bạn cần mua</h1>
		<hr />
		<form action="datMuaMayTinh.jsp">
			<h2>Processcor</h2>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="processor" id="corei9" value="Core I9">
				<label class="form-check-label" for="corei9">Core I9</label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="processor" id="corei7" value="Core I7">
				<label class="form-check-label" for="corei7">Core I7</label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="processor" id="corei5" value="Core I5">
				<label class="form-check-label" for="corei5">Core I5</label>
			</div>

			<h2>Memory</h2>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="ram" id="ram8gb" value="RAM 8GB"> 
				<label class="form-check-label" for="ram8gb">RAM 8GB</label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="ram" id="ram16gb" value="RAM 16GB">
				<label class="form-check-label" for="ram16gb">RAM16GB</label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="ram" id="ram32gb" value="RAM 32GB">
				<label class="form-check-label" for="ram32gb">RAM 32GB</label>
			</div>


			<h2>Monitor</h2>
			<div class="form-check">
				<input class="form-check-input" type="checkbox" value="Monitor" id="monitor" name="monitor">
				<label class="form-check-label" for="monitor">Monitor</label>
			</div>

			<h2>Acessories</h2>
			<select class="form-select" multiple aria-label="Multiple select example" name="accessories">
				<option value="Camera">Camera</option>
				<option value="Printer">Printer</option>
				<option value="Scanner">Scanner</option>
			</select>
			<button class="btn btn-primary mt-2 " type="submit">Buy</button>
		</form>
	</div>
</body>
</html>