/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-03-30 07:59:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.KhachHang;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Header</title>\r\n");
      out.write("<!-- Font Awesome -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" />\r\n");
      out.write("<!-- Google Fonts Roboto -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap\" />\r\n");

String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
		+ request.getContextPath();

      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(url);
      out.write("/css/mdb.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- Navbar -->\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-light bg-body-tertiary\">\r\n");
      out.write("		<!-- Container wrapper -->\r\n");
      out.write("		<div class=\"container-fluid\">\r\n");
      out.write("			<!-- Toggle button -->\r\n");
      out.write("			<button data-mdb-collapse-init class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("				data-mdb-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\"\r\n");
      out.write("				aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("				<i class=\"fas fa-bars\"></i>\r\n");
      out.write("			</button>\r\n");
      out.write("\r\n");
      out.write("			<!-- Collapsible wrapper -->\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("				<!-- Navbar brand -->\r\n");
      out.write("				<div class=\"navbar-brand mt-2 mt-lg-0\">\r\n");
      out.write("					<img src=\"");
      out.print(url);
      out.write("/img/kologo.svg\" height=\"50\" alt=\"Fam Twen Logo\" loading=\"lazy\" />\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- Left links -->\r\n");
      out.write("				<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"");
      out.print(url);
      out.write("/index.jsp\">Trang\r\n");
      out.write("							chủ</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Giảm giá</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<li class=\"nav-item dropdown\"><span class=\"nav-link dropdown-toggle\"\r\n");
      out.write("						role=\"button\" data-bs-toggle=\"dropdown\" data-mdb-dropdown-init data-mdb-ripple-init\r\n");
      out.write("						aria-expanded=\"false\"> Thể loại </span>\r\n");
      out.write("						<ul class=\"dropdown-menu\">\r\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"#\">Quần Jeans</a></li>\r\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"#\">Áo polo</a></li>\r\n");
      out.write("							<li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("							<li><a class=\"dropdown-item\" href=\"#\">Hoodie</a></li>\r\n");
      out.write("						</ul></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link disabled\" aria-disabled=\"true\" href=\"#\">Hết\r\n");
      out.write("							hàng</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("\r\n");
      out.write("				<!-- Left links -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- Collapsible wrapper -->\r\n");
      out.write("\r\n");
      out.write("			<!-- Right elements -->\r\n");
      out.write("			<div class=\"d-flex align-items-center\">\r\n");
      out.write("				<input type=\"search\" class=\"form-control rounded\" placeholder=\"Search\"\r\n");
      out.write("					aria-label=\"Search\" aria-describedby=\"search-addon\" />\r\n");
      out.write("				<span class=\"input-group-text border border-dark border-0\" id=\"search-addon\"> <i\r\n");
      out.write("					class=\"fas fa-search\"></i>\r\n");
      out.write("				</span>\r\n");
      out.write("				");

				Object objKH = session.getAttribute("khachHang");
				KhachHang khachHang = null;
				if (objKH != null)
					khachHang = (KhachHang) objKH;
				if (khachHang == null) {
				
      out.write("\r\n");
      out.write("				<a data-mdb-ripple-init class=\"btn btn-link border border-primary px-3 me-2\"\r\n");
      out.write("					style=\"white-space: nowrap;\" href=\"");
      out.print(url);
      out.write("/KhachHang/dangnhap.jsp\">Đăng nhập</a>\r\n");
      out.write("				<a data-mdb-ripple-init class=\"btn btn-primary me-3\" style=\"white-space: nowrap;\"\r\n");
      out.write("					href=\"");
      out.print(url);
      out.write("/KhachHang/dangky.jsp\">Đăng ký</a>\r\n");
      out.write("				");

				} else {
				
      out.write("\r\n");
      out.write("				<!-- Icon -->\r\n");
      out.write("				<a class=\"text-reset me-3 px-2\" href=\"#\">\r\n");
      out.write("					<i class=\"fas fa-shopping-cart\"></i>\r\n");
      out.write("				</a>\r\n");
      out.write("\r\n");
      out.write("				<!-- Notifications -->\r\n");
      out.write("				<div class=\"dropdown px-2\">\r\n");
      out.write("					<a data-mdb-dropdown-init class=\"text-reset me-3 dropdown-toggle hidden-arrow\"\r\n");
      out.write("						href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" aria-expanded=\"false\">\r\n");
      out.write("						<i class=\"fas fa-bell\"></i> <span\r\n");
      out.write("							class=\"badge rounded-pill badge-notification bg-danger\">1</span>\r\n");
      out.write("					</a>\r\n");
      out.write("					<ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n");
      out.write("						<li><a class=\"dropdown-item\" href=\"#\">Thông báo mới</a></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\" href=\"#\">Thông báo đã đọc</a></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\" href=\"#\">Thông báo đã ẩn</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- Avatar -->\r\n");
      out.write("				<div class=\"dropdown px-2\">\r\n");
      out.write("					<a data-mdb-dropdown-init\r\n");
      out.write("						class=\"dropdown-toggle d-flex align-items-center hidden-arrow\" href=\"#\"\r\n");
      out.write("						id=\"navbarDropdownMenuAvatar\" role=\"button\" aria-expanded=\"false\">\r\n");
      out.write("						<img src=\"");
      out.print(url);
      out.write("/avatar/");
      out.print(khachHang.getDuongDanAnh());
      out.write("\" class=\"rounded-circle\" height=\"25\"\r\n");
      out.write("							alt=\"User icon\" loading=\"lazy\" />\r\n");
      out.write("					</a>\r\n");
      out.write("					<ul class=\"dropdown-menu dropdown-menu-end\"\r\n");
      out.write("						aria-labelledby=\"navbarDropdownMenuAvatar\">\r\n");
      out.write("						<li><span class=\"dropdown-item-text fs-6 fw-bolder\">\r\n");
      out.write("								Xin chào,\r\n");
      out.write("								");
      out.print(khachHang.getHoVaTen());
      out.write("</span></li>\r\n");
      out.write("						<li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/KhachHang/thaydoianh.jsp\">Thay đổi ảnh đại diện</a></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\" href=\"#\">Đơn hàng của tôi</a></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/KhachHang/thaydoithongtinKH.jsp\">Thay\r\n");
      out.write("								đổi thông tin</a></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/KhachHang/doimatkhau.jsp\">Đổi\r\n");
      out.write("								mật khẩu</a></li>\r\n");
      out.write("						<li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("						<li><a class=\"dropdown-item\" href=\"");
      out.print(url);
      out.write("/khach-hang-thay-doi-thong-tin?hanhDong=dang-xuat\">Đăng\r\n");
      out.write("								xuất</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("</body>\r\n");
      out.write("<!-- Navbar -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("		import { Dropdown, Ripple, initMDB } from \"mdb-ui-kit\";\r\n");
      out.write("		initMDB({ Dropdown, Ripple });\r\n");
      out.write("		</script>\r\n");
      out.write("<!-- MDB -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(url);
      out.write("/js/mdb.umd.min.js\"></script>\r\n");
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
