package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class patientsignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>reset</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Tangerine\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("form {border: 3px solid #f1f1f1;}\n");
      out.write(".navbar {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #333;\n");
      out.write("   width:1500;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a {\n");
      out.write("  float: right;\n");
      out.write("  font-size: 20px;\n");
      out.write("  color: white;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 40px 26px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".navbar a:hover, .dropdown:hover .dropbtn {\n");
      out.write("  background-color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("  padding: 12px 40px;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("body, html \n");
      out.write("{\n");
      out.write("    height: 100%;\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bg-img {\n");
      out.write("    \n");
      out.write("    background-image: url(\"h10.jpg\");\n");
      out.write("    height: 800px;\n");
      out.write("    background-position: center;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("    position: relative;\n");
      out.write("    top: -20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    position: absolute;\n");
      out.write("    left: 0;\n");
      out.write("    margin: 10px;\n");
      out.write("    max-width: 400px;\n");
      out.write("    padding: 15px;\n");
      out.write("    background-color: white;\n");
      out.write("}\n");
      out.write(".imgcontainer {\n");
      out.write("    text-align: center;\n");
      out.write("    margin: 24px 0 12px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 15px;\n");
      out.write("    margin: 5px 0 22px 0;\n");
      out.write("    border: none;\n");
      out.write("    background: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text]:focus, input[type=password]:focus {\n");
      out.write("    background-color: #ddd;\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn {\n");
      out.write("    background-color: #000000;\n");
      out.write("\n");
      out.write("    padding: 16px 60px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    \n");
      out.write("    opacity: 0.9;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("    opacity: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("span.psw {\n");
      out.write("    float: right;\n");
      out.write("    padding-top: 16px;\n");
      out.write("}\n");
      out.write(".cancelbtn {\n");
      out.write("    width: auto;\n");
      out.write("    padding: 10px 18px;\n");
      out.write("    background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 300px) \n");
      out.write("{\n");
      out.write("    span.psw {\n");
      out.write("       display: block;\n");
      out.write("       float: none;\n");
      out.write("    }\n");
      out.write("    .cancelbtn {\n");
      out.write("       width: 100%;\n");
      out.write("       background-color:#f1f1f1;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write(".cancelbtn {\n");
      out.write("  padding: 14px 20px;\n");
      out.write("  background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Float cancel and signup buttons and add an equal width */\n");
      out.write(".cancelbtn, .signupbtn {\n");
      out.write("  float: left;\n");
      out.write("  width: 50%;\n");
      out.write("}\n");
      out.write(".clearfix::after {\n");
      out.write("  content: \"\";\n");
      out.write("  clear: both;\n");
      out.write("  display: table;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change styles for cancel button and signup button on extra small screens */\n");
      out.write("@media screen and (max-width: 300px) {\n");
      out.write("  .cancelbtn, .signupbtn {\n");
      out.write("     width: 100%;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"navbar\">\n");
      out.write("\n");
      out.write("     <a href=\"#home\">CONTACT US</a>\n");
      out.write("      <a href=\"#home\">ABOUT US</a>\n");
      out.write("  <a href=\"#home\">SERVICE</a>\n");
      out.write("  <a href=\"#news\">HOME</a>\n");
      out.write("<h1 style=\"font-family:courier;\">HOSPITAL  MANAGEMENT</h1></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       <div class=\"bg-img\">\n");
      out.write("  <form action=\"reset2\" class=\"container\">\n");
      out.write("      <center><img src=\"p1.png\" width=\"70\" height=\"70\"> </center>\n");
      out.write("    <center><label><h3>PATIENT'S SIGNUP</h3></label><br></center>\n");
      out.write("    <center><p>Please fill in this form to create an account.</p></center>\n");
      out.write("    <hr>\n");
      out.write("    <label for=\"name\"><b>Patient's Name</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Name\" name=\"name\" required>\n");
      out.write("    \n");
      out.write("  \n");
      out.write("    <label for=\"email\"><b>Email</b></label>\n");
      out.write("    \n");
      out.write("    <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\n");
      out.write("\n");
      out.write("    <label for=\"psw\"><b>Password</b></label>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n");
      out.write("\n");
      out.write("    <label for=\"psw-repeat\"><b>Repeat Password</b></label>\n");
      out.write("    <input type=\"password\" placeholder=\"Repeat Password\" name=\"psw-repeat\" required>\n");
      out.write("    \n");
      out.write("    <label>\n");
      out.write("      <input type=\"checkbox\" checked=\"checked\" name=\"remember\" style=\"margin-bottom:15px\"> Remember me\n");
      out.write("    </label>\n");
      out.write("    \n");
      out.write("<br><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"clearfix\">\n");
      out.write("      <button type=\"button\" class=\"cancelbtn\">CANCEL</button>\n");
      out.write("     <button type=\"submit\" class=\"btn\"><a href=\"\">SIGNUP</a></button><br><br>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
