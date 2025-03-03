<%@page import="model.KhachHang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fam Twen | Đổi mật khẩu</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- MDB icon -->
<link rel="icon" href="img/mdb-favicon.ico" type="image/x-icon" />
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" />
<!-- Google Fonts Roboto -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap" />

<%
String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
		+ request.getContextPath();
%>
<link rel="stylesheet" href="<%=url%>/css/mdb.min.css">
</head>


<body>
	<%
	Object objKH = session.getAttribute("khachHang");
	KhachHang khachHang = null;
	if (objKH != null)
		khachHang = (KhachHang) objKH;
	if (khachHang == null) {
	%>
	<section class="vh-100 text-center"
		style="background-image: url(<%=url%>/img/background.jpg);">
		<div class="container py-5 h-100">
			<div class="row d-flex justify-content-center align-items-center h-100">
				<div class="col col-xl-10">
					<div class="card" style="border-radius: 1rem;">

						<form action="./index.jsp" method="post">
							<!-- 2 column grid layout with text inputs for the first and last names -->
							<div class="form-outline mt-4">
								<div class="row justify-content-center">
									<img src="./img/logopt.png" alt="Dấu tích thành công"
										style="border-radius: 50%; max-width: 30%; height: auto;" class="img-fluid" />
								</div>
							</div>
							<div class="form-outline mt-4">
								<h1 class="fw-bold mb-4" style="color: red">BẠN CHƯA ĐĂNG NHẬP VÀO TÀI KHOẢN
									HỆ THỐNG</h1>
							</div>
							<div class="form-outline mb-mt-4"></div>
							<div class="form-outline mb-4 ">
								<!-- Submit button -->
								<input type="submit" class="btn btn-primary btn-lg btn-block" value="VỀ TRANG CHỦ"
									name="submit" id="submit">
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<%
	} else {
	String baoLoi = request.getAttribute("baoLoi") + "";
	baoLoi = (baoLoi.equals("null")) ? "" : baoLoi;
	%>
	<section class="vh-100 gradient-custom" style="background-color: #611DD0">
		<div class="container py-5 h-100">
			<div class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-12 col-md-8 col-lg-6 col-xl-5">
					<div class="card bg-dark text-white" style="border-radius: 1rem;">
						<form id="frmthanhcong" action="<%=url%>/khach-hang" method="post">
							<input type="hidden" name="hanhDong" value="doi-mat-khau">
							<div class="card-body p-5 text-center">

								<div class="mb-md-5 mt-md-4">

									<h2 class="fw-bold mb-3 text-uppercase">ĐỔI MẬT KHẨU</h2>

									<span class="mt-5" style="color: red"> <%=baoLoi%></span>

									<p class="mb-3">
									<p>
									<div data-mdb-input-init class="form-outline form-white mb-4">
										<input type="password" id="matKhauHienTai" class="form-control form-control-lg"
											name="matKhauHienTai" />
										<label class="form-label" for="matKhauHienTai">Mật khẩu hiện tại</label>
									</div>


									<div data-mdb-input-init class="form-outline form-white mb-4">
										<input type="password" id="matKhauMoi" class="form-control form-control-lg"
											required="required" name="matKhauMoi" onkeyup="kiemTraNewPassword()" />
										<label class="form-label" for="matKhauMoi">Mật khẩu mới</label>
									</div>

									<div data-mdb-input-init class="form-outline form-white mb-4">
										<input type="password" id="matKhauMoiNhapLai"
											class="form-control form-control-lg" name="matKhauMoiNhapLai"
											required="required" onkeyup="kiemTraNewPassword()" />
										<label class="form-label" for="matKhauMoiNhapLai">Nhập lại mật khẩu mới</label>
									</div>

									<div class="form-outline form-white mb-4">
										<h6 class="mt-mb-2" id="msger" style="color: red;"></h6>
									</div>

									<div class="row justify-content-center">
										<div class="col-md-6">
											<!-- Nút button về trang chủ -->
											<a href="../index.jsp" class="btn btn-primary btn-lg px-5 mt-3">
												<i class="fas fa-arrow-left me-3"></i>Trang chủ
											</a>
										</div>
										<!-- Sử dụng lưới bootstrap -->
										<div class="col-md-6">
											<button class="btn btn-danger btn-lg px-5 mt-3" type="submit"
												id="submitDoiPass" name="submitDoiPass">Lưu mật khẩu</button>
										</div>

									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<%
	}
	%>
</body>
<!-- MDB -->
<script type="text/javascript" src="<%=url%>/js/mdb.umd.min.js"></script>
<script type="text/javascript">// Initialization for ES Users
    import { Input, initMDB } from "mdb-ui-kit";

    initMDB({ Input });
</script>
<script>
	function kiemTraNewPassword() {
		var matKhauMoi = document.getElementById("matKhauMoi").value;
		var matKhauMoiNhapLai = document.getElementById("matKhauMoiNhapLai").value;

		if (matKhauMoi != matKhauMoiNhapLai) {
			document.getElementById("msger").textContent = "  Mật khẩu không khớp!";
			return false;
		} else {
			document.getElementById("msger").textContent = "";
			return true;
		}
	}
</script>
</html>