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

</head>
<body>
	<section class="vh-100" style="background-image: url(./img/background.jpg);">
		<div class="container py-5 h-100">
			<div class="row d-flex justify-content-center align-items-center h-100">
				<div class="col col-xl-10">
					<div class="card" style="border-radius: 1rem;">
						<div class="row g-0">
							<div class="col-md-6 col-lg-5 d-none d-md-block">
								<img
									src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/img1.webp"
									alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem;" />
							</div>
							<div class="col-md-6 col-lg-7 d-flex align-items-center">
								<div class="card-body p-4 p-lg-5 text-black">

									<form>

										<div class="d-flex align-items-center mb-3 pb-1">
											<i class="fas fa-cubes fa-2x me-3" style="color: #ff6219;"></i> <span
												class="h1 fw-bold mb-0">Fam Twen</span>
										</div>

										<h5 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Sign into your
											account</h5>

										<div class="form-outline mb-4">
											<input type="email" id="form2Example17" class="form-control form-control-lg" />
											<label class="form-label" for="form2Example17">Email address</label>
										</div>

										<div class="form-outline mb-4">
											<input type="password" id="form2Example27" class="form-control form-control-lg" />
											<label class="form-label" for="form2Example27">Password</label>
										</div>

										<div class="d-flex justify-content-around align-items-center mb-4">
											<!-- Checkbox -->
											<div class="form-check">
												<input class="form-check-input" type="checkbox" value="" id="form1Example3"
													checked />
												<label class="form-check-label" for="form1Example3"> Remember me </label>
											</div>
											<a href="#!">Forgot password?</a>
										</div>

										<!-- Submit button -->
										<button type="submit" class="btn btn-primary btn-lg btn-block">Sign in</button>

										<div class="divider d-flex align-items-center my-4">
											<p class="text-center fw-bold mx-3 mb-0 text-muted">OR</p>
										</div>


										<a class="btn btn-primary btn-lg btn-block" style="background-color: #dd4b39"
											href="#!" role="button">
											<i class="fab fa-google me-2"></i>Sign in with google
										</a>

										<a class="btn btn-primary btn-lg btn-block" style="background-color: #3b5998"
											href="#!" role="button">
											<i class="fab fa-facebook-f me-2"></i>Sign in with Facebook
										</a>

										<div class="text-center mt-1">
											<p>
												Not a member?
												<a href="./dangky.jsp">Register</a>
											</p>
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
</body>
</html>