/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat (TomEE)/7.0.55 (1.7.1)
 * Generated at: 2015-11-04 16:54:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class employees_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<div class=\"table\">\r\n");
      out.write("\t<h2 style=\"border-bottom:1px solid; text-align: left; font-family:Helvetica Neu\">Administration | Employees</h2>\r\n");
      out.write("\t\t<table class=\"tableFilter\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"6\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th><input type=\"checkbox\" id=\"mainCheck\"></th>\r\n");
      out.write("\t\t\t\t<th style=\"text-align:center; \">Id <i class=\"fa fa-sort\"></i><br><input type=\"text\" class=\"filterSearchInput\"></th>\r\n");
      out.write("\t\t\t\t<th style=\"text-align:center\">First name <i class=\"fa fa-sort\"></i><br><input type=\"text\" class=\"filterSearchInput\"></th>\r\n");
      out.write("\t\t\t\t<th style=\"text-align:center\">Last name <i class=\"fa fa-sort\"></i><br><input type=\"text\" class=\"filterSearchInput\"></th>\r\n");
      out.write("\t\t\t\t<th style=\"text-align:center\">E-mail <i class=\"fa fa-sort\"></i><br><input type=\"text\" class=\"filterSearchInput\"></th>\r\n");
      out.write("\t\t\t\t<th style=\"text-align:center\">Telephone <i class=\"fa fa-sort\"></i><br><input type=\"text\" class=\"filterSearchInput\"></th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t<tr><td colspan=\"6\"></td></tr>\r\n");
      out.write("        </table>\r\n");
      out.write("</div>\r\n");
      out.write(" <script>\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("    $('#mainCheck').change(function () {\r\n");
      out.write("        if($(this).prop('checked')){\r\n");
      out.write("            $('tbody tr td input[type=\"checkbox\"]').each(function(){\r\n");
      out.write("                $(this).prop('checked', true);\r\n");
      out.write("            });\r\n");
      out.write("        }else{\r\n");
      out.write("            $('tbody tr td input[type=\"checkbox\"]').each(function(){\r\n");
      out.write("                $(this).prop('checked', false);\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("    });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("  $(\".filterSearchInput\").keyup(function () {\r\n");
      out.write("      //split the current value of searchInput\r\n");
      out.write("      var data = this.value.split(\" \");\r\n");
      out.write("      //create a jquery object of the rows\r\n");
      out.write("      var jo = $(\".tableFilter\").find(\".hoverRow\");\r\n");
      out.write("      if (this.value == \"\") {\r\n");
      out.write("          jo.show();\r\n");
      out.write("          return;\r\n");
      out.write("      }\r\n");
      out.write("      //hide all the rows\r\n");
      out.write("      jo.hide();\r\n");
      out.write("\r\n");
      out.write("      //Recusively filter the jquery object to get results.\r\n");
      out.write("      jo.filter(function (i, v) {\r\n");
      out.write("          var $t = $(this);\r\n");
      out.write("          for (var d = 0; d < data.length; ++d) {\r\n");
      out.write("              if ($t.is(\":contains('\" + data[d] + \"')\")) {\r\n");
      out.write("                  return true;\r\n");
      out.write("              }\r\n");
      out.write("          }\r\n");
      out.write("          return false;\r\n");
      out.write("      })\r\n");
      out.write("      //show the rows that match.\r\n");
      out.write("      .show();\r\n");
      out.write("  }).focus(function () {\r\n");
      out.write("      this.value = \"\";\r\n");
      out.write("      $(this).css({\r\n");
      out.write("          \"color\": \"black\"\r\n");
      out.write("      });\r\n");
      out.write("      $(this).unbind('focus');\r\n");
      out.write("  }).css({\r\n");
      out.write("      \"color\": \"#C0C0C0\"\r\n");
      out.write("  });\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /jsp/employees_list.jsp(19,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("employee");
    // /jsp/employees_list.jsp(19,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/jsp/employees_list.jsp(19,12) '${employees}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${employees}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<tr class=\"hoverRow\"  onClick=\"editEmployee(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(")\">\r\n");
          out.write("\t\t\t\t<td><input type=\"checkbox\"></input></td>\r\n");
          out.write("\t\t\t\t<td class=\"contact\" value\"edit\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t<td class=\"contact\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.firstName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t<td class=\"contact\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.lastName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t<td class=\"contact\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t<td class=\"contact\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.telephone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
