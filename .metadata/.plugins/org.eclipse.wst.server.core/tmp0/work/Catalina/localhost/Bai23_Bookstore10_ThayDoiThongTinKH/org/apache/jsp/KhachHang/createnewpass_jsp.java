/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-03-29 17:11:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.KhachHang;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.KhachHang;
import util.mahoaemail;

public final class createnewpass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("model.KhachHang");
    _jspx_imports_classes.add("util.mahoaemail");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<!-- Font Awesome -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" />\r\n");
      out.write("<!-- Google Fonts Roboto -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap\" />\r\n");
      out.write("\r\n");
      out.write("<title>Fam Twen | Xác thực tài khoản</title>\r\n");

String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
		+ request.getContextPath();

      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".inputs input {\r\n");
      out.write("	width: 3em;\r\n");
      out.write("	height: 3em;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(url);
      out.write("/css/mdb.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	Object objKH = session.getAttribute("khachHang");
	KhachHang khachHang = null;
	if (objKH != null)
		khachHang = (KhachHang) objKH;
	if (khachHang == null) {
		response.sendRedirect(url+"/index.jsp");
	} else {
		String baoLoi = request.getAttribute("baoLoi") + "";
		baoLoi = (baoLoi.equals("null")) ? "" : baoLoi;
		
		String email = request.getAttribute("email") + "";
		email = (email.equals("null")) ? "" : email;
		String emailMahoa = mahoaemail.maHoaSao(email);
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, false);
      out.write("\r\n");
      out.write("	<!-- Section: Design Block -->\r\n");
      out.write("	<section class=\"vh-100 gradient-custom\"\r\n");
      out.write("		style=\"background-image: url(");
      out.print(url);
      out.write("/img/background.jpg)\">\r\n");
      out.write("		<div class=\"container py-5 h-100\">\r\n");
      out.write("			<div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("				<div class=\"col-12 col-md-8 col-lg-6 col-xl-5\">\r\n");
      out.write("					<div class=\"card bg-light\" style=\"border-radius: 1rem;\">\r\n");
      out.write("						<!-- 2 column grid layout with text inputs for the first and last names -->\r\n");
      out.write("						<form id=\"myForm\" class=\"form needs-validation m-0\" action=\"");
      out.print(url);
      out.write("/khach-hang\"\r\n");
      out.write("							method=\"post\">\r\n");
      out.write("							<input type=\"hidden\" name=\"hanhDong\" value=\"xac-thuc-pwd\">\r\n");
      out.write("							<div class=\"card-body p-5 text-center\">\r\n");
      out.write("								<div class=\"form-outline\">\r\n");
      out.write("									<div class=\"row justify-content-center mb-4\">\r\n");
      out.write("										<img src=\"");
      out.print(url);
      out.write("/img/logopt.png\" alt=\"Dấu tích thành công\"\r\n");
      out.write("											style=\"border-radius: 50%; max-width: 30%; height: auto;\" class=\"img-fluid\" />\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"mb-md-5 mt-md-4\">\r\n");
      out.write("									<h5>Nhập mã OTP để xác thực tài khoản</h5>\r\n");
      out.write("									<input type=\"hidden\" name=\"email\" value=");
      out.print(email);
      out.write(">\r\n");
      out.write("									<div class=\"form-outline mt-4 mb-2\">\r\n");
      out.write("										<span>Chúng tôi đã gửi mã xác thực đến</span> <small>");
      out.print(emailMahoa);
      out.write("</small>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div id=\"otp\" class=\"inputs d-flex flex-row justify-content-center mt-2\">\r\n");
      out.write("										<input class=\"m-2 text-center form-control rounded\" type=\"text\" id=\"first\"\r\n");
      out.write("											maxlength=\"1\" name=\"first\" />\r\n");
      out.write("										<input class=\"m-2 text-center form-control rounded\" type=\"text\" id=\"second\"\r\n");
      out.write("											maxlength=\"1\" name=\"second\" />\r\n");
      out.write("										<input class=\"m-2 text-center form-control rounded\" type=\"text\" id=\"third\"\r\n");
      out.write("											maxlength=\"1\" name=\"third\" />\r\n");
      out.write("										<input class=\"m-2 text-center form-control rounded\" type=\"text\" id=\"fourth\"\r\n");
      out.write("											maxlength=\"1\" name=\"fourth\" />\r\n");
      out.write("										<input class=\"m-2 text-center form-control rounded\" type=\"text\" id=\"fifth\"\r\n");
      out.write("											maxlength=\"1\" name=\"fifth\" />\r\n");
      out.write("										<input class=\"m-2 text-center form-control rounded\" type=\"text\" id=\"sixth\"\r\n");
      out.write("											maxlength=\"1\" name=\"sixth\" />\r\n");
      out.write("									</div>\r\n");
      out.write("									<span style=\"text-align: center; color: red\">");
      out.print(baoLoi);
      out.write("</span>\r\n");
      out.write("									<div class=\"mt-4\">\r\n");
      out.write("										<input type=\"submit\" class=\"btn btn-danger px-4 validate\" name=\"submit\"\r\n");
      out.write("											id=\"submit\" value=\"Xác nhận\">\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer.jsp", out, false);
      out.write("\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		document.addEventListener(\"DOMContentLoaded\", function(event) {\r\n");
      out.write("			function OTPInput() {\r\n");
      out.write("				const inputs = document.querySelectorAll('#otp > *[id]');\r\n");
      out.write("				for (let i = 0; i < inputs.length; i++) {\r\n");
      out.write("					inputs[i].addEventListener('keydown',\r\n");
      out.write("							function(event) {\r\n");
      out.write("								if (event.key === \"Backspace\") {\r\n");
      out.write("									inputs[i].value = '';\r\n");
      out.write("									if (i !== 0)\r\n");
      out.write("										inputs[i - 1].focus();\r\n");
      out.write("								} else {\r\n");
      out.write("									if (i === inputs.length - 1\r\n");
      out.write("											&& inputs[i].value !== '') {\r\n");
      out.write("										return true;\r\n");
      out.write("									} else if (event.keyCode > 47\r\n");
      out.write("											&& event.keyCode < 58) {\r\n");
      out.write("										inputs[i].value = event.key;\r\n");
      out.write("										if (i !== inputs.length - 1)\r\n");
      out.write("											inputs[i + 1].focus();\r\n");
      out.write("										event.preventDefault();\r\n");
      out.write("									} else if (event.keyCode > 64\r\n");
      out.write("											&& event.keyCode < 91) {\r\n");
      out.write("										inputs[i].value = String\r\n");
      out.write("												.fromCharCode(event.keyCode);\r\n");
      out.write("										if (i !== inputs.length - 1)\r\n");
      out.write("											inputs[i + 1].focus();\r\n");
      out.write("										event.preventDefault();\r\n");
      out.write("									}\r\n");
      out.write("								}\r\n");
      out.write("							});\r\n");
      out.write("				}\r\n");
      out.write("			}\r\n");
      out.write("			OTPInput();\r\n");
      out.write("\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("	");
}
      out.write("\r\n");
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
