/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.20
 * Generated at: 2015-07-24 05:41:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.qst.francis.pojo.Info;
import java.text.SimpleDateFormat;

public final class admin_005fcheck_005finfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1437466512864L));
    _jspx_dependants.put("jar:file:/F:/青软实训/FinalWork/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/dsgqxxw/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098682290000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("com.qst.francis.pojo.Info");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <title>ADMIN</title>\r\n");
      out.write("        \r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            .commen-list{\r\n");
      out.write("                list-style: outside none none;\r\n");
      out.write("                margin: 20px 0 20px 5px;\r\n");
      out.write("            }\r\n");
      out.write("            .div-container{\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                font-size: 10px;\r\n");
      out.write("                border: 1px solid #ccc;\r\n");
      out.write("            }\r\n");
      out.write("            .div-detial-info{\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 20px;\r\n");
      out.write("                padding-top: 10px;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                background-color: #ebe6e6;\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("            .div-detial-content{\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                display:inline-block;\r\n");
      out.write("            }\r\n");
      out.write("            .float-left{\r\n");
      out.write("                float: left;\r\n");
      out.write("                width: 50%\r\n");
      out.write("            }\r\n");
      out.write("            .div-op-info{\r\n");
      out.write("                clear: both;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("            }\r\n");
      out.write("            .info{\r\n");
      out.write("                font-size: 10px;\r\n");
      out.write("                text-align: left;\r\n");
      out.write("                padding-left: 43px;\r\n");
      out.write("            }\r\n");
      out.write("            .table-op-info{\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 20px;\r\n");
      out.write("                padding-bottom: 5px; \r\n");
      out.write("                text-align: center;\r\n");
      out.write("                background-color: #ebe6e6;\r\n");
      out.write("            }\r\n");
      out.write("            .div-foot-info{\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 300px;\r\n");
      out.write("                background-color: #ccc;\r\n");
      out.write("            }\r\n");
      out.write("            #div-foot{\r\n");
      out.write("                background-color: #ccc;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("            }\r\n");
      out.write("            .div-foot-table{\r\n");
      out.write("                font-size: 10px;\r\n");
      out.write("                clear: both;\r\n");
      out.write("                width: 80%;\r\n");
      out.write("                float: right;\r\n");
      out.write("            }\r\n");
      out.write("            .div-foot-table tr{\r\n");
      out.write("                font-size: 10px;\r\n");
      out.write("                width: 30%;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    \t");

    		Info info = (Info)request.getAttribute("infoobj");
    		String info_typename = (String)request.getAttribute("info_typename");
    		String checkurl = "/dsgqxxw/payInfoAction?infoid=" + info.getInfo_id();
    		String deleteurl = "/dsgqxxw/deleteInfoAction?infoid=" + info.getInfo_id();
    		String isdisable = "";
    		String pay_state = "disabled";
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	if(info.getInfo_pay_state() == 0){
        		pay_state = "未付费";
        	}
        	else{
        		pay_state = "已付费";
        		isdisable = "disabled";
        	}
        	String check_state = ""; 
        	if(info.getInfo_check_state() == 0){
        		check_state = "未审核";
        	}
        	else{
        		check_state = "已审核";
        	}
    	
      out.write("\r\n");
      out.write("        <div class=\"div-container\">\r\n");
      out.write("            <!--    ID值通过jsp更改        -->\r\n");
      out.write("            <p>付费设置[ID值：");
      out.print(info.getInfo_id() );
      out.write("]</p>\r\n");
      out.write("            <div class=\"div-detial-info\">信息详细内容</div>\r\n");
      out.write("            <div class=\"div-detial-content\">\r\n");
      out.write("                <div class=\"float-left\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li class=\"commen-list\">信息类别： <span name=\"info1\">【");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${info_typename }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("】</span></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li class=\"commen-list\">发布时间： <span name=\"info2\">");
      out.print(dateFormat.format(info.getInfo_date()) );
      out.write("</span></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li class=\"commen-list\">信息标题： <span name=\"info3\">");
      out.print(info.getInfo_title() );
      out.write("</span></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"float-left\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li class=\"commen-list\">付费状态：\r\n");
      out.write("                        <span name=\"info4\">★");
      out.print(pay_state );
      out.write("</span></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li class=\"commen-list\">审核状态： <span name=\"info5\">★");
      out.print(check_state );
      out.write(" </span></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"div-op-info\">\r\n");
      out.write("                <table class=\"table-op-info\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td class=\"info\">信息内容：</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                        \t<a href=");
      out.print(checkurl );
      out.write(">\r\n");
      out.write("                        \t\t<input type=\"button\" id=\"changehadcost\" name=\"changehadcost\" value=\"√设为付费\" ");
      out.print(isdisable );
      out.write(">\r\n");
      out.write("                        \t</a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                        \t<a href=");
      out.print(deleteurl );
      out.write(">\r\n");
      out.write("                        \t\t<input type=\"button\" id=\"changedelete\" name=\"changedelete\" value=\"×删除信息\">\r\n");
      out.write("                        \t</a>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"div-foot-info\">\r\n");
      out.write("                <div>");
      out.print(info.getInfo_content() );
      out.write("</div>\r\n");
      out.write("            </div><div id=\"div-foot\">\r\n");
      out.write("                <table class=\"div-foot-table\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>联系电话:");
      out.print(info.getInfo_phone() );
      out.write("</td>\r\n");
      out.write("                        <td>联系人:");
      out.print(info.getInfo_linkman() );
      out.write("</td>\r\n");
      out.write("                        <td>E-mail:");
      out.print(info.getInfo_email() );
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
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