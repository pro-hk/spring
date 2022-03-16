<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="../include/header.jsp" %>
    <main>
      <div class="inner">
      	<h2 class="subTitle">LOGIN</h2>
      	<div id=contents>
      		<form method="post" action="LoginProcess.do" id="login" class="form">
      			<table>
      				<colgroup>
      					<col style="width:20%">
      					<col style="width:80%">
      				</colgroup>
      				<tbody>
      					<tr>
      						<th>아이디 <span class="required">*</span></th>
      						<td><input type="text" name="user_id" id="user_id" placeholder="아이디를 입력하세요."></td>
      					</tr>
      					<tr>
      						<th>비밀번호 <span class="required">*</span></th>
      						<td><input type="password" name="user_pw" id="user_pw" placeholder="비밀번호를 입력하세요."></td>
      					</tr>
      				</tbody>
      			</table>
      			<div class="btns">
      				<button type="submit" class="btn btnConfirm">로그인</button>
      				<a href="Join.do" class="btn btnCancel">회원가입</a>
      			</div>
      		</form>
     	</div>
      </div>
    </main>
    <script>
    $(".btnConfirm").on("click",function(){
    	if($("#user_id").val()===""){
    		alert("아이디를 입력하세요.");
    		$("#user_id").focus;
    		return false;
    	} else if($("#user_pw").val()===""){
    		alert("비밀번호를 입력하세요.");
    		$("#user_pw").focus;
    		return false;
    	}
    });
    </script>
<%@ include file="../include/footer.jsp" %>
    