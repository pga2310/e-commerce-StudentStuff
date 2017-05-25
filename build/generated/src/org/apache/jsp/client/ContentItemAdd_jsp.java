package org.apache.jsp.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ContentItemAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"row\" style=\"margin-left: 10%\">\n");
      out.write("\t\t\t\t\t<div class=\"span5\">\n");
      out.write("                                            <form name=\"ItemAdd\" action=\"../ItemAdd\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                                        <label> Title:</label>\n");
      out.write("                                        <input type=\"text\"  id=\"title\" name=\"title\"/>\n");
      out.write("\n");
      out.write("                                        <label>Tag Line:</label>\n");
      out.write("                                        <input type=\"text\"  id=\"tagline\" name=\"tagline\"/>\n");
      out.write("\n");
      out.write("                                        <label> Description:</label>\n");
      out.write("                                        <input type=\"text\" id=\"description\" name=\"description\" style=\"width: 200px;\"/>\n");
      out.write("\n");
      out.write("                                        <label>Price:</label>\n");
      out.write("                                        <input type=\"text\"  id=\"price\" name=\"price\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <label> Nearest City:</label>\n");
      out.write("                                        <select id=\"\" name=\"city\">\n");
      out.write("                                                <option value=\"\"> --- Please Select --- </option>\n");
      out.write("                                                <option value=\"244\">Aaland Islands</option>\n");
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                        <label> Choose Field:</label>\n");
      out.write("                                        <select id=\"\" name=\"field\">\n");
      out.write("                                                <option value=\"\"> --- Please Select --- </option>\n");
      out.write("                                                <option value=\"244\">Aaland Islands</option>\n");
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                        <label> Choose Field:</label>\n");
      out.write("                                        <select id=\"\" name=\"category\">\n");
      out.write("                                                <option value=\"\"> --- Please Select --- </option>\n");
      out.write("                                                <option value=\"244\">Aaland Islands</option>\n");
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("\n");
      out.write("                                        <label> Condition:</label>\n");
      out.write("                                        <label id=\"\" >\n");
      out.write("                                                        <input type=\"radio\" id=\"condin\" name=\"condin\" value=\"Used\"/>\n");
      out.write("                                                        Used\n");
      out.write("                                                </label>\n");
      out.write("                                                <label id=\"\">\n");
      out.write("                                                        <input type=\"radio\" id=\"condin\" name=\"condin\" value=\"New\"/>\n");
      out.write("                                                        New\n");
      out.write("                                                </label>\n");
      out.write("\n");
      out.write("                                         <label>Contact Person Name:</label>\n");
      out.write("                                         <input type=\"text\" id=\"personname\"  name=\"personname\" disabled/>\n");
      out.write("                                        <label>Contact No.</label>\n");
      out.write("                                        <input type=\"text\" id=\"number\" name=\"number\" disabled/>\n");
      out.write("                                        <label>Email-ID:</label>\n");
      out.write("                                        <input type=\"text\" id=\"email\" name=\"email\" disabled/>\n");
      out.write("\n");
      out.write("                                        <label>Upload Images</label>\n");
      out.write("                                        <input type=\"file\" name=\"img-1\" id=\"img-1\"/>\n");
      out.write("                                        <input type=\"file\" name=\"img-2\" id=\"img-2\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <br />\n");
      out.write("                                        <input type=\"submit\" class=\"btn-info\" name=\"Submit\" value=\"Submit\">\n");
      out.write("                                </form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t");
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
