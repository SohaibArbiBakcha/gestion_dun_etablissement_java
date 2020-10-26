package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_005ffiliere_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <!-- Required meta tags -->\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <title>Filieres</title>\n");
      out.write("  <!-- plugins:css -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"vendors/ti-icons/css/themify-icons.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"vendors/base/vendor.bundle.base.css\">\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <!-- plugin css for this page -->\n");
      out.write("  <!-- End plugin css for this page -->\n");
      out.write("  <!-- inject:css -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <link rel=\"shortcut icon\" href=\"images/favicon.png\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"container-scroller\">\n");
      out.write("    <!-- partial:partials/_navbar.html -->\n");
      out.write("    <nav class=\"navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row\">\n");
      out.write("      <div class=\"text-center navbar-brand-wrapper d-flex align-items-center justify-content-center\">\n");
      out.write("        <a class=\"navbar-brand brand-logo mr-5\" href=\"admin.jsp\"><img src=\"images/logo.svg\" class=\"mr-2\" alt=\"logo\"/></a>\n");
      out.write("        <a class=\"navbar-brand brand-logo-mini\" href=\"admin.jsp\"><img src=\"images/logo-mini.svg\" alt=\"logo\"/></a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"navbar-menu-wrapper d-flex align-items-center justify-content-end\">\n");
      out.write("        <button class=\"navbar-toggler navbar-toggler align-self-center\" type=\"button\" data-toggle=\"minimize\">\n");
      out.write("          <span class=\"ti-view-list\"></span>\n");
      out.write("        </button>\n");
      out.write("        <ul class=\"navbar-nav navbar-nav-right\">\n");
      out.write("          \n");
      out.write("          <li class=\"nav-item nav-profile dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\" id=\"profileDropdown\">\n");
      out.write("              <img src=\"images/faces/face29.png\" alt=\"profile\"/>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"dropdown-menu dropdown-menu-right navbar-dropdown\" aria-labelledby=\"profileDropdown\">\n");
      out.write("                <a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/logout\">\n");
      out.write("                <i class=\"ti-power-off text-primary\"></i>\n");
      out.write("                Logout\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    <!-- partial -->\n");
      out.write("    <div class=\"container-fluid page-body-wrapper\">\n");
      out.write("      <!-- partial:partials/_sidebar.html -->\n");
      out.write("      <nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"index.html\">\n");
      out.write("              <i class=\"ti-shield menu-icon\"></i>\n");
      out.write("              <span class=\"menu-title\">Dashboard</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#ui-basic\" aria-expanded=\"false\" aria-controls=\"ui-basic\">\n");
      out.write("              <i class=\"ti-palette menu-icon\"></i>\n");
      out.write("              <span class=\"menu-title\">UI Elements</span>\n");
      out.write("              <i class=\"menu-arrow\"></i>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"collapse\" id=\"ui-basic\">\n");
      out.write("              <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/ui-features/buttons.html\">Buttons</a></li>\n");
      out.write("                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/ui-features/typography.html\">Typography</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"pages/forms/basic_elements.html\">\n");
      out.write("              <i class=\"ti-layout-list-post menu-icon\"></i>\n");
      out.write("              <span class=\"menu-title\">Form elements</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"pages/charts/chartjs.html\">\n");
      out.write("              <i class=\"ti-pie-chart menu-icon\"></i>\n");
      out.write("              <span class=\"menu-title\">Charts</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"pages/tables/basic-table.html\">\n");
      out.write("              <i class=\"ti-view-list-alt menu-icon\"></i>\n");
      out.write("              <span class=\"menu-title\">Tables</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"pages/icons/themify.html\">\n");
      out.write("              <i class=\"ti-star menu-icon\"></i>\n");
      out.write("              <span class=\"menu-title\">Icons</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" data-toggle=\"collapse\" href=\"#auth\" aria-expanded=\"false\" aria-controls=\"auth\">\n");
      out.write("              <i class=\"ti-user menu-icon\"></i>\n");
      out.write("              <span class=\"menu-title\">User Pages</span>\n");
      out.write("              <i class=\"menu-arrow\"></i>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"collapse\" id=\"auth\">\n");
      out.write("              <ul class=\"nav flex-column sub-menu\">\n");
      out.write("                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/samples/login.html\"> Login </a></li>\n");
      out.write("                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/samples/login-2.html\"> Login 2 </a></li>\n");
      out.write("                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/samples/register.html\"> Register </a></li>\n");
      out.write("                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/samples/register-2.html\"> Register 2 </a></li>\n");
      out.write("                <li class=\"nav-item\"> <a class=\"nav-link\" href=\"pages/samples/lock-screen.html\"> Lockscreen </a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"documentation/documentation.html\">\n");
      out.write("              <i class=\"ti-write menu-icon\"></i>\n");
      out.write("              <span class=\"menu-title\">Documentation</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("      <!-- partial -->\n");
      out.write("      <div class=\"main-panel\">\n");
      out.write("          <div class=\"content-wrapper\">             \n");
      out.write("              <div class=\"card-body\">\n");
      out.write("                  <h4 class=\"card-title\">Ajouté Filiere</h4>\n");
      out.write("                  <p class=\"card-description\">\n");
      out.write("                   \n");
      out.write("                  </p>\n");
      out.write("                  <form class=\"forms-sample\" action=\"");
      out.print(request.getContextPath());
      out.write("/ajouterFiliere\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                      <label for=\"exampleInputUsername1\">Nom Filiere</label>\n");
      out.write("                      <input type=\"text\" class=\"form-control\" id=\"exampleInputUsername1\" placeholder=\"nom Filiere\" name=\"nom_filiere\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                      <label for=\"exampleInputUsername1\">Prix Mensuel</label>\n");
      out.write("                      <input type=\"text\" class=\"form-control\" id=\"exampleInputUsername1\" placeholder=\"prix Mensuel\" name=\"nom_filiere\">\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary mr-2\">Submit</button>\n");
      out.write("                    <button class=\"btn btn-light\">Cancel</button>\n");
      out.write("                  </form>\n");
      out.write("                </div>\n");
      out.write("          </div>         \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <!-- main-panel ends -->\n");
      out.write("    </div>\n");
      out.write("    <!-- page-body-wrapper ends -->\n");
      out.write("  </div>\n");
      out.write("  <!-- container-scroller -->\n");
      out.write("\n");
      out.write("  <!-- plugins:js -->\n");
      out.write("  <script src=\"vendors/base/vendor.bundle.base.js\"></script>\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <!-- Plugin js for this page-->\n");
      out.write("  <script src=\"vendors/chart.js/Chart.min.js\"></script>\n");
      out.write("  <!-- End plugin js for this page-->\n");
      out.write("  <!-- inject:js -->\n");
      out.write("  <script src=\"js/off-canvas.js\"></script>\n");
      out.write("  <script src=\"js/hoverable-collapse.js\"></script>\n");
      out.write("  <script src=\"js/template.js\"></script>\n");
      out.write("  <script src=\"js/todolist.js\"></script>\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <!-- Custom js for this page-->\n");
      out.write("  <script src=\"js/dashboard.js\"></script>\n");
      out.write("  <!-- End custom js for this page-->\n");
      out.write("</body>\n");
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
