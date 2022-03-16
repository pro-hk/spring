<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ include file="../include/header.jsp"%>

<main>
	<div class="inner">
		<h2 class="subTitle">MEMBER INFO</h2>
		<div id=contents>
			<div class="tableBox">
				<table  class="left">
					<colgroup>
						<col style="width: 150px">
						<col>
					</colgroup>
					<tbody>
						<tr>
							<th>PROFILE</th>
							<td><img src=${memberInfo.thumb } class="profile02"></td>
						</tr>
						<tr>
							<th>ID</th>
							<td>${memberInfo.id }</td>
						</tr>
						<tr>
							<th>이름</th>
							<td>${memberInfo.name }</td>
						</tr>
						<tr>
							<th>이메일</th>
							<td>${memberInfo.email }</td>
						</tr>
						<tr>
							<th>전화번호</th>
							<td>${memberInfo.phone }</td>
						</tr>
						<tr>
							<th>우편번호</th>
							<td>${memberInfo.zipCode }</td>
						</tr>
						<tr>
							<th>주소</th>
							<td>${memberInfo.address }</td>
						</tr>
						<tr>
							<th>가입일</th>
							<td>${memberInfo.regDate }</td>
						</tr>
					</tbody>
				</table>
				<div class="btns">
					<c:if test="${memberInfo.id == loggedId }">
					<a href="../member/Update.do?id=${memberInfo.id }" class="btn btnConfirm">회원정보 수정</a> 
					<a href="../member/Delete.do?id=${memberInfo.id }" class="btn btnCancel">회원탈퇴</a>
					</c:if>
					<a href="../member/List.do" class="btn btnCancel">회원목록</a>
				</div>
			</div>
		</div>
	</div>
</main>
<%@ include file="../include/footer.jsp"%>