package controller;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MuaHang .abcdefghijklmnopqrstuvwxyz
 */
@WebServlet("/mua-hang")
public class MuaHang extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MuaHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String soLuong = request.getParameter("soLuong");
		String soDienThoai = request.getParameter("soDienThoai");
		String email = request.getParameter("email");

		boolean checkError = false;
		double giatri_soLuong = 0;

		try {
			giatri_soLuong = Double.parseDouble(soLuong);
		} catch (Exception e) {
			checkError = true;
			request.setAttribute("e_soLuong", "Nhập dữ liệu không đúng");

		}

		// bắt lỗi số lượng phải lớn hơn 0
		if (giatri_soLuong == 0) {
			checkError = true;
			request.setAttribute("e_soLuong", "Vui lòng chọn ít nhất 1 sản phẩm!");
		}

		// Kiểm tra số điện thoại
		Pattern soDienThoaiPattern = Pattern.compile("\\d{10}");
		Matcher soDienThoaiMatcher = soDienThoaiPattern.matcher(soDienThoai);
		if (!soDienThoaiMatcher.matches()) {
			checkError = true;
			request.setAttribute("e_soDienThoai", "Nhập đúng số điện thoại bao gồm 10 ký tự!");
		}

		Pattern emailPattern = Pattern.compile("\\w+@\\w+(\\.\\w+)+(\\.\\w+)*");
		Matcher emailMatcher = emailPattern.matcher(email);
		if (!emailMatcher.matches()) {
			checkError = true;
			request.setAttribute("e_email", "Vui lòng nhập đúng định dạng email!");
		}
		String url = "success.jsp";
		if (checkError) {
			url = "/index.jsp";
		}
		RequestDispatcher rq = getServletContext().getRequestDispatcher(url);
		rq.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
