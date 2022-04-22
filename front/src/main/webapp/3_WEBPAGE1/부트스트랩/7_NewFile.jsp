<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		.carousel-items{width="100%";}
	
	</style>
</head>
<body>
	<%@include file="1.설치.jsp"%>
	<div class= "container">
		
		<div id = "cs" class="carousel slide" data-bs-ride="carousel" data-bs-interval="1000">	<!-- 캐러셀 -->
		
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#cs" data-bs-slide-to="0" class="active"></button>
			<button type="button" data-bs-target="#cs" data-bs-slide-to="1"></button>
			<button type="button" data-bs-target="#cs" data-bs-slide-to="2"></button>
		</div>
		
			<div class = "carousel-inner">
				<div class="carousel-item active">	<!-- 캐러셀 내용 -->
					<img alt="" src="img/버독2.jpg"></div>
				<div class="carousel-item">	<!-- 캐러셀 내용 -->
					<img alt="" src="img/버독.png"></div>
				<div class="carousel-item">	<!-- 캐러셀 내용 -->
					<img alt="" src="img/흐림1.png"></div>

				<!-- 캐러셀 이동 버튼 -->
				<button type="button" class="carousel-control-prev"  data-bs-target="#cs" data-bs-slide="prev">
					<span class="carousel-control-prev-icon"></span>
				</button>
				<!-- 캐러셀 이동 버튼 -->
				<button type="button" class="carousel-control-next" data-bs-target="#cs" data-bs-slide="next">
					<span class="carousel-control-next-icon"></span>
				</button>
			</div>
		</div>
		
	</div>
	
	
</body>
</html>