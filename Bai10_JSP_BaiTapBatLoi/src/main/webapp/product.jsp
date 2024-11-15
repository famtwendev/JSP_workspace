<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product</title>
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

<script>
	function my_submit() {
		result = "hoantat";
		//Bắt lỗi
		maSanPham = document.getElementById("maSanPham").value;
		tenSanPham = document.getElementById("tenSanPham").value;
		giaNhap = document.getElementById("giaNhap").value;
		giaBan = document.getElementById("giaBan").value;

		if (maSanPham.length == 0) {
			alert("Bạn phải nhập mã sản phẩm");
			return;
		}

		if (tenSanPham.length == 0) {
			alert("Bạn phải nhập tên sản phẩm");
			return;
		}

		if (giaNhap <= 0) {
			error_giaNhap = document.getElementById("error_giaNhap");
			error_giaNhap.innerHTML = "<span class='rq'>Bạn cần nhập giá nhập!</span>";
			return;
		}

		if (giaBan <= 0) {
			error_giaBan = document.getElementById("error_giaBan");
			error_giaBan.innerHTML = "<span class='rq'>Bạn cần nhập giá bán!</span>";
			return;
		}

		if (result == "hoantat") {
			//submit form
			my_form = document.getElementById("my_form");
			my_form.submit();

		}
	}
</script>

</head>
<body>
<%
	String e_maSanPham = request.getAttribute("e_maSanPham")+"";
	e_maSanPham = (e_maSanPham.equals("null"))?"":e_maSanPham;

	String value_maSanPham = request.getAttribute("value_maSanPham")+"";
	String value_tenSanPham = request.getAttribute("value_tenSanPham")+"";
	String value_giaNhap_String = request.getAttribute("value_giaNhap")+"";
	String value_giaBan_String = request.getAttribute("value_giaBan")+"";
	String value_hanSuDung_String = request.getAttribute("value_hanSuDung")+"";
	String value_vat_String = request.getAttribute("value_vat")+"";
	String value_moTa = request.getAttribute("value_moTa")+"";
	
	
	value_maSanPham = (value_maSanPham.equals("null"))?"":value_maSanPham;
	value_tenSanPham = (value_tenSanPham.equals("null"))?"":value_tenSanPham;
	value_giaNhap_String = (value_giaNhap_String.equals("null"))?"":value_giaNhap_String;
	value_giaBan_String = (value_giaBan_String.equals("null"))?"":value_giaBan_String;
	value_hanSuDung_String = (value_hanSuDung_String.equals("null"))?"":value_hanSuDung_String;
	value_vat_String = (value_vat_String.equals("null"))?"":value_vat_String;
	value_moTa = (value_moTa.equals("null"))?"":value_moTa;
	
%>


	<div class="container mt-4">

		<form class="row g-3 needs-validation" action="save-product" id="my_form">

			<div class="row">
				<div class="col-6">
					<label for="maSanPham" class="form-label">Mã sản phẩm <span class="rq">(*)</span>
					</label>
					<input type="text" class="form-control" id="maSanPham" name="maSanPham" value="<%=value_maSanPham%>" required>
					<div class="rq"><%=e_maSanPham %></div>

				</div>

				<div class="col-6">
					<label for="tenSanPham" class="form-label">Tên sản phẩm <span class="rq">(*)</span>
					</label>
					<input type="text" class="form-control" id="tenSanPham" name="tenSanPham" value="<%=value_tenSanPham%>" required>
				</div>
			</div>

			<div class="row">
				<div class="col-6">
					<label for="giaNhap" class="form-label">Giá nhập <span class="rq">(*)</span>
					</label>
					<input type="number" step="0.01" class="form-control" id="giaNhap" name="giaNhap" value="<%=value_giaNhap_String%>" required>
					<div id="error_giaNhap"></div>
				</div>
				<div class="col-6">
					<label for="giaBan" class="form-label">Giá bán <span class="rq">(*)</span>
					</label>
					<input type="number" step="0.01" class="form-control" id="giaBan" name="giaBan" value="<%=value_giaBan_String%>" required>
					<div id="error_giaBan"></div>
				</div>
			</div>

			<div class="row">
				<div class="col-6">
					<label for="hanSuDung" class="form-label">Hạn sử dụng</label>
					<input type="datetime-local" class="form-control" id="hanSuDung" name="hanSuDung" value="<%=value_hanSuDung_String%>">
				</div>
				<div class="col-6">
					<label for="vat" class="form-label">VAT</label>
					<input type="number" step="0.01" class="form-control" id="vat" name="vat" value="<%=value_vat_String%>">
				</div>
			</div>

			<div class="row">
				<label for="moTa" class="form-label">Mô tả sản phẩm</label>
				<textarea rows="10" cols="20" class="form-control" id="moTa" name="moTa" <%=value_moTa %>></textarea>
			</div>


			<div class="row">
				<button class="btn btn-primary" type="button" onclick="my_submit()">Lưu sản phẩm</button>
			</div>

		</form>
	</div>
</body>
</html>