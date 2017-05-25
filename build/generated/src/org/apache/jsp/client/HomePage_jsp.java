package org.apache.jsp.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/client/Header.jsp");
    _jspx_dependants.add("/client/ContentHomePage.jsp");
  }

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

      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\t\n");
      out.write("\t<title>Student Stuff</title>\n");
      out.write("\n");
      out.write("\t<!-- Included Bootstrap CSS Files -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./js/bootstrap/css/bootstrap.min.css\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./js/bootstrap/css/bootstrap-responsive.min.css\" />\n");
      out.write("\t\n");
      out.write("\t<!-- Includes FontAwesome -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./css/font-awesome/css/font-awesome.min.css\" />\n");
      out.write("\n");
      out.write("\t<!-- Css -->\t\n");
      out.write("\t<link rel=\"stylesheet\" href=\"./css/style.css\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("<div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("\t\t<div class=\"navbar-inner\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<button class=\"btn btn-navbar\" data-target=\".nav-collapse\" data-toggle=\"collapse\" type=\"button\">\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"brand\" href=\"HomePage.jsp\">Student Stuff</a>\n");
      out.write("\t\t\t\t<div class=\"nav-collapse collapse\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav\">\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"HomePage.jsp\">Home</a>\n");
      out.write("                                                       \t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                                                <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"StuffSharing.jsp\">Stuff Sharing</a>\n");
      out.write("                                                       \t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                                                <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"MaterialSharing.jsp\">Material Sharing</a>\n");
      out.write("                                                       \t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                                                  <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"Forum.jsp\">Discussion Forum</a>\n");
      out.write("                                                 </li>\n");
      out.write("                                                  <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"AboutUs.jsp\">About Us</a>\n");
      out.write("                                                 </li> <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"ContactUs.jsp\">Contact Us</a>\n");
      out.write("                                                 </li>\n");
      out.write("                                                 \n");
      out.write("                                               \n");
      out.write("                                                \n");
      out.write("                                                        ");

                                                            HttpSession sess=  request.getSession();
                                                if(sess.getAttribute("client_uname") == null)
                                                {
      out.write("\n");
      out.write("                                                \n");
      out.write("                                                 <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"SignIn.jsp\">Sign In</a>\n");
      out.write("                                                 </li>\n");
      out.write("                                                 <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"Registration.jsp\">Join Us</a>\n");
      out.write("                                                 </li>\n");
      out.write("                                                \n");
      out.write("                                                 ");

                                                }else{
                                         
                                         
                                                        
      out.write("\n");
      out.write("\t\t\t\t\t         </ul>\n");
      out.write("                                                 <ul class=\"nav\"  style=\"float: right\">\n");
      out.write("                                                        <li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" style=\"float: right\">");
out.write(sess.getAttribute("client_uname").toString());
      out.write("<b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("                                                            <li></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"AccountDetails.jsp\">Account Details</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"../Client_Logout\">Logout</a></li>\n");
      out.write("                                                                \n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                                </ul>");
}
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>");
      out.write('\n');
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<script src=\"./js/jquery-1.10.0.min.js\"></script>\n");
      out.write("\t<script src=\"./js/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"./js/holder.js\"></script>\n");
      out.write("\t<script src=\"./js/script.js\"></script>\n");
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
