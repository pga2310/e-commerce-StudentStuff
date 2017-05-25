package org.apache.jsp.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ContentHomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<script>\n");
      out.write("    function abc(){\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<div class=\"container\" style=\"width: 100%\">\n");
      out.write("    \n");
      out.write("    <div class=\"row\">\n");
      out.write("        \n");
      out.write("        <center> <img src=\"client_docs/sslogo copy.png.jpg\" style= \"width:100%; height:70%;\"   onclick=\"abc();\"/>   \n");
      out.write("        </center>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"span5\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("<div class=\"container\" style=\"margin-top: 5%;\">\n");
      out.write("    <div class=\"row\"style=\"float: left\">\n");
      out.write("        <div class=\"span5\" >\n");
      out.write("    <div class=\"well\">\n");
      out.write("    \n");
      out.write("\t\t\t\t\t\t<h2>Tecnical News Feed</h2>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<marquee behavior=\"scroll\" onmouseover=\"this.stop();\" onmouseout=\"this.start();\" direction=\"up\" scrollamount=\"3\" loop=>\n");
      out.write("<script type=\"text/javascript\" src=\"http://feed.informer.com/widgets/DC3IDNTXYX.js\"></script>\n");
      out.write("<noscript><a href=\"http://feed.informer.com/widgets/DC3IDNTXYX.html\">\"Tech1\"</a>\n");
      out.write("Powered by <a href=\"http://feed.informer.com/\">RSS Feed Informer</a></noscript>\n");
      out.write("</marquee> \n");
      out.write("                \n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<br />\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("    </div></div><div class=\"span5\" style=\"float: right;height: 40%\">\t\n");
      out.write("            <div class=\"well\" style=\"float: right;height: 40%\">\n");
      out.write("    \n");
      out.write("\t\t\t\t\t\t<h2>Stay Connected With Us</h2>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                <form method=\"get\" action=\"http://www.google.com/search\">\n");
      out.write("\n");
      out.write("<div style=\"border:2px dotted black;padding:4px;width:15em;\">\n");
      out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\">\n");
      out.write("<tr><td>\n");
      out.write("<input type=\"text\"   name=\"q\" size=\"25\" style=\"color:#808080;\"\n");
      out.write("maxlength=\"255\" value=\"Google site search\"\n");
      out.write("onfocus=\"if(this.value==this.defaultValue)this.value=''; this.style.color='black';\" onblur=\"if(this.value=='')this.value=this.defaultValue; \"/>\n");
      out.write("<input type=\"submit\" value=\"Go!\" />\n");
      out.write("<input type=\"hidden\" name=\"sitesearch\" value=\"yoursite.com\" /></td></tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<br />\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("    </div>\t\n");
      out.write("        \n");
      out.write("        </div>  </div>  </div> \n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write(" </div>");
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
