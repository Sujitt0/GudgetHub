package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Payment</title>\n");
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
      out.write("    <div class=\"conatiner mt-5 mb-5\">\n");
      out.write("      <div class=\"row justify-content-center\">\n");
      out.write("        <form action=\"#\" class=\"col-md-6 myform\">\n");
      out.write("          <div class=\"text-center\">\n");
      out.write("            <img\n");
      out.write("              src=\"images/payment.png\"\n");
      out.write("              alt=\"\"\n");
      out.write("              height=\"100px\"\n");
      out.write("              width=\"100px\"\n");
      out.write("              class=\"rounded-circle\"\n");
      out.write("            />\n");
      out.write("            <h2 class=\"text-primary mt-2\">Payment Details</h2>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row mt-3\">\n");
      out.write("            <div class=\"form-group col-md-12\">\n");
      out.write("              <label for=\"card_holder_name\">Name of Card Holder</label>\n");
      out.write("              <input\n");
      out.write("                type=\"text\"\n");
      out.write("                id=\"card_holder_name\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                title=\"Please enter a valid name\"\n");
      out.write("                required\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row mt-3\">\n");
      out.write("            <div class=\"col-md-12 form-group\">\n");
      out.write("              <label for=\"card-number\">Credit Card Number</label>\n");
      out.write("              <input\n");
      out.write("                type=\"text\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                id=\"card-number\"\n");
      out.write("                maxlength=\"19\"\n");
      out.write("                pattern=\"\\d{4}-?\\d{4}-?\\d{4}-?\\d{4}\"\n");
      out.write("                title=\"Please enter a valid credit card number in the format XXXX-XXXX-XXXX-XXXX\"\n");
      out.write("                oninput=\"this.value = this.value.replace(/\\D/g, '').replace(/(\\d{4})(?=\\d)/g, '$1-').slice(0, 19);\"\n");
      out.write("                required\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"row mt-3\">\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("              <label for=\"expiry_month\">Expiry Month</label>\n");
      out.write("              <select\n");
      out.write("                id=\"expiry_month\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                title=\"Please select expiry month\"\n");
      out.write("                required\n");
      out.write("              >\n");
      out.write("                <option value=\"\" disabled selected>Select Month</option>\n");
      out.write("                <!-- Placeholder option -->\n");
      out.write("                <option value=\"01\">01</option>\n");
      out.write("                <option value=\"02\">02</option>\n");
      out.write("                <option value=\"03\">03</option>\n");
      out.write("                <option value=\"04\">04</option>\n");
      out.write("                <option value=\"05\">05</option>\n");
      out.write("                <option value=\"06\">06</option>\n");
      out.write("                <option value=\"07\">07</option>\n");
      out.write("                <option value=\"08\">08</option>\n");
      out.write("                <option value=\"09\">09</option>\n");
      out.write("                <option value=\"10\">10</option>\n");
      out.write("                <option value=\"11\">11</option>\n");
      out.write("                <option value=\"12\">12</option>\n");
      out.write("              </select>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("              <label for=\"expiry_year\">Expiry Year</label>\n");
      out.write("              <select\n");
      out.write("                id=\"expiry_year\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                title=\"Please select a valid expiry year 20XX\"\n");
      out.write("                required\n");
      out.write("              >\n");
      out.write("                <option value=\"\" disabled selected>Select Year</option>\n");
      out.write("                <option value=\"24\">24</option>\n");
      out.write("                <option value=\"25\">25</option>\n");
      out.write("                <option value=\"26\">26</option>\n");
      out.write("                <option value=\"27\">27</option>\n");
      out.write("                <option value=\"28\">28</option>\n");
      out.write("                <option value=\"29\">29</option>\n");
      out.write("                <option value=\"30\">30</option>\n");
      out.write("                <option value=\"31\">31</option>\n");
      out.write("                <option value=\"32\">32</option>\n");
      out.write("                <option value=\"33\">33</option>\n");
      out.write("                <option value=\"34\">34</option>\n");
      out.write("              </select>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- <div class=\"col-md-6 form-group\">\n");
      out.write("              <label for=\"expiry_year\">Expiry Year</label>\n");
      out.write("              <input\n");
      out.write("                type=\"number\"\n");
      out.write("                id=\"expiry_year\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                title=\"Please enter a valid expiry year\"\n");
      out.write("                placeholder=\"Year\"\n");
      out.write("                min=\"24\"\n");
      out.write("                max=\"34\"\n");
      out.write("                oninput=\"\n");
      out.write("                if(this.value.length > 2) this.value = this.value.slice(0, 2);\n");
      out.write("                if(this.value < 24) this.value = 24;\n");
      out.write("             \n");
      out.write("            \"\n");
      out.write("                required\n");
      out.write("              />\n");
      out.write("            </div> -->\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"row mt-3 mb-3\">\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("              <label for=\"cvv\">Card CVV</label>\n");
      out.write("              <input\n");
      out.write("                type=\"number\"\n");
      out.write("                class=\"form-control\"\n");
      out.write("                id=\"cvv\"\n");
      out.write("                min=\"0\"\n");
      out.write("                placeholder=\"Please enter a valid 3-digit CVV\"\n");
      out.write("                oninput=\"if(this.value.length > 3) this.value = this.value.slice(0, 3);\"\n");
      out.write("                required\n");
      out.write("              />\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-6 form-group\">\n");
      out.write("              <label for=\"\">&nbsp;</label>\n");
      out.write("              <button type=\"submit\" class=\"btn btn-warning form-control\">\n");
      out.write("                Pay Rs: 20000\n");
      out.write("              </button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("       ");
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
