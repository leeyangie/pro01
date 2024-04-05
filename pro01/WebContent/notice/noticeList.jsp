<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<c:set var="path0" value="<%=request.getContextPath() %>" />    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title }</title>
<%@ include file="/head.jsp" %>
<style>
.container { width:1400px; }
.page { clear:both; height:100vh; }
#page1 { background-color:#ececec; }
#page2 { background-color:#42bcf5; }
.page_title { font-size:36px; padding-top:2em; text-align:center; }
</style>
</head>
<body>
<div id="header">
	<%@ include file="/header.jsp" %>
</div>
<div id="contents">
	<section class="page" id="page1">
		<div style="width:1400px; margin:0 auto;">
			<h3 class="page_title">공지사항 목록</h3>
			<div>
				<table class="table table-dark">
					<thead>
						<tr>
							<th class="item1">번호</th>
							<th class="item2">제목</th>
							<th class="item3">작성일</th>
							<th class="item4">작성자</th>
							<th class="item5">조회수</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="dto" items="${notiList }">
						<tr>
							<td>${dto.no }</td>
							<td><a href="${path0 }/GetNotice.do?no=${dto.no }">${dto.title }</a></td>
							<td>${dto.resdate }</td>
							<td>${dto.author }</td>
							<td>${dto.visited }</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="btn-group" role="group" aria-label="Basic example">
  				<a href="${path0 }/notice/noti_ins.jsp" class="btn btn-secondary">글 등록</a>
				</div>
			</div>
		</div>
	</section>
	<section class="page" id="page2">
		<div style="width:1400px; margin:0 auto;">	
			<h3 class="page_title"></h3>

		</div>	
	</section>	
</div>
<div id="footer">
	<%@ include file="/footer.jsp" %>
</div>
</body>
</html>