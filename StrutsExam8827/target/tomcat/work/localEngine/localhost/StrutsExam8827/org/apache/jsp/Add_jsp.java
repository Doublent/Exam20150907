package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>客户管理</title>\r\n");
      out.write("<link href=\"bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("#nid {\r\n");
      out.write("\tbackground-color: skyblue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#aid {\r\n");
      out.write("\tmargin-top: 10px;\r\n");
      out.write("\tmargin-right: 10px;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#dd {\r\n");
      out.write("\tbackground-size: 100% 100%;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tmargin-right: -20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#ddiv {\r\n");
      out.write("\theight: 40%;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tbackground-color: #fafafa;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#id2 {\r\n");
      out.write("\tmargin-left: -30px;\r\n");
      out.write("\theight: 80%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#iid {\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#id10 {\r\n");
      out.write("\t/* background-color: darkgray; */\r\n");
      out.write("\tmargin-bottom: 10px;\r\n");
      out.write("\theight: 80%;\r\n");
      out.write("\tbackground-size: 100% 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#bid {\r\n");
      out.write("\tbackground-color: skyblue;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#mid {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tbackground-color: #eaeaea;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#tabid {\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"navbar navbar-default\" role=\"navigation\" id=\"nid\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t<h4>8827肖云龙</h4>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a id=\"aid\" class=\"nav navbar-nav navbar-right\" id=\"aid\" href=\"#\">Admin</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"dd\" class=\"container\">\r\n");
      out.write("\t\t<div class=\"col-md-2\" id=\"id2\">\r\n");
      out.write("\t\t\t<ul class=\"list-group affixed-element-top js-affixed-element-top\">\r\n");
      out.write("\t\t\t\t<li class=\"list-group-item\"><a href=\"#\">Dashboard</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"list-group-item\"><a href=\"#\">应用设置</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"list-group-item\"><a href=\"#\">管理设置</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"list-group-item\"><a href=\"#\">数据配置</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"list-group-item\"><a href=\"#\">主数据管理</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"list-group-item\"><a href=\"#\">客户订单管理</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"list-group-item\"><a href=\"#\">发货单管理</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-10 js-content\" id=\"id10\"\r\n");
      out.write("\t\t\tstyle=\"background-color: #eeeeee\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<h4>创建Customer</h4>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\" style=\"background-color: #ffffff\">\r\n");
      out.write("\t\t\t\t\t<p>基本信息</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<div id=\"mid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form action=\"#\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"ddiv\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"iid\" class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-2\" id=\"iid\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font size=\"4\">First Fame</font><font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Input type=text name=\"firstname\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font size=\"4\">Last Name</font><font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Input type=text name=\"lastname\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font size=\"4\">Email</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Input type=text name=\"email\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font size=\"4\">Address</font><font color=\"red\">*</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Input type=text name=\"address\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-2\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Input type=submit value=\"新建\" style=\"background-color: skyblue\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<Input type=\"button\" value=\"取消\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"jquery-2.1.1min.js\"></script>\r\n");
      out.write("\t<script src=\"bootstrap.min.js\"></script>\r\n");
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
