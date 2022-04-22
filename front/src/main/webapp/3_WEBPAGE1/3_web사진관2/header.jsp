<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		li{ list-style-type: none;} /*글머리 제거 */
		a{ text-decoration: none; color: black; } /*밑줄제거 색상변경*/
		a:hover{ color: orange; }
		@font-face { /* 웹폰트*/
		    font-family: 'KOHIBaeumOTF';
		    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2201-2@1.0/KOHIBaeumOTF.woff') format('woff');
		    font-weight: normal;
		    font-style: normal;
		}
		
		#header{ height: 50px; }
		#box{ width: 1100px; margin: 0 auto; }
		#logo{ float: left; margin: 10px 0px 0px 10px; }
		#logo h2{ display: inline; }
		#h2_1{color:#1411ff;}
		#menus{ float: right; text-align: right; }
		#menus li{ display: inline; }
		#main_menu{margin-top: 10px;}
		#top_menu{ margin: 30px 0px; }
		#top_menu li{ margin-left: 10px; }
		#main_menu li{
			font-family: "KOHIBaeumOTF";
			font-size: 12px; margin: 20px 20px 20px 20px;
		}
	</style>

</head>
<body>

	<div id="header"> <!-- 헤더 전체  -->
		<div id="box"> <!-- 헤더내 박스권 -->
			<div id="logo">	<!-- 로고 -->
				<h2 id="h2_1"> THE </h2><h2 id="h2_2">스튜디오</h2>
			</div>
			<div id="menus"> <!-- 메뉴 -->
				<ul id="main_menu"> <!-- 하단메뉴  -->
					<li> <a href="#">스튜디오 소개</a> </li>
					<li> <a href="#">스튜디오 예약</a> </li>
					<li> <a href="#">블로그</a> </li>
					<li> <a href="#">포토 갤러리</a> </li>
					<li> <a href="#">오시는 길</a> </li>
				</ul>
			</div>
		</div>
	</div>

</body>
</html>

















