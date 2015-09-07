package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("  <title>客户管理</title>\r\n");
      out.write("  <link href=\"bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t#nid{\r\n");
      out.write("\t\t\tbackground-color: skyblue;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#aid{\r\n");
      out.write("\t\t\tmargin-top: 10px;\r\n");
      out.write("\t\t\tmargin-right: 10px;\r\n");
      out.write("\t\t\tfont-size: 20px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#dd{\r\n");
      out.write("\t\t\tbackground-size: 100% 100%;\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\theight: 100%;\r\n");
      out.write("\t\t\tmargin-right: -20px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#id2{\r\n");
      out.write("\t\t\tmargin-left: -30px;\r\n");
      out.write("\t\t\theight:80%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#id10{\r\n");
      out.write("\t\t\t/* background-color: darkgray; */\r\n");
      out.write("\t\t\tmargin-bottom: 10px;\r\n");
      out.write("\t\t\theight:80%;\r\n");
      out.write("\t\t\tbackground-size: 100% 100%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#bid{\r\n");
      out.write("\t\t\tbackground-color: skyblue;\r\n");
      out.write("\t\t\tcolor: white;\r\n");
      out.write("\t\t\tborder-radius: 5px;\r\n");
      out.write("\t\t\tfont-size: 20px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#mid{\r\n");
      out.write("\t\t\tfloat: left;\r\n");
      out.write("\t\t\tbackground-color: #EEEEEE;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#tabid{\r\n");
      out.write("\t\t\tfloat: right;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t</style>  \t\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("\t<nav class=\"navbar navbar-default\" role=\"navigation\" id=\"nid\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<h4>8827肖云龙</h4>\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<a id=\"aid\" class=\"nav navbar-nav navbar-right\" id=\"aid\" href=\"#\" >Admin</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"dd\" class=\"container\">\r\n");
      out.write("\t\t<div class=\"col-md-2\" id=\"id2\">\r\n");
      out.write("\t\t\t<ul class=\"list-group affixed-element-top js-affixed-element-top\">\r\n");
      out.write("\t\t\t\t<li class=\"list-group-item\"><a href=\"index.jsp\">Customer管理</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"list-group-item\"><a href=\"#\">Film设置</a></li>\r\n");
      out.write("\t\t\t</ul>\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-10 js-content\" id=\"id10\" style=\"background-color: #eeeeee\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h4>客户管理</h4>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3\"  style=\"background-color: #ffffff\">\r\n");
      out.write("\t\t\t\t\t<p>客户列表</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-9\"  style=\"background-color: #ffffff\">\r\n");
      out.write(" \t\t\t\t\t<a href=\"");
      out.print(path );
      out.write("/add.do\" id=\"bid\" type=\"button\" >新建</a>\r\n");
      out.write("<!--  \t\t\t\t\t<a href=\"Add.jsp\" id=\"bid\" type=\"button\" >新建</a>\t\r\n");
      out.write(" -->\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div id=\"mid\">\r\n");
      out.write("\t\t\t\t\t<table border=2>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"col-md-1\">操作</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"col-md-1\">FirstName</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"col-md-2\">Last Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"col-md-2\">Address</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"col-md-2\">Email</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"col-md-2\">CustomerId</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"col-md-2\">LastUpdate</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<Table id=\"tabid\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><FORM action=\"#\" method=post>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttype=submit name=\"g\" value=\"<\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</FORM></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><FORM action=\"#\" method=post>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\">1\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</FORM></td>\t\r\n");
      out.write("\t\t\t\t\t\t\t<td><FORM action=\"#\" method=post>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\">2\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</FORM></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><FORM action=\"#\" method=post>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Input type=hidden name=\"showPage\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Input type=submit name=\"g\" value=\">\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</Form></td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</Table>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("  \t\r\n");
      out.write("\t<script src=\"jquery-2.1.1min.js\"></script>\r\n");
      out.write("  <script src=\"bootstrap.min.js\"></script>  \r\n");
      out.write("</BODY>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
