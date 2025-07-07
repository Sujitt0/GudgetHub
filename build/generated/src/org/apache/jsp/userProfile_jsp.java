package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("    <title>Bootstrap demo</title>\n");
      out.write("    <link\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("       \n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row mt-5 col-md-12\">\n");
      out.write("        <nav aria-label=\"breadcrumb\" class=\"bg-warning rounded\">\n");
      out.write("          <ol class=\"breadcrumb pt-3\">\n");
      out.write("            <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\n");
      out.write("            <li class=\"breadcrumb-item active\" aria-current=\"page\">Library</li>\n");
      out.write("          </ol>\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row mt-5 mb-5\">\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("          <div class=\"card mb-3\">\n");
      out.write("            <div class=\"card-body text-center\">\n");
      out.write("              <img\n");
      out.write("                class=\"img-fluid w-50 rounded\"\n");
      out.write("                src=\"images/profile.jpeg\"\n");
      out.write("                alt=\"Card image cap\"\n");
      out.write("              />\n");
      out.write("              <h5 class=\"mt-3\">Hello Prashant</h5>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"card mb-3\">\n");
      out.write("            <div class=\"card-body text-center\">\n");
      out.write("              <h3>My Profile</h3>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"col-md-9\">\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                  <p>Full Name</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                  <p>Prashant</p>\n");
      out.write("                </div>\n");
      out.write("                <hr />\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                  <p>Email</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                  <p>prashantyaduvanshi43@gmail.com</p>\n");
      out.write("                </div>\n");
      out.write("                <hr />\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                  <p>Phone</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                  <p>602827379</p>\n");
      out.write("                </div>\n");
      out.write("                <hr />\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                  <p>Address</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                  <p>Bhopal</p>\n");
      out.write("                </div>\n");
      out.write("                <hr />\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                  <p>Pincode</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                  <p>847229</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("       \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("       \n");
      out.write("    <script\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("      integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("  </body>\n");
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
