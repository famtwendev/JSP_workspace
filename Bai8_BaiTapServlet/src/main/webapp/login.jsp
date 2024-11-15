<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		Object obj_thongbao = request.getAttribute("thongBao");
		String thongBao = "";
		if(obj_thongbao !=null)
		{
			thongBao = obj_thongbao.toString();
		}
   %>

	<form id="login" action="dang-nhap" method="POST">
		<h1>ĐĂNG NHẬP</h1>
		<label for="tenDangNhap">Tên người dùng:</label>
		<input id="tenDangNhap" placeholder="Username"
			type="text" name="tenDangNhap" /> <br> 
		<label for="matKhau">Mật khẩu:</label> 
		<input id="matKhau" placeholder="Password" type="password" name="matKhau" /><br> 

		<input id="submit" type="submit" value="Đăng nhập"/>

	</form>

	<%= thongBao %>
</body>
</html>