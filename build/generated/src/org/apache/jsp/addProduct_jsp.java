package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.jsp");
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Add Product</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"mycss.css\">\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: #E6F9E6;\">\n");
      out.write("\t");

	/* Checking the user credentials */
	/* Java Code */
	
      out.write("\n");
      out.write("\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t");

	/* Java Code */
	
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row justify-content-center\">\n");
      out.write("<form action=\"./AddProductServlet\" method=\"post\" enctype=\"multipart/form-data\"\n");
      out.write("\t\t\t\t class=\"col-md-6 col-md-offset-3 myform\">\n");
      out.write("\t\t\t\t<div class=\"text-center\">\n");
      out.write("\t\t\t\t\t<h2 class=\"text-primary\">Product Addition Form</h2>\n");
      out.write("\t\t\t\t\t");

					/* Java Code */ {
					
      out.write("\n");
      out.write("\t\t\t\t\t<p style=\"color: blue;\">\n");
      out.write("\t\t\t\t\t\t");
      out.print(/*Java Code*/);
      out.write("\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t");

					}
					
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div></div>\n");
      out.write("\t\t\t\t<div class=\"row mt-3\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"last_name\">Product Name</label><input type=\"text\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Enter Product Name\" name=\"name\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tid=\"last_name\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"producttype\">Product Type</label><select name=\"type\"\n");
      out.write("\t\t\t\t\t\t\tid=\"producttype\" class=\"form-control\" required>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"mobile\">MOBILE</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"tv\">TV</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"camera\">CAMERA</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"laptop\">LAPTOP</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"tablet\">TABLET</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"speaker\">SPEAKER</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"other\">Some Other Appliances</option>\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group mt-3\">\n");
      out.write("\t\t\t\t\t<label for=\"last_name\">Product Description</label>\n");
      out.write("\t\t\t\t\t<textarea name=\"info\" class=\"form-control\" id=\"last_name\" required></textarea>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row mt-3\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"last_name\">Unit Price</label><input type=\"number\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Enter Unit Price\" name=\"price\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tid=\"last_name\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"last_name\">Stock Quantity</label><input type=\"number\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Enter Stock Quantity\" name=\"quantity\"\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"last_name\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"mt-3\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12 form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"last_name\">Product Image</label><input type=\"file\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Select Image\" name=\"image\" class=\"form-control\"\n");
      out.write("\t\t\t\t\t\t\tid=\"last_name\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"row mt-3\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 text-center\" style=\"margin-bottom: 2px;\">\n");
      out.write("\t\t\t\t\t\t<button type=\"reset\" class=\"btn btn-danger\">Reset</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 text-center\">\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Add Product</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("    <title>Footer</title>\n");
      out.write("    <link\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css\"\n");
      out.write("      integrity=\"sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("      referrerpolicy=\"no-referrer\"\n");
      out.write("    />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"container-fluid bg-primary text-white p-2\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("          <h2>Contact</h2>\n");
      out.write("          <p>We love our fans!</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("            <p><i class=\"fa-solid fa-phone p-2\"></i>Phone : +916202827379</p>\n");
      out.write("\n");
      out.write("            <p>\n");
      out.write("              <i class=\"fa-solid fa-envelope p-2\"></i>Email :\n");
      out.write("              prashant43@gmail.com\n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("            <p><i class=\"fa-solid fa-signs-post p-2\"></i>Postal code: 847229</p>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-md-8\">\n");
      out.write("            <form action=\"https://formsubmit.co/prashantyaduvanshi43@gmail.com\" method=\"POST\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6 form-group\">\n");
      out.write("                  <input\n");
      out.write("                    type=\"text\"\n");
      out.write("                    class=\"form-control\"\n");
      out.write("                    placeholder=\"Name\"\n");
      out.write("                    required\n");
      out.write("                  />\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-6 form-group\">\n");
      out.write("                  <input\n");
      out.write("                    type=\"email\"\n");
      out.write("                    class=\"form-control\"\n");
      out.write("                    placeholder=\"Email\"\n");
      out.write("                    required\n");
      out.write("                  />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <textarea\n");
      out.write("                name=\"\"\n");
      out.write("                id=\"\"\n");
      out.write("                class=\"form-control mt-2\"\n");
      out.write("                rows=\"5\"\n");
      out.write("                placeholder=\"Enter your message...\"\n");
      out.write("              ></textarea>\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 form-group mt-1\">\n");
      out.write("                  <button  type=\"submit\" class=\"btn bg-warning mb-3\">\n");
      out.write("                    Send\n");
      out.write("                  </button>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <script\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("      integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
