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
#header {font-family: 'SUIT Variable', sans-serif;}
.container { width:100% }
.page { clear:both; height:100vh; }
#page1 {display:block; width:100%; min-width:1000px; max-height:600px;}
#page1 { background-color:#f7f7f2; }
#page1:after {display: block; content: ""; clear:both;}
#page2 { display:block; width:100%; min-width:1000px; height:1200px; }

.page_title { font-size:36px; padding-top:2em; text-align:center; }
.welcom { font-size:45px; overflow-x:hidden;}
</style>
</head>
<body>
<div id="header">
	<%@ include file="/header.jsp" %>
</div>
<div id="contents">
	<section class="page" id="page1">
		<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
		  <ol class="carousel-indicators">
		    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
		    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
		    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
		  </ol>
		  <div class="carousel-inner">
		    <div class="carousel-item active">
		      <img class="d-block w-100" src="${path0 }/images/bukhansan.jpg" alt="First slide">
		    </div>
		    <div class="carousel-item">
		      <img class="d-block w-100" src="${path0 }/images/419image.png" alt="Second slide">
		    </div>
		    <div class="carousel-item">
		      <img class="d-block w-100" src="${path0 }/images/solpark_Image_Enhancer2.jpg" alt="Third slide">
		    </div>
		  </div>
		  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
		    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
		    <span class="sr-only">Previous</span>
		  </a>
		  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
		    <span class="carousel-control-next-icon" aria-hidden="true"></span>
		    <span class="sr-only">Next</span>
		  </a>
		</div>
	</section>
</div>
<div id="contents">
	<section class="page" id="page2">
		<div style="width:1200px; margin:0 auto;">	
			<img class="secondpage" src="${path0 }/images/sander-weeteling-unsplash.jpg" alt="secondpage">
			<p class="welcome">WELCOME TO UIDONG WELCOME TO UIDONG WELCOME TO UIDONG<p>
		</div>	
	</section>	
</div>

<div id="contents">
	<section class="page" id="page3">
	
	</section>
</div>
<div id="footer">
	<%@ include file="/footer.jsp" %>
</div>
</body>
</html>