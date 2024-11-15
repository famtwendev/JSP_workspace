<%@page import="model.KhachHang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" shrink-to-fit=no">
<title>Fam Twen | Thông tin tài khoản</title>
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
<!-- MAIN CSS -->
<link rel="stylesheet" href="<%=url%>/css/maincs.css">
<link rel="stylesheet" href="<%=url%>/css/mdb.min.css">
</head>
<body>
	<jsp:include page="../header.jsp" />
	<%
	Object objKH = session.getAttribute("khachHang");
	KhachHang khachHang = null;
	if (objKH != null)
		khachHang = (KhachHang) objKH;
	if (khachHang == null) {
		response.sendRedirect("dangnhap.jsp");
	} else {
	%>
	<!-- Section: Design Block -->
	<section>
		<%
		String e_email = request.getAttribute("e_email") + "";
		e_email = (e_email.equals("null")) ? "" : e_email;

		String e_emailFormat = request.getAttribute("e_emailFormat") + "";
		e_emailFormat = (e_emailFormat.equals("null")) ? "" : e_emailFormat;

		String baoLoi = request.getAttribute("baoLoi") + "";
		baoLoi = (baoLoi.equals("null")) ? "" : baoLoi;

		String hoVaTen = khachHang.getHoVaTen();

		String gioiTinh = khachHang.getGioiTinh();

		String ngaySinh = khachHang.getNgaySinh().toString();

		String diaChiKhachHang = khachHang.getDiaChi();

		String diaChiMuaHang = khachHang.getDiaChiMuaHang();

		String diaChiNhanHang = khachHang.getDiaChiNhanHang();

		String dienThoai = khachHang.getSoDienThoai();

		String email = khachHang.getEmail();
		%>
		<!-- neu block thi dung <div class = "container py-4 vh-100">  -->
		<div class="card-body py-5 h-100">
			<div class="container-fluid d-flex justify-content-center align-items-center">
				<div class="col-12 col-md-8 col-lg-6 col-xl-8">
					<form id="myForm" class="form needs-validation" action="../khach-hang" method="post">
						<input type="hidden" name="hanhDong" value="thay-doi-thong-tin-kh">
						<h1 class="fw-bold mb-5 text-center">THÔNG TIN TÀI KHOẢN</h1>
						<!-- 2 column grid layout with text inputs for the first and last names -->
						<div class="row">
							<div class="col-md-6 mb-4">
								<h3 class="mb-2">Thông tin khách hàng</h3>
								<div class="form-outline">
									<label for="hoVaTen" class="form-label">Họ và tên<span class="red">*</span></label>
									<input type="text" class="form-control border border-secondary" id="hoVaTen"
										name="hoVaTen" value="<%=hoVaTen%>">
								</div>
							</div>

							<div class="col-md-6 mb-4">
								<h3 class="mb-2">Địa chỉ</h3>
								<div class="form-outline">
									<label for="diaChiKhachHang" class="form-label">Địa chỉ khách hàng</label>
									<input type="text" class="form-control border border-secondary"
										id="diaChiKhachHang" name="diaChiKhachHang" value="<%=diaChiKhachHang%>">
								</div>
							</div>
						</div>


						<div class="row">
							<div class="col-md-6 mb-4">
								<div class="form-outline">
									<label for="gioiTinh" class="form-label">Giới tính<span class="red">*</span></label>
									<select class="form-control border border-secondary" id="gioiTinh"
										name="gioiTinh" required="required">
										<option selected disabled hidden>---</option>
										<option value="Nam" <%=(gioiTinh.equals("Nam")) ? "selected='selected'" : ""%>>Nam</option>
										<option value="Nữ" <%=(gioiTinh.equals("Nữ")) ? "selected='selected'" : ""%>>Nữ</option>
										<option value="Khác" <%=(gioiTinh.equals("Khác")) ? "selected='selected'" : ""%>>Khác</option>
									</select>
								</div>
							</div>
							<div class="col-md-6 mb-4">
								<div class="form-outline">
									<label for="diaChiMuaHang" class="form-label">Địa chỉ Mua hàng</label>
									<input type="text" class="form-control border border-secondary"
										id="diaChiMuaHang" name="diaChiMuaHang" value="<%=diaChiMuaHang%>">
								</div>
							</div>
						</div>


						<div class="row">
							<div class="col-md-6 mb-4">
								<div class="form-outline">
									<label for="ngaySinh" class="form-label">Ngày sinh<span class="red">*</span></label>
									<input type="date" class="form-control border border-secondary" id="ngaySinh"
										name="ngaySinh" value="<%=ngaySinh%>">
								</div>
							</div>
							<div class="col-md-6 mb-4">
								<div class="form-outline">
									<label for="diaChiNhanHang" class="form-label">Địa chỉ Nhận hàng<span
										class="red">*</span>
									</label>
									<input type="text" class="form-control border border-secondary"
										id="diaChiNhanHang" name="diaChiNhanHang" value="<%=diaChiNhanHang%>">
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-6 mb-4">
								<div class="form-outline">
									<label for="dienThoai" class="form-label">Điện thoại<span class="red">*</span></label>
									<input type="tel" class="form-control border border-secondary" id="dienThoai"
										name="dienThoai" value="<%=dienThoai%>">
								</div>
							</div>
							<div class="col-md-6 mb-4">
								<div class="form-outline">
									<label for="email" class="form-label">Email<span class="red">* <%=e_email%>
											<%=e_emailFormat%></span></label>
									<input type="email" class="form-control border border-secondary" id="email"
										name="email" value="<%=email%>">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-6 mb-4 text-center">
								<!-- Nút button về trang chủ -->
								<a href="../index.jsp" class="btn btn-primary btn-lg">
									<i class="fas fa-arrow-left me-3"></i>Trang chủ
								</a>
							</div>

							<div class="col-md-6 mb-4 text-center">

								<!-- Submit button -->
								<button type="submit" class="btn btn-danger btn-lg" name="submit" id="submit">
									<i class="fas fa-floppy-disk me-3"></i>LƯU THÔNG TIN
								</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<!-- MDB -->
	<script type="text/javascript">// Initialization for ES Users
    import { Input, initMDB } from "mdb-ui-kit";
    initMDB({ Input });
</script>

	<%
	}
	%>
	<!-- Section: Design Block -->
	<jsp:include page="../footer.jsp" />
</body>
</html>