<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Đăng nhập</title>
<!-- MDB icon -->
<link rel="icon" href="img/mdb-favicon.ico" type="image/x-icon" />
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" />
<!-- Google Fonts Roboto -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap" />

<style>
.divider:after, .divider:before {
	content: "";
	flex: 1;
	height: 3px;
	background: #B5B5B5;
}
</style>
<%
String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
		+ request.getContextPath();
%>
<link rel="stylesheet" href="<%=url%>/css/mdb.min.css">
<style>
.red {
	color: red;
}
</style>

</head>
<body>
	<%
	String baoLoi = request.getAttribute("baoLoi") + "";
	baoLoi = (baoLoi.equals("null")) ? "" : baoLoi;
	%>
	<section class="vh-100" style="background-image: url(./img/background.jpg);">
		<div class="container py-5 h-100">
			<div class="row d-flex justify-content-center align-items-center h-100">
				<div class="col col-xl-10">
					<div class="card" style="border-radius: 1rem;">
						<!-- Chia cột -->
						<div class="row g-0">
							<!-- Phần ảnh -->
							<div class="col-md-6 col-lg-5 d-none d-md-block">
								<img
									src="<%=url %>/img/mountain.jpg"
									alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem;" />
							</div>
							<div class="col-md-6 col-lg-7 d-flex align-items-center">
								<div class="card-body p-4 p-lg-4 text-black">

									<!-- Phần FORM  -->
									<form action="dang-nhap" method="post">
										<div class="row justify-content-center">
											<img alt="logo" src="<%=url%>/img/logopt.png"
												style="border-radius: 50%; max-width: 20%; height: auto;">
										</div>

										<h4 class="fw-normal mb-0 pb-3" style="letter-spacing: 1px">ĐĂNG NHẬP</h4>

										<span class="red mb-3"> <%=baoLoi%></span>

										<div data-mdb-input-init class="form-outline mb-4">
											<input type="text" id="tenDangNhap" class="form-control form-control-lg" name="tenDangNhap"/>
											<label class="form-label" for="tenDangNhap"> <i class="fas fa-user"></i> 	Tên đăng nhập</label>
										</div>

										<div class="form-outline mb-4" data-mdb-input-init>
											<input type="password" id="matKhau" class="form-control form-control-lg" name="matKhau" />
											<label class="form-label" for="matKhau" > <i class="fas fa-key"></i> 	Mật khẩu</label>
										
										</div>

										<div class="d-flex justify-content-around align-items-center mb-4">
											<!-- Checkbox -->
											<div class="form-check">
												<input class="form-check-input" type="checkbox" value="" id="form1Example3"
													checked />
												<label class="form-check-label" for="form1Example3">Ghi nhớ tài khoản
												</label>
											</div>
												<a class="text-end" href="#!">Quên mật khẩu?</a>
										</div>

										<!-- Submit button -->
										<button type="submit" class="btn btn-primary btn-lg btn-block">Đăng
											nhập</button>

										<div class="divider d-flex align-items-center my-4">
											<p class="text-center fw-bold mx-3 mb-0 text-muted">HOẶC</p>
										</div>


										<a class="btn btn-primary btn-lg btn-block" style="background-color: #dd4b39"
											href="#!" role="button">
											<i class="fab fa-google me-2"></i>Đăng nhập với Google
										</a>

										<a class="btn btn-primary btn-lg btn-block" style="background-color: #3b5998"
											href="#!" role="button">
											<i class="fab fa-facebook-f me-2"></i>Đăng nhập với Facebook
										</a>

										<div class="text-center mt-4">
											<h6>
												Bạn lần đầu biết đến chúng tôi ?
												<a href="./dangky.jsp">Đăng ký</a>
											</h6>
										</div>
									</form>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- MDB -->
	<script type="text/javascript" src="<%=url%>/js/mdb.umd.min.js"></script>
	<script type="text/javascript">// Initialization for ES Users
    import { Input, initMDB } from "mdb-ui-kit";

    initMDB({ Input });
</script>
</body>
</html>