package controller;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import database.KhachHangDAO;
import model.KhachHang;
import util.MaHoa;

/**
 * Servlet implementation class KhachHangThayDoiAnh
 */
@WebServlet("/khach-hang-thay-doi-thong-tin")
public class KhachHangThayDoiTT extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Pattern regexUsername = Pattern.compile("^[a-z0-9._-]{3,15}$");
	private static final Pattern regexPass = Pattern
			.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
	private static final Pattern regexEmail = Pattern.compile("\\w+@\\w+(\\.\\w+)+(\\.\\w+)*");
	private static final Pattern regexFullname = Pattern.compile("^[a-zA-Z][ ]*$");

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public KhachHangThayDoiTT() {
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
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String hanhDong = request.getParameter("hanhDong");
		if (hanhDong.equals("thay-doi-thong-tin-kh")) {
			thayDoiThongTinKH(request, response);
		} else if (hanhDong.equals("doi-mat-khau")) {
			doiMatKhau(request, response); 
		} else if (hanhDong.equals("dang-xuat")) {
			dangXuat(request, response);
		}

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

	private void thayDoiThongTinKH(HttpServletRequest request, HttpServletResponse response) {
		try {
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

			Matcher emailMatcher = regexEmail.matcher(email);
			Matcher fullnameMatcher = regexUsername.matcher(email);
			if (!emailMatcher.matches()) {
				checkError = true;
				request.setAttribute("e_emailFormat", "Vui lòng nhập đúng định dạng email!");
			} else if (!fullnameMatcher.matches()) {
				checkError = true;
				request.setAttribute("e_fullnameFormat", "Vui lòng nhập đúng định dạng họ và tên!");
			}

			if (khachHangDAO.kiemTraEmail(email)) {
				Object objKH = request.getSession().getAttribute("khachHang");
				KhachHang khachHang = (KhachHang) objKH;
				if (khachHang != null) {
					String emailtam = khachHang.getEmail();
					if (emailtam.equals(email)) {
						email = emailtam;
						checkError = false;
					} else {
						checkError = true;
						request.setAttribute("e_email", "Email đã đăng ký, nhập Email khác! </br>");
					}
				}
			}

			if (checkError) {
				url = "/KhachHang/thaydoithongtinKH.jsp";
			} else {
				Object objKH = request.getSession().getAttribute("khachHang");
				KhachHang khachHang = null;
				if (objKH != null)
					khachHang = (KhachHang) objKH;
				if (khachHang != null) {
					String maKhachHang = khachHang.getMaKhachHang();
					KhachHang kh = new KhachHang(maKhachHang, "", "", hoVaTen, gioiTinh, diaChiKhachHang,
							diaChiNhanHang, diaChiMuaHang, Date.valueOf(ngaySinh), dienThoai, email,
							dongYNhanEmail != null);
					khachHangDAO.updateInfo(kh);
					KhachHang kh_updated = khachHangDAO.selectById(kh);
					request.getSession().setAttribute("khachHang", kh_updated);
					url = "/index.jsp";
				}
			}
			RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
			rd.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void doiMatKhau(HttpServletRequest request, HttpServletResponse response) {
		try {
			String urldevice = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
					+ request.getContextPath();

			String matKhauHienTai = request.getParameter("matKhauHienTai");
			String matKhauMoi = request.getParameter("matKhauMoi");
			String matKhauMoiNhapLai = request.getParameter("matKhauMoiNhapLai");

			// Ma hoa matkhau de so sanh voi mat khau SQL
			String matKhauHienTai_SHA1 = MaHoa.toSHA1(matKhauHienTai);
			String matKhauMoi_Sha1 = MaHoa.toSHA1(matKhauMoi);

			String baoLoi = "";
			String url = "/KhachHang/doimatkhau.jsp";

			// Kiem tra user va matkhau cu
			HttpSession session = request.getSession();

			Object objKH = session.getAttribute("khachHang");
			KhachHang khachHang = null;
			if (objKH != null)
				khachHang = (KhachHang) objKH;
			if (khachHang == null) {
				baoLoi = "Bạn chưa đăng nhập vào hệ thống";
			} else {
				// Khach hang da dang nhap vao he thong
				if (!matKhauHienTai_SHA1.equals(khachHang.getMatKhau())) {
					baoLoi = "Mật khẩu hiện tại không chính xác!";
				} else {
					Matcher passMatcher = regexPass.matcher(matKhauMoi);
					if (!passMatcher.matches()) {
						baoLoi = "Sử dụng ít nhất 8 ký tự và kết hợp các chữ cái, số cùng ký hiệu để tạo mật khẩu mạnhSử dụng ít nhất 8 ký tự và kết hợp các chữ cái, số cùng ký hiệu để tạo mật khẩu mạnh";
					} else if (!matKhauMoi.equals(matKhauMoiNhapLai)) {
						baoLoi = "Mật khẩu nhập lại không khớp!";
					} else if (matKhauMoi_Sha1.equals(matKhauHienTai_SHA1)) {
						baoLoi = "Mật khẩu mới không được trùng với mật khẩu hiện tại";
					} else {
						khachHang.setMatKhau(matKhauMoi_Sha1);
						KhachHangDAO khd = new KhachHangDAO();
						if (khd.changePasswordForKH(khachHang)) {
							baoLoi = "Đổi mật khẩu thành công!";
							// In ra thông báo thành công và chờ 5 giây trước khi quay lại trang chủ
							response.setHeader("Refresh", "1; URL=" + urldevice + "/index.jsp");
						} else {
							baoLoi = "Thay đổi mật khẩu thất bại!";
						}
					}
				}

			}
			request.setAttribute("baoLoi", baoLoi);
			RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
			rd.forward(request, response);
		} catch (

		ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void dangXuat(HttpServletRequest request, HttpServletResponse response) {
		try {
			HttpSession session = request.getSession();
			// destroy
			session.invalidate();

			String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
					+ request.getContextPath();
			response.sendRedirect(url + "/index.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
