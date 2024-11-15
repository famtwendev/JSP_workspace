package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.KhachHangDAO;
import model.KhachHang;
import util.MaHoa;

/**
 * Servlet implementation class DoiMatKhau
 */
@WebServlet("/doi-mat-khau")
public class DoiMatKhau extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoiMatKhau() {
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
		String urldevice = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
		+ request.getContextPath();
		
		
		String matKhauHienTai = request.getParameter("matKhauHienTai");
		String matKhauMoi = request.getParameter("matKhauMoi");
		String matKhauMoiNhapLai = request.getParameter("matKhauMoiNhapLai");
		
		
		// Ma hoa matkhau de so sanh voi mat khau SQL
		String matKhauHienTai_SHA1 = MaHoa.toSHA1(matKhauHienTai);
		String matKhauMoi_Sha1 = MaHoa.toSHA1(matKhauMoi);
		
		String baoLoi = "";
		String url = "/doimatkhau.jsp";
		
		// Kiem tra user va matkhau cu
		HttpSession session = request.getSession();
		
		Object objKH = session.getAttribute("khachHang");
		KhachHang khachHang = null;
		if (objKH != null)
			khachHang = (KhachHang) objKH;
		if (khachHang == null) 
		{
			baoLoi = "Bạn chưa đăng nhập vào hệ thống";
		}else	
		{ 
			// Khach hang da dang nhap vao he thong
			if(!matKhauHienTai_SHA1.equals(khachHang.getMatKhau())) {
				baoLoi = "Mật khẩu hiện tại không chính xác!";

			}else {
				if(!matKhauMoi.equals(matKhauMoiNhapLai))
				{
					baoLoi = "Mật khẩu nhập lại không khớp!";
				}else if(matKhauMoi_Sha1.equals(matKhauHienTai_SHA1)){
					baoLoi = "Mật khẩu mới không được trùng với mật khẩu hiện tại";
				}
				else
				{
					khachHang.setMatKhau(matKhauMoi_Sha1);
					KhachHangDAO khd = new KhachHangDAO();
					if(khd.changePasswordForKH(khachHang))
					{
						baoLoi = "Đổi mật khẩu thành công!";
			            // In ra thông báo thành công và chờ 5 giây trước khi quay lại trang chủ
					    response.setHeader("Refresh", "1; URL=" + urldevice +"/index.jsp"); // Đặt URL trang chủ của bạn

					}else
					{
						baoLoi = "Thay đổi mật khẩu thất bại!";
					}
				}
			}
				
		}
		request.setAttribute("baoLoi",baoLoi);
		
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
