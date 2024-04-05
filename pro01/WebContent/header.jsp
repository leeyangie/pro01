<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="hpath" value="<%=request.getContextPath() %>"></c:set>
<header> 
	<div class="logo_wrap">
		<a href="/pro01"><img alt="우이동 로고" src="${hpath }/images/uidonglogo.png"></a>
	</div>
	<nav id="tnb">
		<ul>
			<c:if test="${empty sid }">
			<li><a href="${hpath }/member/">로그인</a></li>
			<li><a href="${hpath }/member/">회원가입</a></li>
			</c:if>
			<c:if test="${not empty sid }">
			<li><a href="${hpath }/member/">로그아웃</a></li>
			<li><a href="${hpath }/member/">회원정보</a></li>
			</c:if>
			<c:if test="${sid.equals('admin') }">
			<li><a href="${hpath }/admin/">관리자로</a></li>
			</c:if>
		</ul>
	</nav>
	<nav id="gnb">
		<ul class="main_menu">
			<li><a href="">커뮤니티</a>
				<ul>
					<li><a href="${hpath }/NoticeList.do">공지사항</a></li>
					<li><a href="">자료실</a></li>
					<li><a href="">묻고 답하기</a></li>
				</ul>
			</li>	
		</ul>
	
	</nav>
</header>