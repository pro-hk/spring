/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-03-15 08:37:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/member/../include/header.jsp", Long.valueOf(1647306281826L));
    _jspx_dependants.put("jar:file:/D:/IT/spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/10-spring-member-board/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/IT/spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/10-spring-member-board/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/member/../include/footer.jsp", Long.valueOf(1645593029026L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1645409495498L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <title>PROHK</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/reset.css\" />\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../summernote/summernote.min.css\"  />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/layout.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/form.css\" />\r\n");
      out.write("    <script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("    <script src=\"../js/jquery-3.6.0.min.js\"></script>  \r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"../summernote/summernote.min.js\"></script> \r\n");
      out.write("    <script src=\"../js/main.js\" defer></script>\r\n");
      out.write("  </head>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <header id=\"header\">\r\n");
      out.write("      <div class=\"inner\">\r\n");
      out.write("        <h1>\r\n");
      out.write("        	<a href=\"../\">PROHK</a>\r\n");
      out.write("        </h1>\r\n");
      out.write("        <nav id=\"gnb\">\r\n");
      out.write("          <h2 class=\"hidden\">global navigation bar</h2>\r\n");
      out.write("          	");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("    </header>");
      out.write("\r\n");
      out.write("    <main>\r\n");
      out.write("      <div class=\"inner\">\r\n");
      out.write("      	<h2 class=\"subTitle\">회원정보 수정</h2>\r\n");
      out.write("      	<div id=contents>\r\n");
      out.write("      		<form method=\"post\" action=\"../member/UpdateProcess.do\" id=\"join\" class=\"form\" enctype=\"multipart/form-data\">\r\n");
      out.write("      			<table class=\"left\">\r\n");
      out.write("      				<colgroup>\r\n");
      out.write("      					<col style=\"width:20%\">\r\n");
      out.write("      					<col style=\"width:80%\">\r\n");
      out.write("      				</colgroup>\r\n");
      out.write("      				<tbody>\r\n");
      out.write("      					<tr>\r\n");
      out.write("      						<th>PROFILE <span class=\"required\">*</span></th>\r\n");
      out.write("      						<td>\r\n");
      out.write("      							<div>\r\n");
      out.write("      								<img src=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memberDto.thumb }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" class=\"profile02\" />\r\n");
      out.write("      							</div>\r\n");
      out.write("      							<div class=\"fileBox\">\r\n");
      out.write("      								<input type=\"text\" class=\"fakeFile\" placeholder=\"업로드할 이미지를 선택하세요\">\r\n");
      out.write("      								<label><input type=\"file\" name=\"multipartFile\"><span>파일찾기</span></label>\r\n");
      out.write("      							</div>\r\n");
      out.write("      						</td>\r\n");
      out.write("      					</tr>\r\n");
      out.write("      					<tr>\r\n");
      out.write("      						<th>아이디 <span class=\"required\">*</span></th>\r\n");
      out.write("      						<td><input type=\"text\" name=\"id\" id=\"user_id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memberDto.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly></td>\r\n");
      out.write("      					</tr>\r\n");
      out.write("      					<tr>\r\n");
      out.write("      						<th>비밀번호 <span class=\"required\">*</span></th>\r\n");
      out.write("      						<td><input type=\"password\" name=\"password\" id=\"user_pw\" placeholder=\"비밀번호를 입력하세요.\"></td>\r\n");
      out.write("      					</tr>\r\n");
      out.write("      					<tr>\r\n");
      out.write("      						<th>이름 <span class=\"required\">*</span></th>\r\n");
      out.write("      						<td><input type=\"text\" name=\"name\" id=\"user_name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memberDto.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("      					</tr>\r\n");
      out.write("      					<tr>\r\n");
      out.write("      						<th>이메일 <span class=\"required\">*</span></th>\r\n");
      out.write("      						<td><input type=\"text\" name=\"email\" id=\"user_email\" placeholder=\"메일을 입력하세요.\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memberDto.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("      					</tr>\r\n");
      out.write("      					<tr>\r\n");
      out.write("      						<th>전화번호 <span class=\"required\">*</span></th>\r\n");
      out.write("      						<td class=\"left\">\r\n");
      out.write("      							<select name=\"phoneFirst\" class=\"short\">\r\n");
      out.write("      								<option value=\"010\" selected>010</option>\r\n");
      out.write("      								<option value=\"011\">011</option>\r\n");
      out.write("      								<option value=\"017\">017</option>\r\n");
      out.write("      							</select>\r\n");
      out.write("      							<input type=\"text\" name=\"phoneMiddle\" class=\"short\" id=\"user_phone_middle\" placeholder=\"전화번호를 입력하세요.\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memberDto.phoneMiddle }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("      							<input type=\"text\" name=\"phoneLast\" class=\"short\" id=\"user_phone_last\" placeholder=\"전화번호를 입력하세요.\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memberDto.phoneLast }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("      						</td>\r\n");
      out.write("      					</tr>\r\n");
      out.write("      					<tr>\r\n");
      out.write("      						<th>주소 <span class=\"required\">*</span></th>\r\n");
      out.write("      						<td class=\"left\">\r\n");
      out.write("      							<div>\r\n");
      out.write("	      							<input type=\"number\" name=\"zipCode\" placeholder=\"우편번호\" id=\"zipcode\" class=\"short\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${memberDto.zipCode }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("    	  							<button class=\"btn btnZipcode\">우편번호</button>\r\n");
      out.write("      							</div>\r\n");
      out.write("      							<div class=\"addrBox\">\r\n");
      out.write("	      							<input type=\"text\" name=\"address01\" id=\"address01\" placeholder=\"기본주소\">\r\n");
      out.write("    	  							<span class=\"sticker\">기본 주소</span>\r\n");
      out.write("      							</div>\r\n");
      out.write("      							<div class=\"addrBox\">\r\n");
      out.write("	      							<input type=\"text\" name=\"address02\" id=\"address02\" placeholder=\"나머지주소\">\r\n");
      out.write("    	  							<span class=\"sticker\">나머지 주소</span>\r\n");
      out.write("      							</div>\r\n");
      out.write("      						</td>\r\n");
      out.write("      					</tr>\r\n");
      out.write("      				</tbody>\r\n");
      out.write("      			</table>\r\n");
      out.write("      			<div class=\"btns\">\r\n");
      out.write("      				<button type=\"submit\" class=\"btn btnConfirm\">수정</button>\r\n");
      out.write("      				<button type=\"reset\" class=\"btn btnCancel\">초기화</button>\r\n");
      out.write("      				<a href=\"javascript:history.back();\" class=\"btn btnCancel\">취소</a>\r\n");
      out.write("      			</div>\r\n");
      out.write("      		</form>\r\n");
      out.write("     	</div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </main>\r\n");
      out.write("    <script>\r\n");
      out.write("    $(\".btnZipcode\").on(\"click\",function(){\r\n");
      out.write("    	postCode();\r\n");
      out.write("    	return false;\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("     $(\".btnConfirm\").on(\"click\",function(){\r\n");
      out.write("    	if($(\"#user_pw\").val()===\"\"){\r\n");
      out.write("    		alert(\"비밀번호를 입력하세요.\");\r\n");
      out.write("    		$(\"#user_pw\").focus;\r\n");
      out.write("    		return false;\r\n");
      out.write("    	} else if($(\"#user_name\").val()===\"\") {\r\n");
      out.write("    		alert(\"이름을 입력하세요.\");\r\n");
      out.write("    		$(\"#user_name\").focus;\r\n");
      out.write("    		return false;\r\n");
      out.write("    	} else if($(\"#user_email\").val()===\"\"){\r\n");
      out.write("    		alert(\"메일을 입력하세요.\");\r\n");
      out.write("    		$(\"#user_email\").focus;\r\n");
      out.write("    		return false;\r\n");
      out.write("    	} else if($(\"#user_phone_middle\").val()===\"\"){\r\n");
      out.write("    		alert(\"전화번호를 입력하세요.\");\r\n");
      out.write("    		$(\"#user_phone_middle\").focus;\r\n");
      out.write("    		return false;\r\n");
      out.write("    	} else if($(\"#user_phone_last\").val()===\"\"){\r\n");
      out.write("    		alert(\"전화번호를 입력하세요.\");\r\n");
      out.write("    		$(\"#user_phone_last\").focus;\r\n");
      out.write("    		return false;\r\n");
      out.write("    	} else if($(\"#zipcode\").val()===\"\"){\r\n");
      out.write("    		alert(\"우편번호를 입력하세요.\");\r\n");
      out.write("    		$(\"#zipcode\").focus;\r\n");
      out.write("    		return false;\r\n");
      out.write("    	} else if($(\"#address01\").val()===\"\"){\r\n");
      out.write("    		alert(\"주소를 입력하세요.\");\r\n");
      out.write("    		$(\"#address01\").focus;\r\n");
      out.write("    		return false;\r\n");
      out.write("    	}\r\n");
      out.write("    }); \r\n");
      out.write("    \r\n");
      out.write("    function postCode() {\r\n");
      out.write("        new daum.Postcode({\r\n");
      out.write("            oncomplete: function(data) {\r\n");
      out.write("                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("\r\n");
      out.write("                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.\r\n");
      out.write("                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("                let roadAddr = data.roadAddress; // 도로명 주소 변수\r\n");
      out.write("                let extraRoadAddr = ''; // 참고 항목 변수\r\n");
      out.write("\r\n");
      out.write("                // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("                // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("                    extraRoadAddr += data.bname;\r\n");
      out.write("                }\r\n");
      out.write("                // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("                if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                }\r\n");
      out.write("                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("                if(extraRoadAddr !== ''){\r\n");
      out.write("                    extraRoadAddr = ' (' + extraRoadAddr + ')';\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("                document.getElementById(\"zipcode\").value = data.zonecode;\r\n");
      out.write("                document.getElementById(\"address01\").value = roadAddr;\r\n");
      out.write("                //document.getElementById(\"sample4_jibunAddress\").value = data.jibunAddress;\r\n");
      out.write("            }\r\n");
      out.write("        }).open();\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer id=\"footer\">\r\n");
      out.write("      <p>ALL COPYRIGHTS RESERVED BY PROHK</p>\r\n");
      out.write("    </footer>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("    ");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          		");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          		");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("          	");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/views/member/../include/header.jsp(37,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty loggedId }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          			<ul>\r\n");
          out.write("            			<li><a href=\"../member/Login.do\">로그인</a></li>\r\n");
          out.write("            			<li><a href=\"../member/Join.do\">회원가입</a></li>\r\n");
          out.write("            			<li><a href=\"../member/List.do\">회원관리</a></li>\r\n");
          out.write("            			<li><a href=\"../board/List.do\">게시판</a></li>\r\n");
          out.write("            		</ul>\r\n");
          out.write("          		");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("          			<ul>\r\n");
          out.write("            			<li><a href=\"../member/Info.do?user_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loggedId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loggedName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님</a></li>\r\n");
          out.write("            			<li><a href=\"../member/Logout.do\">로그아웃</a></li>\r\n");
          out.write("            			<li><a href=\"../member/List.do\">회원관리</a></li>\r\n");
          out.write("            			<li><a href=\"../board/List.do\">게시판</a></li>\r\n");
          out.write("            		</ul>\r\n");
          out.write("          		");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}
