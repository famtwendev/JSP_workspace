<%@page import="model.KhachHang"%>
<%@page import="database.KhachHangDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- MDB icon -->
<link rel="icon" href="img/mdb-favicon.ico" type="image/x-icon" />
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" />
<!-- Google Fonts Roboto -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap" />

<title>Fam Twen | Quên mật khẩu</title>
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
		response.sendRedirect(url + "/index.jsp");
	} else {
		String email = request.getAttribute("email") + "";
		email = (email.equals("null")) ? "" : email;
		String baoLoi = request.getAttribute("baoLoi") + "";
		baoLoi = (baoLoi.equals("null")) ? "" : baoLoi;
	%>
	<jsp:include page="../header.jsp" />
	<!-- Section: Design Block -->
	<section class="vh-100 text-center"
		style="background-image: url(<%=url%>/img/background.jpg);">
		<div class="container py-5 h-100">
			<div class="row d-flex justify-content-center align-items-center h-100">
				<div class="col col-xl-12">
					<div class="card" style="border-radius: 1rem;">
						<form id="frmcheckmail" action="<%=url%>/khach-hang" method="post">
							<input type="hidden" name="hanhDong" value="create-new-pass">
							<div class="card d-flex justify-content-center align-items-center p-5 text-center">
								<!-- Logo -->
								<div class="col-12 col-md-8 col-lg-8 col-xl-10">
									<div class="row mt-4">
										<div class="form-outline">
											<img src="<%=url%>/img/logopt.png" alt="Dấu tích thành công"
												style="border-radius: 50%; max-width: 30%; height: auto;" class="img-fluid" />
										</div>
									</div>
									<!-- Input Email -->
									<div class="row d-flex justify-content-center align-items-center mt-5 mb-4">
										<div class="col-xl-6">
											<div class="border border-gray rounded-5 shadow p-5">
												<ul class="m-0 p-0">
													<li class="pb-2" style="list-style: none"><h5 class="text-start">
															Đặt mật khẩu mới cho tài khoản của bạn.</h5>
															<input type="hidden" name="email" value="<%=email%>"></li>
												</ul>
												<ul class="m-0 p-0">
													<li class="pb-4" style="list-style: none">
														<div class="text-start mt-3">
															<span class="text-start mt-5" style="color: red"><%=baoLoi%></span>
														</div>
														<div class="form-outline" data-mdb-input-init>
															<input type="password" id="matKhauMoi" name="matKhauMoi"
																class="form-control form-control-lg" required="required"
																onkeyup="kiemTraNewPassword()" />
															<label class="form-label" for="matKhauMoi">Mật khẩu mới</label>
														</div>
													</li>
													<li class="pb-4" style="list-style: none">
														<div class="form-outline" data-mdb-input-init>
															<input type="password" id="matKhauMoiNhapLai" name="matKhauMoiNhapLai"
																class="form-control form-control-lg" required="required"
																onkeyup="kiemTraNewPassword()" />
															<label class="form-label" for="matKhauMoiNhapLai">Nhập lại mật khẩu</label>
														</div>
													</li>
												</ul>
												<ul class="m-0 p-0">
													<li class="text-end" style="list-style: none">
														<button type="submit" class="btn btn-primary" data-mdb-ripple-init>Lưu
															mật khẩu</button>
													</li>
												</ul>
											</div>
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
	<!-- MDB -->
	<script type="text/javascript" src="<%=url%>/js/mdb.umd.min.js"></script>
	<script type="text/javascript">
	import { Input, initMDB } from "mdb-ui-kit";
	initMDB({ Input });
	import { Ripple, initMDB } from "mdb-ui-kit";
	initMDB({ Ripple });
</script>
	<%
	}
	%>
</body>
</html>