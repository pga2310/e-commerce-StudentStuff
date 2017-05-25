package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\" />\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<title>Student Stuff</title>\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\n");
      out.write("<meta content=\"\" name=\"description\" />\n");
      out.write("<meta content=\"\" name=\"author\" />\n");
      out.write("\n");
      out.write("<link href=\"./resources/css/pace-theme-flash.css;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"./resources/css/jquery.sidr.light.css;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"./resources/css/bootstrap.min.css;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"./resources/css/bootstrap-responsive.min.css;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"./resources/css/font-awesome.css;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"./resources/css/animate.min.css;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"./resources/css/style.css;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"./resources/css/responsive.css;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"./resources/css/custom-icons.css;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"./resources/css/custom-icon-set.css;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"./resources/css/bootstrap-timepicker.css;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"./resources/css/datepicker.css;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/jquery/jquery-1.8.3.min.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/jquery/jquery-ui-1.10.1.custom.min.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/bootstrap.min.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/breakpoints.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/jquery/jquery.unveil.min.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/jquery/jquery.sidr.min.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/jquery/jquery.slimscroll.min.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/pace.min.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/jquery/jquery.animateNumbers.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/tabs_accordian.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/dropzone.min.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/bootstrap-timepicker.min.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/bootstrap-datepicker.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/jquery/jquery.validate.min.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/jquery/additional-methods.min.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/jquery/jquery.bootstrap.wizard.min.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/jquery/plugin/jquery.form.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/jquery/jquery.tabletojson.min.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/core.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/demo.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/form_validation.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/elements.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/add_menu_item_elements.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/smooth-sliding-menu.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"./resources/js/general.js;jsessionid=95FAADD0899C77ED3C38A3E2A82EA3B6\"></script>\n");
      out.write("</head>\n");
      out.write("<!-- END HEAD -->\n");
      out.write("<!-- BEGIN BODY -->\n");
      out.write("<body class=\"error-body no-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"login-container span12\">\n");
      out.write("\t\t\t\t<div class=\"row-fluid column-seperation\" style=\"padding: 0 10px\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"span5\" style=\"margin-left: 33%\">\n");
      out.write("\t\t\t\t\t\t<br>\n");
      out.write("                                                <form name=\"login\" action=\"../LoginCheck\" method=\"get\">\n");
      out.write("\t\t\t\t\t\t<div class=\"control-group span10\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\">Username</label>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-with-icon right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"\"></i> <input type=\"text\" name=\"username\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"username\" class=\"span12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"control-label\">Password</label> <span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"help\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"controls\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-with-icon right\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"\"></i> <input type=\"password\" name=\"password\" id=\"password\" class=\"span12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"checkbox checkbox check-success\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Trouble login in?</a>&nbsp;&nbsp; <input\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=\"checkbox\" id=\"checkbox1\" value=\"1\"> <label\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfor=\"checkbox1\">Keep me reminded </label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"span10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-primary btn-cons pull-right\"\n");
      out.write("                                                                                type=\"submit\" name=\"Submit_Login\">Login</button>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END CONTAINER -->\n");
      out.write("</body>\n");
      out.write("</html>");
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
