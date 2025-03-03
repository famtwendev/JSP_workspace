<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- MDB icon -->
<link rel="icon" href="img/mdb-favicon.ico" type="image/x-icon" />
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" />
<!-- Google Fonts Roboto -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap" />

<title>Fam Twen | Hoàn tất đăng ký</title>
<%
String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
		+ request.getContextPath();
%>
<link rel="stylesheet" href="<%=url%>/css/mdb.min.css">
<%
// Kiểm tra xem có biến session được thiết lập để xác định trang đã được chuyển hướng hay không
if (session.getAttribute("redirectedFromAnotherPage") == null) {
	// Nếu không có biến session, chuyển hướng đến trang khác
	response.sendRedirect("../index.jsp");
}
%>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<!-- Section: Design Block -->
	<section class="vh-100 text-center" style="background-image: url(./img/background.jpg);">
		<div class="container py-5 h-100">
			<div class="row d-flex justify-content-center align-items-center h-100">
				<div class="col col-xl-10">
					<div class="card" style="border-radius: 1rem;">

						<form id="frmthanhcong" action="dangnhap.jsp" method="post">
							<!-- 2 column grid layout with text inputs for the first and last names -->

							<div class="form-outline mt-4">
								<div class="row justify-content-center">
									<img src="./img/logopt.png" alt="Dấu tích thành công"
										style="border-radius: 50%; max-width: 30%; height: auto;" class="img-fluid" />
								</div>
							</div>

							<div class="form-outline mt-4">
								<h1 class="fw-bold mb-4" style="color: red">ĐĂNG KÝ TÀI KHOẢN THÀNH CÔNG</h1>
							</div>


							<div class="form-outline mb-2">
								<div class="text-content">
									<h3>Cảm ơn quý khách đã tạo tài khoản.</h3>
								</div>
							</div>


							<div class="form-outline mb-4">
								<div class="text-center">
									<h6>Quý khách vui lòng sử dụng tài khoản để đăng nhập hệ thống.</h6>
								</div>
							</div>


							<div class="form-check d-flex justify-content-center mb-4">
								<div class="text-content">
									<h6>Chúc quý khách có những trải nghiệm thật tốt.</h6>
								</div>
							</div>

							<div class="form-outline mb-4">
								<!-- Submit button -->
								<input type="submit" class="btn btn-primary btn-lg btn-block" value="Đăng nhập"
									name="submit" id="submit">
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<jsp:include page="../footer.jsp" />
	
	<!-- Section: Design Block -->
</body>
</html>