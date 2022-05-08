<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>래찬스토어</title>
	<!-- 부트스트랩 css cdn -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
	<!-- 사용자정의 css -->
	<link href="/jspweb/css/main.css" rel="stylesheet">
	<link href="/jspweb/css/header.css" rel="stylesheet">
	
</head>
<body>
	<!--   헤더페이지[ 모든 페이지 사용되기 때문에 = 최상위에서 절대경로 ] -->
	
	<%
		String loginid = (String)session.getAttribute("login");
	%>
	<div id="box">
		<div id="logo">
			<a href="/jspweb/main.jsp"> <img src="/jspweb/img/래찬스토어로고3.png" ></a>
		</div>
		<div id="menus">
			<ul id="main_menu">
				<li><a href="#"> #PRESTIGE &nbsp;</a></li>
				<li><a href="#"> #PREMIUM &nbsp;</a></li>
				<li><a href="#"> #WHATS'NEW &nbsp;</a></li>
				<li><a href="#"> #EVENT &nbsp;</a></li>
				<li><a href="#"> #HELP &nbsp;</a></li>
				<li><a href="#"> #쇼핑백 &nbsp;</a></li>
				<li><a href="#"> #ADDITIONAL &nbsp;</a></li>
		
			</ul>
		
			
			<input type="text"><button>검색</button>
			
			<% if(loginid==null){ %>
			<a href="/jspweb/member/login.jsp">&nbsp;로그인&nbsp;</a>
			<a href="/jspweb/member/signup.jsp">&nbsp;회원가입&nbsp;</a>
			<%} %>
			<% if(loginid!=null){ %>
			<span><%=loginid%>님</span>
			<a href="/jspweb/logout">&nbsp;로그아웃&nbsp;</a>
			<a href="/jspweb/member/myshopping.jsp">&nbsp;나의쇼핑&nbsp;</a>
			<%} %>
			<a href="/jspweb/board/boardlist.jsp">&nbsp;자유게시판&nbsp;</a>
		</div>
	</div>	
		
	<!-- 부트스트랩 js cdn -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- 사용자정의 js -->
	<script src="/jspweb/js/main.js" type="text/javascript"></script>
	<!-- jquery 최신 cdm -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
</body>
</html>





