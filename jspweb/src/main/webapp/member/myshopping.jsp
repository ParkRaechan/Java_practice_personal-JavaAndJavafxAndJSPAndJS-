<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>래찬스토어</title>
<link href="/jspweb/css/myshopping.css" rel="stylesheet">

</head>
	<%@include file = "../header.jsp" %>
	<div class="container"> <!-- 박스권 -->
		<div class="row"> <!-- 가로배치 -->
			<div class="col-md-3" id="qwer"> <!-- 사이드바 -->
				<%@include file ="infosidebar.jsp" %>
			</div>	
			<div class="col-md-9"> <!-- 본문 -->
				<h3>주문현황</h3>
			</div>
		</div>
	</div>
	<%@include file = "../footer.jsp" %>

</body>
</html>






