package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div class=\"header navbar navbar-inverse \">\n");
      out.write("\t\t<!-- BEGIN TOP NAVIGATION BAR -->\n");
      out.write("\t\t<div class=\"navbar-inner\">\n");
      out.write("\t\t\t<div class=\"header-seperation\">\n");
      out.write("\t\t\t\t<ul class=\"nav pull-left notifcation-center\"\n");
      out.write("\t\t\t\t\tid=\"main-menu-toggle-wrapper\" style=\"display: none\">\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a id=\"main-menu-toggle\"\n");
      out.write("\t\t\t\t\t\thref=\"#main-menu\" class=\"\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"iconset top-menu-toggle-white\"></div>\n");
      out.write("\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<!-- BEGIN LOGO -->\n");
      out.write("\t\t\t\t<a href=\"blank_template.html\"><img\n");
      out.write("\t\t\t\t\tsrc=\"resources/images/std_logo.gif\" class=\"logo\" width=\"106\"\n");
      out.write("\t\t\t\t\theight=\"92\" /></a>\n");
      out.write("\t\t\t\t<!-- END LOGO -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- END RESPONSIVE MENU TOGGLER -->\n");
      out.write("\t\t\t<div class=\"header-quick-nav\">\n");
      out.write("\t\t\t\t<!-- BEGIN TOP NAVIGATION MENU -->\n");
      out.write("\t\t\t\t<div class=\"pull-left\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav quick-section\">\n");
      out.write("\t\t\t\t\t\t<li class=\"quicklinks\"><a href=\"#\" class=\"\"\n");
      out.write("\t\t\t\t\t\t\tid=\"layout-condensed-toggle\"><div\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"iconset top-menu-toggle-dark\"></div> </a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"pull-right\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav quick-section\">\n");
      out.write("\t\t\t\t\t\t<a href=\"../Logout\"><i class=\"icon-off\"></i>&nbsp;&nbsp;Logout</a>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- END TOP NAVIGATION MENU -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- END TOP NAVIGATION BAR -->\n");
      out.write("\t</div>");
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
