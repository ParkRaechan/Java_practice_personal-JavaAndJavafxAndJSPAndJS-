<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<%@include file="1.설치.jsp"%>
	<div class="container">
	
		<div class="navbar navbar-expand-md navbar-light offset-md-2 col-md-10" style="background-color: #e3f2fd;">

			
			
			<!-- 메뉴사이즈 작아지면 -->
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navmenu"
			aria-controls="navbar-contents" aria-expanded="false">
				=
			</button>
			
			<div class="collapse navbar-collapse" id="navmenu">
			<a href="#" class = "navbar-brand">
			<ul class= "navbar-nav">
				<li class= "nav-item"><a href="#" class= "nav-link"> 거래내역 </a></li><!-- 네비게이션목록값 -->
				<li class= "nav-item"><a href="#" class= "nav-link"> 내정보 </a></li>
				<li class= "nav-item"><a href="#" class= "nav-link"> 이벤트 </a></li>
				<li class= "nav-item dropdown"><!-- 드랍다운 메뉴 -->
					<!-- 하단텍스클릭했을때 메뉴펼치기 -->
					<a href = "#" class="nav-link dropdown-toggle"
					data-bs-toggle="dropdown" aria-haspopup="ture" aria-expanded="false" id="navdrop">
					계좌관리</a>
					
					<div class = "dropdown-menu" aria-labelledby="navdrop">
						<a class = "dropdown-item" href="#"> 보내기 </a>
						<a class = "dropdown-item" href="#"> 계좌추가 </a>
						<a class = "dropdown-item" href="#"> 계좌삭제 </a>
					</div>
					
				</li>
			</ul>
			
			
			<form action="">
				<div class="row">
					<div class="offset-md-2 col-md-5">
						<input type="text" class="form-control">
						<button>검색</button>
					</div>
				</div>
				
			</form>
			

		</div>
		
	
	
	
	
	</div>
	</div>
	
	
</body>
</html>