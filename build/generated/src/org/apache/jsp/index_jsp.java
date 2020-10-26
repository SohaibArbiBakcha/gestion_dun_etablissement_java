package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/vendors/ti-icons/css/themify-icons.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/vendors/base/vendor.bundle.base.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/style.css\">\n");
      out.write("  <link rel=\"shortcut icon\" href=\"");
      out.print(request.getContextPath());
      out.write("/images/favicon.png\" />\n");
      out.write("    </head>\n");
      out.write("    ");

        String msg=(String) request.getAttribute("msg");
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("  <div class=\"container-scroller\">\n");
      out.write("    <div class=\"container-fluid page-body-wrapper full-page-wrapper\">\n");
      out.write("      <div class=\"content-wrapper d-flex align-items-stretch auth auth-img-bg\">\n");
      out.write("        <div class=\"row flex-grow\">\n");
      out.write("            <div class=\"col-lg-6 d-flex align-items-center justify-content-center\">\n");
      out.write("            <div class=\"auth-form-transparent text-left p-3\">\n");
      out.write("              <div class=\"brand-logo\">\n");
      out.write("                <img src=\"");
      out.print(request.getContextPath());
      out.write("/images/logo.svg\" alt=\"logo\">\n");
      out.write("              </div>\n");
      out.write("              <h4>Welcome back!</h4>\n");
      out.write("              <h6 class=\"font-weight-light\">Happy to see you again!</h6>\n");
      out.write("              <form class=\"pt-3\" action=\"");
      out.print(request.getContextPath());
      out.write("/login\" method=\"\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"exampleInputEmail\">Username</label>\n");
      out.write("                  <div class=\"input-group\">\n");
      out.write("                    <div class=\"input-group-prepend bg-transparent\">\n");
      out.write("                      <span class=\"input-group-text bg-transparent border-right-0\">\n");
      out.write("                        <i class=\"ti-user text-primary\"></i>\n");
      out.write("                      </span>\n");
      out.write("                    </div>\n");
      out.write("                      <input type=\"text\" class=\"form-control form-control-lg border-left-0\" id=\"exampleInputEmail\" placeholder=\"Username\" name=\"username\">\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <label for=\"exampleInputPassword\">Password</label>\n");
      out.write("                  <div class=\"input-group\">\n");
      out.write("                    <div class=\"input-group-prepend bg-transparent\">\n");
      out.write("                      <span class=\"input-group-text bg-transparent border-right-0\">\n");
      out.write("                        <i class=\"ti-lock text-primary\"></i>\n");
      out.write("                      </span>\n");
      out.write("                    </div>\n");
      out.write("                      <input type=\"password\" class=\"form-control form-control-lg border-left-0\" id=\"exampleInputPassword\" placeholder=\"Password\" name=\"password\">                        \n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"my-3\">\n");
      out.write("                    <input type=\"submit\" value=\"Login\" style=\"width: 100% ; border: none ; background-color: #62BEDC ; color: white ; height: 50px\"/>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"color: red\">\n");
      out.write("                    ");
 if(msg!=null && msg.length()!=0){
                        out.println(msg);
                    }
                    
      out.write("\n");
      out.write("                    </div>\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-6 login-half-bg d-flex flex-row\" style=\"background-image: url(");
      out.print(request.getContextPath());
      out.write("/images/auth/login-bg.jpg) ; background-size: cover\">\n");
      out.write("            <p class=\"text-white font-weight-medium text-center flex-grow align-self-end\">Copyright &copy; 2018  All rights reserved.</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- content-wrapper ends -->\n");
      out.write("    </div>\n");
      out.write("    <!-- page-body-wrapper ends -->\n");
      out.write("  </div>\n");
      out.write("  <!-- container-scroller -->\n");
      out.write("  <!-- plugins:js -->\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/vendors/base/vendor.bundle.base.js\"></script>\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <!-- inject:js -->\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/off-canvas.js\"></script>\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/hoverable-collapse.js\"></script>\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/template.js\"></script>\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/todolist.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
