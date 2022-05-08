<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>래찬스토어</title>
<link href="/jspweb/css/main.css" rel="stylesheet">

</head>
<body>

	<%@include file = "header.jsp" %>
	
	
	
	<br><br><br><br><br><br>
	<!--  캐러셀 : 이미지 슬라이드  -->
	<div id="cs" class="carousel slide" data-bs-ride="carousel" data-bs-interval="7000">
								<!-- 슬라이드시간 : 밀리초(1000/1초)  -->
		<!-- 슬라이드 위치 표시 : 인디케이터 -->
		<div class="carousel-indicators">
			<button data-bs-target="#cs" data-bs-slide-to="0" class="active"></button>
			<button data-bs-target="#cs" data-bs-slide-to="1"></button>
			<button data-bs-target="#cs" data-bs-slide-to="2"></button>
		</div>
		 <!-- 캐러셀 내용물 -->
		<div class="carousel-inner">
			<div class="carousel-item active"> <img alt="" src="img/메인이미지1.png"> </div>
			<div class="carousel-item "> <img alt="" src="img/메인이미지1.png"> </div>
			<div class="carousel-item "> <img alt="" src="img/메인이미지1.png"> </div>
		</div>
		<!-- 이미지 이동 버튼 -->
		<button class="carousel-control-prev" data-bs-target="#cs" data-bs-slide="prev">
			<span class="carousel-control-prev-icon"></span>
		</button>
		<button class="carousel-control-next" data-bs-target="#cs" data-bs-slide="next">
			<span class="carousel-control-next-icon"></span>
		</button>
		
	</div>
	
	
	
	<%@include file = "footer.jsp" %>

</body>
</html>