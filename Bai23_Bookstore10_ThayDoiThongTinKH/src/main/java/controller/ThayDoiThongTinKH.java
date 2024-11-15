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
import util.MaHoa;

/**
 * Servlet implementation class ThayDoiThongTinKH
 */
@WebServlet("/thay-doi-thong-tin-kh")
public class ThayDoiThongTinKH extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThayDoiThongTinKH() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		// TODO Auto-generated method stub
		String hoVaTen = request.getParameter("hoVaTen");
		String gioiTinh = request.getParameter("gioiTinh");
		String ngaySinh = request.getParameter("ngaySinh");
		String diaChiKhachHang = request.getParameter("diaChiKhachHang");
		String diaChiMuaHang = request.getParameter("diaChiMuaHang");
		String diaChiNhanHang = request.getParameter("diaChiNhanHang");
		String dienThoai = request.getParameter("dienThoai");
		String email = request.getParameter("email");
		String dongYNhanEmail = null;

		request.setAttribute("hoVaTen", hoVaTen);
		request.setAttribute("gioiTinh", gioiTinh);
		request.setAttribute("ngaySinh", ngaySinh);
		request.setAttribute("diaChiKhachHang", diaChiKhachHang);
		request.setAttribute("diaChiMuaHang", diaChiMuaHang);
		request.setAttribute("diaChiNhanHang", diaChiNhanHang);
		request.setAttribute("dienThoai", dienThoai);
		request.setAttribute("email", email);

		String url = "";
		boolean checkError = false;

		KhachHangDAO khachHangDAO = new KhachHangDAO();

		Pattern emailPattern = Pattern.compile("\\w+@\\w+(\\.\\w+)+(\\.\\w+)*");
		Matcher emailMatcher = emailPattern.matcher(email);

		if (!emailMatcher.matches()) {
			checkError = true;
			request.setAttribute("e_emailFormat", "Vui lòng nhập đúng định dạng email!");
		}

		if (khachHangDAO.kiemTraEmail(email)) {
			Object objKH = request.getSession().getAttribute("khachHang");
			KhachHang khachHang = (KhachHang) objKH;
			if (khachHang != null) {
				String emailtam = khachHang.getEmail();
				if (emailtam.equals(email)) {
					email = emailtam;
					checkError =  false;
				}else
				{
					checkError = true;
					request.setAttribute("e_email", "Email đã đăng ký, nhập Email khác! </br>");					
				}
			}
		}

		if (checkError) {
			url = "/thaydoithongtinKH.jsp";
		} else {
			Object objKH = request.getSession().getAttribute("khachHang");
			KhachHang khachHang = null;
			if (objKH != null)
				khachHang = (KhachHang) objKH;
			if (khachHang != null) {
				String maKhachHang = khachHang.getMaKhachHang();
				KhachHang kh = new KhachHang(maKhachHang, "", "", hoVaTen, gioiTinh, diaChiKhachHang, diaChiNhanHang,
						diaChiMuaHang, Date.valueOf(ngaySinh), dienThoai, email, dongYNhanEmail != null);
				khachHangDAO.updateInfo(kh);
				KhachHang khupdated = khachHangDAO.selectById(kh);
				request.getSession().setAttribute("khachHang", khupdated);
				url = "/index.jsp";
			}
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
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
