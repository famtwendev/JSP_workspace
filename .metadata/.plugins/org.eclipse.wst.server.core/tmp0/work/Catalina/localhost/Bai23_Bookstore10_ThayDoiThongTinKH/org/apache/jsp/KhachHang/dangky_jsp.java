/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-03-28 17:15:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.KhachHang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.KhachHang;

public final class dangky_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(1);
    _jspx_imports_classes.add("model.KhachHang");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" shrink-to-fit=no\">\r\n");
      out.write("<title>Thay đổi thông tin</title>\r\n");
      out.write("\r\n");
      out.write("<!-- MDB icon -->\r\n");
      out.write("<link rel=\"icon\" href=\"img/mdb-favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("<!-- Font Awesome -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" />\r\n");
      out.write("<!-- Google Fonts Roboto -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap\" />\r\n");

String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
		+ request.getContextPath();

      out.write("\r\n");
      out.write("<!-- MAIN CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(url);
      out.write("/css/maincs.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(url);
      out.write("/css/mdb.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");

	Object objKH = session.getAttribute("khachHang");
	KhachHang khachHang = null;
	if (objKH != null)
		khachHang = (KhachHang) objKH;
	if (khachHang != null) {
		response.sendRedirect("./index.jsp"); // Thay "index.jsp" bằng URL của trang chính
	} else {
	
      out.write("\r\n");
      out.write("	<!-- Section: Design Block -->\r\n");
      out.write("	<section>\r\n");
      out.write("		");

		String e_email = request.getAttribute("e_email") + "";
		e_email = (e_email.equals("null")) ? "" : e_email;

		String e_emailFormat = request.getAttribute("e_emailFormat") + "";
		e_emailFormat = (e_emailFormat.equals("null")) ? "" : e_emailFormat;

		String e_tenDangNhap = request.getAttribute("e_tenDangNhap") + "";
		e_tenDangNhap = (e_tenDangNhap.equals("null")) ? "" : e_tenDangNhap;
		
		String e_matKhau = request.getAttribute("e_matKhau") + "";
		e_matKhau = (e_matKhau.equals("null")) ? "" : e_matKhau;

		String tenDangNhap = request.getAttribute("tenDangNhap") + "";
		tenDangNhap = (tenDangNhap.equals("null")) ? "" : tenDangNhap;

		String hoVaTen = request.getAttribute("hoVaTen") + "";
		hoVaTen = (hoVaTen.equals("null")) ? "" : hoVaTen;

		String gioiTinh = request.getAttribute("gioiTinh") + "";
		gioiTinh = (gioiTinh.equals("null")) ? "" : gioiTinh;

		String ngaySinh = request.getAttribute("ngaySinh") + "";
		ngaySinh = (ngaySinh.equals("null")) ? "" : ngaySinh;

		String diaChiKhachHang = request.getAttribute("diaChiKhachHang") + "";
		diaChiKhachHang = (diaChiKhachHang.equals("null")) ? "" : diaChiKhachHang;

		String diaChiMuaHang = request.getAttribute("diaChiMuaHang") + "";
		diaChiMuaHang = (diaChiMuaHang.equals("null")) ? "" : diaChiMuaHang;

		String diaChiNhanHang = request.getAttribute("diaChiNhanHang") + "";
		diaChiNhanHang = (diaChiNhanHang.equals("null")) ? "" : diaChiNhanHang;

		String dienThoai = request.getAttribute("dienThoai") + "";
		dienThoai = (dienThoai.equals("null")) ? "" : dienThoai;

		String email = request.getAttribute("email") + "";
		email = (email.equals("null")) ? "" : email;

		String dongYNhanEmail = request.getAttribute("dongYNhanEmail") + "";
		dongYNhanEmail = (dongYNhanEmail.equals("null")) ? "" : dongYNhanEmail;
		
      out.write("\r\n");
      out.write("		<!-- Header -->\r\n");
      out.write("		<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("			<div class=\"container-fluid justify-content-center align-items-center\">\r\n");
      out.write("				<div>\r\n");
      out.write("					<h1 class=\"fw-bold\">ĐĂNG KÝ TÀI KHOẢN</h1>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</nav>\r\n");
      out.write("		<!-- neu block thi dung <div class = \"container py-4 vh-100\">  -->\r\n");
      out.write("		<div class=\"card-body py-5 h-100\">\r\n");
      out.write("			<div class=\"container-fluid d-flex justify-content-center align-items-center\">\r\n");
      out.write("				<div class=\"col-12 col-md-8 col-lg-6 col-xl-8\">\r\n");
      out.write("					<div class=\"card text-dark\" style=\"border-radius: 1rem;\">\r\n");
      out.write("						<form id=\"myForm\" class=\"form needs-validation m-0\" action=\"");
      out.print(url);
      out.write("/khach-hang\" method=\"post\">\r\n");
      out.write("							<input type=\"hidden\" name=\"hanhDong\" value=\"dang-ky\">\r\n");
      out.write("							<!-- 2 column grid layout with text inputs for the first and last names -->\r\n");
      out.write("							<p>\r\n");
      out.write("								Nếu bạn đã có tài khoản, hãy đăng nhập\r\n");
      out.write("								<a href=\"./dangnhap.jsp\">tại đây</a>\r\n");
      out.write("								.\r\n");
      out.write("							</p>\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-md-6 mb-4\">\r\n");
      out.write("									<h3 class=\"mb-2\">Thông tin khách hàng</h3>\r\n");
      out.write("									<div class=\"form-outline\">\r\n");
      out.write("										<label for=\"tenDangNhap\" class=\"form-label\">Tên đăng nhập<span\r\n");
      out.write("											class=\"red\">* ");
      out.print(e_tenDangNhap);
      out.write("</span></label>\r\n");
      out.write("										<input type=\"text\" class=\"form-control border border-secondary\" id=\"tenDangNhap\"\r\n");
      out.write("											name=\"tenDangNhap\" required=\"required\" value=\"");
      out.print(tenDangNhap);
      out.write("\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("\r\n");
      out.write("								<div class=\"col-md-6 mb-4\">\r\n");
      out.write("									<h3 class=\"mb-2\">Địa chỉ</h3>\r\n");
      out.write("									<div class=\"form-outline\">\r\n");
      out.write("										<label for=\"diaChiKhachHang\" class=\"form-label\">Địa chỉ khách hàng</label>\r\n");
      out.write("										<input type=\"text\" class=\"form-control border border-secondary\"\r\n");
      out.write("											id=\"diaChiKhachHang\" name=\"diaChiKhachHang\" value=\"");
      out.print(diaChiKhachHang);
      out.write("\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-md-6 mb-4\">\r\n");
      out.write("									<div class=\"form-outline\">\r\n");
      out.write("										<label for=\"matKhau\" class=\"form-label\">Mật khẩu<span class=\"red\">* ");
      out.print(e_matKhau);
      out.write("</span></label>\r\n");
      out.write("										<input type=\"password\" class=\"form-control border border-secondary\" id=\"matKhau\"\r\n");
      out.write("											name=\"matKhau\" required=\"required\" onkeyup=\"kiemTraMatKhau()\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-md-6 mb-4\">\r\n");
      out.write("									<div class=\"form-outline\">\r\n");
      out.write("										<label for=\"diaChiMuaHang\" class=\"form-label\">Địa chỉ Mua hàng</label>\r\n");
      out.write("										<input type=\"text\" class=\"form-control border border-secondary\"\r\n");
      out.write("											id=\"diaChiMuaHang\" name=\"diaChiMuaHang\" value=\"");
      out.print(diaChiMuaHang);
      out.write("\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-md-6 mb-4\">\r\n");
      out.write("									<div class=\"form-outline\">\r\n");
      out.write("										<label for=\"matKhauNhapLai\" class=\"form-label\">Xác nhận mật khẩu<span\r\n");
      out.write("											class=\"red\">*</span><span class=\"red\" id=\"msg\"></span>\r\n");
      out.write("										</label>\r\n");
      out.write("										<input type=\"password\" class=\"form-control border border-secondary\"\r\n");
      out.write("											id=\"matKhauNhapLai\" name=\"matKhauNhapLai\" required=\"required\"\r\n");
      out.write("											onkeyup=\"kiemTraMatKhau()\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-md-6 mb-4\">\r\n");
      out.write("									<div class=\"form-outline\">\r\n");
      out.write("										<label for=\"diaChiNhanHang\" class=\"form-label\">Địa chỉ Nhận hàng<span\r\n");
      out.write("											class=\"red\">*</span>\r\n");
      out.write("										</label>\r\n");
      out.write("										<input type=\"text\" class=\"form-control border border-secondary\"\r\n");
      out.write("											id=\"diaChiNhanHang\" name=\"diaChiNhanHang\" value=\"");
      out.print(diaChiNhanHang);
      out.write("\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-md-6 mb-4\">\r\n");
      out.write("									<div class=\"form-outline\">\r\n");
      out.write("										<label for=\"hoVaTen\" class=\"form-label\">Họ và tên<span class=\"red\">*</span></label>\r\n");
      out.write("										<input type=\"text\" class=\"form-control border border-secondary\" id=\"hoVaTen\"\r\n");
      out.write("											name=\"hoVaTen\" value=\"");
      out.print(hoVaTen);
      out.write("\" required=\"required\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-md-6 mb-4\">\r\n");
      out.write("									<div class=\"form-outline\">\r\n");
      out.write("										<label for=\"dienThoai\" class=\"form-label\">Điện thoại<span class=\"red\">*</span></label>\r\n");
      out.write("										<input type=\"tel\" class=\"form-control border border-secondary\" id=\"dienThoai\"\r\n");
      out.write("											name=\"dienThoai\" value=\"");
      out.print(dienThoai);
      out.write("\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-md-6 mb-4\">\r\n");
      out.write("									<label for=\"gioiTinh\" class=\"form-label\">Giới tính<span class=\"red\">*</span></label>\r\n");
      out.write("									<select class=\"form-control border border-secondary\" id=\"gioiTinh\"\r\n");
      out.write("										name=\"gioiTinh\" required=\"required\">\r\n");
      out.write("										<option selected disabled hidden>---</option>\r\n");
      out.write("										<option value=\"Nam\" ");
      out.print((gioiTinh.equals("Nam")) ? "selected='selected'" : "");
      out.write(">Nam</option>\r\n");
      out.write("										<option value=\"Nữ\" ");
      out.print((gioiTinh.equals("Nữ")) ? "selected='selected'" : "");
      out.write(">Nữ</option>\r\n");
      out.write("										<option value=\"Khác\" ");
      out.print((gioiTinh.equals("Khác")) ? "selected='selected'" : "");
      out.write(">Khác</option>\r\n");
      out.write("									</select>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-md-6 mb-4\">\r\n");
      out.write("									<div class=\"form-outline\">\r\n");
      out.write("										<label for=\"email\" class=\"form-label\">Email<span class=\"red\">* ");
      out.print(e_email);
      out.write("\r\n");
      out.write("												");
      out.print(e_emailFormat);
      out.write("</span></label>\r\n");
      out.write("										<input type=\"email\" class=\"form-control border border-secondary\" id=\"email\"\r\n");
      out.write("											name=\"email\" value=\"");
      out.print(email);
      out.write("\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-md-6 mb-4\">\r\n");
      out.write("									<label for=\"ngaySinh\" class=\"form-label\">Ngày sinh<span class=\"red\">*</span></label>\r\n");
      out.write("									<input type=\"date\" class=\"form-control border border-secondary\" id=\"ngaySinh\"\r\n");
      out.write("										name=\"ngaySinh\" value=\"");
      out.print(ngaySinh);
      out.write("\" required=\"required\">\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-md-6 mb-4\">\r\n");
      out.write("									<div>\r\n");
      out.write("										<label for=\"dongYDieuKhoan\" class=\"form-label\">Đồng ý với <a href=\"#\">điều\r\n");
      out.write("												khoản của chúng tôi </a>\r\n");
      out.write("										</label>\r\n");
      out.write("										<input type=\"checkbox\" class=\"form-check-input\" id=\"dongYDieuKhoan\"\r\n");
      out.write("											name=\"dongYDieuKhoan\">\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("									<div>\r\n");
      out.write("										<label for=\"dongYNhanEmail\" class=\"form-label\">Đồng ý nhận thông báo qua\r\n");
      out.write("											Email <span class=\"red\">*</span>\r\n");
      out.write("										</label>\r\n");
      out.write("										<input type=\"checkbox\" class=\"form-check-input\" id=\"dongYNhanEmail\"\r\n");
      out.write("											name=\"dongYNhanEmail\" ");
      out.print((dongYNhanEmail.equals("1")) ? "checked" : "");
      out.write(">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row justify-content-center align-items-center\">\r\n");
      out.write("								<div class=\"col-md-6 mb-4\" style=\"text-align: right;\">\r\n");
      out.write("									<!-- Nút button về trang chủ -->\r\n");
      out.write("									<a href=\"../index.jsp\" class=\"btn btn-primary btn-lg px-5 mt-3\"> Trang chủ </a>\r\n");
      out.write("								</div>\r\n");
      out.write("								<!-- Sử dụng lưới bootstrap -->\r\n");
      out.write("								<div class=\"col-md-6 mb-4\">\r\n");
      out.write("									<input class=\"btn btn-danger btn-lg px-5 mt-3\" type=\"submit\" value=\"Đăng ký\"\r\n");
      out.write("										name=\"submit\" id=\"submit\" disabled>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      out.write("	<!-- function js -->\r\n");
      out.write("	<script src=\"");
      out.print(url);
      out.write("/js/mainjs.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- MDB -->\r\n");
      out.write("	<script type=\"text/javascript\" src=\"");
      out.print(url);
      out.write("/js/mdb.umd.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\">// Initialization for ES Users\r\n");
      out.write("    import { Input, initMDB } from \"mdb-ui-kit\";\r\n");
      out.write("    initMDB({ Input });\r\n");
      out.write("</script>\r\n");
      out.write("	");

	}
	
      out.write("\r\n");
      out.write("	<!-- Section: Design Block -->\r\n");
      out.write("	<!-- <script>\r\n");
      out.write("	function kiemTraMatKhau() {\r\n");
      out.write("		matKhau = document.getElementById(\"matKhau\").value;\r\n");
      out.write("		matKhauNhapLai = document.getElementById(\"matKhauNhapLai\").value;\r\n");
      out.write("		if (matKhau != matKhauNhapLai) {\r\n");
      out.write("			document.getElementById(\"msg\").textContent = \"  Mật khẩu không khớp!\";\r\n");
      out.write("			return false;\r\n");
      out.write("		} else {\r\n");
      out.write("			document.getElementById(\"msg\").textContent = \"\";\r\n");
      out.write("			return true;\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("</script>  -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
