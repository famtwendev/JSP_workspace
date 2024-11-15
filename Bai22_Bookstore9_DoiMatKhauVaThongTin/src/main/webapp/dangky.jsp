<%@page import="model.KhachHang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" shrink-to-fit=no">
<title>Regisrter</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
	integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
	crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
	integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz"
	crossorigin="anonymous"></script>
<%
String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
		+ request.getContextPath();
%>
<!-- MAIN CSS -->
<link rel="stylesheet" href="<%=url%>/css/maincs.css">
<%
// Thiết lập biến session để xác định rằng trang đã được chuyển hướng từ một trang khác
session.setAttribute("redirectedFromAnotherPage", true);
%>
</head>
<body>
	<%
	Object objKH = session.getAttribute("khachHang");
	KhachHang khachHang = null;
	if (objKH != null)
	    khachHang = (KhachHang) objKH;
	if (khachHang != null) {
	%>
	<script>
		alert(
				"Đã đăng nhập xin thoát ra để đăng ký tài khoản mới nếu cần thiết!")
	</script>
	<%
	    response.sendRedirect("index.jsp"); // Thay "index.jsp" bằng URL của trang chính
	} else {
	    // Chưa đăng nhập, cho phép truy cập vào trang đăng ký
	    // Tiếp tục xử lý tại đây (ví dụ: hiển thị trang đăng ký)
	}

	
	String e_email = request.getAttribute("e_email") + "";
	e_email = (e_email.equals("null")) ? "" : e_email;

	String e_emailFormat = request.getAttribute("e_emailFormat") + "";
	e_emailFormat = (e_emailFormat.equals("null")) ? "" : e_emailFormat;

	String e_tenDangNhap = request.getAttribute("e_tenDangNhap") + "";
	e_tenDangNhap = (e_tenDangNhap.equals("null")) ? "" : e_tenDangNhap;

	String e_tenDangNhapFormat = request.getAttribute("e_tenDangNhapFormat") + "";
	e_tenDangNhapFormat = (e_tenDangNhapFormat.equals("null")) ? "" : e_tenDangNhapFormat;

	String tenDangNhap = request.getAttribute("tenDangNhap") + "";
	tenDangNhap = (tenDangNhap.equals("null")) ? "" : tenDangNhap;

	String hoVaTen = request.getAttribute("hoVaTen") + "";
	hoVaTen = (hoVaTen.equals("null")) ? "" : hoVaTen;

	String gioiTinh = request.getAttribute("gioiTinh") + "";
	gioiTinh = (gioiTinh.equals("null")) ? "" : gioiTinh;

	String ngaySinh = request.getAttribute("ngaySinh") + "";
	ngaySinh = (ngaySinh.equals("null")) ? "" : ngaySinh;

	String diaChiKhachHang = request.getAttribute("diaChiKhachHang") + "";
	diaChiKhachHang = (diaChiKhachHang.equals("null")) ? "" : diaChiKhachHang;

	String diaChiMuaHang = request.getAttribute("diaChiMuaHang") + "";
	diaChiMuaHang = (diaChiMuaHang.equals("null")) ? "" : diaChiMuaHang;

	String diaChiNhanHang = request.getAttribute("diaChiNhanHang") + "";
	diaChiNhanHang = (diaChiNhanHang.equals("null")) ? "" : diaChiNhanHang;

	String dienThoai = request.getAttribute("dienThoai") + "";
	dienThoai = (dienThoai.equals("null")) ? "" : dienThoai;

	String email = request.getAttribute("email") + "";
	email = (email.equals("null")) ? "" : email;

	String dongYNhanEmail = request.getAttribute("dongYNhanEmail") + "";
	dongYNhanEmail = (dongYNhanEmail.equals("null")) ? "" : dongYNhanEmail;
	%>


	<div class="container">
		<form id="myForm" class="form needs-validation" action="dang-ky" method="post">
			<h1 class="text-center" style="font-weight: bold;">ĐĂNG KÝ TÀI KHOẢN</h1>
			<p>
				Nếu bạn đã có tài khoản, hãy đăng nhập
				<a href="./dangnhap.jsp">tại đây</a>
				.
			</p>
			<div class="row">
				<div class="col-md-6">
					<h3 class="mb-3">Tài khoản</h3>

					<div class="mb-3">
						<label for="tenDangNhap" class="form-label">Tên đăng nhập<span class="red">*
								<%=e_tenDangNhap%> <%=e_tenDangNhapFormat%></span></label>
						<input type="text" class="form-control" id="tenDangNhap" name="tenDangNhap"
							required="required" value="<%=tenDangNhap%>">
					</div>
					<div class="mb-3">
						<label for="matKhau" class="form-label">Mật khẩu<span class="red">*</span></label>
						<input type="password" class="form-control" id="matKhau" name="matKhau"
							required="required" onkeyup="kiemTraMatKhau()">

					</div>
					<div class="mb-3">
						<label for="matKhauNhapLai" class="form-label">Xác nhận mật khẩu<span
							class="red">*</span><span class="red" id="msg"></span>
						</label>
						<input type="password" class="form-control" id="matKhauNhapLai"
							name="matKhauNhapLai" required="required" onkeyup="kiemTraMatKhau()">

					</div>

					<h3 class="mb-3">Thông tin khách hàng</h3>
					<div class="mb-3">
						<label for="hoVaTen" class="form-label">Họ và tên<span class="red">*</span></label>
						<input type="text" class="form-control" id="hoVaTen" name="hoVaTen"
							value="<%=hoVaTen%>" required="required">
					</div>
					<div class="mb-3">
						<label for="gioiTinh" class="form-label">Giới tính<span class="red">*</span></label>
						<select class="form-control" id="gioiTinh" name="gioiTinh" required="required">
							<option selected disabled hidden>---</option>
							<option value="Nam" <%=(gioiTinh.equals("Nam")) ? "selected='selected'" : ""%>>Nam</option>
							<option value="Nữ" <%=(gioiTinh.equals("Nữ")) ? "selected='selected'" : ""%>>Nữ</option>
							<option value="Khác" <%=(gioiTinh.equals("Khác")) ? "selected='selected'" : ""%>>Khác</option>
						</select>
					</div>
					<div class="mb-3">
						<label for="ngaySinh" class="form-label">Ngày sinh<span class="red">*</span></label>
						<input type="date" class="form-control" id="ngaySinh" name="ngaySinh"
							value="<%=ngaySinh%>" required="required">
					</div>
				</div>

				<div class="col-md-6">
					<h3 class="mb-3">Địa chỉ</h3>
					<div class="mb-3">
						<label for="diaChiKhachHang" class="form-label">Địa chỉ khách hàng</label>
						<input type="text" class="form-control" id="diaChiKhachHang" name="diaChiKhachHang"
							value="<%=diaChiKhachHang%>">
					</div>
					<div class="mb-3">
						<label for="diaChiMuaHang" class="form-label">Địa chỉ Mua hàng</label>
						<input type="text" class="form-control" id="diaChiMuaHang" name="diaChiMuaHang"
							value="<%=diaChiMuaHang%>">
					</div>
					<div class="mb-3">
						<label for="diaChiNhanHang" class="form-label">Địa chỉ Nhận hàng<span
							class="red">*</span>
						</label>
						<input type="text" class="form-control" id="diaChiNhanHang" name="diaChiNhanHang"
							value="<%=diaChiNhanHang%>">
					</div>

					<div class="mb-3">
						<label for="dienThoai" class="form-label">Điện thoại<span class="red">*</span></label>
						<input type="tel" class="form-control" id="dienThoai" name="dienThoai"
							value="<%=dienThoai%>">
					</div>
					<div class="mb-3">
						<label for="email" class="form-label">Email<span class="red">* <%=e_email%>.
								<%=e_emailFormat%></span></label>
						<input type="email" class="form-control" id="email" name="email" value="<%=email%>">
					</div>
					<hr>

					<div class="mb-3">
						<label for="dongYDieuKhoan" class="form-label">Đồng ý với <a href="#">điều
								khoản của chúng tôi </a>
						</label>
						<input type="checkbox" class="form-check-input" id="dongYDieuKhoan"
							name="dongYDieuKhoan">
					</div>

					<div class="mb-3">
						<label for="dongYNhanEmail" class="form-label">Đồng ý nhận thông báo qua
							Email <span class="red">*</span>
						</label>
						<input type="checkbox" class="form-check-input" id="dongYNhanEmail"
							name="dongYNhanEmail" <%=(dongYNhanEmail.equals("1")) ? "checked" : ""%>>
					</div>

					<input class="btn btn-primary form-control" type="submit" value="Đăng ký"
						name="submit" id="submit" disabled>
				</div>
			</div>
		</form>
	</div>

	<script src="<%=url%>/js/mainjs.js"></script>
</body>
<!-- <script>
	function kiemTraMatKhau() {
		matKhau = document.getElementById("matKhau").value;
		matKhauNhapLai = document.getElementById("matKhauNhapLai").value;
		if (matKhau != matKhauNhapLai) {
			document.getElementById("msg").textContent = "  Mật khẩu không khớp!";
			return false;
		} else {
			document.getElementById("msg").textContent = "";
			return true;
		}
	}
</script>  -->
</html>