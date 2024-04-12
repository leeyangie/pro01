<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<c:set var="path0" value="<%=request.getContextPath() %>" />    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/head.jsp" %>
<style>
.container { width:1400px; }
.page { clear:both; height:100vh; }
#page1 { background-color:#f7f7f2; }
#page2 { background-color:#2d3619; }
.page_title { font-size:36px; padding-top:2em; text-align:center; }
th.item1 { width:5%; }
th.item2 { width:15%; }
th.item3 { width:15%; }
th.item4 { width:20%; }
th.item5 { width:20%; }
th.item5 { width:20%; }
</style>
</head>
<body>
<div id="header">
	<%@ include file="/header.jsp" %>
</div>
<div id="contents">
	<div class="row">
		<aside id="Inb" class="col-3">
			<nav>
				<ul>
					<li><a href="${path0 }/MemberList.do">회원목록</a></li>
					<li><a href="${path0 }/NoticeList.do">게시판 관리</a></li>
				</ul>
			</nav>
		</aside>
		<section class="page col-9" id="page1">
			<div>
				<h3 class="page_title">회원 목록</h3>
				<div>
					<table class="table">
					  <thead class="thead-dark">
					    <tr>
					      <th class="item1">번호</th>
					      <th class="item2">이름</th>
					      <th class="item3">아이디</th>
					      <th class="item4">비밀번호</th>
					      <th class="item5">주소</th>
					      <th class="item6">전화번호</th>
					    </tr>
					  </thead>
					  <tbody>
					  	<c:if test="${not empty memList }">
					  		<c:forEach var="dto" items="${memList }" varStatus="status">
						    <tr>
						      <th>${status.count }</th>
						      <td>${dto.name }</td>
						      <td>${dto.id }</td>
						      <td>${dto.pw }</td>
						      <td>${dto.address }</td>
						      <td>${dto.tel }</td>
						    </tr>
						    </c:forEach>
						</c:if>
						<c:if test="${empty memList }">
							<tr>
								<td colspan="6"><strong>회원이 존재하지 않습니다.</strong></td>
							</tr>
						</c:if>
					  </tbody>
					</table>
				</div>
			</div>
		</section>
	</div>
</div>

</body>
</html>