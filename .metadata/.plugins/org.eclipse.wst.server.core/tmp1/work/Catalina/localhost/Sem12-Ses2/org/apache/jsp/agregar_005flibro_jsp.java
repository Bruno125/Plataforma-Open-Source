/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2015-06-09 14:41:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.ArrayList;
import model.Genero;
import model.Editorial;

public final class agregar_005flibro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h3>Agregar libro</h3>\r\n");
      out.write("<form method=\"post\" action=\"LibroAgregar\">\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t<li>Genero:\r\n");
      out.write("\t\t<select name=\"genero\">\r\n");
      out.write("\t\t");
 List<Genero> generos = (ArrayList<Genero>) request.getAttribute("generos");
      out.write("\r\n");
      out.write("\t\t");
 if(generos!=null && generos.size()>0){ 
      out.write("\r\n");
      out.write("\t\t\t\t");
 for(Genero genero : generos){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<option value=\"");
      out.print(genero.getId());
      out.write('"');
      out.write('>');
      out.print(genero.getNombre());
      out.write("</option>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>Editorial:\r\n");
      out.write("\t\t<select name=\"editorial\">\r\n");
      out.write("\t\t");
 List<Editorial> editoriales = (ArrayList<Editorial>) request.getAttribute("editoriales");
      out.write("\r\n");
      out.write("\t\t");
 if(editoriales!=null && editoriales.size()>0){ 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t");
 for(Editorial editorial : editoriales){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<option value=\"");
      out.print(editorial.getId());
      out.write('"');
      out.write('>');
      out.print(editorial.getNombre());
      out.write("</option>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>Titulo: <input type=\"text\" name=\"titulo\"/></li>\r\n");
      out.write("\t<li>Descripcion: <input type=\"text\" name=\"descripcion\"/></li>\r\n");
      out.write("\t<li>ISBN: <input type=\"text\" name=\"isbn\"/></li>\r\n");
      out.write("\t<li>Imagen: <input type=\"file\" name=\"imagen\"/></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t\r\n");
      out.write("\t<input type=\"submit\" value=\"Agregar libro\"/>\r\n");
      out.write("\t\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}