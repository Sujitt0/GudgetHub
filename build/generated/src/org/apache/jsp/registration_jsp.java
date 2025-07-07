package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Registration Form</title>\n");
      out.write("    <link\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    />\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\" />\n");
      out.write("  </head>\n");
      out.write("  <body >\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("       \n");
      out.write("    <div class=\"container mt-5 mb-5\">\n");
      out.write("      <div class=\"row justify-content-center\">\n");
      out.write("        <form action=\"#\" class=\"col-md-6 myform\">\n");
      out.write("          <div class=\"text-center mt-3\">\n");
      out.write("            <h2 class=\"text-primary\">Registration Form</h2>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("              <label for=\"user_name\">Name</label>\n");
      out.write("              <input\n");
      out.write("                type=\"text\"\n");
      out.write("                name=\"\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                id=\"user_name\"\n");
      out.write("                placeholder=\"Enter your name\"\n");
      out.write("                required\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("              <label for=\"user_email\">Email</label>\n");
      out.write("              <input\n");
      out.write("                type=\"email\"\n");
      out.write("                name=\"\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                id=\"user_email\"\n");
      out.write("                placeholder=\"Enter your email id\"\n");
      out.write("                required\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("         <div class=\"form-group\">\n");
      out.write("            <label for=\"address\">Address </label>\n");
      out.write("            <textarea\n");
      out.write("              name=\"\"\n");
      out.write("              id=\"address\"\n");
      out.write("              class=\"form-control\"\n");
      out.write("              placeholder=\"Enter your permanent address\"\n");
      out.write("            ></textarea>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("              <label for=\"mobile\">Mobile No.</label>\n");
      out.write("              <input\n");
      out.write("                type=\"number\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                id=\"mobile\"\n");
      out.write("                placeholder=\"Enter your 10-digit mobile number\"\n");
      out.write("                pattern=\"[0-9]{10}\"\n");
      out.write("                title=\"Mobile number must be exactly 10 digits.\"\n");
      out.write("                maxlength=\"10\"\n");
      out.write("                minlength=\"10\"\n");
      out.write("                oninput=\"this.value = this.value.replace(/[^0-9]/g, '');\"\n");
      out.write("                aria-label=\"Mobile number input field\"\n");
      out.write("                required\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("             <div class=\"col-md-6 form-group\">\n");
      out.write("              <label for=\"pincode\">Pincode</label>\n");
      out.write("              <input\n");
      out.write("                type=\"text\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                id=\"pincode\"\n");
      out.write("                placeholder=\"Enter your 6-digit pincode\"\n");
      out.write("                pattern=\"[0-9]{6}\"\n");
      out.write("                title=\"Enter your 6-digit pincode.\"\n");
      out.write("                maxlength=\"6\"\n");
      out.write("                oninput=\"this.value = this.value.replace(/[^0-9]/g, '');\"\n");
      out.write("                aria-label=\"Pincode input field\"\n");
      out.write("                required\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("              <label for=\"password\">Password</label>\n");
      out.write("              <input\n");
      out.write("                type=\"password\"\n");
      out.write("                name=\"\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                id=\"password\"\n");
      out.write("                 placeholder=\"Enter strong password.\"\n");
      out.write("                required\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("              <label for=\"cpassword\">Confirm Password</label>\n");
      out.write("              <input\n");
      out.write("                type=\"password\"\n");
      out.write("                name=\"\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                id=\"cpassword\"\n");
      out.write("                placeholder=\"Enter strong password.\"\n");
      out.write("                required\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"row mt-3 mb-3 text-center\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("              <button type=\"reset\" class=\"btn btn-outline-danger\">Reset</button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-outline-primary\">\n");
      out.write("                Register\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
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
