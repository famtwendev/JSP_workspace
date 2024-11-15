<%@page import="model.KhachHang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Fam Twen | Đăng nhập</title>
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
	<jsp:include page="../header.jsp" />
	<%
	Object objKH = session.getAttribute("khachHang");
	KhachHang khachHang = null;
	if (objKH != null)
		khachHang = (KhachHang) objKH;
	if (khachHang == null) {
		response.sendRedirect(url + "/index.jsp");
	} else {
		String baoLoi = request.getAttribute("baoLoi") + "";
		baoLoi = (baoLoi.equals("null")) ? "" : baoLoi;

		String duongDanAnh = khachHang.getDuongDanAnh(); 
	%>
	<!-- Section: Design Block -->
	<section class="vh-100 text-center" style="background-image: url(<%=url%>/img/background.jpg);">
		<div class="container py-5 h-100">
			<div class="row d-flex justify-content-center align-items-center h-100">
				<div class="col col-xl-10">
					<div class="card" style="border-radius: 1rem;">

						<form id="frmthanhcong" action="<%=url%>/khach-hang-thay-doi-anh" method="post"
							enctype="multipart/form-data">
							<input type="hidden" name="hanhDong" value="thay-doi-anh">
							<!-- 2 column grid layout with text inputs for the first and last names -->
							<div class="form-outline mt-4">
								<div class="row justify-content-center">
									<h3>Thay đổi ảnh đại diện</h3>
								</div>
							</div>
							<div class="form-outline mt-4">
								<div class="row justify-content-center">
									<img src="<%=url%>/avatar/<%=duongDanAnh%>" alt="Ảnh đại diện"
										style="border-radius: 0%; max-width: 50%; height: auto;" class="img-fluid" />
								</div>
							</div>
							<div class="d-flex justify-content-center mt-4">
								<div class="text-content">
									<label for="duongDanAnh" class="form-label"></label>
									<input type="file" id="duongDanAnh"
										class="form-control mb-2" required="required"
										name="duongDanAnh">
									<h3 class="fw-bold mb-2" style="color: red"><%=baoLoi%>
									</h3>
									<button class="btn btn-primary btn-lg px-5 mb-4" type="submit">Lưu thông
										tin</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<jsp:include page="../footer.jsp" />
	<%
	}
	%>
	<!-- Section: Design Block -->
</body>
</html>