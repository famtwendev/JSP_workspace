package controller;

import java.io.IOException;
import java.sql.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.KhachHangDAO;
import model.KhachHang;

/**
 * Servlet implementation class Register
 */
@WebServlet(name = "DangKy", urlPatterns = { "/dang-ky" })
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		// TODO Auto-generated method stub
		String tenDangNhap = request.getParameter("tenDangNhap");
		String matKhau = request.getParameter("matKhau");
		String matKhauNhapLai = request.getParameter("matKhauNhapLai");
		String hoVaTen = request.getParameter("hoVaTen");
		String gioiTinh = request.getParameter("gioiTinh");
		String ngaySinh = request.getParameter("ngaySinh");
		String diaChiKhachHang = request.getParameter("diaChiKhachHang");
		String diaChiMuaHang = request.getParameter("diaChiMuaHang");
		String diaChiNhanHang = request.getParameter("diaChiNhanHang");
		String dienThoai = request.getParameter("dienThoai");
		String email = request.getParameter("email");
		String dongYNhanEmail = (request.getParameter("dongYNhanEmail") != null) ? "1" : "";
	
		request.setAttribute("tenDangNhap", tenDangNhap);
		request.setAttribute("hoVaTen", hoVaTen);
		request.setAttribute("gioiTinh", gioiTinh);
		request.setAttribute("ngaySinh", ngaySinh);
		request.setAttribute("diaChiKhachHang", diaChiKhachHang);
		request.setAttribute("diaChiMuaHang", diaChiMuaHang);
		request.setAttribute("diaChiNhanHang", diaChiNhanHang);
		request.setAttribute("dienThoai", dienThoai);
		request.setAttribute("email", email);
		request.setAttribute("dongYNhanEmail", dongYNhanEmail);
		
		String url ="";
		boolean checkError = false;
		KhachHangDAO khachHangDAO = new KhachHangDAO();
		
		Pattern emailPattern = Pattern.compile("\\w+@\\w+(\\.\\w+)+(\\.\\w+)*");
		Matcher emailMatcher = emailPattern.matcher(email);		
		if (!emailMatcher.matches()) {
			checkError = true;
			request.setAttribute("e_emailFormat", "Vui lòng nhập đúng định dạng email!");
		}
		
		
		if(khachHangDAO.kiemTraEmail(email))
		{
			checkError = true;
			request.setAttribute("e_email","Email vừa nhập đã tồn tại tài khoản . Vui lòng đăng nhập! </br>");
		}
		
		
		Pattern userPattern = Pattern.compile("^[a-zA-Z0-9.]+$");
		Matcher userMatcher = userPattern.matcher(tenDangNhap);
		if (!userMatcher.matches()) {
			request.setAttribute("e_tenDangNhapFormat", "Vui lòng nhập tên đăng nhập không chứa khoảng trắng và các dấu thanh!");
			checkError = true;
		}
		
		if(khachHangDAO.kiemTraTenDangNhap(tenDangNhap)) {
			checkError = true;
			request.setAttribute("e_tenDangNhap", "Tên đăng nhập đã tồn tại vui lòng chọn tên đăng nhập khác.");
		}
		
		if(!matKhau.equals(matKhauNhapLai))
		{
			checkError = true;
			request.setAttribute("e_matKhau", "Mật khẩu không khớp. </br>");
		}
		

		if(checkError)
		{
			url="/dangky.jsp";
		}else {
			Random rd = new Random();
			String maKhachHang = System.currentTimeMillis() + rd.nextInt() + "";
			KhachHang kh = new KhachHang(maKhachHang, tenDangNhap, matKhau, hoVaTen, gioiTinh, diaChiKhachHang, diaChiNhanHang, diaChiMuaHang, Date.valueOf(ngaySinh), dienThoai, email, dongYNhanEmail!=null);
			khachHangDAO.insert(kh);
			url = "/thanhcong.jsp";
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
