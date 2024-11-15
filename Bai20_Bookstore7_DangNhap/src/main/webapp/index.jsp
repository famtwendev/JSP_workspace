<%@page import="model.KhachHang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Bookstore</title>
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
body {
	background-image: url(./img/background.jpg);
}
</style>

</head>
<body>
	<!-- Navbar -->
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">
				<img src="./img/logopt.png" alt="Logo" width="80" height="80"
					class="d-inline-block align-text-top">
			</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
				data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active" aria-current="page" href="#">Trang
							chủ</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Giảm giá</a></li>
					<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#"
							role="button" data-bs-toggle="dropdown" aria-expanded="false"> Thể loại </a>
						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="#">Quần Jeans</a></li>
							<li><a class="dropdown-item" href="#">Áo polo</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Hoodie</a></li>
						</ul></li>
					<li class="nav-item"><a class="nav-link disabled" aria-disabled="true">Hết
							hàng</a></li>
				</ul>
				<form class="d-flex" role="search">
					<input class="form-control me-2" type="search" placeholder="Nội dung tìm kím"
						aria-label="Search">
					<button class="btn btn active" type="submit">Tìm</button>
					<% 
						Object objKH = session.getAttribute("khachHang");
						KhachHang khachHang = null;
						if(objKH!=null)
							khachHang = (KhachHang)objKH;	
						if(khachHang==null)
						{
					%>
					<a class="btn btn-outline-primary" style="white-space: nowrap; margin-left: 0.5rem"
						href="dangnhap.jsp"">Đăng nhập</a>
					<a class="btn btn-primary" style="white-space: nowrap; margin-left: 0.5rem"
						href="dangky.jsp">Đăng ký</a>
					<%
						}else{				
					%>
						<a class="btn btn-primary" style="white-space: nowrap; margin-left: 0.5rem"
						href="#">Xin chào, <%=khachHang.getTenDangNhap() %></a>			
						<a class="btn btn-outline-primary" style="white-space: nowrap; margin-left: 0.5rem"
						href="dang-xuat">Đăng xuất</a>			
					<%
						}
					%>
				</form>
			</div>
		</div>
	</nav>
	<!-- End Navbar -->

	<!-- Page content -->
	<div class=container>
		<div class="row">
			<div class="col-lg-3">
				<div class="list-group">
					<a href="#" class="list-group-item list-group-item-action">Thời trang nam</a>
					<a href="#" class="list-group-item list-group-item-action">Thời trang nữ</a>
					<a href="#" class="list-group-item list-group-item-action">Dành cho bé</a>
				</div>
			</div>
			<!-- End Menu Left -->


			<!-- Slider and Products -->
			<div class="col-lg-9">
				<!-- Slider -->

				<div id="carouselExampleDark" class="carousel carousel-dark slide">
					<div class="carousel-indicators">
						<button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="0"
							class="active" aria-current="true" aria-label="Slide 1"></button>
						<button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="1"
							aria-label="Slide 2"></button>
						<button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="2"
							aria-label="Slide 3"></button>
					</div>
					<div class="carousel-inner">
						<div class="carousel-item active" data-bs-interval="10000">
							<img src="./img/slider/1.png" class="d-block w-100" alt="Giới thiệu về cửa hàng">
							<div class="carousel-caption d-none d-md-block">
								<!-- <h5>First slide label</h5>
								<p>Some representative placeholder content for the first slide.</p> -->
							</div>
						</div>
						<div class="carousel-item" data-bs-interval="2000">
							<img src="./img/slider/2.png" class="d-block w-100" alt="...">
							<div class="carousel-caption d-none d-md-block">
								<!-- <h5>Second slide label</h5>
								<p>Some representative placeholder content for the second slide.</p>
							 -->
							</div>
						</div>
						<div class="carousel-item">
							<img src="./img/slider/3.png" class="d-block w-100" alt="...">
							<div class="carousel-caption d-none d-md-block">
								<!-- <h5>Third slide label</h5>
								<p>Some representative placeholder content for the third slide.</p>
							 -->
							</div>
						</div>
					</div>
					<button class="carousel-control-prev" type="button"
						data-bs-target="#carouselExampleDark" data-bs-slide="prev">
						<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
							class="visually-hidden">Previous</span>
					</button>
					<button class="carousel-control-next" type="button"
						data-bs-target="#carouselExampleDark" data-bs-slide="next">
						<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
							class="visually-hidden">Next</span>
					</button>
				</div>
				<!-- End Slider -->

				<!--  Products -->

				<div class="row">
					<div class="col-lg-4 col-md-6 mb-4">
						<div class="card h-100">
							<a href="#">
								<img class="card-img-top" src="img/products/1.png" alt="Sản phẩm áo"
									height=400rem;>
							</a>
							<div class="card-body">
								<h4 class="card-title">
									<a href="#">Áo thun Pro-S1</a>
								</h4>
								<h5>50.000</h5>
								<p class="card-text">Sản phẩm thoáng mát, có độ bền tốt, giữ màu sắc tốt.</p>
							</div>
							<div class="card-footer">
								<small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
							</div>
						</div>
					</div>

					<div class="col-lg-4 col-md-6 mb-4">
						<div class="card h-100">
							<a href="#">
								<img class="card-img-top" src="img/products/2.png" alt="Sản phẩm áo"
									height=400rem;>
							</a>
							<div class="card-body">
								<h4 class="card-title">
									<a href="#">Suit</a>
								</h4>
								<h5>50.000</h5>
								<p class="card-text">Sản phẩm thoáng mát, có độ bền tốt, giữ màu sắc tốt.</p>
							</div>
							<div class="card-footer">
								<small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
							</div>
						</div>
					</div>

					<div class="col-lg-4 col-md-6 mb-4">
						<div class="card h-100">
							<a href="#">
								<img class="card-img-top" src="img/products/3.png" alt="Sản phẩm áo"
									height=400rem;>
							</a>
							<div class="card-body">
								<h4 class="card-title">
									<a href="#">Áo Hoodie</a>
								</h4>
								<h5>50.000</h5>
								<p class="card-text">Sản phẩm thoáng mát, có độ bền tốt, giữ màu sắc tốt.</p>
							</div>
							<div class="card-footer">
								<small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
							</div>
						</div>
					</div>

					<div class="col-lg-4 col-md-6 mb-4">
						<div class="card h-100">
							<a href="#">
								<img class="card-img-top" src="img/products/1.png" alt="Sản phẩm áo"
									height=400rem;>
							</a>
							<div class="card-body">
								<h4 class="card-title">
									<a href="#">Áo thun Pro-S1</a>
								</h4>
								<h5>50.000</h5>
								<p class="card-text">Sản phẩm thoáng mát, có độ bền tốt, giữ màu sắc tốt.</p>
							</div>
							<div class="card-footer">
								<small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
							</div>
						</div>
					</div>
				</div>

				<!-- End Products -->
			</div>

			<!-- End Slider and Products -->
		</div>
	</div>
	<!-- End Page Content -->

	<!-- Footer -->
	<footer class="py-3 my-4">
		<ul class="nav justify-content-center border-bottom pb-3 mb-3">
			<li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">Home</a></li>
			<li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">Features</a></li>
			<li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">Pricing</a></li>
			<li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">FAQs</a></li>
			<li class="nav-item"><a href="#" class="nav-link px-2 text-body-secondary">About</a></li>
		</ul>
		<p class="text-center text-body-secondary">© 2023 Company, Inc</p>
	</footer>
	<!-- End Footer -->

</body>
</html>