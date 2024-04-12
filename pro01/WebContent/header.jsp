<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="hpath" value="<%=request.getContextPath() %>"></c:set>
<header> 
	<div class="logo_wrap">
		<a href="/pro01"><img alt="우이동 로고" src="${hpath }/images/uidonglogo.png"></a>
	</div>
	<div id="tnb" style="height:100px; line-height:2rem; padding-top:1rem">
		<c:if test="${not empty sid }">
		<h2 style="text-align:center;">${sname } 님 환영합니다.</h2>
		</c:if>
	</div>
	<nav id="gnb">
		<ul class="">
			<li class="item">
				<a href="" class="dp1"><strong>마이페이지</strong></a>
				<ul class="sub_menu">
					<c:if test="${empty sid }">
					<li><a href="${hpath }/member/login.jsp">로그인</a></li>
					<li><a href="${hpath }/member/term.jsp">회원가입</a></li>
					</c:if>
					<c:if test="${not empty sid }">
					<li><a href="${hpath }/member/">로그아웃</a></li>
					<li><a href="${hpath }/member/editmember.jsp">회원정보</a></li>
					</c:if>
					<c:if test="${sid.equals('admin') }">
					<li><a href="${hpath }/AadminMain.do">관리자 정보</a></li>
					</c:if>
				</ul>
		</li>
		<li class="item">
			<a href="" class="dp1"><strong>지역소개</strong></a>
			<ul class="sub_menu">
				<li><a href="${hpath }/intro/origin.jsp">지명 유래</a>
				<li><a href="${hpath }/intro/feature.jsp">지역 특징</a>
				<li><a href="${hpath }/intro/center.jsp">주민 센터</a>
				<li><a href="${hpath }/intro/traffic.jsp">교통편 안내</a>
			</ul>
		</li>
		<li class="item">
		<a href="" class="dp1"><strong>지역 이용안내</strong></a>
				<ul class="sub_menu">
					<li><a href="${hpath }/tour/bukhansan.jsp">북한산</a></li>
					<li><a href="${hpath }/tour/419minju.jsp">4.19 민주묘지</a></li>
					<li><a href="${hpath }/tour/park.jsp">공원 & 산책로</a></li>
					<li><a href="${hpath }/tour/tourism.jsp">맛집 & 숙박</a></li>
					<li><a href="${hpath }/tour/facility.jsp">주요 생활시설</a></li>
				</ul>
		</li>
		
		<li class="item">
				<a href="" class="dp1"><strong>커뮤니티</strong></a>
				<ul class="sub_menu">
					<li><a href="${hpath }/NoticeList.do">공지사항</a></li>
					<li><a href="">자료실</a></li>
					<li><a href="">묻고 답하기</a></li>
				</ul>
		</li>	
	</ul>
	
	
</nav>
	
		
	
	
</header>